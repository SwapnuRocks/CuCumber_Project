package StepDefinationFile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import ObjectpageModel.signupPOM;
import Resourse.BaseClass;
import Resourse.constants;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdefinationSignup extends BaseClass {
	public WebDriver driver;


    @Given("^Initialize the Chrome Browser for signup$")
    public void initialize_the_chrome_browser_for_signup() throws Throwable {
    	driver = initializeDriver();

		driver.manage().window().maximize();
       
    }

    @And("^nevigate to this url \"([^\"]*)\"$")
    public void nevigate_to_this_url_something(String strArg1) throws Throwable {
    	driver.get(strArg1);
        
    }

    @When("^click on Try for free button$")
    public void click_on_try_for_free_button() throws Throwable {
       
    }

    @Then("^Enter the data on signup page$")
    public void enter_the_data_on_signup_page() throws Throwable {
        
    }

   
	 
}
