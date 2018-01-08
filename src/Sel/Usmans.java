package Sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Usmans {
	public static void main(String[] args) throws InterruptedException {
		
	
	 String fn[]= {"John", "Steve", "Usman", "Zayan"};
     String ln[]= {"Evans", "Smith", "Suleman", "Usman"};
     String pn[]= {"4962177", "9124430", "7690908", "6877717"};
     String pw[]= {"asdftf", "sdhfhkas", "shdfas", "jksdahfh"};
     String pw1[]= {"asdftf", "sdhfhkas", "shdfas", "jksdahfh"};
     String em[]= {"aa.s@gmail.com", "ad@gmail.com", "asd@gmail.com", "adasd@gmail.com"};
     
     for (int i=0; i<fn.length;i++)
      
     {
   
     System.setProperty("webdrive.chrome.driver",
         "C:\\\\Users\\\\Ayesha\\\\eclipse-workspace\\\\Selenium1\\\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
     
     
     driver.get("https://www.facebook.com/");
     System.out.println(driver.getTitle());
//     WebElement emailLogin= driver.findElement(By.id("email"));
//     emailLogin.sendKeys("aali.usman");
     
//     Select slc= new Select(driver.findElement(By.id("month")));
//     slc.selectByVisibleText("May");
//     
//     Select sld=new Select(driver.findElement(By.id("day")));
//     sld.selectByVisibleText("13");
////     sld.selectByValue("1");
////     sld.deselectByIndex(4);
//     
//     Select scl= new Select(driver.findElement(By.id("year")));
//     scl.selectByVisibleText("1993");
     
     
     
     WebElement emailLogin= driver.findElement(By.id("email"));
     emailLogin.sendKeys(em[i]);
     
     WebElement password= driver.findElement(By.id("pass"));
     password.sendKeys(pw[i]);
     
     WebElement Fname= driver.findElement(By.xpath("//input[@aria-label='First name']"));
     Fname.sendKeys(fn[i]);
     WebElement Lname= driver.findElement(By.xpath("//input[@aria-label='Last name']"));
     Lname.sendKeys(ln[i]);
//     
//     WebElement fname= driver.findElement(By.name("firstname"));
//     fname.sendKeys(fn[i]);
//     WebElement lname= driver.findElement(By.name("lastname"));
//     lname.sendKeys(ln[i]);
//     
//     
    // explicit way
     Thread.sleep(4000);
     WebElement mobile= driver.findElement(By.name("reg_email__"));
     mobile.sendKeys(pn[i]);
     //WebElement psw= driver.findElement(By.name("reg_passwd__"));
     //psw.sendKeys("abcd1234");
     driver.findElement(By.xpath("//input[@aria-label='New password']")).sendKeys(pw1[i]);
     Thread.sleep(5000);
     driver.close();
     }}}

