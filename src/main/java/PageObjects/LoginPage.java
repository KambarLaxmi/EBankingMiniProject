package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "uid")
	WebElement userId;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(name = "btnLogin")
	WebElement loginButton;

	public void setUsername(String username) {
		userId.sendKeys(username);
	}
	public void setPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	public void clicksOnLoginButton() {
		loginButton.click();
	}
}
