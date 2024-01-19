import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("form input[name='name']")).sendKeys("Test Only");
		driver.findElement(By.cssSelector("form input[name='email']")).sendKeys("email@test.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("password123");
		driver.findElement(By.id("exampleCheck1")).click(); //Checkbox

		//Dropdown
//		driver.findElement(By.id("exampleFormControlSelect1")).click();
//		driver.findElement(By.xpath("//option[text()='Female']")).click();

		//Alternative for Dropdown
		WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select abc = new Select(dropdown);
		abc.selectByVisibleText("Female");

		driver.findElement(By.id("inlineRadio1")).click(); //Student radio button
		driver.findElement(By.cssSelector("form input[name='bday']")).sendKeys("09/19/1999");
		driver.findElement(By.cssSelector("form input[type='submit']")).click();
		System.out.println(driver.findElement(By.cssSelector("div.alert-success")).getText());	
	}

}