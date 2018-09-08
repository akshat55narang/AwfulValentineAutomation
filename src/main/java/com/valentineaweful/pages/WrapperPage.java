package com.valentineaweful.pages;

import com.valentineaweful.managers.ConfigFileManager;
import org.openqa.selenium.WebDriver;

public class WrapperPage {
    private WebDriver driver;
    public WrapperPage(WebDriver driver){
        this.driver = driver;
    }

    public void get(){
        driver.get(ConfigFileManager.getInstance().getConfiguration().getApplicationURL());
    }

}
