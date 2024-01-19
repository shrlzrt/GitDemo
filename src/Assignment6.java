import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Assignment6 {

	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement optionLabel2 = driver.findElement(By.xpath("//label[@for='benz']"));
		String option2Text = driver.findElement(By.xpath("//label[@for='benz']")).getText();
		
		optionLabel2.findElement(By.id("checkBoxOption2")).click();
		
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		Select dd = new Select(dropdown);
		dd.selectByVisibleText(option2Text);
		
		driver.findElement(By.name("enter-name")).sendKeys(option2Text);
		driver.findElement(By.id("alertbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		
		Assert.assertEquals(driver.switchTo().alert().getText(), "Hello " + option2Text + ", share this practice page and share your knowledge");
		
		String text=  driver.switchTo().alert().getText();	
		if(text.contains(option2Text)){
	    System.out.println("Alert message success");
	    }
	    else
	    System.out.println("Something wrong with execution");
		
		driver.switchTo().alert().accept();
	}
}
