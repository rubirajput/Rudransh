package pageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {



	WebDriver driver;
	@FindBy(xpath="//input[@type='text']")
	private WebElement userId;
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	@FindBy(xpath="//button[@type='submit']")//---->driver.findElement:partial initilization: with method
	//execute: full initiation of web element takes place
	private WebElement clickButton;
	@FindBy(xpath="//input[@type='password']")
	private WebElement pin;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement continueButton;
	
	
	public LoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
		}
	
	
	public void login() throws InterruptedException
	{
		userId.sendKeys("LGD943");
		password.sendKeys("shree@1234");
		clickButton.click();
		Thread.sleep(3000);
		pin.sendKeys("123456");
		clickButton.click();
	}
}
