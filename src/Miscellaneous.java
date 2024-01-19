import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Miscellaneous {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("abc");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		getTranslation(driver);
	}
		public static void getTranslation(WebDriver driver) throws IOException {
//		driver.get("https://www.google.com/");
//		driver.findElement(By.cssSelector("svg[class='gb_i']")).click();
//		driver.findElement(By.xpath("//span[contains(text(), 'Account')]/parent::a")).click();
		driver.get("https://translate.google.com/?sl=auto&tl=en&op=translate");
		driver.findElement(By.xpath("//textarea[@aria-label='Source text']")).sendKeys("lamesa");
	}

}
