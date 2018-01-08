package Sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Unitedairlines {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ayesha\\eclipse-workspace\\Selenium1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver ();
		
		driver.manage().window().maximize();
		driver.get("https://www.united.com/ual/en/us/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("Origin")).sendKeys("WAS");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@data-code='BWI']")).click();
		
		driver.findElement(By.id("Destination")).sendKeys("NYC");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@data-code='JFK']")).click();
		
		
//		to find link count in website
		
//		System.out.println(driver.findElements(By.tagName("a")).size());
		
		driver.findElement(By.xpath(".//*[@id='specificDateSection']/div[1]/label")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[2]/table/tbody/tr[1]/td[2]/a")).click();
		
		driver.findElement(By.xpath(".//*[@id='returnDateTimeDiv']/label")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[2]/td[2]/a")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='travelers-selector']/span/span[2]")).click();
		Thread.sleep(2000);
		Actions ac=new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath(".//*[@id='travelers-select']/div/ul/li[1]/div/a[2]"))).click().click().build().perform();
//		driver.findElement(By.xpath(".//*[@id='travelers-select']/div/ul/li[1]/div/a[2]")).click();
		Thread.sleep(2000);
//		driver.findElement(By.xpath(".//*[@id='cabinType']/option[2]")).click();
//		Thread.sleep(2000);
		
		Select flightclass=new Select(driver.findElement(By.xpath(".//*[@id='cabinType']")));
		flightclass.selectByVisibleText("Business or First");
		Thread.sleep(2000);
		
		WebElement AwardTr=driver.findElement(By.xpath("//input[@id='AwardTravel']"));
//		System.out.println(AwardTr.isSelected());
//		AwardTr.click();
//		System.out.println(AwardTr.isSelected());
//		Thread.sleep(2000);
//		create a webelement with a method in public static void that can be called upon in main
		WebElement stops=driver.findElement(By.xpath("//input[@id='NonStopOnly']"));
		System.out.println(stops.isDisplayed());
		clickcheck(AwardTr);
		clickcheck(stops);
		
		WebElement Hotelto=driver.findElement(By.xpath(".//*[@id='openeditsearchorigin']/label"));
//		System.out.println(Hotelto.isDisplayed());
//		System.out.println(Hotelto.isEnabled());
		
		
//		System.out.println(stops.isSelected());
//		stops.click();
//		System.out.println(stops.isSelected());
//		Thread.sleep(2000);
//		IMPORTANT INTERVIEW QUESTION!! to find out if an element exists or not 
		if(driver.findElements(By.xpath("asdasdasda")).size()==0) {
			System.out.println("this element does not exist");
		}
		driver.navigate().to("https://www.facebook.com/");
		driver.navigate().refresh();
//		EleExist("id","email");
//		driver.findElement(By.xpath(".//*[@id='flightBookingSubmit']")).click();
		
	}
	public static void EleExist(String locat, String locator) {
		int i;
		if(locat.equals("xpath")) {
		i=driver.findElements(By.xpath(locator)).size();
		if(i==0) {
			System.out.println("this element does not exist!!");
		}	else if(locat.equals("css")) {
			i=driver.findElements(By.cssSelector(locator)).size();
			if(i==0) {
				System.out.println("this element does not exist!!");
			} else if(locat.equals("id")) {
				i=driver.findElements(By.id(locator)).size();
				if(i==0){
					System.out.println("this element does not exist!!");
				}
		}
		}}
		
	}
	
	
	public static void clickcheck(WebElement a) throws InterruptedException {
		if(a.isSelected()==false) {
			a.click();
			Thread.sleep(2000);
			if(a.isSelected()==true) {
				System.out.println("I have checked the box");
			}
			else {
				System.out.println("I am not able to check the  box ");
			}
		}
		else {
			System.out.println("Box is already checked.");
			}
	}
	}


