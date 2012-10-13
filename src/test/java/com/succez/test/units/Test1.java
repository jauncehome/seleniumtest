package com.succez.test.units;

import org.junit.Test;

import com.succez.test.selenium.SeleniumTestCase;

public class Test1 extends SeleniumTestCase {

	@Test
	public void test1(){
		selenium.open("http://localhost:9080/selenium");
		assertEquals("Hello World!", selenium.getText("//h2"));
	}
}
