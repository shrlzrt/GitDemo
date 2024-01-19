import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot", "Carrot", "Tomato" };
		
		int j=0;
		
//		WebElement product = driver.findElement(By.cssSelector("h4.product-name")); //If only the target is 1
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name")); // findElements bec. there are 30 items in the list

		for (int i = 0; i < products.size(); i++) {
			String[] name = products.get(i).getText().split("-"); // Brocolli - 1 Kg: name[0] -> 'Brocolli '; name[1] ->' 1 Kg'
			String formattedName = name[0].trim(); // To remove unnecessary space
			List itemsNeededList = Arrays.asList(itemsNeeded);

			

			if (itemsNeededList.contains(formattedName)) {

				j++;
				// Click on 'ADD TO CART'
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
//				break; //
				
				if(j==itemsNeeded.length) {			
					break;
				}
			}
		}
	}
}