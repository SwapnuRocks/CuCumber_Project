package ObjectpageModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPOM {
	public WebDriver driver;
	private By usernamne=By.xpath("//input[@id='username']");
	private By passward=By.xpath("//input[@id='password']");
	private By login=By.xpath("//input[@id='Login']");
	
	
	
	public loginPOM(WebDriver driver2) {
		this.driver=driver2;
		// TODO Auto-generated constructor stub
	}
	//public loginPOM(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		//this.driver=driver2;
	//}
	public WebElement enterusername() {
		return driver.findElement(usernamne);
		
	}
	public WebElement enterpassward() {
		return driver.findElement(passward);
		
	}
	public WebElement clicklogin() {
		return driver.findElement(login);
		
	}	
	
	 }


