import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewWindow {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/angularpractice/");		
//		driver.switchTo().newWindow(WindowType.TAB); //new blank tab will open
		driver.switchTo().newWindow(WindowType.WINDOW); //new blank window will open
		
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> it = windowHandles.iterator();
		String parentWindowID = it.next(); 
		String childWindowID = it.next();
		driver.switchTo().window(childWindowID); //switch to child window and extract the text
		driver.get("https://rahulshettyacademy.com/");
		String courseName = driver.findElements(By.cssSelector("a[href*='access-to-all-courses']")).get(1).getText();
		driver.switchTo().window(parentWindowID); //switch back to 1st window (parent window)
		WebElement name = driver.findElement(By.cssSelector("[name='name']"));
		name.sendKeys(courseName);
		
		/* Take partial screenshot - particular WebElement only */
		File srcfile = name.getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(srcfile,new File("C://Users//sharl//screenshot.png"));	//Alternative
		FileUtils.copyFile(srcfile,new File("logo.png"));

		/* Get the height and width of WebElement */
		System.out.println(name.getRect().getDimension().getHeight());
		System.out.println(name.getRect().getDimension().getWidth());
	}
}
