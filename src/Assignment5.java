import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment5 {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[@href='/nested_frames']")).click();
		System.out.println(driver.findElements(By.tagName("frame")).size());
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='/frame_top']")));
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='/frame_middle']")));
		System.out.println(driver.findElement(By.id("content")).getText());
		
		/* iFrame */
//		driver.findElement(By.xpath("//a[@href='/frames']")).click();
//		driver.findElement(By.xpath("//a[@href='/iframe']")).click();
//		driver.switchTo().frame("mce_0_ifr"); -> Switching frame by ID
		
	}
}
