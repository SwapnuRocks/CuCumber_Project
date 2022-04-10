package CucumberOptions;
import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import Resourse.BaseClass;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/FeatureFiles",
		glue="StepDefinationFile"
		//dryRun=true
        
       )
public class TestRunner{

}
//features="src/test/resources/FeatureFiles",tags="@feature1scenariogroup1,@feature2cenariogroup2"