package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterationPage {
	
	public WebDriver driver;
	
	By reg_uname = By.xpath("//input[contains(@type,'text')]");
	By reg_email = By.xpath("//input[contains(@type,'email')]");
	By reg_button = By.xpath("//input[contains(@type,'submit')]");
	
	
	

	public RegisterationPage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver = driver2;
	}

	public WebElement getUname() {
	return driver.findElement(reg_uname);
	}
	
	public WebElement getRegEmail() {
		return driver.findElement(reg_email);
	}
	
	public WebElement getRegButton() {
		return driver.findElement(reg_button);
	}
}
