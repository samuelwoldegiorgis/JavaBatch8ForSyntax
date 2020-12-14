package com.syntax.class04;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementCommands {
    public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver","drivers/chormedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxtechs.com/selenium-practice/basic-radiobutton-demo.php");

    }
}
