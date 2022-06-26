package com.ingjuanfg.pages;


import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends PageObject {
    WebDriver driver;
    By inputUsuario = By.id("user-name");
    By inputPassword = By.id("password");
    By buttonLogin = By.id("login-button");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public void escribirUsuario(String usuario){
        driver.findElement(inputUsuario).sendKeys(usuario);
    }

    public void escribirPassword(String clave){
        driver.findElement(inputPassword).sendKeys(clave);
    }

    public void clickLogin(){
        driver.findElement(buttonLogin).click();
    }

}
