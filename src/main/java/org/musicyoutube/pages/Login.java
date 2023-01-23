package org.musicyoutube.pages;

import org.musicyoutube.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
    private WebDriver driver;

    public Login() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"right-content\"]/a")
    WebElement signInButton;
    @FindBy(id = "identifierId")
    WebElement username;
    @FindBy(xpath = "//span[.='Next']")
    WebElement btnNext;
    @FindBy(xpath = "//*[@id=\"password\"]/div[1]/div/div[1]/input")
    WebElement password;
    @FindBy(xpath = "//*[@id=\"passwordNext\"]/div/button/span")
    WebElement btnNextLogin;
    @FindBy(xpath = ".ytmusic-settings-button")
    WebElement btnAccount;
    @FindBy (xpath = "//*[@id=\"account-name\"]")
    WebElement txtAccount;
    @FindBy(xpath = "//*[@id=\"label\"]")
    WebElement btnLogout;

    public void signIn(){
        signInButton.click();
    }
    public void loginForm(String username, String password){
        this.username.sendKeys(username);
        this.btnNext.click();
        delay(2);
        this.password.sendKeys(password);
    }

    public void clickBtnLogin(){
        btnNextLogin.click();
    }

    public void clickBtnAccount(){
        btnAccount.isDisplayed();
    }
    public String getTxtAccountValid(){
        delay(2);
        return txtAccount.getText().trim();
    }

    public String getTxtNullMessage(){
        return username.getAttribute("required");
    }


    public void clickBtnLogout(){
        btnLogout.click();
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
