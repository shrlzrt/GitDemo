import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumIntroduction {

	public static void main(String[] args) {
		
		//ChromeDriver driver = new ChromeDriver();
		//webdriver.driver.chromedriver -> value of path
		/* "D:/Automation/Selenium/chromedriver" or D:\\Automation\\Selenium\\chromedriver.exe */
//		WebDriver driver = new ChromeDriver();
//		System.setProperty("webdriver.driver.chromedriver", "D:/Automation/Selenium/chromedriver");
		
//		WebDriver driver = new FirefoxDriver();
//		System.setProperty("webdriver.driver.geckodriver", "D:\\Automation\\Selenium\\geckodriver");
		
		WebDriver driver = new EdgeDriver();
//		System.setProperty("webdriver.driver.edgedriver", "D:\\Automation\\Selenium\\msedgedriver.exe"); 
	
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		driver.close();
		//driver.quit();

	}

}
