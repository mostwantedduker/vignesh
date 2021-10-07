package org.Face;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO PC\\eclipse-workspace\\Comp\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	WebElement txtbtn = driver.findElement(By.xpath("//a[text()='Create a new account']"));
	txtbtn.click();
	Thread.sleep(1000);
	
	WebElement txtusername = driver.findElement(By.name("firstname"));
	txtusername.sendKeys("Vignesh");
	WebElement txtlastname = driver.findElement(By.name("lastname"));
	txtlastname.sendKeys("subramanian");
	
	}
}
