package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyFirstTest {

	public static void main(String[] args) throws InterruptedException {
		
	//	WebDriverManager.firefoxdriver().setup();
	//	WebDriver driver = new FirefoxDriver();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.zoho.com/");
		driver.findElement(By.linkText("Sign In")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("login_id")).sendKeys("seeu11980@gmail.com");
		driver.findElement(By.xpath("//button[@id='nextbtn']")).click();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Qed@1980");
		driver.findElement(By.xpath("//button[@id='nextbtn']")).click();
		

	}

}
