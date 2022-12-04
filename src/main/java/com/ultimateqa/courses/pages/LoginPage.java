package com.ultimateqa.courses.pages;

import com.ultimateqa.courses.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By signInButton= By.xpath("//header/div[1]/div[1]/section[1]/ul[1]/li[1]/a[1]");
    By emailField= By.id("user[email]");
    By passwordField= By.id("user[password]");

    By signInButtonOnLoginPage= By.xpath("//input[@class='button button-primary g-recaptcha']        ");
    By errorMessage= By.xpath("//li[@class='form-error__list-item']");

  public void clickOnSignInButton(){
      clickOnElement(signInButton);
  }
    public void enterEmailId(String email){
        sendTextToElement(emailField, email);
    }
    public void enterPassword(String password){
        sendTextToElement(passwordField, password);
    }
    public void clickOnLoginButton(){
        clickOnElement(signInButtonOnLoginPage);
    }
    public String getErrorMessage(){
        return getTextFromElement(errorMessage);
    }

}
