import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AlertMessage {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		String abc = "Shar";
		driver.findElement(By.name("enter-name")).sendKeys(abc);
		driver.findElement(By.id("alertbtn")).click();
		System.out.println(driver.switchTo().alert().getText()); //System.out.println shortcut -> sysout then press Ctrl + space
		driver.switchTo().alert().accept(); //To select 'OK' or 'Yes'
		driver.findElement(By.name("enter-name")).sendKeys(abc);
		driver.findElement(By.id("confirmbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss(); //To select 'Cancel' or 'No'
	}

}
