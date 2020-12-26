package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class Logintest {
    @BeforeMethod
    public void openAndNavigate(){
        System.setProperty("webdriver.chrome.driver","driver/chomedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://hrmstest.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

    }
}
