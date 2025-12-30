package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;

public class MyFirsttestFW extends BaseTest {

	@Test
	public static void LoginTest() throws InterruptedException {
		
		driver.findElement(By.linkText("Sign In")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("login_id")).sendKeys("seeu11980@gmail.com");
		driver.findElement(By.xpath("//button[@id='nextbtn']")).click();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Qed@1980");
		driver.findElement(By.xpath("//button[@id='nextbtn']")).click();
	}
}
