package com.CuraHealthCare.pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
public class Welcomepage   //POM class   //CuraLogin1.java
{
	@FindBys({@FindBy(id = "menu-toggle"),@FindBy(xpath = "//a[contains(@class,'btn btn-dark btn-lg toggle')]")})

	WebElement menuIcon;

	@FindBys({@FindBy(id = "btn-make-appointment"),@FindBy(xpath = "//a[text()='Make Appointment']")})
	WebElement appointmentButton;

	public Welcomepage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getMenuIcon()
	{
		return menuIcon;
	}
	public WebElement getAppointmentButton()
	{
		return appointmentButton;
	}
}