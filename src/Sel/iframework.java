package Sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ayesha\\eclipse-workspace\\Selenium1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://toolsqa.com/iframe-practice-page/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		to find out number of frames in page
		System.out.println(driver.findElements(By.tagName("iframe")).size());
//		first switch to the index of the frame
		driver.switchTo().frame("IF1");
		
		driver.findElement(By.xpath(".//*[@id='content']/div[1]/div/div/div/div[2]/div/form/fieldset/div[8]/input")).sendKeys("Ayesha");
		driver.findElement(By.xpath(".//*[@id='content']/div[1]/div/div/div/div[2]/div/form/fieldset/div[11]/input")).sendKeys("Siddiqui");
//		always go back to main page
		driver.switchTo().defaultContent();
//		to switch to some other frame
		driver.switchTo().frame(1);
		driver.findElement(By.xpath(".//*[@id='ui-id-1']")).click();
		
		driver.switchTo().defaultContent();
		String a=driver.findElement(By.xpath(".//*[@id='content']/p[6]")).getText();
		System.out.println(a);
		
		driver.switchTo().defaultContent();
		
	}

}
