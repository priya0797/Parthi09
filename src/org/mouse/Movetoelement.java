package org.mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Movetoelement {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\umama\\eclipse-workspace\\Actions\\driver\\N.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.greenstechnologys.com/");
	driver.manage().window().maximize();
	Actions acc = new Actions(driver);
	WebElement tab = driver.findElement(By.xpath("//a[text()='COURSES'] "));
	acc.moveToElement(tab).perform();
	Thread.sleep(2000);
	WebElement accoracle = driver.findElement(By.xpath("//span[text()='Oracle Training ']"));
	acc.moveToElement(accoracle).perform();
	Thread.sleep(2000);
	WebElement sql = driver.findElement(By.xpath("//span[text()='Oracle SQL Training']"));
	sql.click();
	
	
	
}
}
