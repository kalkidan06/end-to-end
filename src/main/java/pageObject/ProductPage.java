package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage {
	 public static WebDriver driver;
	 
	By productOne = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/div[4]/form[1]/button[1]");
	By productTwo = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[4]/form[1]/button[1]");
	
	By validate_title = By.xpath("//h3[contains(.,'Craft Online Shopping')]");
	
	
	public ProductPage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver = driver2;
	}

	public WebElement getproductOne() {
		return driver.findElement(productOne);
	}

	public WebElement getproductTwo() {
		return driver.findElement(productTwo);
		
	}
	public WebElement getvalidateTitle() {
		return driver.findElement(validate_title);
	}
}
