package com.succez.test.selenium;

import junit.framework.TestCase;

import com.thoughtworks.selenium.DefaultSelenium;

public class SeleniumTestCase extends TestCase {

	protected DefaultSelenium selenium;

	@Override
	public void setUp() throws Exception {
		super.setUp();
		selenium = createSeleniumClient("http://localhost:9080/");
		selenium.start();
	}

	private DefaultSelenium createSeleniumClient(String browserURL) {
		return new DefaultSelenium("localhost", 4444, "*firefox", browserURL);
	}

	@Override
	public void tearDown() throws Exception {
		selenium.stop();
		super.tearDown();
	}

}
