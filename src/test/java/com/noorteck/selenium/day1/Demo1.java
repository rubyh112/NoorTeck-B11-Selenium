package com.noorteck.selenium.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		//1. we need to call setProperty() from system and pass 2 params
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\abbas\\Desktop\\selenium_b11\\geckodriver.exe");
		
		
		//2. create and object of WebDriver
		WebDriver driver = new FirefoxDriver();
		
		//now we can navigate to the URL
		driver.get("https://www.expedia.com/");
		
		
		Thread.sleep(2000);
		driver.quit();
		
	}
}
/**
firefox: Key --> webdriver.gecko.driver
chrome:  Key --> webdriver.chrome.driver

edge:    Key --> webdriver.edge.driver

safari:  Key --> webdriver.safari.driver
*/
