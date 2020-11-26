package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskOne {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.navigate().to("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        webDriver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        webDriver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        webDriver.findElement(By.id("ctl00_MainContent_login_button")).click();

        String title = webDriver.getTitle();
        System.out.println(title);
        webDriver.findElement(By.id("ctl00_logout")).click();
        Thread.sleep(1000);
        if (title.equalsIgnoreCase("web orders")) {
            System.out.println(title);
            webDriver.quit();
        }
    }
}