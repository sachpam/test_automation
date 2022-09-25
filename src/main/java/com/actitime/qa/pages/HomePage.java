package com.actitime.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.qa.base.TestBase;

import net.bytebuddy.asm.Advice.Return;

public class HomePage extends TestBase {


	//Page Factory - Object Repository

	@FindBy(xpath = "//a[@class='content tasks']")
	WebElement taskLink;

	@FindBy(xpath = "//a[@class='content reports']")
	WebElement reportsLink;

	@FindBy(xpath = "//div[@id='logo_aT']")
	WebElement actitimeLogo;

	@FindBy(xpath = "//div[@id='logo_aP']")
	WebElement actiPlansLogo;

	@FindBy(className = "logoSwitcherText")
	WebElement switcher;

	//initialization

	public HomePage() {

		PageFactory.initElements(driver, this);
	}


	//Action/Methods

	public Boolean validateActiTimeLogo() {
		return actitimeLogo.isDisplayed();
	}

	public Boolean validateActiPlansLogo() {
		return actiPlansLogo.isDisplayed();
	}

	public void switchToActiPlans() {
		if (validateActiTimeLogo()) {
			switcher.click();
			validateActiPlansLogo();
		}
	}

	public void switchToActiTime() {
		if (validateActiPlansLogo()) {
			switcher.click();
			validateActiTimeLogo();
		}
	}


	public TasksPage clickOnTaskLink() {

		taskLink.click();
		return new TasksPage();

	}


	public ReportsPage clickOnReportsLink() {

		reportsLink.click();
		return new ReportsPage();

	}

}