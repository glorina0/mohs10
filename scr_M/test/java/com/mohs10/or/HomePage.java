package com.mohs10.or;

import org.openqa.selenium.By;

public class HomePage {
	
	//Categories
	//public static By lnkComputer = By.xpath("//li[@class='inactive']//a[normalize-space()='Computers']");
	//public static By lnkDigitaldownloads = By.xpath("//li[@class='inactive']//a[normalize-space()='Digital downloads']");
	//public static By lnkElectronics = By.xpath("//li[@class='inactive']//a[normalize-space()='Electronics']");
	//public static By lnkApparelandShoes = By.xpath("//li[@class='inactive']//a[normalize-space()='Apparel & Shoes']");
	//public static By lnkJewelry = By.xpath("//li[@class='inactive']//a[normalize-space()='Jewelry']");
	//public static By lnkBooks = By.xpath("//li[@class='inactive']//a[normalize-space()='Books']");
	//public static By lnkBooks1 = By.xpath("//body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[3]/div[1]/div[2]/div[3]/div[2]/input[1]");	
	//public static By lnkComputer = By.xpath("//body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ul[1]/li[2]/a[1]");
	//public static By lnkComputer1 = By.xpath("//body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]");
	//public static By lnkNotebook = By.xpath("//input[@value='Add to cart']");
//	public static By lnkNotebook_1 = By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div/div/div[2]/div[3]/div[2]/input");

	//public static By lnkShopcart = By.xpath("//*[@id=\"topcartlink\"]/a/span[1]");
	//public static By lnkCheck_out = By.xpath("//input[@id='termsofservice']");
	//public static By lnkCheck_out_button = By.xpath("//button[@id='checkout']");

	//public static By lnkRegister = By.xpath("");

	//public static By lnkGiftCards =By.xpath("//li[@class='inactive']//a[normalize-space()='Gift Cards']");
	public static By lnkWomen = By.xpath("//body[1]/div[2]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[2]/a[1]/span[2]");
//	public static By lnkWomen1 = By.xpath("/span[contains(text(),'Women')");
	public static By lnkwomen2 = By.xpath("//a[contains(text(),'Tops')]");
	public static By lnkWomen3 = By.xpath("//body/div[2]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]");
	public static By lnkWomen4 = By.xpath("//div[@id='option-label-color-93-item-57']");
	public static By lnkWomen5 = By.xpath("//li[1]//div[1]//div[1]//div[4]//div[1]//div[1]//form[1]//button[1]//span[1]");
	//public static By lnkWomen6 = By.xpath("//button[@id='top-cart-btn-checkout']");
	//public static By lnkWomen7 = By.xpath("//header/div[2]/div[1]/a[1]");
	public static By lnkWomen8 = By.xpath("//header/div[2]/div[1]/a[1]");
	//public static By lnkWomen9 = By.xpath("//button[@id='top-cart-btn-checkout']");
	public static By lnkWomen10 = By.xpath("//span[contains(text(),'View and Edit Cart')]");

	//To Register
/*	public static By lnkRegister = By.xpath("//a[@href=\"/register\"]");
	//public static By rbGender = By.id("gender-female");
	//public static By txtFirstname = By.id("FirstName");
//	public static By txtLastname = By.id("LastName");
	public static By txtEmail = By.id("Email");
	public static By txtPassword = By.id("Password");
	public static By txtConfirmpassword = By.id("ConfirmPassword");
	public static By btnRegister = By.id("register-button");
	public static By btnContinue = By.xpath("//input[@value='Continue']");*/
	
	//To login
	public static By lnkLogin = By.xpath("//a[@href=\"/login\"]");
	public static By txtemail = By.xpath("//input[@id='email']");
	public static By txtpwd = By.className("//fieldset[@class='fieldset login']//input[@id='pass']\"");
	public static By btnlogin = By.xpath("//input[@value='Log in']");
	//public static By lnkLogout = By.xpath("//a[@class='ico-logout']");
	/*
	//Customer Service
	public static By btnNews = By.xpath("//a[@href=\"/news\"]");
	public static By btnBlog = By.xpath("//a[@href=\"/blog\"]");
	public static By btnComparelist = By.xpath("//a[@href=\"/compareproducts\"]");
	public static By btnRecentlyviewed = By.xpath("//a[@href=\"/recentlyviewedproducts\"]");
	
	//To subscribe
	public static By lnkYoutube = By.xpath("//a[@href=\"http://www.youtube.com/user/nopCommerce\"]");
	public static By btnSubscribe = By.xpath("//a[@href=\"http://www.youtube.com/user/nopCommerce\"]");
    
	//To goto sitemap
	public static By lnkSitemap = By.xpath("//a[normalize-space()='Sitemap']");
	public static By lnkSearch = By.xpath("//div[@class='entity-body']//a[normalize-space()='Search']");
	public static By txtSearchKeyword = By.xpath("//input[@id='Q']");
	public static By btnsearch = By.xpath("//input[@class='button-1 search-button']");
	
	//to goto shipping&returns
	public static By lnkShippingandReturns = By.xpath("//a[normalize-space()='Shipping & Returns']");
	public static By lnkShpng = By.xpath("//h1[normalize-space()='Shipping & Returns']");
	
	//Goto Contactus
	public static By lnkContactUs = By.xpath("//a[normalize-space()='Contact us']");
	public static By txtName = By.xpath("//input[@id='FullName']");
	public static By txtEmaill = By.xpath("//input[@id='Email']");
	public static By txtEnquiry = By.xpath("//textarea[@id='Enquiry']");
	public static By btnSubmit = By.xpath("//input[@name='send-email']");
	public static By txtcontactus = By.xpath("//div[@class='result']");
	
	//goto new products
	public static By lnkNewProducts = By.xpath("//a[normalize-space()='New products']");
	public static By txtphCvr = By.xpath("//h1[@itemprop='name']");
	
	//go to shpng cart
	public static By lnkShoppingCart = By.xpath("//span[normalize-space()='Shopping cart']");
	public static By txtemptyshpngcart = By.xpath("//div[@class='order-summary-content']");
	
	//-------login and order--------
	public static By lnkApparelAndShoes = By.xpath("//a[@href=\"/apparel-shoes\"]");
	public static By imgBelt = By.xpath("//img[@src=\"http://demowebshop.tricentis.com/content/images/thumbs/0000217_casual-golf-belt_125.jpeg\"]");
	public static By btnAddtoCart = By.xpath("//input[@id='add-to-cart-button-40']");
	public static By chkAgree = By.xpath("//input[@id='termsofservice']");
	public static By btnCheckout = By.xpath("//button[@id='checkout']");
	public static By btnCntnue = By.xpath("//input[@onclick='Billing.save()']");
	public static By btnBillingContinue = By.xpath("//input[@onclick='Billing.save()']");
	public static By btnShippingContinue = By.xpath("//input[@onclick='Shipping.save()']");
	public static By btnShpngMthdContinue = By.xpath("//input[@class='button-1 shipping-method-next-step-button']");
	public static By btnPaymentMthdContinue = By.xpath("//input[@class='button-1 payment-method-next-step-button']");
	public static By btnPaymentInfoContinue = By.xpath("//input[@class='button-1 payment-info-next-step-button']");
	public static By btnConfirm = By.xpath("//input[@value='Confirm']");
	
	//public static By lnkOrderDetails = By.xpath("//a[normalize-space()='Click here for order details.']");
	public static By classOrderconfrmtn = By.xpath("//strong[normalize-space()='Your order has been successfully processed!']");*/
}
