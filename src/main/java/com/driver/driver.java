package com.driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Locator.signUpPage;

public class driver extends signUpPage {

	public WebDriver driver;
	public driver() {
		browserExecutor();
	}

	public void browserExecutor() {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/driver/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		driver = new ChromeDriver(options);
        driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php");
		System.out.println("url launched");

	}
}
