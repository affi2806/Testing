package com.example.testing9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTesting {
  @Test
  public void TC_001() {
	  //WebDriverManager.edgedriver().setup();
	  //WebDriver driverOne=new EdgeDriver();
	  System.out.println("thread count is: "+Thread.currentThread().getId());
  }
  
  @Test
  public void TC_002()
  {
	//WebDriverManager.edgedriver().setup();
	  //WebDriver driverTwo=new EdgeDriver;
	  System.out.println("thread count is: "+Thread.currentThread().getId());
  }
  
  @Test
  public void TC_003()
  {
	//WebDriverManager.edgedriver().setup();
	  //WebDriver driverThree=new EdgeDriver;
	  System.out.println("thread count is: "+Thread.currentThread().getId());
  }
  
  
}
