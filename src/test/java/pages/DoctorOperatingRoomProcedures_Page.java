package pages;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ReusableMethods;


public class DoctorOperatingRoomProcedures_Page {
    WebDriver driver;

    public DoctorOperatingRoomProcedures_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='Kapat']")
    WebElement closeButton;

    @FindBy(xpath = "//input[@id='AMELIYAT_LST_TARIH']")
    WebElement claimDateSearchBox;

    @FindBy(xpath = "//a[contains(text(),'Salon Seç')]")
    WebElement chooseSaloonButton;

    @FindBy(id = "MEVCUT_SALON_LISTESI_tccell0_5")
    WebElement chooseTableButton;

    @FindBy(id = "MEVCUT_SALON_LISTESI_tccell1_5")
    WebElement chooseSaloonButtonEight;

    @FindBy(xpath = "//td[@id='dxGridAmeliyatHastaListesi_tccell0_1']")
    WebElement patientInformation;

    @FindBy(xpath = "//a[contains(@class,'text_btn text_btn_ekle')]")
    WebElement addSurgeryButton;

    @FindBy(xpath = "//input[@name='AmeliyatKod_TETKIK_ADI']/following-sibling::input[1]")
    WebElement decidedSurgery;

    @FindBy(xpath = "//td[@id='AmeliyatKodList_tccell14_3']//a[1]")
    WebElement decidedSurgeryChooseButton;

    @FindBy(xpath = "//td[@id='AmeliyatKodList_tccell4_3']//a[1]")
    WebElement addAfterVerify;

    @FindBy(id = "OrganYon")
    WebElement organDirection;

    @FindBy(id = "KesiCombo")
    WebElement incision;

    @FindBy(id = "AML_DOKTOR_KODU")
    WebElement decidedDoctorCode;

    @FindBy(xpath = "//a[text()='Kaydet']")
    WebElement saveButtonOnDecidePage;

    @FindBy(xpath = "(//div[@title='ABDOMINOPLASTI'])[1]")
    WebElement verifiesSurgery;

    @FindBy(xpath = "//td[@id='dxGridYapilacakAmeliyat_tccell1_1']/a[1]")
    WebElement crashIcon;

    @FindBy(xpath = "//span[text()='Evet']")
    WebElement continueYesButton;

    @FindBy(xpath = "//a[contains(text(),'Ameliyatları Sil')]")
    WebElement deleteSurgeryButton;

    @FindBy(xpath = "//table[@id='dxGridYapilacakAmeliyat_DXMainTable']")
    WebElement message;

    @FindBy(id = "dxGridYapilacakAmeliyat_tccell0_3")
    WebElement surgeryName;

    @FindBy(xpath = "//a[contains(text(),'Ameliyat Detayları')]")
    WebElement surgeryDetails;


    @FindBy(id = "AMELIYAT_YATIS_NOTU")
    WebElement admissionNote;

    @FindBy(xpath = "//span[text()='Kaydet']")
    WebElement saveButtonOnSurgeryDetails;

    @FindBy(xpath = "//textarea[@name='BILGI_YATIS_NOTU']")
    WebElement informationAdmissionNotes;

    @FindBy(id = "keyboardText")
    WebElement keyboard;

    @FindBy(xpath = "//a[contains(text(),'Tanı Ekle')]")
    WebElement addDiagnosisButton;

    @FindBy(id = "A01.0")
    WebElement tifo;

    @FindBy(xpath = "//a[contains(text(),'Seç ve Kapat')]")
    WebElement chooseAndCloseButton;

    @FindBy(xpath = "//textarea[@name='BILGI_AMELIYAT_TANI']")
    WebElement diagnosis;

    @FindBy(id = "keyboardText")
    WebElement keyboardText;

    @FindBy(xpath = "//td[@id='dxGridAmeliyatEkibi_tcheader5']/a[1]")
    WebElement addButtonOnSurgicalTeam;

    @FindBy(id = "784")
    WebElement addDoctor;

    @FindBy(id = "322")
    WebElement newDoctor;

    @FindBy(xpath = "//td[text()='793']")
    WebElement verifyDeletedDoctor;

    @FindBy(xpath = "//td[text()='784']")
    WebElement surgicalDoctor;

    @FindBy(xpath = "//td[@id='dxGridAmeliyatEkibiAnestezi_tcheader4']/a[1]")
    WebElement addButtonOnAnesthesiaTeam;

    @FindBy(id = "600")
    WebElement addAnesthDoctor;

    @FindBy(xpath = "//td[text()='600']")
    WebElement anesthesiaDoctor;

    @FindBy(xpath = "(//a[contains(@class,'inline text_btn')])[3]")
    WebElement startSession;

    @FindBy(xpath = "//p[text()='Ekip sorumlusu seçmediniz. İşleminiz durduruldu.']")
    WebElement responseMessage;

    @FindBy(xpath = "//span[text()='Tamam']")
    WebElement okeyButton;

    @FindBy(xpath = "//label[@for='cbEkipSorumlu_61429']")
    WebElement responseDoctor;

    @FindBy(xpath = "//p[text()='Sorumlu anestezi doktoru seçmediniz. İşleminiz durduruldu.']")
    WebElement responseAnesthMessage;

    @FindBy(xpath = "//a[contains(text(),'Postop')]")
    WebElement postopButton;

    @FindBy(xpath = "(//a[@id='btnLstYenile'])[2]")
    WebElement refreshButton;

    @FindBy(xpath = "//div[@title='Ameliyathaneye İndirildi']")
    WebElement postopSituation;

    @FindBy(id = "POSTOP_TARIH")
    WebElement postopDate;

    @FindBy(xpath = "//td[text()='Salon_7']")
    WebElement postopSaloon;

    @FindBy(xpath = "//td[text()='ACİL YOĞUN BAKIM']")
    WebElement postopService;

    @FindBy(xpath = "//td[text()='1002']")
    WebElement postopSeviceCode;

    @FindBy(xpath = "//div[text()[normalize-space()='Görüntülenecek veri yok']]")
    WebElement postopScrrenMessage;

    @FindBy(xpath = "//tr[@id='dxGridAmeliyatPostop_DXDataRow0']//td[1]")
    WebElement protocolNo;

    @FindBy(xpath = "//td[text()='ÇOCUK SAĞ. VE CER.SERVİS']")
    WebElement postopPatient;

    @FindBy(xpath = "//a[contains(text(),'Hastayı Servise Gönder')]")
    WebElement sendServiceButton;

    @FindBy(xpath = "//div[@title='Servise Gönderildi']")
    WebElement postopServiceSitutionMessage;

    @FindBy(xpath = "//td[@id='dxGridAmeliyatEkibiAnestezi_tccell0_4']//a[1]")
    WebElement trashIconOnAnesth;

    @FindBy(xpath = "//td[@id='dxGridAmeliyatEkibi_tccell1_5']//a[1]")
    WebElement trashIconOnSurgical;

    @FindBy(xpath = "//div[text()='Iptal']")
    WebElement cancel;

    @FindBy(id = "AMELIYAT_TANI")
    WebElement cleanArea;

    @FindBy(id = "btnLstYenile")
    WebElement refreshButtonOnMainPage;

    @FindBy(xpath = "//div[text()='Uz.Dr. Serjpa BUAKXUKS']")
    WebElement verifyAnesthDoctor;

    @FindBy(xpath = "//div[text()[normalize-space()='Görüntülenecek veri yok']]")
    WebElement surgeryTeamMessage;

    @FindBy(xpath = "//td[@colspan='5']//div[1]")
    WebElement anesthTeamMessage;

    @FindBy(tagName = "p")
    WebElement sameDoctorAddedMessage;

    @FindBy(tagName = "p")
    WebElement hospitlzdWarningMessage;

    @FindBy(xpath = "//label[text()='Servise Gönderilen']")
    WebElement sendToServisRadoButton;

    @FindBy(xpath = "//div[text()='Servise Gönderildi']")
    WebElement sendedServiseMessage;


    public void clickTheCloseButtom() {
        ReusableMethods.jseWithClick(Driver.getDriver(), closeButton);
    }


    public void enterTheClaimDate(String date) {
        ReusableMethods.waitFor(3);
        if (closeButton.isDisplayed()) {
            ReusableMethods.jseWithClick(Driver.getDriver(), closeButton);
        }
        ReusableMethods.waitForVisibility(claimDateSearchBox, 3);
        claimDateSearchBox.click();
        ReusableMethods.waitFor(3);
        claimDateSearchBox.sendKeys(date + Keys.ENTER);
        ReusableMethods.waitFor(3);
        claimDateSearchBox.sendKeys(Keys.ENTER);

    }


    public void clickSelectSaloonButton() {
        ReusableMethods.waitForVisibility(chooseSaloonButton, 3);
        chooseSaloonButton.click();
        chooseTableButton.click();
        ReusableMethods.waitFor(3);


    }

    public void clickOnPatientInformationNameSurname() {
        ReusableMethods.waitFor(5);
        patientInformation.click();
    }

    public void clickAddSurgeryButton() {
        ReusableMethods.waitForVisibility(addSurgeryButton, 3);
        ReusableMethods.jseWithClick(Driver.getDriver(), addSurgeryButton);
    }

    public void clickTheSelectButtonOfTheSurgeryToBePerformed() {
        ReusableMethods.waitForVisibility(decidedSurgery, 10);
        ReusableMethods.jseWithClick(Driver.getDriver(), decidedSurgery);
        ReusableMethods.waitFor(3);
        decidedSurgeryChooseButton.click();
        ReusableMethods.waitFor(3);
    }

    public void chooseTheDirectionOfSurgery(String arg0) {
        organDirection.click();
        organDirection.sendKeys(arg0 + Keys.ENTER);
    }

    public void selectsIncisionInformation(String arg0) {
        incision.click();
        incision.sendKeys(arg0 + Keys.ENTER);
    }

    public void clickSelectDoctorButton(String arg0) {
        decidedDoctorCode.click();
        decidedDoctorCode.sendKeys(arg0 + Keys.ENTER);
    }

    public void clickSaveButtonOnAddSurgeryScreen() {
        saveButtonOnDecidePage.click();
    }

    public void verifiesThatTheNewSurgeryIsAdded() {
        ReusableMethods.waitFor(5);
        Assert.assertTrue(verifiesSurgery.isDisplayed());
    }

    public void clickTheTrashIconOfTheOperationWillBeDeleted() {
        ReusableMethods.waitForVisibility(crashIcon, 3);
        ReusableMethods.jseWithClick(Driver.getDriver(), crashIcon);
    }


    public void clicksYesButtonOnContinuePopup() {
        ReusableMethods.waitFor(5);
        continueYesButton.click();
    }

    public void verifiesThatTheSurgeryIsDeleted() {
        Assert.assertTrue(verifiesSurgery.isDisplayed());
    }

    public void clickDeleteSurgeriesButton() {
        ReusableMethods.waitForVisibility(deleteSurgeryButton, 3);
        ReusableMethods.jseWithClick(Driver.getDriver(), deleteSurgeryButton);
    }

    public void verifiesThatSurgeriesAreDeleted() {
        ReusableMethods.waitFor(10);
        String messegas = message.getText();
        Assert.assertEquals("Görüntülenecek veri yok", messegas);
        ReusableMethods.waitForVisibility(addSurgeryButton, 3);
        ReusableMethods.jseWithClick(Driver.getDriver(), addSurgeryButton);
        ReusableMethods.waitForVisibility(decidedSurgery, 10);
        ReusableMethods.jseWithClick(Driver.getDriver(), decidedSurgery);
        ReusableMethods.waitFor(3);
        addAfterVerify.click();
        ReusableMethods.waitFor(3);
        saveButtonOnDecidePage.click();


    }

    public void clicksOnSurgeryName() {
        ReusableMethods.waitFor(3);
        ReusableMethods.jseWithClick(Driver.getDriver(), surgeryName);
    }

    public void clicksDetailSurgeryButton() {
        ReusableMethods.waitFor(10);
        surgeryDetails.click();
    }

    public void entersDetails() {
        ReusableMethods.waitForVisibility(admissionNote, 3);
        admissionNote.sendKeys("Durum stabil");
    }

    public void clicksSaveButtonOnSurgeryDetailsScreen() {
        saveButtonOnSurgeryDetails.click();
    }

    public void verifiesThatNewDetailsAreDisplayed() {
        ReusableMethods.waitFor(5);
        informationAdmissionNotes.click();
        String notes = keyboard.getText();
        Assert.assertTrue(notes.contains("Durum stabil"));

    }

    public void cleansThePage() {
        ReusableMethods.jseWithClick(Driver.getDriver(), admissionNote);
        admissionNote.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        ReusableMethods.jseWithClick(Driver.getDriver(), saveButtonOnSurgeryDetails);
    }

    public void clickAddDiagnosisButton() {
        ReusableMethods.waitForVisibility(addDiagnosisButton, 3);
        addDiagnosisButton.click();
    }

    public void selectsDiagnosis() {
        tifo.click();

    }

    public void clicksSelectAndCloseButton() {
        chooseAndCloseButton.click();
    }

    public void verifiesThatNewDiagnosisIsDisplayed() {
        ReusableMethods.waitFor(5);
        diagnosis.click();
        String notes = keyboardText.getText();
        Assert.assertTrue(notes.contains("Tifo"));
    }

    public void cleanThePage() {
        ReusableMethods.jseWithClick(Driver.getDriver(), cleanArea);
        cleanArea.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        ReusableMethods.jseWithClick(Driver.getDriver(), saveButtonOnSurgeryDetails);
    }

    public void clicksAddDoctorButtonOnSurgicalTeamSection() {
        ReusableMethods.waitForVisibility(addButtonOnSurgicalTeam, 5);
        ReusableMethods.jseWithClick(Driver.getDriver(), addButtonOnSurgicalTeam);
    }

    public void selectsTheDoctor() {
        ReusableMethods.waitFor(5);
        addDoctor.click();
    }

    public void verifiesThatTheDoctorIsAdded() {
        ReusableMethods.waitFor(5);
        Assert.assertTrue(surgicalDoctor.isDisplayed());
    }

    public void clickAddDoctorButtonOnAnesthesiaSurgeryTeamSection() {
        ReusableMethods.waitForVisibility(addButtonOnAnesthesiaTeam, 5);
        ReusableMethods.jseWithClick(Driver.getDriver(), addButtonOnAnesthesiaTeam);
    }

    public void selectTheAnesthesiaDoctor() {
        ReusableMethods.waitFor(5);
        addAnesthDoctor.click();
    }


    public void clickTheStartSession() {
        ReusableMethods.waitFor(5);
        ReusableMethods.waitForVisibility(startSession, 3);
        ReusableMethods.jseWithClick(Driver.getDriver(), startSession);
    }

    public void verifiesThatTheWarningMesseageOfPatientIsNotHospitalized() {
        ReusableMethods.waitForVisibility(hospitlzdWarningMessage, 3);
        Assert.assertTrue(hospitlzdWarningMessage.isDisplayed());
    }

    public void clickOkeyButton() {
        ReusableMethods.jseWithClick(Driver.getDriver(), okeyButton);
    }

    public void selectResponsibleDoctorOnSurgicalTeam() {
        ReusableMethods.waitFor(5);
        ReusableMethods.jseWithClick(Driver.getDriver(), responseDoctor);
    }

    public void verifiesThatTheWarningMesseageOfYouMustChooseTheResponsiblePerson() {
        ReusableMethods.waitForVisibility(responseAnesthMessage, 3);
        Assert.assertTrue(responseAnesthMessage.isDisplayed());
        okeyButton.click();
        responseDoctor.click();

    }

    public void clicksPostop() {
        ReusableMethods.waitFor(8);
        if (closeButton.isDisplayed()) {
            ReusableMethods.jseWithClick(Driver.getDriver(), closeButton);
        }
        ReusableMethods.waitForVisibility(postopButton, 3);
        ReusableMethods.jseWithClick(Driver.getDriver(), postopButton);
    }

    public void clickRefreshButton() {
        ReusableMethods.waitForVisibility(refreshButton, 3);
        ReusableMethods.jseWithClick(Driver.getDriver(), refreshButton);
    }

    public void verifieThatThePatientSConditionIsDisplayed() {
        String situation = postopSituation.getText();
        Assert.assertEquals("Ameliyathaneye İndirildi", situation);
    }


    public void enterTheClaimDateOnPostop(String arg0) {
        ReusableMethods.waitFor(3);
        ReusableMethods.waitForVisibility(postopDate, 3);
        postopDate.click();
        ReusableMethods.waitFor(3);
        postopDate.sendKeys(arg0 + Keys.ENTER);
        ReusableMethods.waitFor(3);
        postopDate.sendKeys(Keys.ENTER);
    }

    public void verifieThatThePatientSSaloonIsDisplayed() {
        String situation = postopSaloon.getText();
        Assert.assertEquals("Salon_7", situation);
    }

    public void verifieThatThePatientSServiceIsDisplayed() {
        String service = postopService.getText();
        Assert.assertEquals("ACİL YOĞUN BAKIM", service);
    }

    public void verifiesThatThePatientSServiceCodeIsDisplayed() {
        String serviceCode = postopSeviceCode.getText();
        Assert.assertEquals("1002", serviceCode);
    }

    public void displayTheMessageOf(String arg0) {
        ReusableMethods.waitForVisibility(postopScrrenMessage, 3);
        Assert.assertTrue(postopScrrenMessage.isDisplayed());
    }

    public void verifiesThatTheRefreshButtonIsWorkingByViewingThePatients() {
        ReusableMethods.waitForVisibility(protocolNo, 3);
        Assert.assertTrue(protocolNo.isDisplayed());
    }

    public void chooseAndClickThePatient() {
        ReusableMethods.waitForVisibility(postopPatient, 3);
        ReusableMethods.jseWithClick(Driver.getDriver(), postopPatient);
    }

    public void clickOnSendPatientToServiceButton() {
        ReusableMethods.waitForVisibility(sendServiceButton, 3);
        ReusableMethods.jseWithClick(Driver.getDriver(), sendServiceButton);
    }

    public void verifiesThePatientSCondition() {
        String situation = postopServiceSitutionMessage.getText();
        Assert.assertEquals("Servise Gönderildi", situation);
    }


    public void clickOnTheTrashIconInTheSurgicalTeamSection() {
        ReusableMethods.waitForVisibility(trashIconOnAnesth, 3);
        ReusableMethods.jseWithClick(Driver.getDriver(), trashIconOnAnesth);
    }

    public void verifyThatOnlyTheSelectedDoctorIsDeleted() {
        ReusableMethods.waitForVisibility(anesthTeamMessage, 3);
        String message = anesthTeamMessage.getText();
        System.out.println(message);
        Assert.assertFalse(anesthTeamMessage.isDisplayed());
    }

    public void clicksOnTheTrashIconInTheSurgicalTeamSection() {
        ReusableMethods.waitForVisibility(trashIconOnSurgical, 3);
        ReusableMethods.jseWithClick(Driver.getDriver(), trashIconOnSurgical);
    }

    public void clicksTheTrashIconForSelectedDoctor() {

    }


    public void clicksRefreshButtonOnDoctorOperatingRoomProceduresPage() {
        ReusableMethods.waitForVisibility(refreshButtonOnMainPage, 3);
        ReusableMethods.jseWithClick(Driver.getDriver(), refreshButtonOnMainPage);
    }

    public void verifyThatTheSelectedDoctorIsDeleted() {
        ReusableMethods.waitFor(3);
        Assert.assertFalse(verifyAnesthDoctor.isDisplayed());
    }

    public void verifysThatTheMessageGörüntülenecekVeriYokIsNotDisplayed() {
        ReusableMethods.waitForVisibility(surgeryTeamMessage, 3);
        String message = surgeryTeamMessage.getText();
        System.out.println(message);
        Assert.assertFalse(surgeryTeamMessage.isDisplayed());
    }

    public void clicksSelectSaloonButtonSaloonEight() {
        ReusableMethods.waitForVisibility(chooseSaloonButton, 3);
        chooseSaloonButton.click();
        chooseSaloonButtonEight.click();
        ReusableMethods.waitFor(3);
    }

    public void verifysThatTheSurgicalTeamSDoctorIsDeleted() {
        String text = verifyDeletedDoctor.getText();
        Assert.assertEquals("793", text);
    }

    public void verifiesThatTheAnesthesiaDoctorIsAdded() {
        ReusableMethods.waitForVisibility(sameDoctorAddedMessage,3);
        Assert.assertTrue(sameDoctorAddedMessage.isDisplayed());
    }

    public void clicksTheSendedServiceRadioButton() {
        ReusableMethods.waitForVisibility(sendToServisRadoButton,3);
        ReusableMethods.jseWithClick(Driver.getDriver(),sendToServisRadoButton);
    }

    public void verifiesThatTheSituation() {
        ReusableMethods.waitForVisibility(sendedServiseMessage,3);
        Assert.assertTrue(sendedServiseMessage.isDisplayed());
    }

    public void selectsTheNewDoctor() {
        ReusableMethods.waitFor(5);
        newDoctor.click();
    }

    public void clicksSelectAndCloseButtonForNewDoktor() {

    }
}