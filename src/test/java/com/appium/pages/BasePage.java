package com.appium.pages;

import com.appium.step_definitions.Initialize;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BasePage {
    public AndroidDriver<MobileElement> driver;
    public WebDriverWait wait;


    public BasePage(){
        this.driver= Initialize.driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
        wait=new WebDriverWait(driver,10);
    }
    @AndroidFindBy(className = "android.widget.TextView")
    public List<AndroidElement> menuList;

    public void getMenu(String menuName){
        driver.findElement(By.xpath("//android.widget.TextView[@text='"+menuName+"']")).click();
    }


}

