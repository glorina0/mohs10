package Practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Xpath {

	public static void main(String[] args) throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.findElement(By.xpath("//input[@class=\"inputtext _55r1 _6luy\"]")).sendKeys("7377530561");
			driver.findElement(By.xpath("//input[@data-testid=\"royal_pass\"]")).sendKeys("sunnyladdubb13");
			driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
			Thread.sleep(2000);
			driver.quit();

	}

}
