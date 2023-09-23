package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import utilities.Driver;
import utilities.ReusableMethods;

import java.text.ParseException;
import java.time.Duration;
import java.util.List;
import java.util.Random;

public class CreateSurgeryList_Page {
    static String protocolNo;
    static boolean requestDateIsValid = false;


    public CreateSurgeryList_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//a[contains(text(),'Hasta İşlemleri')]")
    public WebElement patientProceduresTitle;

    @FindBy(xpath = "//a[contains(text(),'Ameliyathane İşlemleri')]")
    public WebElement operatingRoomOperationsTitle;

    @FindBy(xpath = "//a[contains(text(),'Ameliyat Listesi Oluşturma')] ")
    public WebElement creatingSurgeryListTitle;

    @FindBy(xpath = "//input[@name='AMELIYAT_LST_TARIH']")
    public WebElement requestDateBox;

    @FindBy(xpath = "(//input[@class][@type='button'])[2]")
    public WebElement serviceBox;


    @FindBy(xpath = "//a[@data-lookupvalue='1010']")
    public WebElement internalService;

    @FindBy(xpath = "//a[@id='btnLstYenile']")
    public static WebElement refreshButton;

    @FindBy(xpath = "//td[normalize-space()='HÜLCHOYA TÜXBJ']")
    public WebElement patientFromList;

    @FindBy(xpath = "//td[normalize-space()='EMCFNOP KAWSFTM']")
    public WebElement otherPatientFromList;


    @FindBy(xpath = "//*[contains(text(),'1538')]")
    public WebElement patientFromListe;

    @FindBy(xpath = "//a[contains(text(),'Salon İşlemleri')]")
    public static WebElement hallOperationsButton;

    @FindBy(xpath = "//a[normalize-space()='Salon Ekle']")
    public WebElement addHallButton;

    @FindBy(xpath = "//li[contains(@class,'amlButton')]")
    public WebElement addedHallButton;

    @FindBy(xpath = "(//li[contains(@class,'amlButton')])[2]")
    public WebElement addedOtherHallButton;

    @FindBy(xpath = "//td/table/tbody/tr/td/input")
    public WebElement operationTimeBox;


    @FindBy(xpath = "//table[@id='lstSalonMasaListesi_DXMainTable']//tr[3]//td[5]")
    public WebElement selectHallButton;

    @FindBy(xpath = "//*[contains(text(),'Kapat')]")
    public WebElement closePopupButton;

    @FindBy(xpath = "//a[contains(text(),'Salonu İptal Et')]")
    public static WebElement cancellHallButton;

    @FindBy(xpath = "(//a[contains(text(),'İşlemler')])[11]")
    public WebElement transactionsButton;

    @FindBy(xpath = "//span[@title='İşlemler']")
    public static WebElement patientTransactionButton;

    @FindBy(xpath = "//a[normalize-space()='Ameliyat Ekle']")
    public WebElement addOperationButton;

    @FindBy(xpath = "//a[@id='btnAmeliyathaneBildir']")
    public WebElement sendToOperationRoomButton;

    @FindBy(xpath = "//a[@id='btnAmeliyatErtele']")
    public WebElement postponeOperationButton;

    @FindBy(xpath = "//select[@id='AmlErtelemeNedeniCombo']")
    public WebElement causeOfPostponeOperation; //

    @FindBy(xpath = "//span[contains(text(),'Ameliyatı Ertele')]")
    public WebElement savePostponeOperationButton; //

    @FindBy(xpath = "//span[contains(text(),'Evet')]")
    public static WebElement verifyAlert;

    @FindBy(xpath = "//div[@id='HastaAmeliyatForm']//input[@type='button']")
    public WebElement toBeDoneOperation;

    @FindBy(xpath = "//table[@id='AmeliyatKodList_DXMainTable']//tr[8]//td[4]")
    public WebElement toBeDoneOperationSelect;

    @FindBy(xpath = "//a[normalize-space()='Kaydet']")
    public WebElement savetoBeDoneOperationButton;

    @FindBy(xpath = "//a[@onclick='funcCerrahiDoktorEkle(this)']")
    public WebElement addDocTeamButton;

    @FindBy(xpath = "//a[@onclick='funcAnesteziDoktorEkle(this)']")
    public WebElement addAnesthesiaTeamButton;

    @FindBy(xpath = "//table[@id='dxGridAmeliyatEkibi_DXMainTable']//tr[2]//td[3]")
    public WebElement selectResponsibleDoc;


    @FindBy(xpath = "//table[@id='dxGridAmeliyatEkibiAnestezi_DXMainTable']//tr[2]//td[3]")
    public WebElement selectResponsibleAnesthesiaDoc;

    @FindBy(xpath = "//input[@data-icon='verify']")
    public List<WebElement> selectDocCheckboxList;

    @FindBy(xpath = "//a[normalize-space()='Seç ve Kapat']")
    public WebElement selectAndCloseButton;

    @FindBy(xpath = "//input[@data-icon='verify']")
    public List<WebElement> selectAnesCheckboxList;

    @FindBy(xpath = "//div[@title='Hastanın ameliyatı ertelenmiş.']")
    public WebElement statusOfPatientButton;

    @FindBy(xpath = "//ul[@id='amlSalonList']//li")
    public List<WebElement> numberOfHall;

    @FindBy(xpath = "//div[2]/table/tbody/tr/td/div[2]/table/tbody/tr[3]/td[2]")
    public WebElement numberOfPatients;

    @FindBy(xpath = "//*[contains(text(),'1538')]")
    public WebElement patientProtocolNo;

    @FindBy(xpath = " //span[contains(text(),'Ameliyathane bildirimi tamamlanmıştır.')]")
    public WebElement notificationPopup;

    @FindBy(xpath = "(//div[@title='AHMET MEHMET'])[1](//div[@title='AHMET MEHMET'])[1]")
    public WebElement patientName;

    @FindBy(xpath = "//ul[@id='amlSalonList']//li")
    public List<WebElement> numberOfHalls;

    @FindBy(xpath = "//td[text()='GENEL CERRAHİ SERVİS']")
    public WebElement GenelCerrahi;

    @FindBy(xpath = "//a[@data-search-menu='AMELİYAT RANDEVU']")
    public WebElement Surgeryappointment;

    @FindBy(xpath = "//table[@id='dxGridRandevuListesi_DXMainTable']")
    public WebElement GridRandevuListesi;

    @FindBy(xpath = "//*[@id=\"AmeliyatListe_tccell6_2\"]/a")
    public WebElement tccell;

    @FindBy(xpath = "//a[contains(@class,'text_btn text_btn_ekle')]")
    public WebElement newappointment;

    @FindBy(xpath = "(//div[@class='datepicker']//input)[3]")
    public WebElement newappointmentdate;

    @FindBy(xpath = "//*[@id=\"PROTOKOL_NO_RND\"]")
    public WebElement SurgeryAppointmentProtocol;
    @FindBy(xpath = "//strong[text()='Hasta Adı Soyadı']/following-sibling::input")
    public WebElement clickPatientNo;

    @FindBy(xpath = "(//input[@class='inpt wpx200'])[2]")
    public WebElement SurgeryAppointmentSurgery;

    @FindBy(xpath = "//table[@id='AmeliyatListe_DXFREditorcol0']/tbody[1]/tr[1]/td[1]/input[1]")
    public WebElement AmeliyatEkle;

    @FindBy(xpath = "((//input[@type='textbox'])[1]")
    public WebElement appointmenttime;

    @FindBy(xpath = "(//input[@type='textbox'])[2]")
    public WebElement clocks10;

    @FindBy(xpath = "//input[@id='PLANLANAN_SURE']")
    public WebElement plannedcensorship;

    @FindBy(xpath = "(//input[contains(@class,'inpt inpt')])[1]")
    public WebElement SurgeryAppointmentDate;
    @FindBy(xpath = "(//tr[@data-randevuid='28288']//td)[3]")
    public WebElement AmeliyatRandevuhasta;
    @FindBy(xpath = "(//input[contains(@class,'inpt inpt')])[2]")
    public WebElement SurgeryAppointmentDate2;

    @FindBy(xpath = "//td[@id='dxGridAmeliyatHastaListesi_tccell0_0']//span[1]")
    public WebElement islemler;

    @FindBy(xpath = "//div[@class='content blckAcilirMenu']//a[1]")
    public WebElement masadancikar;

    @FindBy(xpath = "//span[text()='Evet']")
    public WebElement AlertDummy;

    @FindBy(xpath = "//a[@class='PopupSaveButton PopupButton']//span[1]")
    public WebElement AlertSaveButton;

    @FindBy(xpath = "//div[@class='alertButtons']//span[1]")
    public WebElement AlertSavebuttons2;


    @FindBy(xpath = "//td[text()='15388673']")
    public WebElement randevuprotokol;

    @FindBy(xpath = "//*[@id=\"dxGridAmeliyatHastaListesi_tccell0_4\"]/div")
    public WebElement ameliyatedilecekhasta;

    @FindBy(xpath = "//a[contains(text(),'Salonu İptal Et')]")
    public WebElement salonuiptalet;

    @FindBy(xpath = "//span[@class='yes item']")
    public WebElement popupsalonyes;

    @FindBy(xpath = "//span[(text() = 'Ekle')]")
    public static WebElement causeOftakeOffTable;

    @FindBy(xpath = "//li[@data-masakodu='11']")
    public WebElement tablecode;

    @FindBy(xpath = "(//a[@data-islemno='2'])[2]")
    public WebElement changeHall;

    @FindBy(xpath = "//a[contains(text(),'Seç')]")
    public WebElement secButton;

    @FindBy(xpath = "(//div[contains(text(),'Görüntülenecek veri yok')])[1]")
    public WebElement goruntulenecekveri;

    @FindBy(xpath = "//div[@id='salonlistesipanel']")
    public WebElement salonlistesi;

    @FindBy(xpath = "//*[@id=\"lstSalonMasaListesi_DXDataRow2\"]")
    public WebElement salonlar;

    @FindBy(xpath = "//*[@id=\"lstSalonMasaListesi_tccell2_4\"]/a")
    public WebElement salonlarsec;

    @FindBy(xpath = "(//a[@data-islemno='1'])[2]")
    public static WebElement takeOffTable;



    public void clickPatientProceduresTitle() {
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), patientProceduresTitle);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), operatingRoomOperationsTitle);
    }

    public void clickCreatingASurgeryListTitle() {
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), creatingSurgeryListTitle);
    }

    public void clickService() {
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), serviceBox);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), internalService);
        ReusableMethods.waitFor(6);
    }

    public void selectAppointmentDate() {
        ReusableMethods.waitFor(6);
        ReusableMethods.sendKeysWithJS(Driver.getDriver(), requestDateBox, "25.10.2023");
    }

    public void registerPatientWithProtocolNo() throws InterruptedException {
        ReusableMethods.waitFor(6);
        ReusableMethods.generateProtokolNo();
    }

    public void selectAPatient() {
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), refreshButton);
        ReusableMethods.waitFor(6);
        ReusableMethods.waitForVisibility(patientFromList, 5);
        ReusableMethods.jseWithClick(Driver.getDriver(), patientFromList);
    }

    public void addsHall() {
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), hallOperationsButton);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), addHallButton);
        ReusableMethods.waitFor(6);
        selectHallButton.click();
    }

    public void addsPatientToHall() {
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), refreshButton);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOf(addedHallButton));
        try {
            ReusableMethods.doubleClickWithJS(Driver.getDriver(), patientFromList);
        } catch (StaleElementReferenceException e) {
            ReusableMethods.doubleClickWithJS(Driver.getDriver(), patientFromList);
        }
        protocolNo = patientFromListe.getText();
    }


    public void selectSurgeryTime() {

        //ReusableMethods.waitForVisibility(operationTimeBox, 2);
        Random random = new Random();
        int hour = random.nextInt(9) + 8;       // 8-16
        int minute = random.nextInt(2) * 30;     // 0-59
        String randomHourString = String.format("%02d:%02d", hour, minute);
        ReusableMethods.waitFor(6);

        ReusableMethods.jseWithClick(Driver.getDriver(), operationTimeBox);
        ReusableMethods.waitFor(6);
        ReusableMethods.sendKeysWithJS(Driver.getDriver(), operationTimeBox, randomHourString);
        System.out.println("birinci metod p1:" + randomHourString);
    }



    public void addsSurgeryTeam() {
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), addDocTeamButton);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), selectDocCheckboxList.get(3));
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), selectAndCloseButton);

    }

    public void addsSurgery() {
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), addOperationButton);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), toBeDoneOperation);
        ReusableMethods.waitFor(6);
        toBeDoneOperationSelect.click();
        ReusableMethods.jseWithClick(Driver.getDriver(), savetoBeDoneOperationButton);

    }

    public void selectSurgicalTeamLeader() {
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), selectResponsibleDoc);

    }

    public void addAnesthesiaTeam() {
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), addAnesthesiaTeamButton);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), selectAnesCheckboxList.get(3));
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), selectAndCloseButton);
    }

    public void selectAnesthesiaTeamLeader() {
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), selectResponsibleAnesthesiaDoc);
    }

    public void sendOperatingRoomReport() {
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), transactionsButton);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), sendToOperationRoomButton);
    }


    public void cancelApprovedSurgery() {
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), transactionsButton);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), postponeOperationButton);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), causeOfPostponeOperation);
        ReusableMethods.waitFor(6);
        Select select = new Select(causeOfPostponeOperation);
        select.selectByValue("1");
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), savePostponeOperationButton);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), verifyAlert);


    }

    public void verifyApprovedSurgeryCanceled() {
        ReusableMethods.waitFor(6);
        Assert.assertEquals(statusOfPatientButton.getText(), "Hastanın ameliyatı ertelenmiş.");
    }

    public void selectAppointmentDateForThePastAndTheFuture(String requestDate) throws ParseException {
        ReusableMethods.waitFor(6);
        ReusableMethods.sendKeysWithJS(Driver.getDriver(), requestDateBox, requestDate);
        if (ReusableMethods.periodBetweenDates(requestDate) > 0) {
            requestDateIsValid = true;
        }
        ReusableMethods.waitFor(6);
    }

    public void checkRequestDate() {
        ReusableMethods.waitFor(6);
        Assert.assertEquals(requestDateIsValid, closePopupButton.isDisplayed());
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), closePopupButton);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), patientTransactionButton);
        ReusableMethods.waitFor(6);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(7));
        WebElement elementToOption = ReusableMethods.locateHallOptionsByText("Masadan Çıkar");
        ReusableMethods.jseWithClick(Driver.getDriver(), elementToOption);
        ReusableMethods.waitFor(6);
        wait.until(ExpectedConditions.elementToBeClickable(verifyAlert));
        ReusableMethods.jseWithClick(Driver.getDriver(), verifyAlert);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), causeOftakeOffTable);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), verifyAlert);
        ReusableMethods.jseWithClick(Driver.getDriver(), hallOperationsButton);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), cancellHallButton);
        ReusableMethods.jseWithClick(Driver.getDriver(), verifyAlert);


    }

    public void verifyPatientCannotAddToHall() {
        ReusableMethods.waitFor(6);
        SoftAssert softAssert = new SoftAssert();
        ReusableMethods.waitFor(6);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOf(addedHallButton));
        try {
            ReusableMethods.doubleClickWithJS(Driver.getDriver(), patientFromList);
        } catch (StaleElementReferenceException e) {
            ReusableMethods.doubleClickWithJS(Driver.getDriver(), patientFromList);
        }
        protocolNo = patientFromListe.getText();

        softAssert.assertNull(protocolNo);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), patientTransactionButton);
        ReusableMethods.waitFor(6);
        WebElement elementToOption = ReusableMethods.locateHallOptionsByText("Masadan Çıkar");
        ReusableMethods.jseWithClick(Driver.getDriver(), elementToOption);
        ReusableMethods.waitFor(6);
        wait.until(ExpectedConditions.elementToBeClickable(verifyAlert));
        ReusableMethods.jseWithClick(Driver.getDriver(), verifyAlert);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), causeOftakeOffTable);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), hallOperationsButton);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), cancellHallButton);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), verifyAlert);
        softAssert.assertAll();

    }

    public void addsAnotherPatientToHall() {
        ReusableMethods.waitFor(6);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOf(addedHallButton));
        try {
            ReusableMethods.doubleClickWithJS(Driver.getDriver(), otherPatientFromList);
        } catch (StaleElementReferenceException e) {
            ReusableMethods.doubleClickWithJS(Driver.getDriver(), otherPatientFromList);
        }
        protocolNo = patientFromListe.getText();
    }

    public void selectAnotherPatient() {
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), refreshButton);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), otherPatientFromList);
    }

    public void verifyPatientMoreThanOneHall() {
        SoftAssert softAssert = new SoftAssert();
        ReusableMethods.waitFor(6);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOf(addedHallButton));
        int numberOfPatient = Integer.parseInt(numberOfPatients.getText());

        softAssert.assertEquals(numberOfPatient, 1);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), patientTransactionButton);
        ReusableMethods.waitFor(6);
        WebElement elementToOption = ReusableMethods.locateHallOptionsByText("Masadan Çıkar");
        ReusableMethods.jseWithClick(Driver.getDriver(), elementToOption);
        ReusableMethods.waitFor(6);
        wait.until(ExpectedConditions.elementToBeClickable(verifyAlert));
        ReusableMethods.jseWithClick(Driver.getDriver(), verifyAlert);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), causeOftakeOffTable);
        ReusableMethods.waitFor(6);
        wait.until(ExpectedConditions.elementToBeClickable(patientTransactionButton));
        ReusableMethods.jseWithClick(Driver.getDriver(), patientTransactionButton);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), takeOffTable);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), verifyAlert);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), causeOftakeOffTable);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), hallOperationsButton);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), cancellHallButton);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), verifyAlert);
        ReusableMethods.waitFor(6);
        softAssert.assertAll();


    }


    public void enterSurgeryTime(String time) {
        ReusableMethods.waitFor(6);
        ReusableMethods.waitForVisibility(operationTimeBox, 2);
        try {
            ReusableMethods.jseWithClick(Driver.getDriver(), operationTimeBox);
            ReusableMethods.sendKeysWithJS(Driver.getDriver(), operationTimeBox, time);
        } catch (StaleElementReferenceException e) {
        }
    }

    public void addAnyHall(String string) {
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), hallOperationsButton);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), addHallButton);
        ReusableMethods.waitFor(6);
        WebElement elementToClick = ReusableMethods.locateSelectHallByText(string);
        ReusableMethods.doubleClickWithJS(Driver.getDriver(), elementToClick);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), refreshButton);
        ReusableMethods.waitFor(6);
    }

    public void addsTheSamePatientToTheHall() {
            ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), refreshButton);
        ReusableMethods.waitFor(6);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOf(addedOtherHallButton));
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), addedOtherHallButton);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), patientFromList);
        ReusableMethods.doubleClickWithJS(Driver.getDriver(), patientFromList);
    }

    public void verifyMoreThanOneHall() {
        SoftAssert softAssert = new SoftAssert();
        ReusableMethods.waitFor(6);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(3));
        softAssert.assertTrue(numberOfHall.size() <= 1);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), patientTransactionButton);
        ReusableMethods.waitFor(6);
        WebElement elementToOption = ReusableMethods.locateHallOptionsByText("Masadan Çıkar");
        ReusableMethods.jseWithClick(Driver.getDriver(), elementToOption);
        ReusableMethods.waitFor(6);
        wait.until(ExpectedConditions.elementToBeClickable(verifyAlert));
        ReusableMethods.jseWithClick(Driver.getDriver(), verifyAlert);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), causeOftakeOffTable);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), hallOperationsButton);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), cancellHallButton);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), verifyAlert);
        ReusableMethods.jseWithClick(Driver.getDriver(), refreshButton);
        ReusableMethods.waitFor(6);
        wait.until(ExpectedConditions.elementToBeClickable(hallOperationsButton));
        ReusableMethods.jseWithClick(Driver.getDriver(), hallOperationsButton);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), cancellHallButton);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), verifyAlert);
        softAssert.assertAll();
    }

    public void changeTheHallWithTheOtherHall(String text, String hall1, String hall2) {
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), patientTransactionButton);
        ReusableMethods.waitFor(6);
        WebElement selectChangeHall = ReusableMethods.locateSelectChangeHallByText(text);
        ReusableMethods.jseWithClick(Driver.getDriver(), selectChangeHall);
        ReusableMethods.waitFor(6);
        WebElement selectHall = ReusableMethods.locateChangeHallByText(hall2);
        ReusableMethods.waitFor(6);
        ReusableMethods.doubleClickWithJS(Driver.getDriver(), selectHall);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), verifyAlert);


    }

    public void verifyWherePatient(String hall1, String hall2) {
        SoftAssert softAssert = new SoftAssert();
        WebElement selectHall1 = ReusableMethods.locateSelectHallFromHallListByText(hall1);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), selectHall1);
        String emptyHall = Driver.getDriver().findElement(By.xpath("(//*[contains(text(),'Görüntülenecek veri yok')])[2]")).getText();
        softAssert.assertTrue(emptyHall.contains("Görüntülenecek veri yok"));
        WebElement selectHall2 = ReusableMethods.locateSelectHallFromHallListByText(hall2);
        ReusableMethods.jseWithClick(Driver.getDriver(), selectHall2);
        softAssert.assertTrue(patientProtocolNo.isDisplayed());
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), patientTransactionButton);
        ReusableMethods.waitFor(6);
        WebElement elementToOption = ReusableMethods.locateHallOptionsByText("Masadan Çıkar");
        ReusableMethods.jseWithClick(Driver.getDriver(), elementToOption);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), verifyAlert);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), causeOftakeOffTable);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), hallOperationsButton);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), cancellHallButton);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), verifyAlert);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), refreshButton);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), hallOperationsButton);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), cancellHallButton);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), verifyAlert);
        softAssert.assertAll();


    }

    public void selectAnyService() throws InterruptedException {
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), serviceBox);
        SoftAssert softAssert = new SoftAssert();
        ReusableMethods.waitFor(6);
        String pageNumberText = Driver.getDriver().findElement(By.xpath("//b[contains(@class,'dxp-lead dxp-summary')]")).getText();
        System.out.println("Total page: " + pageNumberText);
        int pageNumberCount = Integer.valueOf(pageNumberText.substring(pageNumberText.indexOf("/") + 2, pageNumberText.indexOf("(") - 1));

        for (int p = 1; p <= 2;/*pageNumberCount;*/ p++) {
            ReusableMethods.clickCurrentPage(p);
            for (int r = 1; r <= 2;/*serviceListTable.size();*/ r++) {
                WebElement serviceCodeExpected = Driver.getDriver().findElement(By.xpath("(//tr[contains(@id,'lstServis_DXDataRow')])[" + r + "]//td[2]"));
                String serviceCodeTextExpected = serviceCodeExpected.getText();
                ReusableMethods.doubleClickWithJS(Driver.getDriver(), serviceCodeExpected);
                ReusableMethods.jseWithClick(Driver.getDriver(), refreshButton);
                ReusableMethods.waitFor(6);
                ReusableMethods.jseWithClick(Driver.getDriver(), hallOperationsButton);
                ReusableMethods.waitFor(6);
                ReusableMethods.jseWithClick(Driver.getDriver(), addHallButton);
                ReusableMethods.waitFor(6);
                WebElement elementToClick = ReusableMethods.locateSelectHallByText("Salon_2");
                ReusableMethods.doubleClickWithJS(Driver.getDriver(), elementToClick);
                WebElement hallName = Driver.getDriver().findElement(By.xpath("//ul[@id='amlSalonList']//li"));
                String serviceCodeTextActual = hallName.getAttribute("data-serviskodu");
                //System.out.println(count + ")  Page no: " + p + "  serviceCodeText: " + serviceCodeTextActual);
                softAssert.assertEquals(serviceCodeTextActual, serviceCodeTextExpected);
                ReusableMethods.waitFor(6);
                ReusableMethods.jseWithClick(Driver.getDriver(), hallOperationsButton);
                ReusableMethods.waitFor(6);
                ReusableMethods.jseWithClick(Driver.getDriver(), cancellHallButton);
                ReusableMethods.waitFor(6);
                ReusableMethods.jseWithClick(Driver.getDriver(), verifyAlert);
                ReusableMethods.waitFor(6);
                ReusableMethods.jseWithClick(Driver.getDriver(), serviceBox);
                ReusableMethods.waitFor(6);
                ReusableMethods.clickCurrentPage(p);
            }
            ReusableMethods.waitFor(6);
        }
        softAssert.assertAll();
    }

    public void optionToPostponeNotDisplayed() {
        SoftAssert softAssert = new SoftAssert();
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), refreshButton);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), transactionsButton);
        softAssert.assertFalse(postponeOperationButton.isDisplayed());
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), patientTransactionButton);
        ReusableMethods.waitFor(6);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(7));
        WebElement elementToOption = ReusableMethods.locateHallOptionsByText("Masadan Çıkar");
        ReusableMethods.jseWithClick(Driver.getDriver(), elementToOption);
        ReusableMethods.waitFor(6);
        wait.until(ExpectedConditions.elementToBeClickable(verifyAlert));
        ReusableMethods.jseWithClick(Driver.getDriver(), verifyAlert);
        ReusableMethods.waitFor(6);
        wait.until(ExpectedConditions.elementToBeClickable(patientTransactionButton));
        ReusableMethods.jseWithClick(Driver.getDriver(), patientTransactionButton);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), takeOffTable);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), verifyAlert);
        ReusableMethods.jseWithClick(Driver.getDriver(), causeOftakeOffTable);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), verifyAlert);
        ReusableMethods.jseWithClick(Driver.getDriver(), hallOperationsButton);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), cancellHallButton);
        ReusableMethods.jseWithClick(Driver.getDriver(), verifyAlert);
        softAssert.assertAll();


    }

    public void surgeryListNotBeCreated() {
        SoftAssert softAssert = new SoftAssert();
        ReusableMethods.waitFor(6);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(3));
        ReusableMethods.waitForVisibility(notificationPopup, 5);
        ReusableMethods.waitFor(6);
        softAssert.assertFalse(notificationPopup.isDisplayed());
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), patientTransactionButton);
        ReusableMethods.waitFor(6);
        WebElement elementToOption = ReusableMethods.locateHallOptionsByText("Masadan Çıkar");
        ReusableMethods.jseWithClick(Driver.getDriver(), elementToOption);
        ReusableMethods.waitFor(6);
        wait.until(ExpectedConditions.elementToBeClickable(verifyAlert));
        ReusableMethods.jseWithClick(Driver.getDriver(), verifyAlert);
        ReusableMethods.waitFor(6);
        wait.until(ExpectedConditions.elementToBeClickable(patientTransactionButton));
        ReusableMethods.jseWithClick(Driver.getDriver(), patientTransactionButton);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), takeOffTable);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), verifyAlert);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), causeOftakeOffTable);
        ReusableMethods.waitFor(6);
        wait.until(ExpectedConditions.elementToBeClickable(hallOperationsButton));
        ReusableMethods.jseWithClick(Driver.getDriver(), hallOperationsButton);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), cancellHallButton);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), verifyAlert);
        softAssert.assertAll();


    }

    public void selectAppointmentOnPublicHoliday(String date) {
        ReusableMethods.waitFor(6);
        ReusableMethods.sendKeysWithJS(Driver.getDriver(), requestDateBox, date);
    }

    public void cancelTheHall() {
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), hallOperationsButton);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), cancellHallButton);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), verifyAlert);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), refreshButton);
        ReusableMethods.waitFor(6);
        Assert.assertTrue(numberOfHalls.isEmpty());


    }

    public void enterAppointmentDate(String date) {
        ReusableMethods.waitFor(6);
        ReusableMethods.sendKeysWithJS(Driver.getDriver(), requestDateBox, date);
    }

    public void selectService(String service) {
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), serviceBox);
        WebElement elementToClick = ReusableMethods.locateServiceByText(service);
        ReusableMethods.waitFor(6);
        ReusableMethods.doubleClickWithJS(Driver.getDriver(), elementToClick);
        ReusableMethods.waitFor(6);
    }

    public void selectPatientWithText(String patient) {
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), refreshButton);
        ReusableMethods.waitFor(6);
        WebElement elementToClick = ReusableMethods.locatePatientByText(patient);
        ReusableMethods.jseWithClick(Driver.getDriver(), elementToClick);
        ReusableMethods.waitFor(6);
    }

    public void addPatientWithText(String patient) {
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), refreshButton);
        WebElement elementToClick = ReusableMethods.locatePatientByText(patient);
        ReusableMethods.waitFor(6);
        ReusableMethods.doubleClickWithJS(Driver.getDriver(), elementToClick);
        ReusableMethods.waitFor(6);
    }

    public void surgeryListCreated() {
        ReusableMethods.waitFor(6);
        ReusableMethods.waitForVisibility(notificationPopup, 5);
        ReusableMethods.waitFor(6);
        Assert.assertTrue(notificationPopup.isDisplayed());


    }

    //*****************************************************************************************************





    public void SurgeryAppointmentProcedures() {
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), Surgeryappointment);
        ReusableMethods.waitFor(6);

    }



    public void ClicksOnThENewAppointmentTab() {
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), newappointment);
    }


    public void EntersAppointmentDate() {
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), newappointmentdate);
        ReusableMethods.waitFor(6);
        ReusableMethods.sendKeysWithJS(Driver.getDriver(), newappointmentdate, "21.09.2023");


    }


    public void EntersProtocolNo() {
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), SurgeryAppointmentProtocol);
        ReusableMethods.waitFor(6);
        ReusableMethods.sendKeysWithJS(Driver.getDriver(), SurgeryAppointmentProtocol, "15388673");


    }

    public void CliksPatientNo() {

        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), clickPatientNo);
        ReusableMethods.waitFor(6);

    }

    public void EntersSurgery() {
        ReusableMethods.waitFor(6);
        ReusableMethods.doubleClickWithJS(Driver.getDriver(), SurgeryAppointmentSurgery);
        ReusableMethods.waitFor(6);
        ReusableMethods.sendKeysWithJS(Driver.getDriver(), AmeliyatEkle, "KAFA BANDI UYGULAMASI");
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), tccell);


    }

    public void ClicksClocks() {
        ReusableMethods.waitFor(6);
        ReusableMethods.sendKeysWithJS(Driver.getDriver(), appointmenttime, "15");
        ReusableMethods.waitFor(6);
        ReusableMethods.sendKeysWithJS(Driver.getDriver(), clocks10, "30");

    }

    public void EntersPlanTime() {
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), plannedcensorship);
        ReusableMethods.waitFor(6);
        ReusableMethods.sendKeysWithJS(Driver.getDriver(), plannedcensorship, "30" + Keys.ENTER);

    }

    public void ClicksOnPatientTransactions() {
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), patientProceduresTitle);

    }

    public void ClicksOnOperation() {
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), operatingRoomOperationsTitle);


    }

    public void ClicksToCreateAnOperationList() {
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), creatingSurgeryListTitle);

    }


    public void DateFromAppointmentPatientsSection() {
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), SurgeryAppointmentDate);
        ReusableMethods.waitFor(6);
        ReusableMethods.sendKeysWithJS(Driver.getDriver(), SurgeryAppointmentDate, "30.11.2023");
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), SurgeryAppointmentDate2);
        ReusableMethods.waitFor(6);
        ReusableMethods.sendKeysWithJS(Driver.getDriver(), SurgeryAppointmentDate2, "30.11.2023");


    }


    public void SelectsService() {
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), serviceBox);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(),GenelCerrahi);
        ReusableMethods.waitFor(6);


    }


    public void ClicksTheRefreshButton() {
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), refreshButton);

    }


    public void DoubleClicksOnPatient() {
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), AmeliyatRandevuhasta);
        ReusableMethods.waitFor(6);
        ReusableMethods.waitFor(6);
        ReusableMethods.waitFor(6);
        ReusableMethods.doubleClickWithJS(Driver.getDriver(), AmeliyatRandevuhasta);
    }


    public void UserClicksOnTheOperationsTab() {
        ReusableMethods.waitFor(6);
        ReusableMethods.doubleClick(Driver.getDriver(), GridRandevuListesi);
        ReusableMethods.waitFor(6);


    }


    public void VerifiesPatientSArrival() {

        String randevuprtokolverify = randevuprotokol.getText();
        String ameliyatedilecekhastalistesi = ameliyatedilecekhasta.getText();
        ReusableMethods.waitFor(6);
        Assert.assertEquals(randevuprtokolverify, ameliyatedilecekhastalistesi);


    }
//******************************************************************


    public void UserClicksDevamEdilsinmiPopup() {
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), AlertSavebuttons2);

    }

    public void clickNewHall() {

        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), hallOperationsButton);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), addHallButton);
        ReusableMethods.waitFor(6);
        selectHallButton.click();

    }

    public void UserSelectsHall(String string) {

        ReusableMethods.waitFor(6);
        WebElement elementToClick = ReusableMethods.locateElementByText(string);
        ReusableMethods.waitFor(6);
        ReusableMethods.waitFor(6);
        ReusableMethods.waitFor(6);
        ReusableMethods.waitForVisibility(elementToClick, 5);
        ReusableMethods.waitFor(6);
        ReusableMethods.doubleClickWithJS(Driver.getDriver(), elementToClick);
        ReusableMethods.waitFor(6);

    }

    public void addSelectsAHall() {
        ReusableMethods.waitFor(6);
        selectHallButton.click();
        ReusableMethods.waitFor(6);
    }

    public void ClicksOperationsButton() {
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), patientTransactionButton);
    }

    public void ClicksIslemlerMasadanCikar() {
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), masadancikar);
    }

    public void ClicksUyariPopupEvetButonuna() {
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), AlertDummy);

    }

    public void UserClicksMasadanCikarEkleButtonTab() {
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), AlertSaveButton);

    }

    public void VerifiesAmeliyatEdilecekHastaListesi() {
        SoftAssert softAssert = new SoftAssert();
        ReusableMethods.waitFor(6);
        softAssert.assertTrue((goruntulenecekveri.isDisplayed()));
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), hallOperationsButton);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), cancellHallButton);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), verifyAlert);
        softAssert.assertAll();
    }

    public void ClicksOnOperatingRoomProceduresPage() {
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), hallOperationsButton);
        ReusableMethods.waitFor(6);

    }

    public void ClicksOnUserCancelHall() {
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), salonuiptalet);
        ReusableMethods.waitFor(6);
    }

    public void HallGivesConsentToThePopupWhetherToBeCancelled() {
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), popupsalonyes);

    }

    public void ClicksOnHallOperations() {
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), hallOperationsButton);

    }

    public void ClicksAddLounge(String string) {
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), hallOperationsButton);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), addHallButton);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), salonlar);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), salonlarsec);
    }

    public void SelectsADifferentHall() {
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), islemler);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), tablecode);


    }

    public void UserSalonChangeSecer() {
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), changeHall);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), secButton);


    }

    public void UserGivesConsentFromTheWarningTab() {
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), AlertDummy);
    }

    public void theUserConfirmsThatThePatientSHallHasChanged() {
        ReusableMethods.waitFor(6);
        Assert.assertTrue(patientName.isDisplayed());


    }

    public void ConfirmsHallCancellation() {
        ReusableMethods.waitFor(6);
        Assert.assertTrue(salonlistesi.isDisplayed());
    }

    public void rollbackAllSteps() {
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), patientTransactionButton);
        ReusableMethods.waitFor(6);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(7));
        WebElement elementToOption = ReusableMethods.locateHallOptionsByText("Masadan Çıkar");
        ReusableMethods.jseWithClick(Driver.getDriver(), elementToOption);
        ReusableMethods.waitFor(6);
        wait.until(ExpectedConditions.elementToBeClickable(verifyAlert));
        ReusableMethods.jseWithClick(Driver.getDriver(), verifyAlert);
        ReusableMethods.waitFor(6);
        wait.until(ExpectedConditions.elementToBeClickable(patientTransactionButton));
        ReusableMethods.jseWithClick(Driver.getDriver(), patientTransactionButton);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), takeOffTable);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), verifyAlert);
        ReusableMethods.jseWithClick(Driver.getDriver(), causeOftakeOffTable);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), verifyAlert);
        ReusableMethods.jseWithClick(Driver.getDriver(), hallOperationsButton);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), cancellHallButton);
        ReusableMethods.jseWithClick(Driver.getDriver(), verifyAlert);

    }

    public void patientNotMoreThanOneOperation() {
        ReusableMethods.waitFor(6);
        SoftAssert softAssert = new SoftAssert();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(3));
        ReusableMethods.waitForVisibility(notificationPopup, 5);
        softAssert.assertFalse(notificationPopup.isDisplayed());

        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), patientTransactionButton);
        ReusableMethods.waitFor(6);
        WebElement elementToOption = ReusableMethods.locateHallOptionsByText("Masadan Çıkar");
        ReusableMethods.jseWithClick(Driver.getDriver(), elementToOption);
        ReusableMethods.waitFor(6);
        wait.until(ExpectedConditions.elementToBeClickable(verifyAlert));
        ReusableMethods.jseWithClick(Driver.getDriver(), verifyAlert);
        ReusableMethods.waitFor(6);
        wait.until(ExpectedConditions.elementToBeClickable(patientTransactionButton));
        ReusableMethods.jseWithClick(Driver.getDriver(), patientTransactionButton);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), takeOffTable);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), verifyAlert);
        ReusableMethods.jseWithClick(Driver.getDriver(), causeOftakeOffTable);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), hallOperationsButton);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), cancellHallButton);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), verifyAlert);
        ReusableMethods.jseWithClick(Driver.getDriver(), refreshButton);
        ReusableMethods.waitFor(6);
        wait.until(ExpectedConditions.elementToBeClickable(hallOperationsButton));
        ReusableMethods.jseWithClick(Driver.getDriver(), hallOperationsButton);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), cancellHallButton);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), verifyAlert);
        softAssert.assertAll();


    }


    public void verifyWherePatientRollback(String hall1, String hall2) {
        SoftAssert softAssert = new SoftAssert();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(3));
        WebElement selectHall1 = ReusableMethods.locateSelectHallFromHallListByText(hall1);
        ReusableMethods.jseWithClick(Driver.getDriver(), selectHall1);
        String emptyHall = Driver.getDriver().findElement(By.xpath("(//*[contains(text(),'Görüntülenecek veri yok')])[2]")).getText();
        softAssert.assertTrue(emptyHall.contains("Görüntülenecek veri yok"));
        WebElement selectHall2 = ReusableMethods.locateSelectHallFromHallListByText(hall2);
        selectHall2.click();
        softAssert.assertTrue(patientProtocolNo.isDisplayed());

        ReusableMethods.waitFor(6);
        wait.until(ExpectedConditions.elementToBeClickable(patientTransactionButton));
        ReusableMethods.jseWithClick(Driver.getDriver(), patientTransactionButton);
        ReusableMethods.waitFor(6);
        WebElement elementToOption = ReusableMethods.locateHallOptionsByText("Masadan Çıkar");
        ReusableMethods.jseWithClick(Driver.getDriver(), elementToOption);
        ReusableMethods.waitFor(6);
        wait.until(ExpectedConditions.elementToBeClickable(verifyAlert));
        ReusableMethods.jseWithClick(Driver.getDriver(), verifyAlert);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), causeOftakeOffTable);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), verifyAlert);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), hallOperationsButton);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), cancellHallButton);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), verifyAlert);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), refreshButton);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), hallOperationsButton);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), cancellHallButton);
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), verifyAlert);
    }

    public void surgeryListShouldBeCreatedOutpatients() {
        ReusableMethods.waitFor(6);
        ReusableMethods.jseWithClick(Driver.getDriver(), verifyAlert);
        ReusableMethods.waitFor(6);
        ReusableMethods.waitForVisibility(notificationPopup, 5);
        ReusableMethods.waitFor(6);
        Assert.assertTrue(notificationPopup.isDisplayed());

    }

    public void checkIfAnyHallOnTheTable() {
        ReusableMethods.waitFor(6);
        ReusableMethods.checkIfPatientOrHallAtTable();
    }
}



