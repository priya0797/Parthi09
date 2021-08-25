package org.mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Movetoelements {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\umama\\eclipse-workspace\\Actions\\driver\\N.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		Actions acc = new Actions(driver);
	WebElement findElement = driver.findElement(By.xpath("//a[text()='COURSES']"));
	acc.moveToElement(findElement).perform();
	WebElement onlee = driver.findElement(By.xpath("//*[@id=\'nav-wrapper\']/ul/li[3]/ul/li[7]/a/span"));
	acc.moveToElement(onlee).perform();
		
		
//		WebElement pass = driver.findElement(By.name("lastname"));
//		pass.sendKeys("priya");
		
	}
}
