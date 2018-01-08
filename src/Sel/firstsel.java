package Sel;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.firefox.FirefoxDriver;



public class firstsel {
	
	final static String myurl="https://www.facebook.com/";
//	to make a global string url open globally across browsers

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver1.chrome.driver", "C:\\Users\\Ayesha\\eclipse-workspace\\Selenium1\\chromedriver.exe");
//	System.setProperty("webdriver2.gecko.driver", "C:\\Users\\Ayesha\\eclipse-workspace\\Selenium1\\geckodriver.exe");
//		WebDriver driver2=new FirefoxDriver();
//		driver2.get("https://www.facebook.com/");
//		Webdriver is interface and Chromedriver is the class of this interface
		WebDriver driver=new ChromeDriver();
		
		driver.get(myurl);
		driver.manage().window().maximize();
//		to maximize the window before opening the page
		driver.get("https://www.facebook.com/");
		System.out.println(driver.findElements(By.xpath(".//*[@id='globalContainer']/div[2]//a")).size());
//		WebElement Firstname=driver.findElement(By.name("firstname"));
//		Firstname.sendKeys("Ayesha");
//		
//		WebElement Lastname=driver.findElement(By.name("lastname"));
//		Lastname.sendKeys("Siddiqui");
//		
//		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email']")).sendKeys("7038153922");
//		WebElement NewPazword=driver.findElement(By.name("reg_passwd__"));
//		NewPazword.sendKeys("AyeshaRocks");
//		
//		Select months=new Select(driver.findElement(By.id("month")));
//		months.selectByVisibleText("Mar");
//		
//		Select dayz=new Select(driver.findElement(By.id("day")));
//		dayz.selectByVisibleText("16");
//		
//		Select yearz=new Select(driver.findElement(By.id("year")));
//		yearz.selectByVisibleText("1985");
//		
//		driver.findElement(By.xpath("//input[@id='u_0_6']")).click();
//		
//		driver.findElement(By.xpath("//button[@id='u_0_r']")).click();
//		
		
		
////		in selenium 3.4 doubleclick is not working
//		Actions ac=new Actions(driver);
//		ac.doubleClick(driver.findElement(By.xpath("//h2[text()='Sign Up']"))).build().perform();
//		rightclick on screen
		//ac.contextClick(driver.findElement(By.xpath("//h2[text()='Sign Up']"))).build().perform();
//		mine is below
//		ac.contextClick(driver.findElement(By.xpath("//h2[text()='Sign Up']"))).build().perform();
		//Thread.sleep(5000);

		//driver.findElement(By.id("email")).sendKeys("hahaha");
//		to press enter
//		ac.keyDown(Keys.CONTROL).sendKeys(Keys.ENTER).keyUp(Keys.CONTROL).build().perform();
//		to delete text written previously
//		ac.keyDown(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).keyUp(Keys.CONTROL).build().perform();
//		to tab over
//		ac.sendKeys(Keys.TAB).build().perform();
		
				
		
	}}
//		WebElement Emllogin=driver.findElement(By.id("email"));
//		Emllogin.sendKeys("maurier1985@gmail.com");
//		
//		WebElement Pazword=driver.findElement(By.id("pass"));
//		Pazword.sendKeys("motakray");
//		
//		WebElement LoginButton=driver.findElement(By.xpath("//input[@data-testid='royal_login_button']"));
//		LoginButton.click();
//		
//		
//				
//months.selectByIndex(3); 
//months.selectByValue("8");
//		
//		
//		WebElement Mobilenum=driver.findElement(By.xpath("//input[@name='reg_email__']"));
//		Mobilenum.sendKeys("1234567");
//		
//		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email'])")).sendKeys("1234345");
//		
//		
//		
//		
//		driver.findElement(By.linkText("Forgot account?")).click();
//		
//		driver.findElement(By.partialLinkText("Why do I")).click();
//		
//		WebElement Firstname=driver.findElement(By.xpath("//input[@name='firstname']"));
//		Firstname.sendKeys("Ayesha");
//		
//		WebElement Lastname=driver.findElement(By.xpath("//input[@name='lastname']"));
//		Lastname.sendKeys("Siddiqui");
//		String expecttitle="Facebook - Log In or Sign Up";
//		String Title= driver.getTitle();
//		System.out.println(Title);
//		System.out.println(driver.getTitle());
//		to get the title of the tab of the page
//		
////		if(Title.equals(expecttitle)) {
////			System.out.println("My test passed");
////		}else {
////			System.out.println("My test failed");
////		}
//////		To compare the title with expected title.test case.
////		String url= driver.getCurrentUrl();
//////		System.out.println(driver.getPageSource());
//////		to get pagesource or source code of the page
////		
////		System.out.println(url);
//////		to get url of driver(page you are interested in)
		
////		driver.close();
//		
//		}
//
//}
