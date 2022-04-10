package Resourse;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver;
	public Properties prop;
	public WebDriver initializeDriver() throws IOException
	{
		prop=new Properties();
	FileInputStream fis=new FileInputStream("C:\\Users\\User\\eclipse-workspace\\CucumberDemo\\src\\main\\java\\Resourse\\data.properties");
	prop.load(fis);
	String BrowserName=prop.getProperty("Browser");
	if(BrowserName.equals("Chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	return driver;
	

	
	}
}
