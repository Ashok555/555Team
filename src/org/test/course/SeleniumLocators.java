package org.test.course;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocators {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashok 555\\eclipse-workspace\\bharath\\Ashok\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://github.com/login");
	WebElement txtUserName = driver.findElement(By.id("login_field"));
	txtUserName.sendKeys("Ashok555");
	WebElement txtPass = driver.findElement(By.id("password"));
	txtPass.sendKeys("Ashok555");
	WebElement signIn = driver.findElement(By.name("commit"));
	signIn.click();
	driver.close();
}
}
