package pageClass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoard {
	WebDriver driver;
@FindBy(xpath="//span[text()='Dashboard']")
private WebElement dashBoard;
@FindBy(xpath="//*[@id=\"app\"]/div[2]/div/div/div/div[2]/div[1]/div/button")
private WebElement startInvesting;
@FindBy(xpath="//*[@id=\"app\"]/div[5]/div/div/div[1]/div/div/div/div/div/input")
private WebElement searchField;
public DashBoard(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public String dashboardIsDispalyed() throws InterruptedException
{
	Thread.sleep(3000);
	String text = dashBoard.getText();
	return text;
}
public boolean stratInvesting() throws InterruptedException
{
	Thread.sleep(3000);
	boolean actual = startInvesting.isEnabled();
	startInvesting.click();
	return actual;
}
public void searchShare() throws InterruptedException
{
	Thread.sleep(3000);
	searchField.sendKeys("sbi");
	Actions act=new Actions(driver);
	act.sendKeys(searchField, Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	
	
}
}



