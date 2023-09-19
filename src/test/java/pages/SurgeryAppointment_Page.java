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
    WebElement calendar_apptPopUp;

    @FindBy(id = "ERTELEME_TARIH")
    WebElement calendar_apptPostpone;

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

    @FindBy(linkText = "Randevu Sil")
    WebElement deleteAppointment_button;
    @FindBy(linkText = "Randevu İptal Et")
    WebElement cancelAppointment_button;

    @FindBy(id = "Ameliyat_Randevu_Liste_Paging_DXFREditorcol5_I")
    WebElement protocolNumber_box_main;

    @FindBy(id = "IPTAL_KODU")
    WebElement selectCancelReason_box;

    @FindBy(id = "IPTAL_ACIKLAMA")
    WebElement addDescriptionCancelReason_box;

    @FindBy(id = "ERTELEME_ACIKLAMA")
    WebElement addDescriptionPostponeReason_box;

    @FindBy(xpath = "(//td[@class='dxgvFixedColumn_MetropolisBlue dxgv'])[1]")
    WebElement dateOfApptOnList;

    @FindBy(xpath = "//label[text()='İptaller']")
    WebElement canceledAppt_checkBox;

    @FindBy(xpath = "(//td[@class='dxgvFixedColumn_MetropolisBlue dxgv'])[2]")
    WebElement appointmentStatus;

    @FindBy(id = "RANDEVU_SIRA_NO")
    WebElement appointmentNumber_box;

    @FindBy(id = "clearBtn")
    WebElement clear_button;


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
        ReusableMethods.waitForVisibility(newAdd_button, 2);
        ReusableMethods.jseWithClick(Driver.getDriver(), newAdd_button);
        //newAdd_button.click();
    }


    public void selectTheServiceCode(String arg0) {
        ReusableMethods.waitFor(2);
        unitCode_box_page.clear();
        ReusableMethods.waitFor(2);
        unitCode_box_page.sendKeys(arg0 + Keys.ENTER);
    }

    public void assertTheNewSurgeryServiceUnit(String arg0) {
        WebElement actualServiceCode = driver.findElement(By.xpath("//td[text()='" + arg0 + "']"));
        System.out.println("expectedServiceCode = " + arg0);
        System.out.println("actualServiceCode = " + actualServiceCode.getText());
        Assert.assertEquals(actualServiceCode.getText(), arg0);
    }

    public void clickSaveButton() {
        ReusableMethods.jseWithClick(Driver.getDriver(), popUpSave_button);
        //save_button.click();
        ReusableMethods.waitFor(1);
    }

    public void assertTheWarningMessage(String arg0) {
        System.out.println(popUpMessage.getAttribute("textContent"));
        Assert.assertEquals(popUpMessage.getAttribute("textContent"), arg0);
    }

    public void enterServiceCodeToServiceCodeBox(String arg0) {
        //ReusableMethods.jseWithClick(Driver.getDriver(),serviceCode_box);
        ReusableMethods.waitFor(1);
        serviceCode_box.click();

        serviceCode_box.sendKeys(arg0);
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
        ReusableMethods.waitFor(2);
        // ReusableMethods.waitForClickablility(newAppointment_button, 2);
        ReusableMethods.jseWithClick(Driver.getDriver(), newAppointment_button);
        ReusableMethods.waitFor(1);

    }

    public void selectTheDate(String arg0) {
        //ReusableMethods.waitFor(2);
ReusableMethods.jseWithClick(Driver.getDriver(),calendar_apptPopUp);
//        calendar_apptPopUp.click();
        calendar_apptPopUp.sendKeys(arg0 + Keys.ENTER);
        ReusableMethods.waitFor(1);

        //closeCalendar_button.click();
    }

    public void selectTheSurgeryCode(String arg0) {
        firstSurgery_box.sendKeys(arg0 + Keys.ENTER);
        ReusableMethods.waitFor(1);
    }

    public void clickHoursButton() {
        ReusableMethods.waitFor(1);
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
        ReusableMethods.waitFor(2);
        deleteUnit_button.click();
    }

    public void assertThePopupMessage(String arg0) {
        ReusableMethods.waitFor(1);
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

        System.out.println("HATA mesajı= ");
        //System.out.println("HATA mesajı= "+ popUpMessageTitle.getAttribute("textContent"));

        //softAssert.assertFalse(popUpMessageTitle.isDisplayed());
    }

    public void enterServiceCodeToBranchCodeBox(String arg0) {
        branchCode_box.sendKeys(arg0 + Keys.ENTER);
        ReusableMethods.waitFor(3);
    }

    public void assertTheNewGroup(String arg0) {
        //ReusableMethods.waitFor(2);
        branchName_box.clear();
        ReusableMethods.waitFor(2);
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
        ReusableMethods.waitFor(2);

        cancelReasonSearch_box.sendKeys(arg0 + Keys.ENTER);
        ReusableMethods.waitFor(2);

        WebElement reason = driver.findElement(By.xpath("//td[text()='" + arg0 + "']"));
        System.out.println("expected reason = " + arg0);
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


    //todo EYUP


    @FindBy(xpath = "//span[contains(@class,'hem_button hem_border')]")
    public WebElement patientSettings_button;

    @FindBy(id = "TXT_BAS_TARIH")
    public WebElement calender_start;

    @FindBy(id = "TXT_BIT_TARIH")
    public WebElement calender_end;

    @FindBy(xpath = "(//span[contains(@class,'hem_button hem_border')])[3]")
    public WebElement ayarlarButton2;

    @FindBy(xpath = "(//span[contains(@class,'hem_button hem_border')])[1]")
    public WebElement ayarlarButton3;

    @FindBy(xpath = "(//span[@class='hem_button hem_border hem_islem backWhite btnRndButonlar btnAcilirMenu'])[2]")
    public WebElement ayarlarButton4;

    @FindBy(xpath = "(//div[@class='content blckAcilirMenu']//a)[2]")
    public WebElement randevuErtele;

    @FindBy(xpath = "(//a[@class='text_btn_border wper100 marbottompx3 backWhite'])[11]")
    public WebElement randevuiptalet;

    @FindBy(xpath = "//span[@class='yes item']")
    public WebElement randevuSilYesButton;

    @FindBy(xpath = "//td[text()='FAGZQZ']")
    public WebElement randevuSilVerfy;

    @FindBy(xpath = "//a[@id='btnAmeliyatRandevuListele']")
    public WebElement yenileButton;

    @FindBy(xpath = "//input[@class='inpt  lookupOpenButton']")
    public WebElement birimButton;

    @FindBy(xpath = "(//a[@class='LookupSelectButton text_btn text_btn_ok backWhite'])[3]")
    public WebElement genelAmeliyetBirimSec;

    @FindBy(xpath = "(//a[@class='open'])[1]")
    public WebElement hastaIslemleri;

    @FindBy(xpath = "(//a[@class='open'])[3]")
    public WebElement ameliyethaneIslemleri;

    @FindBy(xpath = "//a[@href='/HBYS_WEB_PRODUCT/AML/RND/Index']")
    public WebElement ameliyetRandevu;

    @FindBy(xpath = "(//input[@type='text'])[9]")
    public WebElement genelTarih;

    @FindBy(xpath = "//div[contains(@class,'PopupHeader clearfix')]")
    public WebElement ameliyetRandevuErtelemePop;

    @FindBy(xpath = "(//input[contains(@class,'inpt inpt')])[3]")
    public WebElement ertelemeTarihi;

    @FindBy(id = "AmlErtelemeNedeniCombo")
    public WebElement reasonPostpone;

    @FindBy(id = "ERTELEME_ACIKLAMA")
    public WebElement ertelemeAciklama;

    @FindBy(xpath = "//a[contains(text(),'Kaydet')]")
    public WebElement ertelemekaydetButton;

    @FindBy(xpath = "//td[text()='PÜIYIIA']")
    public WebElement ertelemeVeryf;

    @FindBy(xpath = "(//input[@class='inpt  lookupOpenButton'])[4]")
    public WebElement iptalNedenButton;

    @FindBy(xpath = "//a[@data-lookupvalue='23']")
    public WebElement iptalNedeni;

    @FindBy(xpath = "//textarea[@class='txtar wpx350']")
    public WebElement iptalAciklama;

    @FindBy(id = "PopupSaveButton_0")
    public WebElement iptalKaydetButton;

    @FindBy(linkText = "Randevu Düzelt")
    public WebElement apptEdit_button;

    @FindBy(id = "(//span[text()='Kaydet']/following::input)[3]")
    public WebElement amlKararTarih;

    @FindBy(id = "USER_DATE")
    public WebElement calenderSurgeryDecision;

    @FindBy(xpath = "//a[@id='PopupSaveButton_0']")
    public WebElement kaydet;

    @FindBy(id = "BUTCE_KODU_2")
    public WebElement secondSurgeryCode_box;

    @FindBy(id = "TANI_KODU_RND")
    public WebElement illnessCode_box;

    @FindBy(id = "ANESTEZI_TIPI")
    public WebElement anesthesia_dropDown;

    @FindBy(id = "TARAF")
    public WebElement side_dropDown;

    @FindBy(id = "POLIKLINIK_TARIHI")
    public WebElement calendar_serviceDate;

    @FindBy(id = "TELEFON1")
    public WebElement phone1_box;

    @FindBy(id = "TELEFON2")
    public WebElement phone2_box;

    @FindBy(id = "GRUP")
    public WebElement groupCodeAppt_box;

    @FindBy(id = "MASA_KODU")
    public WebElement saloonCodeAppt_box;

    @FindBy(id = "ODA_NO")
    public WebElement roomNoAppt_box;

    @FindBy(id = "DOKTOR_KODU_RND")
    public WebElement doctorCodeAppt_box;

    @FindBy(id = "PLANLANAN_SURE")
    public WebElement durationAppt_box;

    @FindBy(id = "RANDEVU_ACIKLAMA")
    public WebElement descriptionAppt_box;

    @FindBy(id = "RANDEVU_SAATI")
    public WebElement apptTime;

    public void selectTheStartDate(String arg0) {
        calender_start.click();
        calender_start.sendKeys(arg0 + Keys.ENTER);
        ReusableMethods.waitFor(2);
    }

    public void selectTheEndDate(String arg0) {
        calender_end.click();
        //calender_end.clear();
        calender_end.sendKeys(arg0 + Keys.ENTER);
        ReusableMethods.waitFor(2);
    }

    public void clickPatientSettingsButton() {
        ReusableMethods.waitFor(2);
        patientSettings_button.click();
        ReusableMethods.waitFor(2);
    }

    public void searchTheProtocolNumber(String arg0) {
        ReusableMethods.waitFor(2);
        protocolNumber_box_main.clear();
        protocolNumber_box_main.sendKeys(arg0 + Keys.ENTER);
        ReusableMethods.waitFor(2);
    }

    public void clickOnRefreshButtonMain() {
    }

    public void click_on_the_refresh_button() {
        yenileButton.click();
        ReusableMethods.waitFor(2);
    }

    public void click_the_delete_appointment_button() {
        deleteAppointment_button.click();
    }

    public void selectThePostponeDate(String arg0) {
        calendar_apptPostpone.clear();
        calendar_apptPostpone.click();

        calendar_apptPostpone.sendKeys(arg0 + Keys.ENTER);
    }

    public void assertTheAppointmentDate(String arg0) {
        ReusableMethods.waitFor(2);
//        System.out.println("actual date = " + dateOfApptOnList.getAttribute("textContent"));

        System.out.println("expected date = " + arg0);
        System.out.println("actual date = " + dateOfApptOnList.getAttribute("textContent"));

        Assert.assertEquals(dateOfApptOnList.getAttribute("textContent"), arg0);

    }

    public void createNewUnit(String code, String capacity) {
        clickSettingsButton();
        clickUnitDefinitionsButton();
        clickNewAddButton();
        enterServiceCodeToServiceCodeBox(code);
        enterTheDailyCapacity(capacity);
        clickSaveButton();
    }

    public void deleteAUnit(String code) {
        clickSettingsButton();
        clickUnitDefinitionsButton();
        enterServiceCodeToUnitCodeBox(code);
        clickDeleteButton();
        clickYesButton();
    }

    public void closeUnitPopUpEditPage() {
        closePopUpPage_button.click();
    }

    public void createANewAppointment(DataTable dataTable) {
        String code = dataTable.cell(1, 0);
        String date = dataTable.cell(1, 1);
        String protocol = dataTable.cell(1, 2);
        String surgery = dataTable.cell(1, 3);
        String time = dataTable.cell(1, 4);

        selectTheServiceCode(code);
        clickNewAppointmentButton();
        ReusableMethods.waitFor(2);
        selectTheDate(date);
        enterTheProtocolNumber(protocol);
        selectTheSurgeryCode(surgery);
        clickHoursButton();
        selectAppointmentTime(time);
        clickSaveButton();
    }

    public void deleteAppointment(DataTable dataTable) {
        String code = dataTable.cell(1, 0);
        String startDate = dataTable.cell(1, 1);
        String endDate = dataTable.cell(1, 2);
        String protocol = dataTable.cell(1, 3);

        selectTheStartDate(startDate);
        selectTheEndDate(endDate);
        selectTheServiceCode(code);
        clickOnRefreshButtonMain();
        searchTheProtocolNumber(protocol);
        clickPatientSettingsButton();
        click_the_delete_appointment_button();
    }

    public void selectCancelReason(String arg0) {
        selectCancelReason_box.clear();
        selectCancelReason_box.sendKeys(arg0 + Keys.ENTER);
    }

    public void addAPostponeDescription(String arg0) {
        addDescriptionPostponeReason_box.sendKeys(arg0);
    }

    public void clickCheckBoxCancelAppointment() {
        canceledAppt_checkBox.click();

    }

    public void assertTheAppointmentTitle(String arg0) {
        ReusableMethods.waitFor(3);
        System.out.println("actual status = " + appointmentStatus.getAttribute("textContent"));
        System.out.println("expected status = " + arg0);
        Assert.assertEquals(appointmentStatus.getAttribute("textContent"), arg0);

    }

    public void addACancelDescription(String arg0) {
        addDescriptionCancelReason_box.sendKeys(arg0);
    }

    public void selectTheSurgeryDecisionDateAndTime(String arg0) {
        calenderSurgeryDecision.clear();
        calenderSurgeryDecision.sendKeys(arg0 + Keys.ENTER);
        ReusableMethods.waitFor(1);

    }

    public void assertTheSurgeryDecisionDateAndTime(String arg0) {
        System.out.println("expected = " + arg0);
        System.out.println("actual = " + calenderSurgeryDecision.getAttribute("value"));
        Assert.assertEquals(calenderSurgeryDecision.getAttribute("value"), arg0);
    }

    public void changeTheAppointmentNumber(String arg0) {
        appointmentNumber_box.clear();
        appointmentNumber_box.sendKeys(arg0 + Keys.ENTER);
    }

    public void assertTheAppointmentNumber(String arg0) {
        System.out.println("expected number = " + arg0);
        System.out.println("actual number = " + appointmentNumber_box.getAttribute("value"));
        Assert.assertEquals(appointmentNumber_box.getAttribute("value"), arg0);
    }

    public void selectTheSecondSurgery(String arg0) {
        secondSurgeryCode_box.sendKeys(arg0 + Keys.ENTER);

    }

    public void selectTheIllness(String arg0) {
        illnessCode_box.sendKeys(arg0);
    }

    public void selectTheTypeOfAnesthesia(String arg0) {
        anesthesia_dropDown.click();
        ReusableMethods.waitFor(1);
        WebElement anesthesia = driver.findElement(By.xpath("//option[text()='" + arg0 + "']"));
        anesthesia.click();

    }

    public void selectTheSide(String arg0) {
        side_dropDown.click();
    }

    public void changeTheServiceDate(String arg0) {
        calendar_serviceDate.clear();
        calendar_serviceDate.click();
        calendar_serviceDate.sendKeys(arg0 + Keys.ENTER);
    }

    public void addEditPhoneNumbers(String phone1, String phone2) {
        phone1_box.clear();
        phone1_box.click();
        phone1_box.sendKeys(phone1);

        phone2_box.clear();
        phone2_box.click();
        phone2_box.sendKeys(phone2);
    }

    public void selectGroup(String arg0) {
        groupCodeAppt_box.clear();
        groupCodeAppt_box.click();
        groupCodeAppt_box.sendKeys(arg0 + Keys.ENTER);
    }

    public void selectSaloon(String arg0) {
        saloonCodeAppt_box.clear();
        saloonCodeAppt_box.click();
        saloonCodeAppt_box.sendKeys(arg0 + Keys.ENTER);
    }

    public void enterRoomNo(String arg0) {
        roomNoAppt_box.sendKeys(arg0);
    }

    public void changeTheDoctor(String arg0) {
        doctorCodeAppt_box.clear();
        doctorCodeAppt_box.sendKeys(arg0 + Keys.ENTER);
    }

    public void enterSurgeryDurationMinute(String arg0) {
        durationAppt_box.sendKeys(arg0);
    }

    public void enterDescriptionOfAppointment(String arg0) {
        descriptionAppt_box.sendKeys(arg0);
    }

    public void assertTheSecondSurgery(String arg0) {
        System.out.println("actual surgery code = " + secondSurgeryCode_box.getAttribute("value"));
        System.out.println("expected surgery code = " + arg0);
        Assert.assertEquals(secondSurgeryCode_box.getAttribute("value"), arg0);

    }

    public void assertTheIllness(String arg0) {
        System.out.println("actual illness code = " + illnessCode_box.getAttribute("value"));
        System.out.println("expected illness code = " + arg0);
        Assert.assertEquals(illnessCode_box.getAttribute("value"), arg0);
    }

    public void assertTheTypeOfAnesthesia(String arg0) {
        //anesthesia_dropDown.click();
        ReusableMethods.waitFor(1);
        WebElement anesthesia = driver.findElement(By.xpath("//option[text()='" + arg0 + "']"));
        Assert.assertTrue(anesthesia.isSelected());
        //System.out.println("actual anesthesia = " + anesthesia_dropDown.getText());
        //#System.out.println("expected anesthesia = " + arg0);

        //Assert.assertEquals(anesthesia_dropDown.getText(),arg0);
    }

    public void assertTheSide(String arg0) {
        System.out.println("actual side = " + side_dropDown.getAttribute("value"));
        System.out.println("expected side = " + arg0);
        Assert.assertEquals(side_dropDown.getAttribute("value"), arg0);

    }

    public void assertTheServiceDate(String arg0) {
        System.out.println("actual service date = " + calendar_serviceDate.getAttribute("value"));
        System.out.println("expected service date = " + arg0);
        Assert.assertEquals(calendar_serviceDate.getAttribute("value"), arg0);
    }

    public void assertPhoneNumbers(String phone1, String phone2) {
        System.out.println("actual phone 1 = " + phone1_box.getAttribute("value"));
        System.out.println("expected phone 1 = " + phone1);
        System.out.println("actual phone 2 = " + phone2_box.getAttribute("value"));
        System.out.println("expected phone 2 = " + phone2);

        Assert.assertEquals(phone1_box.getAttribute("value"), phone1);
        Assert.assertEquals(phone2_box.getAttribute("value"), phone2);

    }

    public void assertGroup(String arg0) {
        System.out.println("actual group = " + groupCodeAppt_box.getAttribute("value"));
        System.out.println("expected group = " + arg0);
        Assert.assertEquals(groupCodeAppt_box.getAttribute("value"), arg0);
    }

    public void assertSaloon(String arg0) {
        System.out.println("actual saloon = " + saloonCodeAppt_box.getAttribute("value"));
        System.out.println("expected saloon = " + arg0);
        Assert.assertEquals(saloonCodeAppt_box.getAttribute("value"), arg0);

    }

    public void assertRoomNo(String arg0) {
        System.out.println("actual room = " + roomNoAppt_box.getAttribute("value"));
        System.out.println("expected room = " + arg0);
        Assert.assertEquals(roomNoAppt_box.getAttribute("value"), arg0);
    }

    public void assertTheDoctor(String arg0) {
        System.out.println("actual doctor code = " + doctorCodeAppt_box.getAttribute("value"));
        System.out.println("expected doctor code = " + arg0);
        Assert.assertEquals(doctorCodeAppt_box.getAttribute("value"), arg0);
    }

    public void assertAppointmentTime(String arg0) {
        System.out.println("actual appt time = " + apptTime.getAttribute("value"));
        System.out.println("expected appt time = " + arg0);
        Assert.assertEquals(apptTime.getAttribute("value"), arg0);
    }

    public void assertSurgeryDurationMinute(String arg0) {
        System.out.println("actual duration = " + durationAppt_box.getAttribute("value"));
        System.out.println("expected duration = " + arg0);
        Assert.assertEquals(durationAppt_box.getAttribute("value"), arg0);
    }

    public void assertDescriptionOfAppointment(String arg0) {
        System.out.println("actual description = " + descriptionAppt_box.getText());
        System.out.println("expected description = " + arg0);
        Assert.assertEquals(descriptionAppt_box.getText(), arg0);
    }

    public void clickClearButton() {
        ReusableMethods.waitFor(2);
        clear_button.click();
        ReusableMethods.waitFor(2);
    }

    public void assertThePatientInTheAppointmentList(String arg0) {
        ReusableMethods.waitFor(5);
        WebElement protocolNo = driver.findElement(By.xpath("//td[text()='"+arg0+"']"));
        System.out.println("expected protocol = " + arg0);
        System.out.println("actual protocol = " + protocolNo.getAttribute("textContent"));
        Assert.assertEquals(protocolNo.getAttribute("textContent"),arg0);
    }

    public void clickOnTheCancelAppointmentButton() {
        ReusableMethods.waitFor(1);
        ReusableMethods.jseWithClick(Driver.getDriver(),cancelAppointment_button);
    }
}


