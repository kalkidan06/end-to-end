package craftsoftware;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public static WebDriver driver;
	
	public WebDriver initializeBrowser() throws IOException {
	
	Properties p = new Properties();
	FileInputStream f = new FileInputStream("C:/Users/Admin/Capston_project/src/main/java/craftsoftware/data.properties");
	
	p.load(f);
	p.getProperty("browser");
	String BrowserName = p.getProperty("browser");
	
	if(BrowserName.equals("chrome")) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		 driver = new ChromeDriver();
	}
	
//	else if (BrowserName.equals("webdriver.gecko.driver","C:\\Users\\Admin\\Downloads\\geckodriver-v0.31.0-win64\\gechodriver.exe")) {
//		
//		
//	}
	
	else if (BrowserName.equals("IE")) {
		
		
	}
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;
	}

}
