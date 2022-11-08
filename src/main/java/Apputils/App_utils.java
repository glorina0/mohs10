package Apputils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App_utils {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver,chrome,driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(3000);
		
		driver.close();
		

	}

}
