package com.example.testing1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UrlVerify {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver= new EdgeDriver();
		driver.get("https://j2store.net/free/");
		driver.manage().window().maximize();
		String url=driver.getCurrentUrl();
		if(url.equals("https://j2store.net/free/"))
		{
			System.out.println("same");
		}
		Thread.sleep(3000);
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)","");
		WebElement clothing=driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/h4/a"));
		clothing.click();
		String ur=driver.getCurrentUrl();
		if(ur.equals("https://j2store.net/free/index.php/shop?filter_catid=11"))
		{
	         System.out.println("ame ur");
		}
		
		driver.quit();
		

	}

}

