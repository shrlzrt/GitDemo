import java.awt.RenderingHints.Key;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Scope {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		/* Get the count of links in the webpage. Note: Links always have "a" as tag name. */
//		System.out.println(driver.findElements(By.tagName("a")).size());	
		/* Get the count of links in the footer page - 2 ways */
//		System.out.println(driver.findElements(By.xpath("//div[@id='gf-BIG']/descendant::a")).size()); //1st way - Minimize elements by xpath
		//2nd way
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());		
		/* Get the count of links in the 1st column of footer page */
//		System.out.println(driver.findElements(By.xpath("//div[@id='gf-BIG']//descendant::td[1]//a")).size());	//1st way
		//2nd way
		WebElement columndriver1 = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columndriver1.findElements(By.tagName("a")).size());		
		
		/* Click each link in different tab and get the title of each link from the column */
		for(int i=1; i<columndriver1.findElements(By.tagName("a")).size(); i++) {		
			String clickonlinkTab = Keys.chord(Keys.CONTROL,Keys.ENTER); //Ctrl + Enter -> Open link in new tab
			columndriver1.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);					
		}		
		
		Set<String> abc = driver.getWindowHandles();
		Iterator<String> it = abc.iterator();
		
		while(it.hasNext()) {
			driver.switchTo().window(it.next());
//			Thread.sleep(5000L);	-> I used an implicit wait instead for faster execution
			System.out.println(driver.getTitle());
		} 			
	}
}
