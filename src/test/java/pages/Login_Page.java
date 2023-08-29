package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ReusableMethods;

public class Login_Page {
    public Login_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id ="txtKA" )
    public WebElement kullaniciKodu;

    @FindBy(id ="txtSF" )
    public WebElement sifre;

    @FindBy(id ="txtWSF" )
    public WebElement webSifre;

    @FindBy(id ="btnLogin" )
    public WebElement clickButton;


}
