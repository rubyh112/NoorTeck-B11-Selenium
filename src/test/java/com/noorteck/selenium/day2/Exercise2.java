package com.noorteck.selenium.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.Hooks;

public class Exercise2 extends Hooks {
	public static void main(String[] args) throws InterruptedException {

		setUp();
		driver.get("https://demo.guru99.com/test/newtours/");
		Thread.sleep(1000);

		WebElement registerLink = driver.findElement(By.cssSelector(
				"body > div:nth-child(5) > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(2) > td > table > tbody > tr > td:nth-child(2) > a"));
		registerLink.click();
		Thread.sleep(1000);

		String title = driver.getTitle();
		if (title.equals("Register: Mercury Tours")) {
			System.out.println("Murcury Tours: verified");
			Thread.sleep(1000);

			WebElement firstName = driver.findElement(By.name("firstName"));
			firstName.sendKeys("Ruby");
			Thread.sleep(1000);

			WebElement lasttName = driver.findElement(By.name("lastName"));
			lasttName.sendKeys("Haddad");
			Thread.sleep(1000);

			WebElement PhoneNumber = driver.findElement(By.name("phone"));
			PhoneNumber.sendKeys("919-348-3191");
			Thread.sleep(1000);

			WebElement email = driver.findElement(By.id("userName"));
			email.sendKeys("Rubyhaddad18@gmail.com");
			Thread.sleep(1000);

			WebElement address = driver.findElement(By.name("address1"));
			address.sendKeys("4348 Alta Peak rd");
			Thread.sleep(1000);

			WebElement city = driver.findElement(By.name("city"));
			city.sendKeys("Houston");
			Thread.sleep(1000);

			WebElement stateProvince = driver.findElement(By.name("state"));
			stateProvince.sendKeys("Texas");
			Thread.sleep(1000);

			WebElement postalCode = driver.findElement(By.name("postalCode"));
			postalCode.sendKeys("77030");
			Thread.sleep(1000);

			WebElement countryDropdown = driver.findElement(By.name("country"));
			Select selectObj = new Select(countryDropdown);

			List<WebElement> countryList = selectObj.getOptions();
			for (WebElement country : countryList) {
				String countryStr = country.getText();
				if (countryStr.contains("UNITED STATES")) {
					System.out.println(countryStr);
					country.click();
				}
			}
		}
		WebElement userNameField = driver.findElement(By.id("email"));
		userNameField.sendKeys("rubyhaddad18@gmail.com");
		Thread.sleep(1000);

		WebElement passwordField = driver.findElement(By.name("password"));
		passwordField.sendKeys("123456");

		WebElement confirmPasswordField = driver.findElement(By.name("confirmPassword"));
		confirmPasswordField.sendKeys("123456");

		WebElement submitBtn = driver.findElement(By.name("submit"));
		submitBtn.click();
		Thread.sleep(1000);
		
		
		WebElement confirMessage = driver.findElement(By.xpath("(//font[@size ='2'])[2]"));

		String checkConfirm = confirMessage.getText();
		if (checkConfirm.contains("Thank you for registering.")) {
			System.out.println("TestCase PASSED");
			System.out.println("Done");
			
		}

		else {
			System.out.println("TestCase Failed");
		}
		Thread.sleep(1000);
		tearDown();

	}
}
