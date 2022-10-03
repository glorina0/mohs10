package Practice2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Confirmation {

	

		@SuppressWarnings("deprecation")
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
			driver.get("https://demo.actitime.com");
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
			driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("manager");
			driver.findElement(By.id("loginButton")).click();
			driver.findElement(By.id("container_tasks")).click();
			driver.findElement(By.xpath("//div[.='Add New']")).click();
			driver.findElement(By.xpath("//div[@class='item createNewCustomer']")).click();
			driver.findElement(By.xpath("//input[@placeholder='Enter Customer Name'])[2]")).click();
			driver.findElement(By.xpath("//div[@class='greyButton cancrlBtn']")).click();
			Alert alt=driver.switchTo().alert();
			alt.accept();
			
			
			

	}

		
			
		}

	
			
		


