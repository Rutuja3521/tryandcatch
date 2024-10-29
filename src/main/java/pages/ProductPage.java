package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    private WebDriver driver;
    private By productField = By.className("inventory_item");
    private By addToCartButton = By.className("btn_inventory");

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addToCart() {
        try {
            driver.findElement(addToCartButton).click();
        } catch (NoSuchElementException e) {
            System.out.println("Product element not found: " + e.getMessage());
        } catch (ElementNotInteractableException e) {
            System.out.println("Product is not interactable: " + e.getMessage());
        }
    }
}
