import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class LiveDemo {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//th[@role='columnheader'][1]")).click(); // Click the column

		/* Validate if the list has been sorted after clicking the column */
//		List<WebElement> elementsList = driver.findElements(By.xpath("//tbody/tr/td[1]"));
//		List<String> originalList = elementsList.stream().map(s -> s.getText()).collect(Collectors.toList());
//		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
//		Assert.assertTrue(originalList.equals(sortedList));

		/* Scan a specific item then fetch the price of that item - Pagination */

		List<String> price;
		do {
			List<WebElement> rows = driver.findElements(By.xpath("//tbody/tr/td[1]"));
			price = rows.stream().filter(a -> a.getText().contains("Rice")).map(b -> getPriceVeggie(b)).collect(Collectors.toList());
			price.forEach(c -> System.out.println(c));
			if (price.size() < 1) { //If no search item is found (0 item < 1 -> true), click 'Next' button
				driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
			}
		} while (price.size() < 1); // Unless the while condition is true, loop will continue to iterate
	}
	private static String getPriceVeggie(WebElement k) {
		String pricevalue = k.findElement(By.xpath("following-sibling::td[1]")).getText();
		return pricevalue;
	}
}
