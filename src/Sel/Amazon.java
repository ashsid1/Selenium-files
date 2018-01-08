package Sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ayesha\\eclipse-workspace\\Selenium1\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		String url= driver.getCurrentUrl();
		System.out.println(url);
		
		
//		WebElement Searchbar=driver.findElement(By.name("field-keywords"));
//		Searchbar.sendKeys("alexa");
//		Thread.sleep(4000);
//		above thread sleep is an explicit wait.
//		driver.findElement(By.xpath("//input[@tabindex='20']")).click();

		Actions ac=new Actions(driver);
//		
//		ac.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(".//*[@id='nav-flyout-ya-signin']/a/span")).click();
		
		ac.moveToElement(driver.findElement(By.id("nav-link-prime"))).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='nav-flyout-prime']/div[2]/div[1]/div[3]/a")).click();
		
		System.out.println(driver.getTitle());
		
//		String expectedtitle= "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
//		String Title=driver.getTitle();
//		System.out.println(Title);
//		
//		if(Title.equals(expectedtitle)) {
//			System.out.println("Excellent deduction Watson!");
//		}else {
//			System.out.println("Wrong! Wrong! Wrong!");
//		}
		
//		System.out.println(driver.getPageSource());
		
		
		
		
		
//		driver.close();
	}

}
