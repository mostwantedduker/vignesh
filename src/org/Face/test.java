package org.Face;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\LENOVO PC\\\\eclipse-workspace\\\\Comp\\\\driver\\\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://mypage.rediff.com/login/dologin");
	driver.manage().window().maximize();
	
	Alert ai =  driver.switchTo().alert();
	WebElement li = driver.findElement(By.xpath("//input[@type='submit']"));
	li.click();
	
	
	
}
}
