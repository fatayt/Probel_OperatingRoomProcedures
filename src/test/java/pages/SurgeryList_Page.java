package pages;

import com.github.javafaker.Faker;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.*;
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

public class SurgeryList_Page {
    static String protocolNo;
    private String randomHourString;
    static boolean requestDateIsValid = false;

    public SurgeryList_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    Faker faker = new Faker();

    @FindBy(xpath = "//a[contains(text(),'Hasta İşlemleri')]")
    public WebElement patientProceduresTitle;

    @FindBy(xpath = "//a[contains(text(),'Ameliyathane İşlemleri')]")
    public WebElement operatingRoomOperationsTitle;

    @FindBy(xpath = "//a[contains(text(),'Ameliyat Listesi Oluşturma')] ")
    public WebElement creatingSurgeryListTitle;


    //@FindBy(xpath = "//div[@id='GelisTarihiBlock']//div[@class='datepicker']")
    @FindBy(xpath = "//input[@name='AMELIYAT_LST_TARIH']")
    public WebElement requestDateBox;

    @FindBy(xpath = "(//input[@class][@type='button'])[2]")
    public WebElement serviceBox;


    @FindBy(xpath = "//input[@id='lstServis-SERVIS_KODU']")
    public WebElement serviceNameBox;

    @FindBy(xpath = "//tr[contains(@id,'lstServis_DXDataRow')]")
    public List<WebElement> serviceListrow;

    @FindBy(xpath = "//tr[contains(@id,'lstServis_DXDataRow')]")
    public List<WebElement> serviceListTable;

    @FindBy(xpath = "//a[@data-lookupvalue='1010']")
    public WebElement internalService;

    @FindBy(xpath = "//a[@id='btnLstYenile']")
    public WebElement refreshButton;

    @FindBy(xpath = "//tr[contains(@id,'dxGridHastaListe')]")
    public WebElement servicePatientListTable;

    @FindBy(xpath = "//td[normalize-space()='HÜLCHOYA TÜXBJ']")
    public WebElement patientFromList;

    @FindBy(xpath = "//td[normalize-space()='EMCFNOP KAWSFTM']")
    public WebElement otherPatientFromList;

    @FindBy(xpath = "//table[@id='dxGridAmeliyatHastaListesi']")
    public List<WebElement> patientFromListeTable;

    @FindBy(xpath = "//*[contains(text(),'1538')]")
    public WebElement patientFromListe;

    @FindBy(xpath = "//a[contains(text(),'Salon İşlemleri')]")
    public WebElement hallOperationsButton;

    @FindBy(xpath = "//a[normalize-space()='Salon Ekle']")
    public WebElement addHallButton;

    @FindBy(xpath = "//li[contains(@class,'amlButton')]")
    public WebElement addedHallButton;

    @FindBy(xpath = "(//li[contains(@class,'amlButton')])[2]")
    public WebElement addedOtherHallButton;


    @FindBy(xpath = "//td/table/tbody/tr/td/input")
    public WebElement operationTimeBox;

    @FindBy(xpath = "//td/table/tbody/tr/td/input")
    public WebElement otherOperationTimeBox;

    @FindBy(xpath = "//table[@id='lstSalonMasaListesi_DXMainTable']")
    public WebElement hallTable;

    @FindBy(xpath = "//table[@id='lstSalonMasaListesi_DXMainTable']//tr[3]//td[5]")
    public WebElement selectHallButton;

    @FindBy(xpath = "//table[@id='lstSalonMasaListesi_DXMainTable']//tr[3]//td[5]")
    // @FindBy(xpath = "//a[contains(@id,'lstSalonMasaListesi')]")
    public WebElement selectAnyHallButton;

    @FindBy(xpath = "//*[contains(text(),'Kapat')]")
    public WebElement closePopupButton;

    @FindBy(xpath = "//a[contains(text(),'Salonu İptal Et')]")
    public WebElement cancellHallButton;

    @FindBy(xpath = "//table[@id='dxGridAmeliyatHastaListesi']")
    public WebElement patientsTobeOperatedListTable;
    @FindBy(xpath = "//table[@id='dxGridAmeliyatHastaListesi']//tr[2]//td[3]")
    public WebElement patientTobeOperated;

    @FindBy(id = "ListeAnesteziTipiCombo")
    public WebElement anesthesiaTypeDropDown;

    @FindBy(xpath = "(//a[contains(text(),'İşlemler')])[11]")
    public WebElement transactionsButton;

    @FindBy(xpath = "//span[@title='İşlemler']")
    public WebElement patientTransactionButton;


    @FindBy(xpath = "//a[normalize-space()='Ameliyat Ekle']")
    public WebElement addOperationButton;

    @FindBy(xpath = "//a[contains(text(),'Ameliyatları Sil')]")
    public WebElement deleteOperationButton;

    @FindBy(xpath = "//a[contains(text(),'Ameliyat Detayları')]")
    public WebElement surgeryDetailsButton;

    @FindBy(xpath = "//a[@id='btnAmeliyathaneBildir']")
    public WebElement sendToOperationRoomButton;

    @FindBy(xpath = "//a[@id='btnAmeliyatErtele']")
    public WebElement postponeOperationButton;

    @FindBy(xpath = "//select[@id='AmlErtelemeNedeniCombo']")
    public WebElement causeOfPostponeOperation; //

    @FindBy(xpath = "//span[contains(text(),'Ameliyatı Ertele')]")
    public WebElement savePostponeOperationButton; //

    @FindBy(xpath = "//span[contains(text(),'Evet')]")
    public WebElement verifyAlert;

    @FindBy(xpath = "//table[@id='dxGridAmeliyatHastaListesi_DXMainTable']//tr[2]")
    public WebElement patientfirst;

    @FindBy(xpath = "//table[@id='dxGridAmeliyatHastaListesi_DXMainTable']//tr[3]")
    public WebElement patientfsecond;

    @FindBy(xpath = "//table[@id='dxGridYapilacakAmeliyat']")
    public WebElement toBeOperatedPatientsListTable;

    @FindBy(xpath = "//div[@id='HastaAmeliyatForm']//input[@type='button']")
    public WebElement toBeDoneOperation;

    @FindBy(xpath = "//table[@id='AmeliyatKodList_DXMainTable']")
    public WebElement toBeDoneOperationTable;

    @FindBy(xpath = "//table[@id='AmeliyatKodList_DXMainTable']//tr[8]//td[4]")
    public WebElement toBeDoneOperationSelect;

    @FindBy(xpath = "//a[normalize-space()='Kaydet']")
    public WebElement savetoBeDoneOperationButton;

    @FindBy(xpath = "//a[@onclick='funcCerrahiDoktorEkle(this)']")
    public WebElement addDocTeamButton;

    @FindBy(xpath = "//a[@onclick='funcAnesteziDoktorEkle(this)']")
    public WebElement addAnesthesiaTeamButton;

    @FindBy(xpath = "//table[@id='dxGridAmeliyatEkibi_DXMainTable']")
    public WebElement selectResponsibleDocTable;

    @FindBy(xpath = "//table[@id='dxGridAmeliyatEkibi_DXMainTable']//tr[2]//td[3]")
    public WebElement selectResponsibleDoc;

    @FindBy(xpath = "//table[@id='dxGridAmeliyatEkibiAnestezi_DXMainTable']")
    public WebElement selectResponsibleAnesthesiaDocTable;

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

    @FindBy(xpath = "(//a[contains(text(),'Ameliyathane İşlemleri')])[2]")
    public WebElement operatingRoomOperationsPageTitle;

    @FindBy(xpath = "//td[normalize-space()='Salon_2']")
    public WebElement hallButton;

    @FindBy(xpath = "//*[contains(text(),'1538')]")
    public WebElement patientProtocolNo;

    @FindBy(xpath = " //span[contains(text(),'Ameliyathane bildirimi tamamlanmıştır.')]")
    public WebElement notificationPopup;

    @FindBy(xpath = "//a[contains(text(),'Ö. Hastanın Ekibini Kopyala')]")
    public WebElement copyPatientteamBox;

    @FindBy(xpath = "//a[contains(text(),'Ö. Hastanın Ekibini Kopyala')]")
    public WebElement patientByAppointmentTable;


    public void clickPatientProceduresTitle() {
        ReusableMethods.jseWithClick(Driver.getDriver(), patientProceduresTitle);
        ReusableMethods.jseWithClick(Driver.getDriver(), operatingRoomOperationsTitle);
    }

    public void clickCreatingASurgeryListTitle() {
        ReusableMethods.jseWithClick(Driver.getDriver(), creatingSurgeryListTitle);
    }

    public void clickService() throws InterruptedException {
        ReusableMethods.jseWithClick(Driver.getDriver(), serviceBox);
        ReusableMethods.jseWithClick(Driver.getDriver(), internalService);
        ReusableMethods.waitFor(3);
    }

    public void selectAppointmentDate() throws InterruptedException {
        ReusableMethods.sendKeysWithJS(Driver.getDriver(), requestDateBox, "25.10.2023");
    }

    public void registerPatientWithProtocolNo() throws InterruptedException {
        ReusableMethods.generateProtokolNo();
    }

    public void selectAPatient() {
        ReusableMethods.jseWithClick(Driver.getDriver(), refreshButton);
        ReusableMethods.waitForVisibility(patientFromList, 5);
        ReusableMethods.jseWithClick(Driver.getDriver(), patientFromList);
    }

    public void addsHall() throws InterruptedException {

        ReusableMethods.jseWithClick(Driver.getDriver(), hallOperationsButton);
        Thread.sleep(2000);
        ReusableMethods.jseWithClick(Driver.getDriver(), addHallButton);
        Thread.sleep(2000);
        selectHallButton.click();
    }

    public void addsPatientToHall() throws InterruptedException {
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


    public void selectSurgeryTime() throws InterruptedException {

        //ReusableMethods.waitForVisibility(operationTimeBox, 2);
        Random random = new Random();
        int hour = random.nextInt(9) + 8;       // 8-16
        int minute = random.nextInt(2) * 30;     // 0-59
        this.randomHourString = String.format("%02d:%02d", hour, minute);
        Thread.sleep(2000);

        ReusableMethods.jseWithClick(Driver.getDriver(), operationTimeBox);
        ReusableMethods.sendKeysWithJS(Driver.getDriver(), operationTimeBox, randomHourString);
        System.out.println("birinci metod p1:" + randomHourString);
    }

    public String getRandomHourString() {
        return this.randomHourString;
    }

    public void addsSurgeryTeam() {
        ReusableMethods.waitFor(2);
        ReusableMethods.jseWithClick(Driver.getDriver(), addDocTeamButton);
        ReusableMethods.jseWithClick(Driver.getDriver(), selectDocCheckboxList.get(3));
        ReusableMethods.waitFor(2);
        ReusableMethods.jseWithClick(Driver.getDriver(), selectAndCloseButton);

    }

    public void addsSurgery() {
        ReusableMethods.waitFor(2);
        ReusableMethods.jseWithClick(Driver.getDriver(), addOperationButton);
        ReusableMethods.jseWithClick(Driver.getDriver(), toBeDoneOperation);
        ReusableMethods.waitFor(2);
        toBeDoneOperationSelect.click();
        ReusableMethods.jseWithClick(Driver.getDriver(), savetoBeDoneOperationButton);

    }

    public void selectSurgicalTeamLeader() throws InterruptedException {
        Thread.sleep(2000);
        selectResponsibleDoc.click();

    }

    public void addAnesthesiaTeam() {
        ReusableMethods.waitFor(2);
        ReusableMethods.jseWithClick(Driver.getDriver(), addAnesthesiaTeamButton);
        ReusableMethods.jseWithClick(Driver.getDriver(), selectAnesCheckboxList.get(3));
        ReusableMethods.jseWithClick(Driver.getDriver(), selectAndCloseButton);
    }

    public void selectAnesthesiaTeamLeader() {
        ReusableMethods.waitFor(2);
        selectResponsibleAnesthesiaDoc.click();
    }

    public void sendOperatingRoomReport() throws InterruptedException {
        ReusableMethods.waitFor(2);
        ReusableMethods.jseWithClick(Driver.getDriver(), transactionsButton);
        Thread.sleep(2000);
        ReusableMethods.jseWithClick(Driver.getDriver(), sendToOperationRoomButton);
    }


    public void cancelApprovedSurgery() {
        ReusableMethods.waitFor(2);
        transactionsButton.click();
        postponeOperationButton.click();
        causeOfPostponeOperation.click();
        Select select = new Select(causeOfPostponeOperation);
        select.selectByValue("1");
        savePostponeOperationButton.click();
        verifyAlert.click();

    }

    public void verifyApprovedSurgeryCanceled() {
        Assert.assertEquals(statusOfPatientButton.getText(), "Hastanın ameliyatı ertelenmiş.");
    }

    public void selectAppointmentDateForThePastAndTheFuture(String requestDate) throws ParseException {
        ReusableMethods.sendKeysWithJS(Driver.getDriver(), requestDateBox, requestDate);
        if (ReusableMethods.periodBetweenDates(requestDate) > 0) {
            requestDateIsValid = true;
        }
        ReusableMethods.waitFor(2);
    }

    public void checkRequestDate() {
        ReusableMethods.waitFor(2);
        Assert.assertEquals(requestDateIsValid, closePopupButton.isDisplayed());
    }

    public void verifyPatientCannotAddToHall() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOf(addedHallButton));
        try {
            ReusableMethods.doubleClickWithJS(Driver.getDriver(), patientFromList);
        } catch (StaleElementReferenceException e) {
            ReusableMethods.doubleClickWithJS(Driver.getDriver(), patientFromList);
        }
        protocolNo = patientFromListe.getText();
        Assert.assertNull(protocolNo);

    }

    public void addsAnotherPatientToHall() {
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
        ReusableMethods.jseWithClick(Driver.getDriver(), refreshButton);
        ReusableMethods.waitFor(2);
        ReusableMethods.jseWithClick(Driver.getDriver(), otherPatientFromList);
    }

    public void verifyPatientMoreThanOneHall() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOf(addedHallButton));

        int numberOfPatient = Integer.parseInt(numberOfPatients.getText());
        Assert.assertTrue(numberOfPatient == 1);
    }

    public void enterSurgeryTime(String time) throws InterruptedException {
        ReusableMethods.waitForVisibility(operationTimeBox, 2);
        try {
            ReusableMethods.jseWithClick(Driver.getDriver(), operationTimeBox);
            ReusableMethods.sendKeysWithJS(Driver.getDriver(), operationTimeBox, time);
        } catch (StaleElementReferenceException e) {
            System.out.println("Error: Operation time box could not be found");
            return;
        }
        System.out.println("Time3: " + operationTimeBox.getAttribute("value"));
    }

    public void addAnyHall(String string) throws InterruptedException {
        ReusableMethods.jseWithClick(Driver.getDriver(), hallOperationsButton);
        Thread.sleep(2000);
        ReusableMethods.jseWithClick(Driver.getDriver(), addHallButton);
        Thread.sleep(2000);
        WebElement elementToClick = ReusableMethods.locateSelectHallByText(string);
        ReusableMethods.doubleClickWithJS(Driver.getDriver(), elementToClick);
    }

    public void addsTheSamePatientToTheHall() throws InterruptedException {
        // ReusableMethods.waitFor(2);
        Thread.sleep(2000);
        ReusableMethods.jseWithClick(Driver.getDriver(), refreshButton);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOf(addedOtherHallButton));
        Thread.sleep(2000);
        ReusableMethods.jseWithClick(Driver.getDriver(), addedOtherHallButton);
        Thread.sleep(2000);
        ReusableMethods.jseWithClick(Driver.getDriver(), patientFromList);
        ReusableMethods.doubleClickWithJS(Driver.getDriver(), patientFromList);
    }

    public void verifyMoreThanOneHall() {
        System.out.println("Number of halls: " + numberOfHall.size());
        Assert.assertTrue(numberOfHall.size() <= 1);
    }

    public void changeTheHallWithTheOtherHall(String text, String hall1, String hall2) throws InterruptedException {
        refreshButton.click();
        ReusableMethods.jseWithClick(Driver.getDriver(), patientTransactionButton);
        WebElement elementToOption = ReusableMethods.locateHallOptionsByText(text);
        ReusableMethods.jseWithClick(Driver.getDriver(), elementToOption);
        WebElement elementTohall = ReusableMethods.locateChangeHallByText(hall2);
        ReusableMethods.doubleClickWithJS(Driver.getDriver(), elementTohall);
        verifyAlert.click();
        WebElement hall2Click = ReusableMethods.locateSelectHallByText(hall2);
        hall2Click.click();
    }

    public void verifyWherePatient(String hall1, String hall2) {
        WebElement selectHall1 = ReusableMethods.locateSelectHallByText(hall1);
        ReusableMethods.jseWithClick(Driver.getDriver(), selectHall1);
        String emptyHall = Driver.getDriver().findElement(By.xpath("(//*[contains(text(),'Görüntülenecek veri yok')])[2]")).getText();
        Assert.assertTrue(emptyHall.contains("Görüntülenecek veri yok"));
        WebElement selectHall2 = ReusableMethods.locateSelectHallByText(hall2);
        selectHall2.click();
        Assert.assertTrue(patientProtocolNo.isDisplayed());
    }

    public void selectAnyService() throws InterruptedException {
        ReusableMethods.jseWithClick(Driver.getDriver(), serviceBox);
        int count = 0;
        SoftAssert softAssert = new SoftAssert();
        String pageNumberText = Driver.getDriver().findElement(By.xpath("//b[contains(@class,'dxp-lead dxp-summary')]")).getText();
        System.out.println("Total page: " + pageNumberText);
        int pageNumberCount = Integer.valueOf(pageNumberText.substring(pageNumberText.indexOf("/") + 2, pageNumberText.indexOf("(") - 1));

        for (int p = 1; p <= pageNumberCount; p++) {
            ReusableMethods.clickCurrentPage(p);
            for (int r = 1; r <= serviceListTable.size(); r++) {
                WebElement serviceCodeExpected = Driver.getDriver().findElement(By.xpath("(//tr[contains(@id,'lstServis_DXDataRow')])[" + r + "]//td[2]"));
                String serviceCodeTextExpected = serviceCodeExpected.getText();
                ReusableMethods.doubleClickWithJS(Driver.getDriver(), serviceCodeExpected);
                ReusableMethods.jseWithClick(Driver.getDriver(), refreshButton);
                Thread.sleep(1000);
                ReusableMethods.jseWithClick(Driver.getDriver(), hallOperationsButton);
                Thread.sleep(1000);
                ReusableMethods.jseWithClick(Driver.getDriver(), addHallButton);
                Thread.sleep(1000);
                WebElement elementToClick = ReusableMethods.locateSelectHallByText("Salon_2");
                ReusableMethods.doubleClickWithJS(Driver.getDriver(), elementToClick);
                WebElement hallName = Driver.getDriver().findElement(By.xpath("//ul[@id='amlSalonList']//li"));
                String serviceCodeTextActual = hallName.getAttribute("data-serviskodu");
                count++;
                System.out.println(count + ")  Page no: " + p + "  serviceCodeText: " + serviceCodeTextActual);
                softAssert.assertEquals(serviceCodeTextActual, serviceCodeTextExpected);
                Thread.sleep(1000);
                ReusableMethods.jseWithClick(Driver.getDriver(), hallOperationsButton);
                ReusableMethods.jseWithClick(Driver.getDriver(), cancellHallButton);
                ReusableMethods.jseWithClick(Driver.getDriver(), verifyAlert);
                ReusableMethods.jseWithClick(Driver.getDriver(), serviceBox);
                Thread.sleep(1000);
                ReusableMethods.clickCurrentPage(p);
            }
            Thread.sleep(1000);
        }
        softAssert.assertAll();
    }

    public void optionToPostponeNotDisplayed() throws InterruptedException {
        transactionsButton.click();
        ReusableMethods.waitForVisibility(postponeOperationButton, 5);
        Assert.assertFalse(postponeOperationButton.isDisplayed());
    }

    public void surgeryListNotBeCreated() {
        System.out.println("popo up görüldü mü?");
        ReusableMethods.waitForVisibility(notificationPopup, 5);
        Assert.assertFalse(notificationPopup.isDisplayed());
    }

    public void selectAppointmentOnPublicHoliday(String date) {
        ReusableMethods.sendKeysWithJS(Driver.getDriver(), requestDateBox, date);
    }

    public void cancelTheHall() {
        ReusableMethods.jseWithClick(Driver.getDriver(), hallOperationsButton);
        ReusableMethods.jseWithClick(Driver.getDriver(), cancellHallButton);
        ReusableMethods.jseWithClick(Driver.getDriver(), verifyAlert);
    }

    public void enterAppointmentDate(String date) {
        ReusableMethods.sendKeysWithJS(Driver.getDriver(), requestDateBox, date);
    }

    public void selectService(String service) {
        ReusableMethods.jseWithClick(Driver.getDriver(), serviceBox);
        WebElement elementToClick = ReusableMethods.locateServiceByText(service);
        ReusableMethods.doubleClickWithJS(Driver.getDriver(), elementToClick);
        ReusableMethods.waitFor(3);
    }

    public void selectPatientWithText(String patient) throws InterruptedException {
        ReusableMethods.jseWithClick(Driver.getDriver(), refreshButton);
        Thread.sleep(2000);
        WebElement elementToClick = ReusableMethods.locatePatientByText(patient);
        elementToClick.click();
        ReusableMethods.waitFor(3);
    }

    public void addPatientWithText(String patient) {
        ReusableMethods.jseWithClick(Driver.getDriver(), refreshButton);
        WebElement elementToClick = ReusableMethods.locatePatientByText(patient);
        ReusableMethods.doubleClickWithJS(Driver.getDriver(), elementToClick);
        ReusableMethods.waitFor(3);
    }

    public void surgeryListCreated() {
        ReusableMethods.waitForVisibility(notificationPopup, 5);
        Assert.assertTrue(notificationPopup.isDisplayed());
    }
}
