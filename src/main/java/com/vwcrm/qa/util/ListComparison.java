package com.vwcrm.qa.util;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListComparison {

	public static boolean compareLists(List<String> oUT, List<String> oUT2) {
//		Collections.sort(oUT);
//		Collections.sort(oUT2);
		boolean result = false;

		Set<String> ad = new HashSet<String>(oUT);
		Set<String> bd = new HashSet<String>(oUT2);
		ad.removeAll(bd);
		System.out.println(" Data mismatch at :" + ad);
		if (oUT.equals(oUT2))

			result = true;

		return result;

	}

}
