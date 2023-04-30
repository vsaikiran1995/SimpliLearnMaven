package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

import testcases.BaseClass;

public class LoginPage {
	WebDriver pageDriver;

	@FindBy(linkText = "Log in")
	WebElement loginLink;
	@FindBy(name = "user_login")
	WebElement userName;
	@FindBy(name = "user_pwd")
	WebElement password;
	@FindBy(className = "rememberMe")
	WebElement RememberMe;
	@FindBy(name = "btn_login")
	WebElement loginBtn;

	public LoginPage(WebDriver driver) {
		pageDriver = driver;
		PageFactory.initElements(pageDriver, this);
	}

	public void LoginFunction(String userName, String pwd) {
		loginLink.click();
		System.out.println(pageDriver.getTitle());
		this.userName.sendKeys(userName);
		password.sendKeys(pwd);
		RememberMe.click();
		loginBtn.click();
	}

}
