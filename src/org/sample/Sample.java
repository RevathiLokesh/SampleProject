package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\MvnProject\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");

WebElement txtUsername = driver.findElement(By.id("email"));
txtUsername.sendKeys("revathisugumar1992@gmail.com");

WebElement txtPass = driver.findElement(By.id("pass"));
txtPass.sendKeys("Revathi");

WebElement btnSignup = driver.findElement(By.name("login"));
btnSignup.click();
}
}
