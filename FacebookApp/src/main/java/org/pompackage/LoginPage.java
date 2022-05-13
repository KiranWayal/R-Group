package org.pompackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy (xpath="//input[@id='email']")
	 private WebElement username;
	
	@FindBy (xpath="//input[@id='pass']")
	private WebElement password;
	
	@FindBy (xpath="//button[@name='login']")
	private WebElement loginbtn;
	
	public void user()
	{
		username.sendKeys("KiranWayal");
	}
	
	public void pass()
	{
		password.sendKeys("12345678");
	}
	
	public void login()
	{
		loginbtn.click();
	}
	
	public LoginPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
    }	
}
