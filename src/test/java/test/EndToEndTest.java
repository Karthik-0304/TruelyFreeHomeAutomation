package test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.AccountPage;
import pages.BrandPage;
import pages.CartPage;
import pages.CheckoutPage;
import pages.LoginPage;
import pages.PaymentPage;
import pages.ProductPage;
import utils.TestListener;

public class EndToEndTest extends BaseClass {

	String productName = "Hanes Men's Beefy-t T-Shirt";

	@Test
	public void completeFlow() throws InterruptedException {

		LoginPage login = new LoginPage();
		BrandPage brand = new BrandPage();
		ProductPage product = new ProductPage();
		CartPage cart = new CartPage();
		CheckoutPage checkout = new CheckoutPage();
		PaymentPage payment = new PaymentPage();
		AccountPage account = new AccountPage();

		login.loginUser();

		brand.selectBrand();

		product.selectProduct(productName);

		product.addToCart();

		cart.openCart();

		try {

			checkout.checkout();
			checkout.Address();
			payment.makePayment();

		} catch (Exception e) {

			System.out.println("Error occurred during checkout/payment: " + e.getMessage());
			e.printStackTrace();

		} finally {

			payment.placepayment();
			account.logout();
		}

	}
}