package pages;


import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import utilities.Driver;
import utilities.ReusableMethods;


public class SurgicalSupplies_Page {
    WebDriver driver;
    SoftAssert softAssert = new SoftAssert();

    SurgeryAppointment_Page sap = new SurgeryAppointment_Page(Driver.getDriver());


    @FindBy(name = "AMELIYAT_LST_TARIH")
    WebElement calendar_suppliesPage;

    @FindBy(id = "btnLstYenile")
    WebElement refresh_button;



    @FindBy(xpath = "//td[text()='Salon_1']")
    WebElement saloon1;

    @FindBy(xpath = "//td[text()='1']")
    WebElement patient1;

    @FindBy(linkText = "Şablon Uygula")
    WebElement template_button;

    @FindBy(id = "lstMalzemeSablonListe_DXFREditorcol1_I")

    WebElement templateCode_box;

    @FindBy(xpath = "//input[@class='inpt wpx300']")
    WebElement templateNewName_box;

    @FindBy(xpath = "//a[@data-icon='verify']")
    WebElement select_button;

    @FindBy(xpath = "(//label[@class='lbl_check no-margin'])[2]")
    WebElement firstSupplyApprove_box;

    @FindBy(xpath = "(//label[@class='lbl_check no-margin'])[3]")
    WebElement secondSupplyApprove_box;

    @FindBy(xpath = "(//label[@class='lbl_check no-margin'])[4]")
    WebElement firstMedicineApprove_box;

    @FindBy(xpath = "(//label[@class='lbl_check no-margin'])[5]")
    WebElement secondMedicineApprove_box;

    @FindBy(linkText = "Malzemeleri İşle & Güncelle")
    WebElement materialUpdate_button;

    @FindBy(linkText = "İlaçları İşle & Güncelle")
    WebElement medicineUpdate_button;

    @FindBy(xpath = "//span[@class='warning item']")
    WebElement okey_button;

    @FindBy(xpath = "//a[@onclick='funcMalzemeSil(this)']")
    WebElement deleteMaterial_button;

    @FindBy(xpath = "//a[@onclick='funcIlacSil(this)']")
    WebElement deleteMedicine_button;

    @FindBy(id = "MALZEME_BARKOD")
    WebElement materialBarcode_box;

    @FindBy(xpath = "//*[@id='lstIlacNo']")
    WebElement medicineBarcode_box;

    @FindBy(id = "MalzemeListe_DXFREditorcol0_I")
    WebElement materialCode_box;

    @FindBy(id = "IlacListe_DXFREditorcol0_I")
    WebElement medicineCode_box;

    @FindBy(xpath = "(//input[@value='...'])[1]")
    WebElement materialPopUp_button;

    @FindBy(xpath = "(//input[@value='...'])[2]")
    WebElement medicinePopUp_button;

    @FindBy(xpath = "//a[@title='Malzeme Ekle']")
    WebElement addMaterial_button;

    @FindBy(xpath = "//a[@title='İlaç Ekle']")
    WebElement addMedicine_button;

    @FindBy(linkText = "Kapat")
    WebElement closePopUpPage_button;

    @FindBy(xpath = "//a[@onclick=\"SablonTanimlamaAc()\"]")
    WebElement templateDefinitions_button;

    @FindBy(xpath = "(//a[contains(@class,'text_btn text_btn_yeni')])[3]")
    WebElement newTemplateAdd_button;

    @FindBy(id = "lstMalzemeSablonListe_DXFREditorcol1_I")
    WebElement templateName_box;
    @FindBy(id = "Ameliyat_Sablon_Liste_DXFREditorcol1_I")
    WebElement templateName2_box;

    @FindBy(id = "BRANS_KODU")
    WebElement branchCode_box;

    @FindBy(id = "TETKIK_ADI")
    WebElement examName_box;

    @FindBy(id = "TetkikListe_DXFREditorcol0_I")
    WebElement officialExamCode_box;

    @FindBy(xpath = "//td[@colspan='9']")
    WebElement noTemplateDisplay;

    @FindBy(xpath = "//div[@class='PopupTitle']")
    WebElement popUpPage_title;

    public SurgicalSupplies_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void selectTheSurgeryDate(String arg0) {
        ReusableMethods.waitFor(4);
        //ReusableMethods.jseWithClick(Driver.getDriver(),calendar_suppliesPage);
        calendar_suppliesPage.click();
        // calendar_suppliesPage.clear();
        calendar_suppliesPage.sendKeys(arg0 + Keys.ENTER);
        ReusableMethods.waitFor(2);
    }

    public void clickRefreshButton() {
        ReusableMethods.waitFor(1);
        refresh_button.click();
        ReusableMethods.waitFor(3);
    }

    public void clickSaloon() {
        ReusableMethods.waitFor(1);
        saloon1.click();
    }

    public void selectPatient() {
        // ReusableMethods.waitFor(4);
        patient1.click();
        ReusableMethods.waitFor(2);
    }

    public void clickApplyTemplate() {
        template_button.click();
    }

    public void clickTemplateName(String arg0) {
        templateName_box.sendKeys(arg0 + Keys.ENTER);
        ReusableMethods.waitFor(2);
        select_button.click();
        ReusableMethods.waitFor(2);
    }

    public void clickApproveBoxForMaterials() {
        ReusableMethods.waitFor(2);
        ReusableMethods.jseWithClick(Driver.getDriver(),firstSupplyApprove_box);
        ReusableMethods.jseWithClick(Driver.getDriver(),secondSupplyApprove_box);
        //firstSupplyApprove_box.click();
        //secondSupplyApprove_box.click();
    }

    public void clickApproveBoxForMedicine() {
        ReusableMethods.waitFor(2);
        firstMedicineApprove_box.click();
        secondMedicineApprove_box.click();
    }

    public void clickMaterialsProcessAndUpdateButton() {
        materialUpdate_button.click();
        ReusableMethods.waitFor(2);
    }

    public void clickOkeyButton() {
        okey_button.click();
        ReusableMethods.waitFor(2);
    }

    public void clickMedicineProcessAndUpdateButton() {
        medicineUpdate_button.click();
        ReusableMethods.waitFor(2);
    }

    public void deleteTheMaterial(String arg0) {
        WebElement supply = driver.findElement(By.xpath("//td[text()='" + arg0 + "']"));
        supply.click();
        deleteMaterial_button.click();
    }

    public void assertTheMaterialOrMedicineDeleted(String arg0) {

        WebElement supply = driver.findElement(By.xpath("//table[@id='dxGridAmeliyatMalzemeListesi_DXMainTable']"));
        System.out.println(supply.getAttribute("textContent"));
        Assert.assertFalse(supply.getAttribute("textContent").contains(arg0));
    }

    public void deleteTheMedicine(String arg0) {
        WebElement supply = driver.findElement(By.xpath("//td[text()='" + arg0 + "']"));
        supply.click();
        deleteMedicine_button.click();
    }

    public void enterBarcodeToBarcodeBox(String arg0) {
        materialBarcode_box.sendKeys(arg0 + Keys.ENTER);
        ReusableMethods.waitFor(2);
    }

    public void doubleClickBarcodeBox() {
        ReusableMethods.doubleClickWithJS(Driver.getDriver(), materialBarcode_box);
    }

    public void assertPopupPage(String arg0) {
        ReusableMethods.waitFor(3);
        System.out.println("actual result = " + popUpPage_title.getAttribute("textContent"));
        System.out.println("expected result = " + arg0);
        Assert.assertTrue(popUpPage_title.getAttribute("textContent").contains(arg0));
    }

    public void enterBarcodeToMaterialCodeBox(String arg0) {
        materialCode_box.sendKeys(arg0 + Keys.ENTER);
        ReusableMethods.waitFor(2);
    }

    public void assertTheMaterialOrMedicine(String arg0, String arg1) {
        WebElement table = driver.findElement(By.xpath("//table[@id='" + arg1 + "_DXMainTable']"));
        System.out.println(table.getAttribute("textContent"));
        Assert.assertFalse(table.getAttribute("textContent").contains(arg0));
    }

    public void closePopupPage() {
        closePopUpPage_button.click();
    }

    public void clickMaterialsPopupPageButton() {
        materialPopUp_button.click();
    }

    public void enterMedicineCodeToAddMedicineBox(String arg0) {
        medicineBarcode_box.sendKeys(arg0 + Keys.ENTER);
    }

    public void doubleClickMedicineCodeBox() {
        ReusableMethods.doubleClickWithJS(Driver.getDriver(), medicineBarcode_box);
    }

    public void enterMedicineCodeToMedicineCodeBox(String arg0) {
        medicineCode_box.sendKeys(arg0 + Keys.ENTER);
    }

    public void clickMedicinePopupPageButton() {
        medicinePopUp_button.click();
    }

    public void clickMaterialsAddButton() {
        addMaterial_button.click();
    }

    public void clickMedicineAddButton() {
        addMedicine_button.click();
    }

    public void clickTemplateDefinitionsButton() {
        ReusableMethods.waitFor(3);
        ReusableMethods.jseWithClick(Driver.getDriver(),templateDefinitions_button);
       // templateDefinitions_button.click();
    }

    public void clickNewTemplateAddButton() {
        newTemplateAdd_button.click();
    }

    public void selectTypeOfTemplate(String arg0) {
        WebElement type = driver.findElement(By.xpath("//option[text()='" + arg0 + "']"));
        type.click();
    }

    public void enterTemplateName(String arg0) {
        //templateNewName_box.click();
        templateNewName_box.sendKeys(arg0 + Keys.ENTER);
        ReusableMethods.waitFor(3);
    }

    public void enterBranchCodeToBranchBox(String arg0) {
        branchCode_box.clear();
        branchCode_box.sendKeys(arg0 + Keys.ENTER);
    }

    public void doubleClickExaminationNameBox() {
        ReusableMethods.doubleClickWithJS(Driver.getDriver(), examName_box);
    }

    public void enterCodeToOfficialCodeBox(String arg0) {
        officialExamCode_box.sendKeys(arg0 + Keys.ENTER);
        ReusableMethods.waitFor(2);
        select_button.click();
    }

    public void assertNewTemplateByName(String arg0) {
        WebElement templateName = driver.findElement(By.xpath("//td[text()='" + arg0 + "']"));
        System.out.println("actual result = " + templateName.getAttribute("textContent"));
        System.out.println("expected result = " + arg0);
        Assert.assertTrue(templateName.getAttribute("textContent").contains(arg0));
    }

    public void assertTheTemplateDeleted(String arg0) {
        ReusableMethods.waitFor(2);
        System.out.println(noTemplateDisplay.getAttribute("textContent"));
        Assert.assertTrue(noTemplateDisplay.isDisplayed());
    }

    public void enterTemplateNameToNameSearchBox(String arg0) {
        ReusableMethods.waitFor(2);
        templateName2_box.clear();
        ReusableMethods.waitFor(2);
        templateName2_box.sendKeys(arg0 + Keys.ENTER);
    }

    public void clearTemplateName() {
        templateNewName_box.clear();
    }

    public void ifMaterialDisplayedDeleteTheMaterial(String arg0) {
        try {
            WebElement supply = driver.findElement(By.xpath("//td[text()='" + arg0 + "']"));
            if (supply.isDisplayed()) {
                supply.click();
                deleteMaterial_button.click();
                sap.clickYesButton();
            }
        } catch (NoSuchElementException e) {
        }
        ReusableMethods.waitFor(2);
    }
    public void ifMedicineDisplayedDeleteTheMedicine(String arg0) {
        try {
            WebElement medicine = driver.findElement(By.xpath("//td[text()='" + arg0 + "']"));

            if (medicine.isDisplayed()) {
                medicine.click();
                deleteMedicine_button.click();
                sap.clickYesButton();
            }
        } catch (NoSuchElementException e) {
        }
        ReusableMethods.waitFor(2);
    }

}

