import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment8 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("autocomplete")).sendKeys("uni");
		List<WebElement> options = driver.findElements(By.cssSelector(".ui-menu-item div"));
		
		for(WebElement option1:options) {			
			if(option1.getText().contains("USA")) {
				option1.click();
				break;
			}
		}		
		/* Alternative Solution */
//		Thread.sleep(3000);
//		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
//		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
//		System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));
	}
}
