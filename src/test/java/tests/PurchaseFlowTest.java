package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductPage;
import pages.CartPage;
import pages.CheckoutPage;

public class PurchaseFlowTest extends BaseTest {
	@Test
	public void testPurchaseFlow() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login("standard_user", "secret_sauce");

		ProductPage productPage = new ProductPage(driver);
		productPage.addToCart();

		CartPage cartPage = new CartPage(driver);
		cartPage.openCart();

		CheckoutPage checkoutPage = new CheckoutPage(driver);
		try {
			checkoutPage.proceedToCheckout();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
}
