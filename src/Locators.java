import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.driver.chromedriver", "D:\\Automation\\Selenium\\chromedriver.exe");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice");
		driver.findElement(By.id("inputUsername")).sendKeys("shar");
		driver.findElement(By.name("inputPassword")).sendKeys("shar123");
		driver.findElement(By.className("signInBtn")).submit();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
//		System.out.println(driver.findElement(By.cssSelector(".error")).getText()); //CSS via className
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000); //2000msecs = 2secs
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("shar");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("shar@gmail.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear(); //to clear the text @line 25
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("sharlynzarate@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("1234");
//		driver.findElement(By.cssSelector("form input:nth-child(4)")).sendKeys("1234");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click(); 
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
//		driver.findElement(By.cssSelector("div button:nth-child(1)")).click();
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("shar");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		Thread.sleep(1000);
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//button[contains(@class,'signInBtn')]")).click();		
	}

}