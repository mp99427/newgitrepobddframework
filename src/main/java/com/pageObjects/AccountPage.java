package com.pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountPage {
	private WebDriver driver;
	private By accountSections= By.cssSelector("div#center_column span");
	
	public AccountPage(WebDriver driver)
	{
	this.driver= driver;	
	}
	public Dimension getSectionCount()
	{
		return driver.findElement(accountSections).getSize();
	
}
public List<String> getAccountSectionList() {
	List<WebElement> sectionList = driver.findElements(accountSections);
	List<String> accountSectionList = new ArrayList<>();
	for(WebElement e: sectionList)
	{
		String text = e.getText();
		accountSectionList.add(text);
	}
	return accountSectionList;
}
public String getAccountPageTitle()
{
	return driver.getTitle();
}
}