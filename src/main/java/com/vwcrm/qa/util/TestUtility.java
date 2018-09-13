package com.vwcrm.qa.util;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import com.vwcrm.qa.base.TestBase;

public class TestUtility extends TestBase {

	public static long PAGE_LOAD_TIMEOUT = 25;
	public static long IMPLICIT_WAIT = 30;

	public static void robotUtil() throws Exception {

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.delay(1000);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}
}