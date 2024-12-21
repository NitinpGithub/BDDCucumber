package Hooks;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import Utils.configReaderTest;
import factory.DriverFactoryTest;
import io.cucumber.java.*;

public class MyHooksTest
{
	
	WebDriver driver;
	@Before
	public void SetUp() throws IOException
	{
		Properties prop = configReaderTest.readConfigData();
		DriverFactoryTest.initilizebrowser(prop.getProperty("browser"));
		driver = DriverFactoryTest.getDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(prop.getProperty("url"));
	}
	
	@After
	public void TeatDown()
	{
		driver.quit();
	}

}
