package com.example.testing2;

import org.testng.Assert;
import org.testng.annotations.Test;


public class Day_7_2 {
  @Test
	  public class Calculator {

			

			int num1=20;

			int num2=10;

		  @Test(priority=1)

		  public void add() {

			  int sum=num1+num2;

			  Assert.assertEquals(sum, 30);

			  

		  }

		  

		  @Test(priority=2)

		  public void subtract()

		  {

			  int subtract=num1-num2; 

			  Assert.assertEquals(subtract,10);

		  }

		  @Test(priority=3)

		  public void multiply()

		  {

			  int multiply=num1*num2; 

			  Assert.assertEquals(multiply,200);

		  }

		  @Test(priority=4)

		  public void div()

		  {

			  int div=num1/num2; 

			  Assert.assertEquals(div,2);

		  }
  }
}
