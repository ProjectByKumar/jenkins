package com.training.jenkins;

import static org.junit.Assert.*;

import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class SampleSeleniumDemo {

WebDriver driver;
	
	@BeforeClass
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asheesh\\OWASP ZAP\\webdriver\\windows\\32\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
		driver= new ChromeDriver(chromeOptions);
	}
	
	@org.testng.annotations.Test
	public void validateAmazonAccount() {
		System.out.println("Launching Browser");
		driver.get("https://www.amazon.in/");
		System.out.println("Click on sign in");
		driver.findElement(By.id("nav-link-accountList")).click();
		System.out.println("Enter Email id");
		driver.findElement(By.id("ap_email")).sendKeys("educatioupgrade@gmail.com");
		System.out.println("Click on continue button");
		driver.findElement(By.id("continue")).click();
		System.out.println("finding forgot password link");
		boolean linkPresent = driver.findElement(By.id("auth-fpp-link-bottom")).isDisplayed();
		AssertJUnit.assertTrue(linkPresent);
		
	}

	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
}
