package com.vwcrm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.listeners.MyListener;
import com.relevantcodes.extentreports.LogStatus;
import com.vwcrm.qa.pages.HomePage;
import com.vwcrm.qa.pages.LoginPage;
import com.vwcrm.qa.pages.TopPartsSold;
import com.vwcrm.qa.util.ExcelToArray;
import com.vwcrm.qa.util.GetWebTableData;
import com.vwcrm.qa.util.ListComparison;

public class TopPartsProdGrpTest extends MyListener {

	HomePage homePage;
	LoginPage loginPage;
	TopPartsSold toppartssold;

	public TopPartsProdGrpTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		homePage = new HomePage();
		toppartssold = new TopPartsSold();

	}

	@Test(priority = 1, enabled = false)

	public void prodGrpAllTest() throws Exception {

		homePage.validatePerformanceReportingBtnFn();
		toppartssold.validateProdGrpAll();
		Assert.assertTrue(ListComparison.compareLists(ExcelToArray.InnerArray, GetWebTableData.InnerArray2));
		System.out.println("Data Matches");
		test.log(LogStatus.INFO, "ProductGroup-All-Passed");

	}

	@Test(priority = 2, enabled = false)

	public void prodGrpAccessoriesTest() throws Exception {
		homePage.validatePerformanceReportingBtnFn();
		toppartssold.validateProdGrpAccessories();
		Assert.assertTrue(ListComparison.compareLists(ExcelToArray.InnerArray, GetWebTableData.InnerArray2));
		System.out.println("Data Matches");
		test.log(LogStatus.INFO, "ProductGroup-Accessories-Passed");

	}

	@Test(priority = 3, enabled = false)

	public void prodGrpChemicalsTest() throws Exception {
		homePage.validatePerformanceReportingBtnFn();
		toppartssold.validateProdGrpChemicals();
		Assert.assertTrue(ListComparison.compareLists(ExcelToArray.InnerArray, GetWebTableData.InnerArray2));
		System.out.println("Data Matches");
		test.log(LogStatus.INFO, "ProductGroup-Chemicals-Passed");

	}

	@Test(priority = 4, enabled = false)

	public void prodGrpCollisionTest() throws Exception {
		homePage.validatePerformanceReportingBtnFn();
		toppartssold.validateProdGrpCollision();
		Assert.assertTrue(ListComparison.compareLists(ExcelToArray.InnerArray, GetWebTableData.InnerArray2));
		System.out.println("Data Matches");
		test.log(LogStatus.INFO, "ProductGroup-Collision-Passed");

	}

	@Test(priority = 5, enabled = true)

	public void prodGrpMechanicalTest() throws Exception {
		homePage.validatePerformanceReportingBtnFn();
		toppartssold.validateProdGrpMechanical();
		Assert.assertTrue(ListComparison.compareLists(ExcelToArray.InnerArray, GetWebTableData.InnerArray2));
		System.out.println("Data Matches");
		test.log(LogStatus.INFO, "ProductGroup-Mechanical-Passed");
	}

	@AfterMethod

	public void tearDown() {
		driver.quit();
	}

}