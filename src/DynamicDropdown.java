import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
//		System.out.println(driver.getTitle()); 
//		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();	
//		driver.findElement(By.xpath("//a[contains(text(), 'Bengaluru')]")).click();
//		System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).getAttribute("value"));
//		System.out.println("The type of passengers selected is - "+driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).getAttribute("name"));
//		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXTaction")).click();
//		driver.findElement(By.xpath("//a[contains(text(), 'Chennai')]")).click();		
		/*Calendar - To select current date */
//		driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight")).click();
		
		/* To check if element is enabled in UI */
//		System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
//		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click(); //Round Trip radio button
//		System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		
		/* Alternative method if 'isEnabled' doesn't work as expected */
		System.out.println(driver.findElement(By.className("picker-second")).getAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click(); //Round Trip radio button
		System.out.println(driver.findElement(By.className("picker-second")).getAttribute("style"));
		if (driver.findElement(By.className("picker-second")).getAttribute("style").contains("1"))
		{
			System.out.println("It's enabled");
			Assert.assertTrue(true);
		}
		else 
		{
			Assert.assertTrue(false);
		}
	}
}
