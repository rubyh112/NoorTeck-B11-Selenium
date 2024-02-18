package com.noorteck.selenium.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class Exercise7iFrame extends Hooks {
	public static void main(String[] args) throws InterruptedException {

		setUp();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		Thread.sleep(1000);
		WebElement openqaSelenium = driver.findElement(By.xpath("//a[text()='org.openqa.selenium']"));
		openqaSelenium.click();
		Thread.sleep(1000);
		
		WebElement alertbtn = driver.findElement(By.xpath("//a[text()='Alert']"));
		alertbtn.click();
		Thread.sleep(3000);
		
		
		WebElement textMsg = driver.findElement(By.xpath("//h1[text()='Interface Alert']"));
		String checkMessg = textMsg.getText();

		if (checkMessg.equals("Interface Alert")) {
			System.out.println("TestCase PASSED");
		}else {
			System.out.println("TESTCASE FAILED");
		
			Thread.sleep(3000);
		}
		
		tearDown();
	}

}
