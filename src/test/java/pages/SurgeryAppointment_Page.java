package pages;


import io.cucumber.datatable.DataTable;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import utilities.Driver;
import utilities.ReusableMethods;

public class SurgeryAppointment_Page {
    WebDriver driver;
    SoftAssert softAssert = new SoftAssert();


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

    @FindBy(id = "BIRIM_KODU")
    WebElement serviceCode_box;

    @FindBy(xpath = "(//img[@class='dxGridView_gvFilterRowButton_MetropolisBlue'])[1]")
    WebElement serviceSearch_button;

    @FindBy(id = "GUNLUK_MAKS_KAYIT")
    WebElement dailyCapacity_box;

    @FindBy(linkText = "Kaydet")
    WebElement popUpSave_button;

    @FindBy(xpath = "//div[@class='alertText']//p[1]")
    WebElement popUpMessage;

    @FindBy(xpath = "//div[@class='alrt']//h2[1]")
    WebElement popUpMessageTitle;

    @FindBy(xpath = "(//span[text()='Kapat'])[1]")
    WebElement closePopUPMessage_button;

    @FindBy(xpath = "(//a[contains(@class,'hem_button hem_border')])[1]")
    WebElement edit_button;

    @FindBy(xpath = "(//td[@class='dxgv dx-al'])[2]")
    WebElement getCapacity;

    @FindBy(linkText = "Yeni Randevu")
    WebElement newAppointment_button;

    @FindBy(linkText = "Hasta Bul")
    WebElement findPatient_button;

    @FindBy(xpath = "//div[text()='Hasta Geçmişi']")
    WebElement patientHistory_title;

    @FindBy(id = "LISTE_HASTA_ARAMA_DXFREditorcol2_I")
    WebElement patientName_box;

    @FindBy(linkText = "Geliş Aktar")
    WebElement transfer_button;

    @FindBy(xpath = "//div[text()='Ameliyat Randevu Bilgileri']")
    WebElement popUp_title;

    @FindBy(id = "RANDEVU_TARIHI")
    WebElement calendar;

    @FindBy(xpath = "(//input[@id='TETKIK_ADI']/following-sibling::input)[1]")
    WebElement firstSurgery_button;

    @FindBy(id = "AmeliyatListe_DXFREditorcol0_I")
    WebElement surgeryName_box;

    @FindBy(linkText = "Saatler")
    WebElement hours_button;

    @FindBy(id = "Ameliyat_Birim_Tanim_Liste_DXFREditorcol0_I")
    WebElement unitCode_box;

    @FindBy(id = "BIRIM_KODU_ANA")
    WebElement unitCode_box_page;

    @FindBy(xpath = "(//a[contains(@class,'hem_button hem_border')])[2]")
    WebElement deleteUnit_button;

    @FindBy(xpath = "//span[text()='Evet']")
    WebElement yes_button;

    @FindBy(xpath = "//div[text()[normalize-space()='Görüntülenecek veri yok']]")
    WebElement nothingToDisplay;

    @FindBy(xpath = "//div[@class='alertText']//p[1]")
    WebElement popUpWarningMessage;

    @FindBy(xpath = "//input[@id='PASIF']/following-sibling::label[1]")
    WebElement passive_box;

    @FindBy(xpath = "(//a[@class='PopupCloseButton PopupButton'])[2]")
    WebElement closePopUpPage_button;

    @FindBy(id = "BUTCE_KODU")
    WebElement firstSurgery_box;

    @FindBy(id = "PROTOKOL_NO_RND")
    WebElement protocolID_box;

    @FindBy(id = "BRANS_KODU")
    WebElement branchCode_box;

    @FindBy(xpath = "//a[contains(text(),'Grup Tanımları')]")
    WebElement groupDef_button;

    @FindBy(id = "Ameliyat_Grup_Tanim_Liste_DXFREditorcol0_I")
    WebElement groupCode_box;

    @FindBy(id = "GRUP_ADI_TNM")
    WebElement groupName_box;

    @FindBy(id = "Ameliyat_Grup_Tanim_Liste_DXFREditorcol1_I")
    WebElement branchName_box;

    @FindBy(xpath = "(//td[@class='dxgv dx-al'])[1]")
    WebElement branchNameTitle;

    @FindBy(xpath = "(//td[@class='dxgv dx-al'])[2]")
    WebElement groupNameTitle;

    @FindBy(xpath = "//a[contains(text(),'İptal Nedenleri')]")
    WebElement cancelReason;

    @FindBy(xpath = "//input[@class='inpt wpx350']")
    WebElement cancelReason_box;

    @FindBy(id = "Ameliyat_Iptal_Neden_Liste_DXFREditorcol1_I")
    WebElement cancelReasonSearch_box;


    public SurgeryAppointment_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickSettingsButton() {
        ReusableMethods.waitForVisibility(settings_button, 3);
        ReusableMethods.jseWithClick(Driver.getDriver(), settings_button);
        //settings_button.click();
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
        // ReusableMethods.jseWithClick(Driver.getDriver(), servicePage_button);
        servicePage_button.click();
    }

    public void enterToServiceNameBox(String arg0) {
        ReusableMethods.waitFor(3);
        serviceName_box.sendKeys(arg0 + Keys.ENTER);
        ReusableMethods.waitFor(3);
    }

    public void selectTheServiceCode(String arg0) {
        ReusableMethods.waitFor(5);
        unitCode_box_page.sendKeys(arg0 + Keys.ENTER);
    }

    public void assertTheNewSurgeryServiceUnit(String arg0) {
        WebElement actualServiceCode = driver.findElement(By.xpath("//td[text()='" + arg0 + "']"));
        System.out.println(actualServiceCode.getText());
        Assert.assertEquals(actualServiceCode.getText(), arg0);
    }

    public void clickSearch() {
        serviceSearch_button.click();
    }

    public void clickSaveButton() {
        ReusableMethods.jseWithClick(Driver.getDriver(), popUpSave_button);
        //save_button.click();
        ReusableMethods.waitFor(2);
    }

    public void assertTheWarningMessage(String arg0) {
        System.out.println(popUpMessage.getAttribute("textContent"));
        Assert.assertEquals(popUpMessage.getAttribute("textContent"), arg0);
    }

    public void enterServiceCodeToServiceCodeBox(String arg0) {
        //ReusableMethods.jseWithClick(Driver.getDriver(),serviceCode_box);
        //serviceCode_box.click();
        ReusableMethods.waitFor(2);

        serviceCode_box.sendKeys(arg0 + Keys.ENTER);
        ReusableMethods.waitFor(2);
    }

    public void clickEditButton() {
        ReusableMethods.waitFor(2);
        ReusableMethods.jseWithClick(Driver.getDriver(), edit_button);
        //edit_button.click();
    }

    public void deleteTheDailyCapacity() {
        dailyCapacity_box.clear();
    }

    public void assertTheNewCapacityNumber(String arg0) {
        //String capacity = String.valueOf(arg0);
        System.out.println("new capacity = " + getCapacity.getAttribute("textContent"));
        Assert.assertEquals(getCapacity.getAttribute("textContent"), arg0);
    }

    public void changeAndAssertTheNewCapacityNumber(DataTable dataTable) {
        for (int row = 0; row < dataTable.height(); row++) { // Rowlari doner
            String capacity = dataTable.cell(row, 0);

            clickEditButton();
            deleteTheDailyCapacity();
            dailyCapacity_box.sendKeys(capacity);
            ReusableMethods.waitFor(1);

            popUpSave_button.click();
            ReusableMethods.waitFor(2);
            //ReusableMethods.jseWithClick(Driver.getDriver(), save_button);

            try {
                if (popUpMessage.isDisplayed()) {
                    System.out.println("\'" + capacity + "\'" + " can not be the capacity");
                    System.out.println("Warning message title = " + popUpMessageTitle.getAttribute("textContent"));
                    System.out.println("Warning message  = " + popUpMessage.getAttribute("textContent"));
                    closePopUPMessage_button.click();
                    ReusableMethods.waitFor(2);

                    closePopUpPage_button.click();
                    ReusableMethods.waitFor(2);

                }
            } catch (NoSuchElementException e) {
            }

            softAssert.assertEquals(getCapacity.getAttribute("textContent"), capacity);
            //Assert.assertEquals(getCapacity.getAttribute("textContent"), capacity);

            ReusableMethods.waitFor(1);
        }
    }

    public void clickNewAppointmentButton() {
        ReusableMethods.waitFor(5);
        // ReusableMethods.waitForClickablility(newAppointment_button, 2);
        ReusableMethods.jseWithClick(Driver.getDriver(), newAppointment_button);
    }

    public void clickFindPatientButton() {
        ReusableMethods.waitFor(4);
        ReusableMethods.jseWithClick(Driver.getDriver(), findPatient_button);
    }

    public void assertThePageOfPatientHistory(String arg0) {
        ReusableMethods.waitForVisibility(patientHistory_title, 5);
        Assert.assertEquals(patientHistory_title.getAttribute("textContent"), arg0);
    }

    public void enterTheNameInTheNameBox(String arg0) {
        ReusableMethods.waitFor(5);
        //patientName_box.sendKeys(arg0 + Keys.ENTER);

        patientName_box.click();
        patientName_box.sendKeys(arg0 + Keys.ENTER);
    }

    public void selectThePatient(String arg0) {
        ReusableMethods.waitFor(5);
        WebElement patientName = driver.findElement(By.xpath("//td[text()='" + arg0 + "']"));
        ReusableMethods.waitForVisibility(patientName, 2);
        System.out.println(patientName.getText());
        patientName.click();
    }

    public void clickTheTransferTheServiceRegistrationButton() {
        ReusableMethods.waitFor(4);
        ReusableMethods.jseWithClick(Driver.getDriver(), transfer_button);
    }

    public void assertThePopupPageOfSurgeryAppointment(String arg0) {
        ReusableMethods.waitForVisibility(popUp_title, 2);
        System.out.println("popUp_title = " + popUp_title.getAttribute("textContent"));

        Assert.assertEquals(popUp_title.getAttribute("textContent"), arg0);
    }

    public void clickCalendar() {
        calendar.click();
        ReusableMethods.waitFor(2);
    }

    public void selectTheDate(String arg0) {
        calendar.sendKeys(arg0 + Keys.ENTER);
        ReusableMethods.waitFor(1);

        //closeCalendar_button.click();
    }

    public void clickFirstSurgeryButton() {
        firstSurgery_button.click();
    }

    public void enterToSurgeryNameBox(String arg0) {
        ReusableMethods.waitForVisibility(surgeryName_box, 2);
        surgeryName_box.sendKeys(arg0 + Keys.ENTER);
    }

    public void selectTheSurgeryCode(String arg0) {
        firstSurgery_box.sendKeys(arg0 + Keys.ENTER);
        ReusableMethods.waitFor(1);
    }

    public void clickHoursButton() {
        hours_button.click();
        ReusableMethods.waitFor(1);
    }

    public void selectAppointmentTime(String arg0) {
        ReusableMethods.waitFor(1);
        WebElement hour = driver.findElement(By.linkText(arg0));
        hour.click();
        ReusableMethods.waitFor(1);
    }

    public void clickDeleteButton() {
        ReusableMethods.waitFor(3);
        deleteUnit_button.click();
    }

    public void assertThePopupMessage(String arg0) {
        ReusableMethods.waitFor(3);
        System.out.println("popUp_title = " + popUpWarningMessage.getAttribute("textContent"));
        Assert.assertTrue(popUpWarningMessage.getAttribute("textContent").contains(arg0));
    }

    public void clickYesButton() {
        yes_button.click();
        ReusableMethods.waitFor(2);
    }

    public void assertTheServiceWasDeleted(String arg0) {
        System.out.println("message = " + nothingToDisplay.getAttribute("textContent"));
        Assert.assertTrue(nothingToDisplay.getAttribute("textContent").contains(arg0));
    }

    public void clickPassiveBox() {
        ReusableMethods.waitFor(2);
        passive_box.click();
    }

    public void assertTheUnitIsPassive() {
    }

    public void clearServiceCode() {
        ReusableMethods.waitFor(3);
        serviceCode_box.clear();
    }

    public void enterServiceCodeToUnitCodeBox(String arg0) {
        ReusableMethods.waitFor(3);
        unitCode_box.sendKeys(arg0 + Keys.ENTER);
        ReusableMethods.waitFor(2);
    }

    public void enterTheDailyCapacity(String arg0) {
        dailyCapacity_box.sendKeys(arg0);
    }

    public void closeTheWarningMessage() {
        closePopUPMessage_button.click();
    }

    public void enterTheProtocolNumber(String arg0) {
        protocolID_box.sendKeys(arg0 + Keys.ENTER);
    }

    public void assertTheServiceCanNotBeDeleted(String arg0) {
        System.out.println(popUpMessageTitle.getAttribute("textContent"));
        Assert.assertEquals(popUpMessageTitle.getAttribute("textContent"), arg0);
    }

    public void enterServiceCodeToBranchCodeBox(String arg0) {
        branchCode_box.sendKeys(arg0 + Keys.ENTER);
        ReusableMethods.waitFor(3);
    }

    public void assertTheNewGroup(String arg0) {
        //ReusableMethods.waitFor(2);
        branchName_box.sendKeys(arg0 + Keys.ENTER);
        ReusableMethods.waitFor(2);
        String branchName = branchNameTitle.getAttribute("textContent");
        System.out.println("branchName = " + branchName);
        Assert.assertEquals(branchName, arg0);
    }

    public void clickGroupDefinitionsButton() {
        ReusableMethods.jseWithClick(Driver.getDriver(), groupDef_button);
        //groupDef_button.click();
        ReusableMethods.waitFor(2);
    }

    public void enterTheGroupName(String arg0) {
        groupName_box.sendKeys(arg0 + Keys.ENTER);
    }

    public void enterGroupCodeToGroupCodeBox(String arg0) {
        groupCode_box.sendKeys(arg0 + Keys.ENTER);
    }

    public void deleteTheGroupName() {
        ReusableMethods.waitFor(2);
        groupName_box.clear();
    }

    public void assertTheNewGroupName(String arg0) {
        ReusableMethods.waitFor(2);
        String groupName = groupNameTitle.getAttribute("textContent");
        System.out.println("group name actual = " + groupName);
        Assert.assertEquals(groupName, arg0);
    }

    public void editTheGroupName(DataTable dataTable) {
        for (int row = 0; row < dataTable.height(); row++) { // Rowlari doner
            String group = dataTable.cell(row, 0);

            clickEditButton();
            deleteTheGroupName();
            enterTheGroupName(group);
            clickSaveButton();
            try {
                if (popUpMessage.isDisplayed()) {
                    System.out.println("\'" + group + "\'" + " is not accepted");
                    System.out.println("Warning message = " + popUpMessageTitle.getAttribute("textContent"));
                    closePopUPMessage_button.click();
                    ReusableMethods.waitFor(2);
                    closePopUpPage_button.click();
                }
            } catch (NoSuchElementException e) {
            }

            ReusableMethods.waitFor(1);
            assertTheNewGroupName(group);
            System.out.println("group name expected= " + group);
            //softAssert.assertEquals(getCapacity.getAttribute("textContent"), group);
            //Assert.assertEquals(getCapacity.getAttribute("textContent"), capacity);

            ReusableMethods.waitFor(1);
        }
    }

    public void clickCancellationReasonButton() {
        ReusableMethods.jseWithClick(Driver.getDriver(), cancelReason);
        ReusableMethods.waitFor(3);
    }

    public void enterToReasonOfCancellationBox(String arg0) {
        ReusableMethods.waitFor(2);
        cancelReason_box.sendKeys(arg0 + Keys.ENTER);
        ReusableMethods.waitFor(2);
    }

    public void assertTheReason(String arg0) {
        cancelReasonSearch_box.clear();
        cancelReasonSearch_box.sendKeys(arg0 + Keys.ENTER);

        WebElement reason = driver.findElement(By.xpath("//td[text()='" + arg0 + "']"));
        System.out.println("actual reason = " + reason.getAttribute("textContent"));
        Assert.assertEquals(reason.getAttribute("textContent"), arg0);
    }

    public void enterToReasonOfCancellationSearchBox(String arg0) {
        cancelReasonSearch_box.sendKeys(arg0 + Keys.ENTER);
    }

    public void deleteTheReasonOfCancellation() {
        ReusableMethods.waitFor(2);
        cancelReason_box.clear();
    }
}

