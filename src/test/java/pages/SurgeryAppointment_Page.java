package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.Driver;
import utilities.ReusableMethods;

import java.sql.ResultSet;

public class SurgeryAppointment_Page {
    WebDriver driver;

    @FindBy(xpath = "//a[text()='İşlemler']")
    WebElement settings_button;

    @FindBy(xpath = "//a[contains(text(),'Birim Tanımları')]")
    WebElement unitDefinition_button;

    @FindBy(xpath = "//a[contains(text(),'Yeni Ekle')]")
    WebElement newAdd_button;

    @FindBy(xpath = "//input[@id='SERVIS_ADI']/following-sibling::input[1]")
    WebElement servicePage_button;

    @FindBy(id = "BirimListe_DXFREditorcol0_I")
    WebElement serviceName_box;

    @FindBy(xpath = "(//img[@class='dxGridView_gvFilterRowButton_MetropolisBlue'])[1]")
    WebElement serviceSearch_button;
    @FindBy(id = "GUNLUK_MAKS_KAYIT")
    WebElement dailyCapacity_box;

    @FindBy(xpath = "//input[@id='Ameliyat_Birim_Tanim_Liste_DXFREditorcol0_I']")
    WebElement serviceCode_box;

    @FindBy(linkText = "Kaydet")
    WebElement save_button;

    @FindBy(xpath = "//div[@class='alertText']//p[1]")
    WebElement popUpMessage;

    @FindBy(xpath = "(//a[contains(@class,'hem_button hem_border')])[1]")
    WebElement edit_button;

@FindBy(xpath = "(//td[@class='dxgv dx-al'])[2]")
    WebElement getCapacity;


    public SurgeryAppointment_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void clickSettingsButton() {
        ReusableMethods.jseWithClick(Driver.getDriver(), settings_button);
//        settings_button.click();
    }

    public void clickUnitDefinitionsButton() {
        ReusableMethods.jseWithClick(Driver.getDriver(), unitDefinition_button);
        // unitDefinition_button.click();
    }

    public void clickNewAddButton() {
        ReusableMethods.waitForVisibility(newAdd_button, 3);
        ReusableMethods.jseWithClick(Driver.getDriver(), newAdd_button);
        //newAdd_button.click();
    }

    public void clickServiceButton() {
        ReusableMethods.jseWithClick(Driver.getDriver(), servicePage_button);
        //servicePage_button.click();
    }

    public void enterToServiceNameBox(String arg0) {
        serviceName_box.sendKeys(arg0);
        serviceName_box.sendKeys(Keys.ENTER);
        ReusableMethods.waitFor(2);

    }

    public void selectTheServiceCode(int arg0) {
        WebElement service = driver.findElement(By.xpath("//a[@data-lookupvalue='" + arg0 + "']"));
        ReusableMethods.jseWithClick(Driver.getDriver(), service);
        //actions.doubleClick(service);

    }

    public void enterTheNewDailyCapacity(int arg0) {
        ReusableMethods.waitForVisibility(dailyCapacity_box, 3);
        String capacity = String.valueOf(arg0);
        dailyCapacity_box.sendKeys(capacity);

    }


    public void assertTheNewSurgeryServiceUnit(int arg0) {
        String serviceCode = String.valueOf(arg0);
        WebElement actualServiceCode = driver.findElement(By.xpath("//td[text()='" + arg0 + "']"));
        System.out.println(actualServiceCode.getText());
        Assert.assertEquals(actualServiceCode.getText(), serviceCode);
    }

    public void clickSearch() {
        serviceSearch_button.click();

    }

    public void clickSaveButton() {
        ReusableMethods.jseWithClick(Driver.getDriver(), save_button);
        //save_button.click();
    }


    public void assertTheWarningMessage(String arg0) {
        System.out.println(popUpMessage.getAttribute("textContent"));
        Assert.assertEquals(popUpMessage.getAttribute("textContent"), arg0);
    }


    public void enterServiceCodeToServiceCodeBox(int arg0) {
        String serviceCode = String.valueOf(arg0);
        //ReusableMethods.jseWithClick(Driver.getDriver(),serviceCode_box);
        //serviceCode_box.click();
        ReusableMethods.waitFor(5);

        serviceCode_box.sendKeys(serviceCode+Keys.ENTER);
        ReusableMethods.waitFor(2);
    }

    public void clickEditButton() {
        ReusableMethods.waitForVisibility(edit_button,3);
        ReusableMethods.jseWithClick(Driver.getDriver(),edit_button);
        //edit_button.click();

    }

    public void deleteTheDailyCapacity() {
        dailyCapacity_box.clear();
    }

    public void assertTheNewCapacityNumber(String arg0) {
        //String capacity = String.valueOf(arg0);
        System.out.println("new capacity = " + getCapacity.getAttribute("textContent"));
        Assert.assertEquals(getCapacity.getAttribute("textContent"),arg0);

    }

    public void goToHome() {
        ReusableMethods.jseWithClick(Driver.getDriver(),servicePage_button);
        servicePage_button.click();
    }
}

