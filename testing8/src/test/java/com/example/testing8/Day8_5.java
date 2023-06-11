package com.example.testing8;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day8_5 {
  @Test
  public static void main(String[] args) throws InterruptedException{
	  WebDriverManager.edgedriver().setup();
	  WebDriver driver=new EdgeDriver();
	  driver.get("https://google.com");
	  driver.manage().window().maximize();
	  WebElement key1=driver.findElement(By.name("q"));
	  key1.sendKeys("Apple");
	  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	  Thread.sleep(3000);
	  String t1=driver.getTitle();
	  String id1=driver.getWindowHandle();
	  System.out.println(t1);
	  System.err.println(id1);
	  
	  //open in new tab
	  driver.switchTo().newWindow(WindowType.TAB);
	  
	  WebDriverManager.edgedriver().setup();
	  driver.get("https://google.com");
	  WebElement key2=driver.findElement(By.name("q"));
	  key2.sendKeys("Selenium");
	  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	  Thread.sleep(3000);
	  String t2=driver.getTitle();
	  String id2=driver.getWindowHandle();
	  System.out.println(t2);
	  System.err.println(id2);
	  
	  //open in new tab
	  driver.switchTo().newWindow(WindowType.TAB);
	  
	  WebDriverManager.edgedriver().setup();
	  driver.get("https://google.com");
	  driver.manage().window().maximize();
	  WebElement key3=driver.findElement(By.name("q"));
	  key3.sendKeys("Cucumber");
	  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	  Thread.sleep(3000);
	  String t3=driver.getTitle();
	  String id3=driver.getWindowHandle();
	  System.out.println(t3);
	  System.err.println(id3);
	  
	  //to print total tabs opened
	  Set<String> total=driver.getWindowHandles();
	  System.out.println("Total tabs "+total.size());
	  
  }
}
