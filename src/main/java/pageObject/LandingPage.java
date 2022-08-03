package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public static WebDriver driver;
	
	 By RegisterBut = By.xpath("//input[contains(@value,'Register')]");  //object for the register button element
	 
	 
	 public LandingPage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		 this.driver = driver2;
	}

	 public WebElement getRegbutton() {
		return driver.findElement(RegisterBut);          //this returns webelement.
		 
		
		


	
}
}