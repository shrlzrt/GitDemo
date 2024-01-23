import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopUp {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
//		driver.get("http://foo:bar@httpbin.org/basic-auth/foo/bar"); //https://httpbin.org/basic-auth/foo/bar
		/* Use this format -> http://Username:Password@SiteURL */
		driver.get("http://admin:admin@the-internet.herokuapp.com/"); //https://the-internet.herokuapp.com/
		driver.findElement(By.linkText("Basic Auth")).click();
		System.out.println(driver.findElement(By.cssSelector("p")).getText());	
		//US Timezone Changes
		System.out.println("US Timezone Change1");
		System.out.println("US Timezone Change2");
	}
}
