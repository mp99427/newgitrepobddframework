package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage<AccountPageStepdefinition> {
	private WebDriver driver;

	private By userName = By.id("email");
	private By password = By.id("passwd");
	private By signInButton = By.id("SubmitLogin");
	private By forgotPwdLink=By.linkText("Forgot your password?");

	public LoginPage(WebDriver driver) {
		this.driver = driver;

	}

	public String getLoginPageTitle() {
 return driver.getTitle();
	}
public Boolean isForgotPasswordExist()
{
return driver.findElement(forgotPwdLink).isDisplayed();
}
public void enterUsername(String userName)
{
	driver.findElement(this.userName).sendKeys(userName);
	}
public void enterPassword(String pwd)
{
	driver.findElement(password).sendKeys(pwd);
	}

public void clickOnLogin()
{
	driver.findElement(signInButton).click();
	}
public AccountPage doSignIn(String userName, String pwd)
{
	driver.findElement(this.userName).sendKeys(userName);
	driver.findElement(password).sendKeys(pwd);
	driver.findElement(signInButton).click();
	return new AccountPage(driver);
}
}
