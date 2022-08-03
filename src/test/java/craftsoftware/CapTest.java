package craftsoftware;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//import org.testng.asserts.SoftAssert;
import org.junit.Assert;


import pageObject.CartLink;
import pageObject.Cart_page;
import pageObject.LandingPage;
import pageObject.LoginPage;
import pageObject.ProductPage;
import pageObject.RegisterationPage;


public class CapTest extends Base {

	@BeforeTest
	public void broweapplication() throws IOException {
		
		driver  = initializeBrowser();
		driver.get("http://shop.icraftsoft.net:8095/");
		driver.manage().window();
	}
	@Test
	public void aLanding_test() {
		LandingPage lan = new LandingPage(driver);
		lan.getRegbutton().click();
	}
	@Test
	public void bRegistration_test() {
		RegisterationPage r = new RegisterationPage(driver);
		
		r.getUname().sendKeys("kal2");
		r.getRegEmail().sendKeys("kal2@gmail.com");
		r.getRegButton().click();
		
		driver.navigate().back();
		driver.navigate().back();       //how can we do it with loop ?
	}
	@Test
	public void cLogin_test() {
		
		LoginPage log = new LoginPage(driver);
		log.getLoginText().sendKeys("2502");
		log.getLoginButton().click();
	}
	@Test
	public void dProduct_test() {
	
		ProductPage p = new ProductPage(driver);
		p.getvalidateTitle().getText();
		//SoftAssert softassertion = new SoftAssert();
		//softassertion.assertEquals(p.getvalidateTitle().getText(),"Craft Online Shopping");
		Assert.assertEquals(p.getvalidateTitle().getText(),"Craft Online Shopping");
		p.getproductOne().click();
		p.getproductTwo().click();
		
	}
	
	@Test
	public void eCartLink_test() {
		CartLink c = new CartLink(driver);
		c.getCart().click();
	}
	@Test
	public void fCart_test() {
		Cart_page cart = new Cart_page(driver);
		cart.getvalidatecontbuton();
		Assert.assertTrue(cart.getvalidatecontbuton().isDisplayed());
		cart.getbuyButton().click();
		
	}
	@AfterTest
	public void terminate_browser() {
		driver.close();
	}
	}


// we use assert all notation after all softassertions  >>>softassertion.assertAll();to execute all validation without stopping on failed finding validation. 
