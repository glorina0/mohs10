package com.mohs10.scripts;

import org.testng.annotations.Test;

import com.mohs10.base.StartBrowser;
import com.mohs10.reuse.CommonFuns;

	public class HomeTest extends StartBrowser{
	
	//Clicking on Categories links; #4
	@Test
	public void CategoriesTest() throws Exception {
CommonFuns cat = new CommonFuns();
    cat.Categories();
	Thread.sleep(5000);
	}
//	
//	//Clicking on news link #5
	//@Test
	//public void NewsbtnTestCase() throws Exception {
//	CommonFuns News = new CommonFuns();
//	    News.Pagedown();
//	    Thread.sleep(2000);
//	    News.Newsbtn();
//		Thread.sleep(5000);
//	}
//	//blog Link #1
//	@Test
//	public void BlogbtnTestCase() throws Exception {
//		CommonFuns blog = new CommonFuns();
//	    blog.Pagedown();
//	    Thread.sleep(2000);
//	    blog.Blogbtn();
//		Thread.sleep(5000);
//	}
	
	//Registration of new user #6
/*	@Test
	public void RegisterPageTestCase() throws Exception {
		CommonFuns hm = new CommonFuns();
			  hm.Register("Manisha", "Koyla", "manishkoyla908904@hotmail.com", "Test@444", "Test@444");
			 Thread.sleep(5000);
		  }
	
	
}
	
	
	
	//Testing with invalid inputs #2
//	@Test
//	public void InvalidLogInTestCase() throws Exception {
//		CommonFuns hm1 = new CommonFuns();
//			  hm1.invalidLogIn("Invalidlogininputs@gmail.com", "Test@1114");
//			  Thread.sleep(5000);*/
//	
//}
	//Testing with Valid inputs #3
	//@Test
	 // public void LoginPageTestCase() throws Exception {
//CommonFuns hm2 = new CommonFuns();
	//	  hm2.logIn("tunguru@gmail.com", "msd27Glory");
		//  Thread.sleep(5000);
	}
	//}
	
	//}
//		  }
		
