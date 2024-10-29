package pages;



import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class CheckoutPage {
    private WebDriver driver;
    private By checkoutButton = By.id("checkout");

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void proceedToCheckout() throws InterruptedException {
        try {
            driver.findElement(checkoutButton).click();
        } catch (NoSuchFrameException e) {
            System.out.println("Checkout frame not found: " + e.getMessage());
        }
    }
}

