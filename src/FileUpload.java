import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException, AWTException {
		String downloadPath = System.getProperty("user.dir");
		HashMap<String,Object> chromePrefs = new HashMap<String,Object>();
		chromePrefs.put("profile.default_content_settings_popups", 0);
		chromePrefs.put("download.default_directory", downloadPath);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://altoconvertpdftojpg.com/");
		
		driver.findElement(By.cssSelector(".py-3")).click();
		Thread.sleep(5000);		
//		Runtime.getRuntime().exec("D:\\Automation\\Test Data\\fileupload.exe");		
		Robot rb = new Robot();	
		/* Copying File path to Clipboard */
		StringSelection str = new StringSelection("D:\\Automation\\Test Data\\PDF Test Data.pdf");
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
	    /* Press Control+V for pasting */
	    rb.keyPress(KeyEvent.VK_CONTROL);
	    rb.keyPress(KeyEvent.VK_V);
	    /* Release Control+V for pasting */
	    rb.keyRelease(KeyEvent.VK_CONTROL);
	    rb.keyRelease(KeyEvent.VK_V);
	    /* For pressing and releasing Enter */
	    rb.keyPress(KeyEvent.VK_ENTER);
	    rb.keyRelease(KeyEvent.VK_ENTER);	
	    
	    Thread.sleep(5000);
	    driver.findElement(By.id("submit_btn")).click();
	    driver.findElement(By.linkText("Download")).click();
	    Thread.sleep(10000);
//	    File f = new File("C:\\Users\\sharl\\Downloads\\PDF_Test_Data.jpg");
	    File f = new File(downloadPath+"\\PDF_Test_Data.jpg");
	    if(f.exists()) {
	    	System.out.println("file found");
	    	if(f.delete()) 
	    		System.out.println("file deleted");    	
	    }
	}
}
