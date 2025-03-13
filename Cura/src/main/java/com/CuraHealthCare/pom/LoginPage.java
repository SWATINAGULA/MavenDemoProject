package com.CuraHealthCare.pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPage  //POM class we store webElements as web objects  //CuraLogin1.java
{
	@FindAll({@FindBy(css="input[id='txt-username'][name='username']") , @FindBy(xpath = "//input[@id='txt-username'and @name='username'] ")})
	
	WebElement username;

	@FindBys({@FindBy(css = "input[id='txt-password'][name='password']"),@FindBy(xpath = "//input[@id='txt-password' and @name='password']")})

	WebElement password;

	@FindBys({@FindBy(id = "btn-login"),@FindBy(xpath = "//button[contains(@class,'btn btn-default')]")})

	WebElement loginBtn;
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

//	public WebElement getUsername() {
//		return username;
//	}
//
//	public WebElement getPassword() {
//		return password;
//	}
//
//	public WebElement getLoginBtn() {
//		return loginBtn;
//	}
	
	public void loginToCuraHealth(String user , String pass)
	{
		username.sendKeys(user);
		password.sendKeys(pass);
		loginBtn.click();
	}
	
	
	
}
