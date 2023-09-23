package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class OperatingRoomProcedures_Page {
    public OperatingRoomProcedures_Page(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//a[@class='open'])[3]")
    public WebElement hastaIslemleri;

    @FindBy(xpath = "//*[@id=\"menuDurumDegis\"]/div[2]/div/ul/li/div/ul/li[2]/a")
    public WebElement ameliyathaneIslemleri1;

    @FindBy(xpath = "//*[@id=\"menuDurumDegis\"]/div[2]/div/ul/li/div/ul/li[2]/div/ul/li[2]/a")
    public WebElement ameliyathaneIslemleri2;


    @FindBy(xpath = "//*[@id=\"AMELIYAT_LST_TARIH\"]")
    public WebElement requestDate;

    @FindBy(xpath = "//*[@id=\"btnLstYenile\"]")
    public WebElement refreshButton;

    @FindBy(xpath = "//td[text()='Salon_4']")
    public WebElement selectHallName;


    @FindBy(xpath = "/html/body/div[1]/div[4]/section/div[4]/div[2]/div[2]/div[2]/table/tbody/tr/td/div[2]/table/tbody/tr[3]/td[3]")
    public WebElement protocolNo;



    @FindBy(xpath = "//a[contains(text(),'Salon İşlemleri')]")
    public WebElement HallOperations;

    @FindBy(xpath = "//a[contains(text(),'Salon Onayla')]")
    public WebElement hallApprove ;

    @FindBy(xpath = "//*[@id=\"onayIcerik\"]/div/div[3]/span[1]")
    public WebElement DoYouWantToContinuePopupYESbutton;

    @FindBy(xpath = "//*[@id=\"menuDurumDegis\"]/div[2]/div/ul/li/div/ul/li[2]/div/ul/li[3]/a")
    public WebElement doctorSurgeryProceduresPage ;


    @FindBy(xpath = "//*[@id=\"salon_durumu\"]")
    public WebElement hallStatus ;

    @FindBy(xpath = "//a[text()='Onay İptal']")
    public WebElement hallCanceled;

    @FindBy(xpath = "//td[text()='Salon Adı']")
    public WebElement hallName;

    @FindBy(xpath = "//td[@id='AMELIYAT_SALON_LISTESI_tccell3_1']//b[1]")
    public WebElement hallNameTik;


    @FindBy(xpath = "//a[contains(text(),'Tüm Salonları Onayla')]")
    public WebElement AllhallApprove;


    @FindBy(xpath = "//a[contains(text(),'Tüm Salon Onay İptal')]")
    public WebElement AllhallCancelled;

    @FindBy(xpath = "//*[@id=\"dxGridAmeliyatHastaListesi_tccell0_0\"]")
    public WebElement patientOperations;

    @FindBy(xpath = "/html/body/div[7]/div/a[2]")
    public WebElement changeHall;




    @FindBy(xpath = "//a[contains(text(),'Seç')]")
    public WebElement chooseNewHall;



    @FindBy(xpath = "//*[@id=\"protokolAraInput\"]")
    public WebElement protocolSearch ;

    @FindBy(xpath = "//a[contains(text(),'Hasta Bul')]")
    public WebElement findPatient ;

    @FindBy(xpath = "//a[contains(text(),'Ameliyat Detayları')]")
    public WebElement operationDetails ;

    @FindBy(xpath = "//*[@id=\"AMELIYAT_TANI\"]")
    public WebElement operationDiagnosis ;

   @FindBy(xpath = "//*[@id=\"AmeliyatDetaylariPopup\"]/div[2]/div[2]/div[2]/div[1]/div[1]/h2/div/a")
    public WebElement addDiagnosis ;

    @FindBy(xpath = "//*[@id=\"TaniListesiLookup_tcFC2\"]/input")
    public WebElement sellectAllDiagnosis ;

    @FindBy(xpath = "//*[@id=\"TaniListesiLookup_tcheader2\"]/a")
    public WebElement selelctAndCloseButton ;


    @FindBy(xpath = "//*[@id=\"AMELIYAT_ADI\"]")
    public WebElement operationName ;

    @FindBy(xpath = "//*[@id=\"AMELIYAT_ACIKLAMA\"]")
    public WebElement operationDescription ;

    @FindBy(xpath = "//*[@id=\"AMELIYAT_YATIS_NOTU\"]")
    public WebElement hospitalizationNote ;

    @FindBy(xpath = "//*[@id=\"PopupSaveButton_0\"]/span")
    public WebElement saveOperationDetailsButton;


    @FindBy(xpath = "//a[contains(text(),'Hasta Ameliyathaneye Giriş Yapıldı')]")
    public WebElement operatingRoomEntranceButton;

    @FindBy(xpath = "//*[@id=\"dxGridAmeliyatHastaListesi_tccell0_9\"]/div")
    public WebElement statusButton;


    @FindBy(xpath = "//a[contains(text(),'Hasta Ameliyathane Giriş İptal')]")
    public WebElement operatingRoomCancelsEntranceButton;


    @FindBy(xpath = "//*[@id=\"input_ayaktahasta_protokol\"]")
    public WebElement popup1protokolNo;

    @FindBy(xpath = "//*[@id=\"AyaktaHastaPopup\"]/div[2]/div[2]/div[1]/a[1]")
    public WebElement protokolNoQuestioningButton;

    @FindBy(xpath = "/html/body/div[7]/div[2]/div[2]/div[1]/div/div[2]/input[3]")
    public WebElement popup1selectSalonButton;

    @FindBy(xpath = "//*[@id=\"lstSalonMasaListesi_tccell3_3\"]/a")
    public WebElement selectSalonButtonFromList;

    @FindBy(xpath = "//td[@id='lstSalonMasaListesi_tccell3_3']//a[1]")
    public WebElement selectSalon4;





    @FindBy(xpath = "//input[@name='TB_MASA_ADI']/following-sibling::input[1]")
    public WebElement popupSelectSalonButtonFromList;





    @FindBy(xpath = "//a[contains(text(),'Listeye Hasta Ekle')]")
    public WebElement addPatientListButton;

    @FindBy(xpath = "//*[@id=\"btn-ayaktahastaekle\"]")
    public WebElement popup1addPatientListButton;

    @FindBy(xpath = "/html/body/div[1]/div[4]/section/div[4]/div[1]/div[2]/a[4]")
    public WebElement POstopButton;

    @FindBy(xpath = "//a[contains(text(),'Postop')]")
    public WebElement homePagePOstopButton;

    @FindBy(xpath = "//*[@id=\"dxGridAmeliyatPostop_DXFREditorcol0_I\"]")
    public WebElement POstopProtokolNoButton;

    @FindBy(xpath = "//*[@id=\"dxGridAmeliyatPostop_DXDataRow1\"]/td[1]")
    public WebElement POstopSelectPatient;


    @FindBy(xpath = "//*[@id=\"PopupAmeliyatPostop\"]/div[2]/div[2]/div/div[1]/div[3]/a")
    public WebElement POstopSEndPatientServiceButton;

    @FindBy(xpath = "//*[@id=\"POSTOP_TARIH\"]")
    public WebElement POstopPageDataButton;

    @FindBy(xpath = "//*[@id=\"PopupAmeliyatPostop\"]/div[2]/div[1]/a/span")
    public WebElement POstopCloseButton;


    @FindBy(xpath = "/html/body/div[7]/div[2]/div[2]/div/div[1]/a")
    public WebElement POstopPageRefreshButton;


    @FindBy(xpath = "//*[@id=\"dxGridAmeliyatHastaListesi_tccell0_9\"]/div")
    public WebElement serviceStatus;

    @FindBy(xpath = "//*[@id=\"9de3c0dc_8766_4f34_ad56_cde74254a2b6\"]/input[3]")
    public WebElement Popup1selectSalonButton;

    @FindBy(xpath = "//*[@id=\"lstSalonMasaListesi_tccell1_3\"]/a")
    public WebElement Popup2selectSalonButton;


    @FindBy(xpath = "//*[@id=\"ServisListe_tccell1_2\"]/a")
    public WebElement EMERGENCYCHILDDAYCAREServiceButton;





    @FindBy(xpath = "//*[@id=\"64ce4f9a_bdbf_4e4f_a6db_f4b9d5c558d8\"]/input[3]")
    public WebElement Popup1HallButton;

    @FindBy(xpath = "/html/body/div[7]/div[2]/div[2]/div[1]/div/div[1]/input[3]")
    public WebElement popup1serviceButton;


    @FindBy(xpath = "//*[@id=\"protokolAraInput\"]")
    public WebElement homePageProtokolButton;

    @FindBy(xpath = "//*[@id=\"salon_servis_adi\"]")
    public WebElement homePageServiceName;

    @FindBy(xpath = "/html/body/div[7]/div/a[1]")
    public WebElement takeOfTableButton;


    @FindBy(xpath = "//*[@id=\"PopupSaveButton_0\"]/span")
    public WebElement takeOfTablepageAddButton;

    @FindBy(xpath = "//*[@id=\"ServisListe_DXFREditorcol0_I\"]")
    public WebElement poupServisNameButton;

    @FindBy(xpath = "//*[@id=\"ServisListe_tccell0_2\"]/a")
    public WebElement poupKadınDogumServiceButton;



    @FindBy(xpath = "//*[@id=\"AMELIYAT_SALON_LISTESI_DXDataRow0\"]/td[1]")
    public WebElement selectHallOne;



    @FindBy(xpath = "//td[text()='15384267']")
    public WebElement selectilyas;

    @FindBy(xpath = "//*[@id=\"dxGridAmeliyatHastaListesi_DXDataRow0\"]/td[3]")
    public WebElement selectPatient;









}
