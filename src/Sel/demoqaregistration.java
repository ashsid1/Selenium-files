package Sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demoqaregistration {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ayesha\\eclipse-workspace\\Selenium1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demoqa.com/registration/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath(".//*[@id='name_3_firstname']")).sendKeys("Ayesha");
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='name_3_lastname']")).sendKeys("Siddiqui");
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='pie_register']/li[2]/div/div/input[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='pie_register']/li[3]/div/div/input[2]")).click();
		Thread.sleep(1000);
		Select country=new Select(driver.findElement(By.xpath(".//*[@id='dropdown_7']")));
		country.selectByVisibleText("United Arab Emirates");
		Thread.sleep(1000);
		Select months=new Select(driver.findElement(By.id(".//*[@id='mm_date_8']")));
		months.selectByVisibleText("12");
		Thread.sleep(1000);
		Select Dayz=new Select(driver.findElement(By.id(".//*[@id='dd_date_8']")));
		Dayz.selectByVisibleText("16");
		Thread.sleep(1000);
		Select yearz=new Select(driver.findElement(By.id(".//*[@id='yy_date_8']")));
		yearz.selectByVisibleText("1985");
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='phone_9']")).sendKeys("451-213-4121");
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("Ashsid");
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='email_1']")).sendKeys("maurier1985@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='description']")).sendKeys("Hello Everyone!");
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='password_2']")).sendKeys("Liferocks");
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='confirm_password_password_2']")).sendKeys("Liferocks");
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='pie_register']/li[14]/div/input")).click();
	}

}
