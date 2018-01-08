package Sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingwithalerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Usman\\eclipse-workspace\\Selenium_3\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/selenium/delete_customer.php");
		Thread.sleep(2000);
		driver.findElement(By.name("cusid")).sendKeys("12345");
		driver.findElement(By.name("submit")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		driver.findElement(By.name("submit")).click();
		
		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());
	
		//Thread.sleep(2000);
		
		
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(4000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("3245");
//		driver.findElement(By.name("submit")).click();
//		Thread.sleep(3000);
//		System.out.println(driver.switchTo().alert().getText());
//		
//		driver.switchTo().alert().dismiss();
//		
//		driver.findElement(By.name("submit")).click();
//		Thread.sleep(3000);
//		driver.switchTo().alert().accept();
//		driver.switchTo().alert().accept();
		
		
		
		

	}

}
