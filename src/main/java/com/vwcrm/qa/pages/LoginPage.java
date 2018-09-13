package com.vwcrm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vwcrm.qa.pages.HomePage;
import com.vwcrm.qa.base.TestBase;

public class LoginPage  extends TestBase{
	
	//Page Factory 
	@FindBy(id="P101_USERNAME")
	WebElement username;
	
	@FindBy(name="p_t29")
	WebElement password;
	
	@FindBy(id="B14821918234344450")
	WebElement loginBtn;
	
	@FindBy(xpath="//h1[contains(@text,'Wholesale Parts CRM Portal')]")
	WebElement heading;
	
	@FindBy(xpath="//a[contains(@href,'#')]/img")
	WebElement vwcrmLogo;
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	
	
}
	//Actions:
		public String validateLoginPageTitle(){
			return driver.getTitle();
		}
		
		public boolean validateVWCRMImage(){
			return vwcrmLogo.isDisplayed();
		}
	public HomePage login(String un, String pwd){
	
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		return new HomePage();
		}}