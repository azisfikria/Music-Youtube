package org.musicyoutube.selenium;

import org.musicyoutube.drivers.DriverSingleton;
import org.musicyoutube.pages.Login;
import org.musicyoutube.pages.Search;
import org.musicyoutube.utils.Constants;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestSearch {
    public static WebDriver driver;
    private Login login;
    private Search search;

    @BeforeClass // ini ga perlu kalo lanjut dari tes login
    public void setUp() {
        DriverSingleton.getInstance(Constants.CHROME);
        driver = DriverSingleton.getDriver();
        driver.get(Constants.URL);
    }

    @BeforeMethod
    public void pageObject() {
        login = new Login();
        search = new Search();
    }

    @AfterClass
    public void closeBrowser() {
        delay(3);
//        driver.quit();
        DriverSingleton.closeObjectInstance();
    }

    @Test
    public void testSearch(){
        delay(Constants.DETIK);
        login.signIn();
        login.loginForm("acctestsqa", "testsqajc123");
        login.clickBtnLogin();
        delay(Constants.DETIK);

        search.searchBar();
        delay(Constants.DETIK);
    }
    static void delay(int detik) {
        try {
            Thread.sleep(1000*detik);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
