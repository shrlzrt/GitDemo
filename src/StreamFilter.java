import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class StreamFilter {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.id("search-field")).sendKeys("apple");
		List<WebElement> elementsList = driver.findElements(By.xpath("//tbody/tr/td[1]"));
		List<WebElement> filteredList = elementsList.stream().filter(veggie->veggie.getText().contains("pple")).collect(Collectors.toList());
		Assert.assertEquals(elementsList.size(), filteredList.size());
	}
}
