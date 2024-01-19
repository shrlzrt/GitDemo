import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calendar {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companion/");
		//Scroll the page
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1200)");
		Thread.sleep(7000);		
		driver.findElement(By.id("form-field-travel_comp_date")).click();
	
		Thread.sleep(7000);		
		/* Click the month -> If not (!) the desired month, then click next icon */
		while(!driver.findElement(By.className("flatpickr-month")).getText().contains("December")) {
			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".flatpickr-next-month")));
			driver.findElement(By.cssSelector(".flatpickr-next-month")).click();
		}
		/* Selecting date -> Grab common attribute, put into list then iterate */
		List<WebElement> dates = driver.findElements(By.className("flatpickr-day"));
		int count = driver.findElements(By.className("flatpickr-day")).size();
		for(int i=0;i<count;i++) {
			String text = dates.get(i).getText();
			if(text.equalsIgnoreCase("15")) {
				dates.get(i).click();
				break;
			}			
		}
	}
}
