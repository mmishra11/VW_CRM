
package com.vwcrm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vwcrm.qa.base.TestBase;

public class HomePage extends TestBase {

	// Page- Objects

	@FindBy(xpath = "//div/h3[contains(text(),'Wholesale Parts CRM Portal')]")
	WebElement TopHeader;

	@FindBy(xpath = "*//span[@id='welcome_usr']")
	WebElement UsernameLabel;

	@FindBy(xpath = "*//div[contains(@class,'header-rt')]")
	WebElement VwcrmLogo;

	@FindBy(xpath = "*//a[@class='list' and @href='f?p=123:108:14750645838502::NO:::']")
	WebElement AdminBtn;

	@FindBy(xpath = "*//a[@class='list' and @href='f?p=123:110:14750645838502:FIRST:NO:RP,110::']")
	WebElement HelpBtn;

	@FindBy(xpath = "*//span[@id='notificon']")
	WebElement NotificationBtn;

	@FindBy(xpath = "//div[@class='notifholder-header']/span[1]")
	WebElement NotificationLabel;

	@FindBy(xpath = "//a[@class='list' and starts-with(@href,'apex_authentication.logout')]")
	WebElement LogoutBtn;

	@FindBy(xpath = "//div[@class='list-item-label'and contains(text(), 'Performance Reporting')]")
	WebElement PerformanceReportingBtn;

	@FindBy(xpath = "//div[@class='list-item-label'and contains(text(), 'Marketing')]")
	WebElement MarketingBtn;

	@FindBy(xpath = "//div[@class='list-item-label'and contains(text(), 'Customers')]")
	WebElement CustomersBtn;

	@FindBy(xpath = "//div[@class='list-item-label'and contains(text(), 'Wholesale Comp')]")
	WebElement WholesaleCompBtn;

	@FindBy(xpath = "//div[@class='list-item-label'and contains(text(), 'SMART Maps')]")
	WebElement SMARTMapsBtn;

	@FindBy(xpath = "//td/button[contains(@id,'P1_VIEW_DASHBORD')]/span[2]")
	WebElement ViewDashboardBtn;

	@FindBy(xpath = "//td/button[contains(@id,'p1_view_contacts')]/span[2]")
	WebElement CustomerContactsBtn;

	@FindBy(xpath = "//div[@class='footerright']/a")
	WebElement ContactUsbtn;

	public HomePage() {
		PageFactory.initElements(driver, this);

	}

	// Actions

	public String verifyHomePageTitle() {
		return driver.getTitle();
	}

	public String verifyTopHeader() {
		return TopHeader.getText();
	}

	public String verifyUsernameLabel() {
		return UsernameLabel.getText();
	}

	public boolean verifyVwcrmLogo() {
		return VwcrmLogo.isDisplayed();
	}

	public AdminPage validateAdminBtnFn() {
		AdminBtn.click();
		return new AdminPage();
	}

	public HelpPage validateHelpBtnFn() {
		HelpBtn.click();
		return new HelpPage();
	}

	public String validateNotificationBtnFn() {
		NotificationBtn.click();
		return NotificationLabel.getText();
	}

	public void validatePerformanceReportingBtnFn() {
		PerformanceReportingBtn.click();

	}

	public Marketing validateMarketingBtnFn() {
		MarketingBtn.click();
		return new Marketing();
	}

	public Customers validateCustomerBtnFn() {
		CustomerContactsBtn.click();
		return new Customers();
	}

	public WholeSaleComp validateWholesaleCompBtnFn() {
		WholesaleCompBtn.click();
		return new WholeSaleComp();
	}

	public SmartMaps validateSmartMapBtnFn() {
		SMARTMapsBtn.click();
		return new SmartMaps();
	}

	public DealerDashboard validateViewDashBoardBtnFn() {
		ViewDashboardBtn.click();
		return new DealerDashboard();
	}

	public CustomerContacts validateCustomerContactsbtnfn() {
		CustomerContactsBtn.click();
		return new CustomerContacts();
	}

	public ContactUs validateContactUsBtnFn() {
		ContactUsbtn.click();
		return new ContactUs();
	}

}
