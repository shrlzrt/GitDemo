import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.driver.chromedriver", "D:\\Automation\\Selenium\\chromedriver.exe");
		
		String name = "test";
		String password =getPassword(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.className("signInBtn")).submit();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
//		System.out.println(driver.findElement(By.cssSelector("p")).getText());
//		System.out.println(driver.findElement(By.xpath("//p")).getText());
//		System.out.println(driver.findElement(By.xpath("//p[contains(text(),'You are successfully logged in')]")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");		
//		driver.findElement(By.xpath("//button[contains(@class, 'log')]")).click();
//		driver.findElement(By.xpath("//button[contains(text(), 'Log')]")).click();
		driver.findElement(By.xpath("//button[text()='Log Out']")).click(); // -> can be also //*[text()='Log Out'] if no tag name. * means universal
		driver.close();
	}	
	public static String getPassword(WebDriver driver) throws InterruptedException {

		driver.get("https://rahulshettyacademy.com/locatorspractice");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click(); 
		String passwordText = driver.findElement(By.cssSelector("form p")).getText();
		//Please use temporary password 'rahulshettyacademy' to Login.
		String[] passwordArray = passwordText.split("'"); 	// split into two with apostrophe (') as center		
		//0th index = Please use temporary password 
		//1st index = 'rahulshettyacademy' to Login.
		String password = passwordArray[1].split("'")[0]; 	// split the 1st index again to get rahulshettyacademy alone
//		String[] passwordArray2 = passwordArray[1].split("'");
//		String password = passwordArray2[0];
		//0th index - rahulshettyacademy
		//1st index -  to Login.
		return password;		
		}
	}
