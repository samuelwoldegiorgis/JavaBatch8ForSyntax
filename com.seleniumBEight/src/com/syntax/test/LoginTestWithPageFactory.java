package com.syntax.test;

import com.syntax.pages.LoginPageWithPageFactory;
import com.syntax.testbase.BaseClass;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class LoginTestWithPageFactory {
    public static void main(String[] args){
        BaseClass.setUp();
        LoginPageWithPageFactory loginPageWithPageFactory=new LoginPageWithPageFactory();

        loginPageWithPageFactory.usernameTextbox.sendKeys("Admin");
        loginPageWithPageFactory.passwordTextBox.sendKeys("Hum@nhrm123");
        loginPageWithPageFactory.loginBtn.click();

        /*TakesScreenshot ts=(TakesScreenshot)BaseClass.driver;
        File file= ts.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file,new File("screenshots/HRMS/dashboard.png"));
        } catch (IOException e) {
            e.printStackTrace();*/
        }
    }


