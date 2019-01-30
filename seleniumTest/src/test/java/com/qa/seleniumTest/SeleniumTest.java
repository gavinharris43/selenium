package com.qa.seleniumTest;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumTest {

	WebDriver driver;
	
@Before
public void setup() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\chromedriver.exe");
	driver= new ChromeDriver();
	
}

@After
public void teardown() {
	driver.quit();
}
@Ignore
@Test
public void bingTesty() {
driver.get(Constants.URL);
BingLandingPage blp = PageFactory.initElements(driver, BingLandingPage.class);
blp.searchBing("selenium");

BingSearchPage bsp = PageFactory.initElements(driver, BingSearchPage.class);
}
@Ignore
@Test
public void testy() throws InterruptedException {
	driver.manage().window().maximize();
	driver.get("https://www.bing.com");
	WebElement textbox =driver.findElement(By.name("q"));
	textbox.sendKeys("Selenium");
	textbox.submit();
	WebElement sele = driver.findElement(By.xpath("//*[@id=\"b_context\"]/li[1]/div/div[1]/h2"));
	Thread.sleep(10000);
	assertEquals("Selenium not found", "Selenium", sele.getText());
}
@Ignore
@Test
public void ChromeTesty() throws InterruptedException {
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	WebElement textbox =driver.findElement(By.name("q"));
	textbox.sendKeys("Selenium");
	textbox.submit();
	WebElement sele = driver.findElement(By.name("q"));
	//Thread.sleep(10000);
	assertEquals("Selenium not found", "Selenium", sele.getAttribute("value"));
}
@Ignore
@Test

public void ChromeTestyGH43() throws InterruptedException {
	driver.manage().window().maximize();
	driver.get("https://www.youidraw.com/apps/painter/");
	
	WebElement textbox =driver.findElement(By.name("q"));
	textbox.sendKeys("gavinharris43");
	textbox.submit();
	WebElement sele = driver.findElement(By.name("q"));
	//Thread.sleep(10000);
	assertEquals("GavinHarris43 not found", "gavinharris43", sele.getAttribute("value"));
}
@Ignore
@Test

public void PaintTesty() throws InterruptedException {
	Actions action = new Actions(driver);
	driver.manage().window().maximize();
	driver.get("https://www.youidraw.com/apps/painter/");
	WebElement canvis =driver.findElement(By.id("painter"));
	
	action.moveToElement(canvis).moveByOffset(-400, 0).clickAndHold().moveByOffset(100,0).moveByOffset(-100, 0).moveByOffset(0, 100).moveByOffset(100, 0).moveByOffset(0, -50).moveByOffset(-50, 0).release().perform();
	action.moveToElement(canvis).moveByOffset(-250, 0).clickAndHold().moveByOffset(100,0).moveByOffset(-100, 0).moveByOffset(0, 100).moveByOffset(100, 0).moveByOffset(0, -50).moveByOffset(-50, 0).release().perform();
	//Thread.sleep(10000);
}
@Ignore
@Test
public void shafeeq() throws InterruptedException {
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
	driver.get("https://christophperrins.github.io/TestingSite/");
	driver.findElement(By.xpath("//*[@id=\"quote\"]/h2"));
	WebElement element = driver.findElement(By.xpath("//*[@id=\"quote\"]/h1")); 
	assertEquals("I HATE YOU!", element.getText());


	
	
}
@Ignore
@Test 
public void shafeeq3() {
 
driver.get("https://christophperrins.github.io/TestingSite/");
WebElement element = (new WebDriverWait(driver, 10)) .until(ExpectedConditions.presenceOfElementLocated(By.id("quote"))); 
//driver.findElement(By.xpath("//*[@id=\"quote\"]/h2"));
assertEquals("", element.getText());

}

@Ignore
@Test
public void shafeeq2() {
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
	driver.get("https://christophperrins.github.io/TestingSite/");

	WebElement element2 = driver.findElement(By.xpath("//*[@id=\"quote\"]/h2"));

	assertEquals("-The Shafeeq", element2.getText());
	
}


}
