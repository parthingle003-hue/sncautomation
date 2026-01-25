package com.snc.tests;

import org.testng.annotations.Test;

import com.snc.base.TestBase;

public class SncSmokeTest extends TestBase{
	@Test
	public void OpenURL() {
		driver.get("https://sncnutrition.com/");
		System.out.println("SNC Website Open Succesfully ");
		
	}

}
