package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorDemo {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxtechs.com/selenium-practice/index.php");
        driver.findElement(By.cssSelector("a[id = 'btn_basic_example']")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#basic > div > a:nth-child(1)")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[placeholder ^= 'Please']")).sendKeys("TEst");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button[onclick *= 'show']")).click();
        driver.quit();
    }
}
