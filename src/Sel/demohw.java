package Sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demohw {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Ayesha\\\\eclipse-workspace\\\\Selenium1\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demoqa.com/registration/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='name_3_firstname']")).sendKeys("Ayesha");
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='name_3_lastname']")).sendKeys("Siddiqui");
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='pie_register']/li[2]/div/div/input[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='pie_register']/li[3]/div/div/input[1]")).click();
		Thread.sleep(1000);
		Select Count = new Select(driver.findElement(By.xpath(".//*[@id='dropdown_7']")));
		Count.selectByVisibleText("United Arab Emirates");
		Thread.sleep(1000);
		Select slc= new Select(driver.findElement(By.xpath(".//*[@id='mm_date_8']")));
	    slc.selectByVisibleText("12");
	    Thread.sleep(1000);
	    Select sld=new Select(driver.findElement(By.xpath(".//*[@id='dd_date_8']")));
	    sld.selectByVisibleText("16");
	    Thread.sleep(1000);
	    Select scl= new Select(driver.findElement(By.xpath(".//*[@id='yy_date_8']")));
	    scl.selectByVisibleText("1985");
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='phone_9']")).sendKeys("123456789101");
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("Ashsid");
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='email_1']")).sendKeys("maurier1985@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='password_2']")).sendKeys("12345678");
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='confirm_password_password_2']")).sendKeys("12345678");
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='pie_register']/li[14]/div/input")).click();
		Thread.sleep(10000);
		driver.close();

	}

}
