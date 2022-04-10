package ObjectpageModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signupPOM {
	public WebDriver driver;
	private By signupbuttun = By.xpath("//a[@class='button secondary']");
	private By firstName = By.xpath("//input[@name='UserFirstName']");
	private By lastName = By.xpath("//input[@name='UserLastName']");
	private By email = By.xpath("//input[@name='UserEmail']");
	private By usertitle = By.xpath("//select[@name='UserTitle']");
	private By selecttitle = By.xpath("//option[@value='IT_Manager_AP']");
	private By company=By.xpath("//input[@name='CompanyName']");
	private By clickemployees = By.xpath("//select[@name='CompanyEmployees']");
	private By selectemployee = By.xpath("//option[@value='9']");
	private By phoneNo = By.xpath("//input[@name='UserPhone']");
	private By iAgree = By.xpath("//div[@class='checkbox-ui']");

	//public SignupPagePOM(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		//this.driver = driver2;
	//}

	public signupPOM(WebDriver driver2) {
		this.driver = driver2;
		// TODO Auto-generated constructor stub
	}

	public WebElement clicksignup() {
		return driver.findElement(signupbuttun);
	}

	public WebElement EnterfirstName() {
		return driver.findElement(firstName);
	}

	public WebElement EnterlastName() {
		return driver.findElement(lastName);
	}

	public WebElement Enteremail() {
		return driver.findElement(email);
	}

	public WebElement clickjobTitle() {
		return driver.findElement(usertitle);
	}

	public WebElement clickIT() {
		return driver.findElement(selecttitle);
	}
	public WebElement Entercompanyname() {
		return driver.findElement(company);
	}

	public WebElement clickEmployees() {
		return driver.findElement(clickemployees);
		
	}
	public WebElement selectEmp() {
		return driver.findElement(selectemployee);
	}

	public WebElement enteruserNo() {
		return driver.findElement(phoneNo);
	}

	public WebElement clickAgree() {
		return driver.findElement(iAgree);
	}
}

