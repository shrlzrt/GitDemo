import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.driver.chromedriver", "D:\\Automation\\Selenium\\chromedriver.exe");
		
		driver.manage().window().maximize(); // -> can also use fullscreen instead of maximize
		driver.get("https://www.google.com/");
		// -> driver.get is recommended if running for the first time because it will wait to load all the components first before doing the next step
		driver.navigate().to("https://rahulshettyacademy.com/");
		// -> driver.navigate will not wait to load all components. Need to internally add implicit wait
		driver.navigate().back();
		driver.navigate().forward();	
		//PH Timezone Changes
		System.out.println("PH Timezone Change2");
		System.out.println("PH Timezone Change3");
		System.out.println("PH Timezone Change4");
	}
}
