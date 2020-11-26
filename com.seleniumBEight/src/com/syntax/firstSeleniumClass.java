package com.syntax;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstSeleniumClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\asmarabella\\Documents\\SeleniumBatch8Folder\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://passcomptia.com/");
    }


}
