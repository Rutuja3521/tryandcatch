package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class CartPage {
    private WebDriver driver;
    private By cartIcon = By.className("shopping_cart_link");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openCart() {
        try {
            driver.findElement(cartIcon).click();
        } catch (StaleElementReferenceException e) {
            System.out.println("Cart element became stale: " + e.getMessage());
        } catch (WebDriverException e) {
            System.out.println("WebDriver encountered an issue: " + e.getMessage());
        }
    }
}
