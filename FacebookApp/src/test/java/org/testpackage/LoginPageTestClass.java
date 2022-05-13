package org.testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pompackage.LoginPage;

public class LoginPageTestClass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		LoginPage obj = new LoginPage(driver);
		
		obj.user();
		obj.pass();
		obj.login();	
  }
}
