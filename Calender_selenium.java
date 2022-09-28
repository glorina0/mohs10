package Practice2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender_selenium {
		

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.americanairlines.in/");
		driver.findElement(By.xpath("(//button[@class-'u-datepicker-trigger'])[1]")).click();
		driver.findElement(By.xpath("//span[.'February']/../../..//a[.='27]")).click();
		driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[2]")).click();
		for(int i=0;i<7;i++);
		{
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[@data-handler='next']")).click();
			
		}
		driver.findElement(By.xpath("//span[.='September']/../../..//a[.='29')")).click();
		
	}
}

		
		

	


