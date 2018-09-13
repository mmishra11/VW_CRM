package com.vwcrm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.vwcrm.qa.base.TestBase;
import com.vwcrm.qa.pages.HomePage;
import com.vwcrm.qa.pages.LoginPage;



	
	
	public class LoginPageTest extends TestBase{
		LoginPage loginPage;
		HomePage homePage;
		
		public LoginPageTest(){
			super();
		}
		
		@BeforeMethod
		public void setUp(){
			initialization();
			loginPage = new LoginPage();	
		}
		
		@Test(priority=1)
		public void loginPageTitleTest(){
			String title = loginPage.validateLoginPageTitle();
			Assert.assertEquals(title, "Login");
            System.out.println("Title Matches");			
		}
		@Test(priority=2)
			public void vwcrmLogoImageTest(){
			boolean flag = loginPage.validateVWCRMImage();
			Assert.assertTrue(flag);
		System.out.println("Logo is Present");
		}
		@Test(priority=3)
		public void loginTest() throws Exception{
			homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		System.out.println("Login Successful");
		
		}
		@AfterMethod
      
     public void tearDown() {
    	  driver.quit();
      }
	
	}
	
