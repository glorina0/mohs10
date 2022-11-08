package com.sdet;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Log_in {
	

		@Test
		public void Register_page()
		{

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();

		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("gloriya@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("surajaditya");
		driver.findElement(By.xpath("//body/div[4]/div[1]/div[4]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/form[1]/div[5]/input[1]")).click();
		}
	}

