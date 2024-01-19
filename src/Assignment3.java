import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector("input#username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("input#password")).sendKeys("learning"); 
		driver.findElement(By.xpath("//span[text()=' User']/following-sibling::span")).click();
		
		WebElement dropdown = driver.findElement(By.cssSelector("select.form-control"));
		Select dd = new Select(dropdown);
		dd.selectByVisibleText("Student");
		
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.btn-success")));
		driver.findElement(By.cssSelector("button.btn-success")).click();
//		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.cssSelector("input.btn-md")).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.btn-info")));
				
		String[] itemsNeeded = { "iphone X", "Samsung Note 8", "Nokia Edge", "Blackberry" };
		addItems(driver, itemsNeeded);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a.btn-primary")));
		driver.findElement(By.cssSelector("a.btn-primary")).click();
		driver.findElement(By.cssSelector("button.btn-success")).click();
	}
	public static void addItems(WebDriver driver, String[] itemsNeeded) {
		int j = 0;
		List<WebElement> products = driver.findElements(By.cssSelector("h4.card-title"));

		for (int i = 0; i < products.size(); i++) {
			String name = products.get(i).getText();
			List itemsNeededList = Arrays.asList(itemsNeeded);
			if (itemsNeededList.contains(name)) {

				j++;
				// Click on 'ADD TO CART'
				driver.findElements(By.cssSelector("button.btn-info")).get(i).click();

				if (j == itemsNeeded.length) {
					break;
				}
			}
		}
	}
}