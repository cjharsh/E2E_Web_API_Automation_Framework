package test;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.w2a.base.W2aCoreTest;
import com.w2a.endpoints.BankDemoSiteEndPoints;
import com.w2a.screens.HomePage;
import com.w2a.utilies.Constants;

public class LoginTest extends W2aCoreTest {

	@Test
	public void HomepageTest() {

		log.info("Verify all the elements are displayed");
		Assert.assertTrue(driver.findElement(HomePage.LOGO).isDisplayed());
		Assert.assertTrue(driver.findElement(HomePage.USERID_LABEL).isDisplayed());
		Assert.assertTrue(driver.findElement(HomePage.USERID_INPUT).isEnabled());
		Assert.assertTrue(driver.findElement(HomePage.PASSWORD_LABEL).isDisplayed());
		Assert.assertTrue(driver.findElement(HomePage.PASSWORD_INPUT).isEnabled());
		Assert.assertTrue(driver.findElement(HomePage.LOGIN_BTN).isEnabled());
		Assert.assertTrue(driver.findElement(HomePage.RESET_BTN).isEnabled());
	}

	@DataProvider()
	public Object[][] invalidCredentials() {
		log.trace("In the data provider");
		return new Object[][] { { HomePage.USERID_INPUT }, { HomePage.PASSWORD_INPUT } };
	}
}
