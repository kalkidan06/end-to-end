package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartLink {
	
	WebDriver driver;
	
	By CartLink = By.xpath("//a[contains(@class,'nav-link fa text-white')]");
	
	public CartLink(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		
		this.driver =driver2;
	}

	public WebElement getCart() {
		return driver.findElement(CartLink);
	}

}
