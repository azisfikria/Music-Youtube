package org.musicyoutube.pages;

import org.musicyoutube.drivers.DriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search {
    private WebDriver driver;

    public Search() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"placeholder\"]")
    WebElement btnSearch;

    @FindBy(xpath = "//input[@id='input']")
    WebElement inputSinger;

    public void searchBar(){
        btnSearch.click();
        delay(1);
        inputSinger.sendKeys("Greenday", Keys.ENTER);
        delay(1);
    }


    static void delay(int detik){
        //delay
        try {
            Thread.sleep(1000 * detik);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
