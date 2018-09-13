package com.vwcrm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vwcrm.qa.base.TestBase;
import com.vwcrm.qa.util.ExcelToArray;
import com.vwcrm.qa.util.GetWebTableData;
import com.vwcrm.qa.util.LatestFile;
import com.vwcrm.qa.util.TestUtility;

public class TopPartsSold extends TestBase {
	public static String downloadPath = prop.getProperty("download_path");

	@FindBy(xpath = "//*[@class='tile-descr' and contains(text(),'Top Parts Sold ')]")
	WebElement TopPartsSoldBtn;

	@FindBy(xpath = "//*[@id=\"P12_FROM_DATE_SPAN\"]")
	WebElement FromDate;
	@FindBy(xpath = "//*[@id=\"P12_FROM_DATE_LIST\"]/li[32]")
	WebElement Jan2016;

	@FindBy(xpath = "//*[@id=\"P12_TO_DATE_SPAN\"]")
	WebElement ToDate;
	@FindBy(xpath = "//*[@id=\"P12_TO_DATE_LIST\"]/li[2]")
	WebElement Jan2018;

	@FindBy(xpath = "//*[@id=\"P12_PROD_GROUP_SPAN\"]")
	WebElement ProductGroup;
	@FindBy(xpath = "//*[@id=\"P12_PROD_GROUP_LIST\"]/li[1]")
	WebElement AllProdGroup;
	@FindBy(xpath = "//ul[@id='P12_PROD_GROUP_LIST']/li[2]")
	WebElement Accessories;
	@FindBy(xpath = "//*[@id=\"P12_PROD_GROUP_LIST\"]/li[3]")
	WebElement Chemicals;
	@FindBy(xpath = "//*[@id=\"P12_PROD_GROUP_LIST\"]/li[4]")
	WebElement Collision;
	@FindBy(xpath = "//*[@id=\"P12_PROD_GROUP_LIST\"]/li[5]")
	WebElement Mechanical;

	@FindBy(xpath = "//*[@id=\"P12_SRCH_RGN_SPAN\"]")
	WebElement Region;
	@FindBy(xpath = "//*[@id=\"P12_SRCH_RGN_LIST\"]/li[1]")
	WebElement AllRegion;

	@FindBy(xpath = "//*[@id=\"P12_SRCH_AREA_CODE_SPAN\"]")
	WebElement Area;
	@FindBy(xpath = "//*[@id=\"P12_SRCH_AREA_CODE_LIST\"]/li")
	WebElement AllArea;

	@FindBy(xpath = "//*[@id=\"P12_WOFS_SPAN\"]")
	WebElement WOFS;
	@FindBy(xpath = "//*[@id=\"P12_WOFS_LIST\"]/li[1]")
	WebElement AllWOFS;

	@FindBy(id = "P12_SEARCH_BUTTON")
	WebElement Search;

	@FindBy(xpath = "//span[@class='downresults']/a")
	WebElement DownloadBtn;

	public TopPartsSold() {
		PageFactory.initElements(driver, this);
	}

	// Functions
	public void validateProdGrpAll() throws Exception {

		TopPartsSoldBtn.click();
		FromDate.click();
		Jan2016.click();
		Search.click();
		DownloadBtn.click();
		Thread.sleep(2000);
		TestUtility.robotUtil();
		ExcelToArray.getExcelTableIntoArrayList(LatestFile.getLatestExcelFile(downloadPath));
		GetWebTableData.uiData();

	}

	public void validateProdGrpAccessories() throws Exception {
		TopPartsSoldBtn.click();
		FromDate.click();
		Jan2016.click();
		ProductGroup.click();
		Accessories.click();
		Search.click();
		DownloadBtn.click();
		Thread.sleep(1000);

		TestUtility.robotUtil();
		ExcelToArray.getExcelTableIntoArrayList(LatestFile.getLatestExcelFile(downloadPath));
		GetWebTableData.uiData();

	}

	public void validateProdGrpChemicals() throws Exception {
		TopPartsSoldBtn.click();
		FromDate.click();
		Jan2016.click();
		ProductGroup.click();
		Chemicals.click();
		Search.click();
		DownloadBtn.click();
		Thread.sleep(1000);

		TestUtility.robotUtil();
		ExcelToArray.getExcelTableIntoArrayList(LatestFile.getLatestExcelFile(downloadPath));
		GetWebTableData.uiData();
	}

	public void validateProdGrpCollision() throws Exception {
		TopPartsSoldBtn.click();
		FromDate.click();
		Jan2016.click();
		ProductGroup.click();
		Collision.click();
		Search.click();
		DownloadBtn.click();
		Thread.sleep(1000);

		TestUtility.robotUtil();
		ExcelToArray.getExcelTableIntoArrayList(LatestFile.getLatestExcelFile(downloadPath));
		GetWebTableData.uiData();

	}

	public void validateProdGrpMechanical() throws Exception {
		TopPartsSoldBtn.click();
		FromDate.click();
		Jan2016.click();
		ProductGroup.click();
		Mechanical.click();
		Search.click();
		DownloadBtn.click();
		Thread.sleep(1000);

		TestUtility.robotUtil();
		ExcelToArray.getExcelTableIntoArrayList(LatestFile.getLatestExcelFile(downloadPath));
		GetWebTableData.uiData();

	}
}
