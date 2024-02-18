package com.noorteck.selenium.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.Hooks;

public class Exercise3 extends Hooks {
	public static void main(String[] args) throws InterruptedException {

		setUp();
		driver.get("https://demo.nopcommerce.com/");
		Thread.sleep(1000);

		//WebElement registerLink = driver.findElement(By.cssSelector(
		//		"body > div.master-wrapper-page > div.header > div.header-upper > div.header-links-wrapper > div.header-links > ul > li:nth-child(1) > a"));
		WebElement registerLink = driver.findElement(By.xpath("//a[contains(@class,'ico')]"));
		registerLink.click();
		Thread.sleep(1000);

		String title = driver.getTitle();
		if (title.equals("nopCommerce demo store. Register")) {
			System.out.println("Verify page title: nopCommerce demo store");
			Thread.sleep(1000);

			WebElement genderFemale = driver.findElement(By.id("gender-female"));
			genderFemale.click();
			Thread.sleep(1000);

			WebElement firstName = driver.findElement(By.id("FirstName"));
			firstName.sendKeys("Ruby");
			Thread.sleep(1000);

			WebElement lastName = driver.findElement(By.id("LastName"));
			lastName.sendKeys("Haddad");
			Thread.sleep(1000);

			WebElement dateOfBirth = driver.findElement(By.name("DateOfBirthDay"));
			Select selectDay = new Select(dateOfBirth);
			selectDay.selectByVisibleText("9");

			WebElement dateOfMonth = driver.findElement(By.name("DateOfBirthMonth"));
			Select selectMonth = new Select(dateOfMonth);
			selectMonth.selectByVisibleText("September");

			WebElement dateOfYear = driver.findElement(By.name("DateOfBirthYear"));
			Select selectYear = new Select(dateOfYear);
			selectYear.selectByVisibleText("2000");

			WebElement userEmail = driver.findElement(By.id("Email"));
			userEmail.sendKeys("Rubyhaddad18@gmail.com");
			Thread.sleep(1000);

			WebElement companyName = driver.findElement(By.id("Company"));
			companyName.sendKeys("Ruby H Design");
			Thread.sleep(1000);

			WebElement newsLettCheck = driver.findElement(By.id("Newsletter"));
			newsLettCheck.click();
			Thread.sleep(1000);

			WebElement passWord = driver.findElement(By.id("Password"));
			passWord.sendKeys("abcd1234");
			Thread.sleep(1000);

			WebElement repassWord = driver.findElement(By.id("ConfirmPassword"));
			repassWord.sendKeys("abcd1234");

			Thread.sleep(2000);

			WebElement clickSubmit = driver.findElement(By.id("register-button"));
			clickSubmit.click();

			WebElement message = driver.findElement(By.cssSelector(
					"body > div.master-wrapper-page > div.master-wrapper-content > div > div > div > div.page-body > div.result"));
			String checkMessg = message.getText();

			if (checkMessg.equals("Your registration completed!!!")) {
				System.out.println("TestCase PASSED");
			}

			else {

				System.out.println("TestCase FAILED");
			}
		}

		tearDown();

	}

}