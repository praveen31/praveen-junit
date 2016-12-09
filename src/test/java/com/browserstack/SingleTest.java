package com.browserstack;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class SingleTest extends BrowserStackJUnitTest {

  @Test
  public void loginAutomateRunTest() throws Exception {
    boolean isPhoneNumberDisplayed=false;
    WebDriverWait wait = new WebDriverWait(driver, 5);
    driver.get("https://www.browserstack.com/automate");
    WebElement getStarted = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Get started")));
    getStarted.click();
    WebElement emailField = wait.until(ExpectedConditions.elementToBeClickable(By.id("user_email_login")));
  	emailField.clear();
  	emailField.sendKeys("praveen@browserstack.com");
    WebElement pwdField = wait.until(ExpectedConditions.elementToBeClickable(By.id("user_password")));
  	pwdField.sendKeys("tlido1981!");
  	WebElement submitButton=driver.findElement(By.id("user_submit"));
  	submitButton.click();
  	WebElement inviteLink = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("invite-link")));

  }

  @Test
  public void checkContactSalesForm() throws Exception {
    boolean isPhoneNumberDisplayed=false;
    WebDriverWait wait = new WebDriverWait(driver, 5);
    driver.get("https://www.browserstack.com/pricing");
    WebElement contactSalesButton = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Contact Sales")));
    contactSalesButton.click();
    WebElement phoneNumber = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("sales-phone")));
  }
}
