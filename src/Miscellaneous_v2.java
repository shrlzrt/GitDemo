import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.apache.commons.io.FileUtils;

public class Miscellaneous_v2 {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.manage().deleteCookieNamed("sessionKey");
		driver.get("https://www.google.com/");
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); //Casting driver to take screenshot method object
		FileUtils.copyFile(src,new File("C://Users//sharl//screenshot.png")); //Copying the file from the source object to local machine
	}
}
