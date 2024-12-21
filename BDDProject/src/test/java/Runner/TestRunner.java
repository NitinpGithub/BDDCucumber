package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//import org.junit.runner.RunWith;

//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/featureFiles",
		glue="stepDefination",
		publish=true,
		plugin={"pretty","html:target/HtmlReport.html"})
public class TestRunner extends AbstractTestNGCucumberTests{
}
