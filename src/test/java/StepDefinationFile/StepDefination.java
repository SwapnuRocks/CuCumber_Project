package StepDefinationFile;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ObjectpageModel.loginPOM;
import Resourse.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class StepDefination extends BaseClass {
    
	public WebDriver driver;

    @Given("^Initialize the Chrome Browser$")
    public void initialize_the_chrome_browser() throws Throwable {
    	driver=initializeDriver();
		//driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
    
    }
    
    @And("^nevigate to \"([^\"]*)\"$")
    public void nevigate_to_something(String strArg1) throws Throwable {
    	driver.get(strArg1);
       
    }

    @When("^User enters (.+) and (.+) and click on Login Button$")
    public void user_enters_and_and_click_on_login_button(String Username, String Passward) throws Throwable {
    //	driver.findElement(By.xpath("//input[@id='username']")).sendKeys(Username);
    	//driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Passward);
    	//driver.findElement(By.xpath("//input[@id='Login']")).click();
    	loginPOM abc=new loginPOM(driver);
    	abc.enterusername().sendKeys(Username);
    	abc.enterpassward().sendKeys(Passward);
    	abc.clicklogin().click();
    	
    	
       
    }

    @Then("^User should be able to login$")
    public void user_should_be_able_to_login() throws Throwable {
       
    }

   

}
   
    
    
    
    /*@Given("^Initialize the Chrome Browser$")
    public void initialize_the_chrome_browser() throws Throwable {
    	System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\Desktop\\Selinum Jas Data\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
       
    }

    @And("^nevigate to \"([^\"]*)\"$")
    public void nevigate_to_something(String strArg1) throws Throwable {
    	driver.get(strArg1);
        
    }


    @When("^User enters (.+) and (.+) and click on Login Button$")
    public void user_enters_and_and_click_on_login_button(String Username, String Passward) throws Throwable {
    	driver.findElement(By.xpath("//input[@id='username']")).sendKeys(Username);
    	driver.findElement(By.xpath("//input[@id='passwor//input[@id='usernamed']")).sendKeys(Passward);
    	driver.findElement(By.xpath("//input[@id='Login']")).click();
        
    }

    @Then("^User should be able to login$")
    public void user_should_be_able_to_login() throws Throwable {
        
    }
*/
	


