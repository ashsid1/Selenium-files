package Sel;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindow {
	static String myurl="http://toolsqa.com/automation-practice-switch-windows/";
	public static void main(String[] args) throws InterruptedException {
		// to show switchwindow handle
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ayesha\\eclipse-workspace\\Selenium1\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get(myurl);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		Map <String, String> hsmap=new HashMap(); 
		
		hsmap.put("num1", "stringgg");
		hsmap.put("num2", "peoplentech");
		
		System.out.println(hsmap.get("num1"));
		
		String mainwin=driver.getWindowHandle();
		driver.findElement(By.id("button1")).click();
		Thread.sleep(2000);
		Set<String> wins=driver.getWindowHandles();
		for (String a: wins) {
			if(!a.equalsIgnoreCase(mainwin)) {
				driver.switchTo().window(a);
				System.out.println(driver.getTitle());
			}
		}
			driver.switchTo().window(mainwin);
				
			}
	

}

