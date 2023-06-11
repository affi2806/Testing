package com.example.testing9;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class Day9_5 implements ITestListener {
  @Test
 
  
  public void onTestStart(ITestResult result) {
	  System.out.println("test started : "+result.getName());
  }
  
  @Override
  public void onTestSuccess(ITestResult result) {
	  System.out.println("test success: "+result.getName());
  }
  
  @Override
  public void onTestFailure(ITestResult result) {
	  System.out.println("test failed : "+result.getName());
  }
  
  
}
