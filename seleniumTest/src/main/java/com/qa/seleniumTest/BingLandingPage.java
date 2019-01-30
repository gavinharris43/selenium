package com.qa.seleniumTest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class BingLandingPage 
{
  @FindBy(id="sb_from_q")
  private WebElement searchbox;
  
  public void searchBing(String searchText) {
	  searchbox.sendKeys(searchText);
	  searchbox.submit();
	  
  }
}
