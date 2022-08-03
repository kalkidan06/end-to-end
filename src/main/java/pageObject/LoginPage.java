package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;
	
	By Login_text = By.xpath("//input[contains(@type,'number')]");
	By Login_button = By.xpath("//input[contains(@value,'Login')]");
	
	public LoginPage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver = driver2;
	}
	public WebElement getLoginText() {
		return driver.findElement(Login_text);
		
	}
	public WebElement getLoginButton() {
		return driver.findElement(Login_button);
	}
}
