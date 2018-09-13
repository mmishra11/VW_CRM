package com.vwcrm.qa.util;

import java.io.File;
import java.io.FileFilter;

import com.vwcrm.qa.base.TestBase;

public class LatestFile extends TestBase

{

	public static File getLatestExcelFile(String dir) {

		File fl = new File(dir);
		File choice = null;
		if (fl.listFiles().length > 0) {
			File[] files = fl.listFiles(new FileFilter() {
				public boolean accept(File file) {
					return file.isFile();
				}
			});
			long lastMod = Long.MIN_VALUE;

			for (File file : files) {
				if (file.lastModified() > lastMod) {
					choice = file;
					lastMod = file.lastModified();
				}
			}
		}

		return choice;

	}
}
