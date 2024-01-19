import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment7 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		/* Get the number of rows, columns and print row2 */
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 500)");
		List<WebElement> rows = driver.findElements(By.cssSelector(".table-display tr"));
		System.out.println(rows.size());
		List<WebElement> columns = driver.findElements(By.cssSelector(".table-display th"));
		System.out.println(columns.size());
		List<WebElement> row2 = driver.findElements(By.xpath("//table[@class='table-display']/descendant::tr[3]/td"));
		for(int i=0; i<row2.size();i++) {
			System.out.println(row2.get(i).getText());
		}
		
		/* Alternative Solution */
//		WebElement table=driver.findElement(By.id("product"));
//		System.out.println(table.findElements(By.tagName("tr")).size());
//		System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());
//		List<WebElement> secondrow=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
//		System.out.println(secondrow.get(0).getText());
//		System.out.println(secondrow.get(1).getText());
//		System.out.println(secondrow.get(2).getText());
		
	}
}
