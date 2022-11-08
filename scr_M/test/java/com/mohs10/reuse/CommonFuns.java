package com.mohs10.reuse;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.interactions.Actions;

import com.mohs10.base.StartBrowser;
import com.mohs10.ActionDriver.Action;
import com.mohs10.or.HomePage;

	public class CommonFuns {
		
		public Action aDriver;
		public WebDriver driver;
		
		public CommonFuns()
		{
			aDriver = new Action();
			driver = StartBrowser.driver;
		}
		
		// Registration process
				public void Register(String Firstname, String Lastname, String Email, String Pwd, String ConfirmPwd) throws Exception
				{
				//StartBrowser.childTest = StartBrowser.parentTest.createNode("Register in Magento shop");
					aDriver.navigateToApplication("https://magento.softwaretestingboard.com/");
					//aDriver.click(HomePage.lnkRegister, "Register link");
					//aDriver.click(HomePage.rbGender, "Radio button Gender");
					//aDriver.type(HomePage.txtFirstname,  Firstname, "FirstName text box");
					//aDriver.type(HomePage.txtLastname, Lastname, "LastName text box");
					//aDriver.type(HomePage.txtEmail, Email, "Email text box");
					//aDriver.type(HomePage.txtPassword, Pwd, "password text box");
					//aDriver.type(HomePage.txtConfirmpassword, ConfirmPwd, "confirm password text box");
					//aDriver.click(HomePage.btnRegister, "Register button");
					//aDriver.click(HomePage.btnContinue, "Continue button");
					//aDriver.click(HomePage.lnkBooks, "Clicking for  ShopCart");
					//aDriver.click(HomePage.lnkBooks1, "Clicking for  ShopCart");
					//aDriver.click(HomePage., "Clicking for  ShopCart");
					//aDriver.click(HomePage.lnkComputer, "Clicking for  ShopCart");
					//aDriver.click(HomePage.lnkComputer1, "Clicking for  ShopCart");
					//aDriver.click(HomePage.lnkNotebook, "Clicking for  ShopCart");
					//aDriver.click(HomePage.lnkShopcart, "Clicking for  ShopCart");

					//aDriver.click(HomePage.lnkCheck_out, "Clicking for  ShopCart");
					//aDriver.click(HomePage.lnkCheck_out_button, "Clicking for  ShopCart");
					//aDriver.click(HomePage.lnkShopcart, "Clicking for  ShopCart");
					//aDriver.click(HomePage.lnkWomen, "Clicking for Product");
					//aDriver.click(HomePage.lnkWomen1,"Clicking for Product");
				//	aDriver.click(HomePage.lnkwomen2,"Clicking for Product");
					//aDriver.click(HomePage.lnkWomen3,"Clicking for Product");
				//	aDriver.click(HomePage.lnkWomen4,"Clicking for Product");
					//aDriver.click(HomePage.lnkWomen5,"Clicking for Product");
					//aDriver.click(HomePage.lnkWomen6,"Clicking for Product");
				//	aDriver.click(HomePage.lnkWomen7,"Clicking for Product");
					
					//


				}

			//Login process
				 public void logIn(String email, String pwd) throws Exception
				{
					StartBrowser.childTest = StartBrowser.parentTest.createNode("Login to Magento shop");
					aDriver.navigateToApplication("https://magento.softwaretestingboard.com/");
					aDriver.click(HomePage.lnkLogin, "Login link");
					aDriver.type(HomePage.txtemail, email, "email text box");
					aDriver.type(HomePage.txtpwd, pwd, "password text box");
					aDriver.click(HomePage.btnlogin, "Login button");
					//aDriver.click(HomePage.lnkLogout, "Logout link");
				}
				//invalid login process
			/*	public void invalidLogIn(String email, String pwd) throws Exception
				{
					StartBrowser.childTest = StartBrowser.parentTest.createNode("Login to DemoWeb shop with invalid credentials");
					aDriver.navigateToApplication("http://demowebshop.tricentis.com/");
					aDriver.click(HomePage.lnkLogin, "Login link");
					aDriver.type(HomePage.txtemail, email, "email text box");
					aDriver.type(HomePage.txtpwd, pwd, "password text box");
					aDriver.click(HomePage.btnlogin, "Login button");
				}	
		
		
		//News button
		 /* public void Pagedown() throws Exception
		  
		  { 
		  StartBrowser.childTest =StartBrowser.parentTest.createNode("Page down");
		  aDriver.navigateToApplication("http://demowebshop.tricentis.com/");
		  Actions a=new Actions(driver);
		  a.sendKeys(Keys.PAGE_DOWN).perform();
		  a.sendKeys(Keys.PAGE_DOWN).perform();*/
		  
		 
		 /* public void Newsbtn() throws Exception
		  {
			StartBrowser.childTest = StartBrowser.parentTest.createNode("News button");
			aDriver.navigateToApplication("http://demowebshop.tricentis.com/");
			aDriver.click(HomePage.btnNews, "Performed click operation on News button");*/
		  
		  
		  //Blog Link
		 /* public void Blogbtn() throws Exception
			{
				StartBrowser.childTest = StartBrowser.parentTest.createNode("Blog buttton");
				aDriver.navigateToApplication("http://demowebshop.tricentis.com/");
				aDriver.click(HomePage.btnBlog, "Performed click operation on Blog button");*/
			
			
		  //Categories
  public void Categories() throws Exception 
	  {
		  	StartBrowser.childTest = StartBrowser.parentTest.createNode("Category links");
			aDriver.navigateToApplication("https://magento.softwaretestingboard.com/");
			//aDriver.click(HomePage.lnkLogin,"Clicking for login");
//				aDriver.click(HomePage.lnkBooks, "Performed click operation on books link");
//				//aDriver.click(HomePage.lnkComputer,"Performed click operation on Computer Link");
//				//aDriver.click(HomePage.lnkElectronics,"Performed click operation on Electronics Link");
//				//aDriver.click(HomePage.lnkApparelandShoes,"Performed click operation on Apparel and Shoes Link");
//				//aDriver.click(HomePage.lnkDigitaldownloads,"Performed click operation on Digital Downloads Link");
//				//aDriver.click(HomePage.lnkJewelry,"Performed click operation on Jewelry Link");
//				//aDriver.click(HomePage.lnkGiftCards,"Performed click operation on Gift Cards Link");
//				
//				aDriver.click(HomePage.lnkShopcart, "Clicking for  ShopCart");
				 aDriver.click(HomePage.lnkWomen, "Clicking for Product");
				 aDriver.click(HomePage.lnkwomen2,"Clicking for Product");
					aDriver.click(HomePage.lnkWomen3,"Clicking for Product");
					aDriver.click(HomePage.lnkWomen4,"Clicking for Product");
					aDriver.click(HomePage.lnkWomen5,"Clicking for Product");
					//aDriver.click(HomePage.lnkWomen6,"Clicking for Product");
				//	aDriver.click(HomePage.lnkWomen7,"Clicking for checkout");
					aDriver.click(HomePage.lnkWomen8,"Clicking for Product");
					//aDriver.click(HomePage.lnkWomen9,"Clicking for Checkout");
					aDriver.click(HomePage.lnkWomen10,"Clicking for View");
					
	  }
	}
					
//			
//			  
//		  }
	

