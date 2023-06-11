package com.example.testing2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day_7_1 {
  @Test
  public void verifyTitle() 

  {

	  WebDriverManager.edgedriver().setup();

	  WebDriver driver=new EdgeDriver();

	  driver.manage().window().maximize();

	  driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");

	  String actualTitle="Guest Registration Form";

	  AssertJUnit.assertEquals(actualTitle,driver.getTitle());
}
}
