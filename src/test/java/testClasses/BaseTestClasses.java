package testClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageClass.DashBoard;
import pageClass.LoginPage;

public class BaseTestClasses {

static WebDriver driver;
LoginPage lip;
DashBoard dsh;

@BeforeSuite
public void launchURL()
{
	WebDriverManager.chromedriver().setup();
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--start-maximized");
	options.addArguments("--disable-notifications");
	driver=new ChromeDriver(options);
	driver.get("https://kite.zerodha.com/");
}

@BeforeClass
public void creationObject()
{
	lip=new LoginPage(driver);
	dsh=new DashBoard(driver);
}


}

//@AfterSuite
/*public void closebrowser()
{
  driver.close();

}*/


