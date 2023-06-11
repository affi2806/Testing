package com.example.testing9;



import org.testng.annotations.DataProvider;

import org.testng.annotations.Test;



import junit.framework.Assert;



public class CalculatorData {

	CalculatorLogic cl=new CalculatorLogic();

  @Test(dataProvider="testData")

  public void addMethod(int a,int b,int expected) {

	  int result=cl.add(a,b);

	  Assert.assertEquals(expected, result);

  }

  @DataProvider

  public Object [][] testData()

  {

	  return new Object[][]

			  {

		  {1,2,3},{2,2,5}

			  };

			  }

  }

  









