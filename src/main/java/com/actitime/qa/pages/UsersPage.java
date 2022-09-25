package com.actitime.qa.pages;

import com.actitime.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class UsersPage extends TestBase  {
    @FindBy(xpath = "//*[@id=\"logo_aT\"]")
    WebElement actitimeLogo;

    @FindBy(xpath = "//*[@id=\"pageBody\"]/tbody/tr[1]/td[3]/div/div[3]/div[1]")
    WebElement components_button_label;

    @FindBy(xpath = "//*[@id=\"createUserPanel\"]")
    WebElement createUserPanel;

    @FindBy(xpath = "//*[@id=\"editUserPanel\"]/div[2]/div/div[1]/div")
    WebElement userPanel;

    @FindBy(xpath = "//*[@id=\"topnav\"]/tbody/tr/td[6]")
    WebElement usersPage;

    @FindBy(xpath = "//*[@id=\"userListTableContainer\"]/div/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]")
    WebElement userLink;

    public UsersPage() {
        PageFactory.initElements(driver, this);
    }

    public Boolean validateActiTimeLogo() {
        return actitimeLogo.isDisplayed();
    }

    public UsersPage goToUsersPage() {
        usersPage.click();
        return  new UsersPage();
    }

    public Boolean addUser() {
        components_button_label.click();
        if(createUserPanel.isDisplayed()) {
            return true;
        }else {
            return false;
        }
    }

    public boolean clickOnUsersLink() {
        userLink.click();
        if(userPanel.isDisplayed()) {
            return true;
        }else {
            return false;
        }
    }

}
