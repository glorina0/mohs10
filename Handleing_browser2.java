package Practice2;

import org.openqa.selenium.WebDriver;
import java.util.Set;

public class Handleing_browser2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		System.out.println(driver.getWindowHandles());
		Set<String> allwindows = driver.getWindowHandles();
		System.out.println(allwindows);

	}

}