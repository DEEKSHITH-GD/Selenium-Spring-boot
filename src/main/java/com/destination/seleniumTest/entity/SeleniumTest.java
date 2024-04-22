package com.destination.seleniumTest.entity;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class SeleniumTest {
	public static void webDriver() {
		try {
			
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.setBrowserVersion("121");
			WebDriver webDriver = new ChromeDriver();
			
			webDriver.get("https://www.instagram.com");
			Thread.sleep(2000);
			
			System.out.println(webDriver.getCurrentUrl());
			System.out.println(webDriver.getTitle());
			//System.out.println(webDriver.getPageSource());
			//System.out.println(webDriver.getWindowHandle());
			//System.out.println(webDriver.getWindowHandles());
			webDriver.manage().window().maximize();
			Thread.sleep(2000);
			webDriver.manage().window().fullscreen();
			Thread.sleep(1000);
			WebElement username = webDriver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']"));
			username.sendKeys("your-credential");
			Thread.sleep(1000);
			WebElement password1 = webDriver.findElement(By.xpath("//input[@aria-label='Password']")); //relative
			password1.sendKeys("your-credential");
			Thread.sleep(1000);
			webDriver.findElement(By.xpath("//button[@class=' _acan _acap _acas _aj1- _ap30']")).click();
			System.out.println("Login successfull");
			Thread.sleep(3000);
			
			Point point = new Point(900, 500);
			webDriver.manage().window().setPosition(point);
			Thread.sleep(5000);
			webDriver.navigate().to("https://www.google.com");
			Thread.sleep(5000);
			webDriver.manage().window().maximize();
			Thread.sleep(5000);
			webDriver.navigate().back();
			Thread.sleep(5000);
			webDriver.navigate().forward();
			Thread.sleep(5000);
			webDriver.navigate().refresh();
			Thread.sleep(5000);
			
			webDriver.switchTo().activeElement().sendKeys("selenium");
			Thread.sleep(5000);
			
			webDriver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			System.out.println("web running");
			Thread.sleep(3000);
			//absolute
			WebElement username2 = webDriver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
			System.out.println("found xpath");
			username2.sendKeys("Admin");
			System.out.println("sent username keys");
			WebElement password = webDriver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")); 
			System.out.println("found element");
			password.sendKeys("admin123");
			System.out.println("sent password keys");
			/*
			webDriver.findElement(By.name("password")).sendKeys("admin123");
			*/
			Thread.sleep(3000);
			webDriver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
			System.out.println("submit button found");
			/*
			webDriver.findElement(By.linkText("OrangeHRM, Inc")).click();
			webDriver.findElement(By.partialLinkText("HRM, Inc")).click();
			Thread.sleep(2000);
			webDriver.close();
			*/
			
			webDriver.get("https://www.saucedemo.com/v1/inventory.html");
			System.out.println("web running");
			Thread.sleep(2000);
			Actions a = new Actions(webDriver);
			WebElement clickOnItem1 = webDriver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div"));
			System.out.println("action");
			a.moveToElement(clickOnItem1).build().perform();
			clickOnItem1.click();
			Thread.sleep(2000);
			WebElement addToCart = webDriver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div/button"));
			a.moveToElement(addToCart).build().perform();
			System.out.println("add to cart done");
			addToCart.click();
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
