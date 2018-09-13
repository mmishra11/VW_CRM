package com.vwcrm.qa.util;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;

import com.vwcrm.qa.base.TestBase;

public class GetWebTableData extends TestBase

{
	static String t = "";
	public static List<String> InnerArray2 = new ArrayList<String>();

	public static List<String> uiData() {

		for (int i = 2; i <= 15; i++) {
			for (int j = 1; j <= 6; j++) {

				t = driver.findElement(By.xpath("//table[@id='4424591611612131']/tbody/tr[" + i + "]/td[" + j + "]"))
						.getText();
				// String newt = t.replaceAll("\\s+", "");
				InnerArray2.add(t);
			}
		}
		System.out.println("WebTableData is " + InnerArray2);

		return InnerArray2;
	}
}
