package com.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public WebDriver driver;
	
	public WebDriver launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\LatestChrome\\chromedriver.exe");
		driver=new ChromeDriver();
		return driver;
	}
	
	public void enterURL() {
		driver.get("http://automationpractice.com/index.php");
	}
}
