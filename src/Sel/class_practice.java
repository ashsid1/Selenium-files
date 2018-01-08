package Sel;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class class_practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ayesha\\eclipse-workspace\\Selenium1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS );
		
//		driver.findElement(By.xpath("//strong[contains(.,'Partial Link Test')]\"));"));
//		driver.findElement(By.xpath("//strong[contains(.,'Link Test')]"));
		
		WebElement FirstName=driver.findElement(By.name("firstname"));
		FirstName.sendKeys("Ayesha");
		
		WebElement LastName=driver.findElement(By.name("lastname"));
		LastName.sendKeys("Siddiqui");
		
		driver.findElement(By.xpath("//input[@id='sex-1']")).click();
		driver.findElement(By.xpath("//input[@id='exp-4']")).click();
		
		WebElement Dates=driver.findElement(By.id("datepicker"));
		Dates.sendKeys("12/13/2017");
		
		driver.findElement(By.xpath("//input[@id='profession-1']")).click();
		
//		driver.findElement(By.xpath("//a[@href='http://toolsqa.wpengine.com/wp-content/uploads/2014/04/OnlineStore.zip']"));
//		driver.findElement(By.xpath("//a[@href='http://20tvni1sjxyh352kld2lslvc.wpengine.netdna-cdn.com/wp-content/uploads/2016/09/Test-File-to-Download.xlsx']"));
	
		driver.findElement(By.xpath("//input[@id='tool-2']")).click();
		
		Select continentz=new Select(driver.findElement(By.id("continents")));
		continentz.selectByVisibleText("North America");
		
		Select Commandz=new Select(driver.findElement(By.id("selenium_commands")));
		Commandz.selectByVisibleText("Switch Commands");
		
		Thread.sleep(5000);
//		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		
	}

}
