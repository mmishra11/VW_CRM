package com.vwcrm.qa.util;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFFormulaEvaluator;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.vwcrm.qa.base.TestBase;

public class ExcelToArray extends TestBase {
	static String cellValueStr = "";
	public static List<String> InnerArray = new ArrayList<String>();
	static DataFormatter objDefaultFormat;
	static FormulaEvaluator objFormulaEvaluator;

	public static List<String> getExcelTableIntoArrayList(File excelfile) throws Exception {

		FileInputStream fis = new FileInputStream(excelfile);

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sheet1 = wb.getSheetAt(0);
		objDefaultFormat = new DataFormatter();
		objFormulaEvaluator = new XSSFFormulaEvaluator((XSSFWorkbook) wb);

		Iterator<Row> rowIterator = sheet1.rowIterator();
		while (rowIterator.hasNext()) {
			Row row = rowIterator.next();
			if (row.getRowNum() == 0) {
				continue;
			}
			if (row.getRowNum() == 15)
				break;
			// Now let's iterate over the columns of the current row
			Iterator<Cell> cellIterator = row.cellIterator();

			while (cellIterator.hasNext()) {
				Cell cell = cellIterator.next();

				objFormulaEvaluator.evaluate(cell);
				cellValueStr = objDefaultFormat.formatCellValue(cell, objFormulaEvaluator);
				// String newcellValueStr = cellValueStr.replaceAll("\\s+", "");
				InnerArray.add(cellValueStr);

			}

			fis.close();

		}

		System.out.println("Excel Data   is " + InnerArray);

		return InnerArray;

	}
}
