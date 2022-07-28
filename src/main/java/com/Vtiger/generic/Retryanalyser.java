package com.Vtiger.generic;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retryanalyser implements IRetryAnalyzer {
	int count = 0;
	int try_count=3;
	public boolean retry(ITestResult result) {
		if(count<try_count) {
			count++;
		return true;
		}
		return false;
	}
	
}
