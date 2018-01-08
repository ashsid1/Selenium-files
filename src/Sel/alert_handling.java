package Sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert_handling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ayesha\\eclipse-workspace\\Selenium1\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		alert class creation uses switchto.alert
		driver.findElement(By.xpath("//button[text()='Simple Alert']")).click();
		Thread.sleep(3000);
		System.out.println(driver.switchTo().alert().getText());
//		if it is something positive (like we have to click OK or yes) then use accept
		driver.switchTo().alert().accept();
//		driver.findElement(By.xpath("//button[contains(@class,' firepath-matching-node')]")).click();
//		Thread.sleep(3000);
	}
	}


