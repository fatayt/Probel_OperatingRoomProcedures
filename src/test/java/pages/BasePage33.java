package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ReusableMethods;

public class BasePage33 {
    public BasePage33(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath ="(//a[@class='open'])[1]" )
    WebElement patientProcedures_button3;

    @FindBy(xpath ="(//a[@class='open'])[1]" )
    WebElement patientProcedures_button;

    @FindBy(xpath ="(//a[@class='open'])[2]" )
    WebElement ayaktanHastaIslemleri;

    @FindBy(xpath ="(//a[@href='/HBYS_WEB_PRODUCT/POL/POL/POLIKLINIKMUAYENE'])" )
    WebElement poliklinikMuayneKayit;

    @FindBy(xpath ="/html[1]/body[1]/div[1]/div[4]/section[1]/form[1]/div[3]/div[1]/div[1]/div[1]/div[4]/a[2]" )
    WebElement hastaButton;

    @FindBy(xpath ="(//a[@class='open'])[3]" )
    WebElement operatingRoomProcedures_button;
    @FindBy(xpath = "//a[@href='/HBYS_WEB_PRODUCT/AML/RND/Index']")
    WebElement appointmentPage_button;

    @FindBy(xpath = "//a[@href='/HBYS_WEB_PRODUCT/AML/LST/AmeliyatMalzemeIslemleri']")
    WebElement surgicalSupplies_button;

    @FindBy(xpath = "//a[@href='/HBYS_WEB_PRODUCT/AML/LST/DrAmeliyatislem']")
    WebElement doctorOperatingRoomProcedures_button;

   @FindBy(xpath = "//a[@href='/HBYS_WEB_PRODUCT/AML/LST/Ameliyatislem']")
    WebElement operatingRoomProcedures2_button;

   @FindBy(xpath = "//a[@href='/HBYS_WEB_PRODUCT/AML/LST']")
    WebElement createSurgeryList_button;


    public void theUserGoesSurgeryAppointmentPage() {
        ReusableMethods.jseWithClick(Driver.getDriver(), patientProcedures_button);
        ReusableMethods.jseWithClick(Driver.getDriver(), operatingRoomProcedures_button);
        ReusableMethods.jseWithClick(Driver.getDriver(), appointmentPage_button);
    }

    public void theUserGoesSurgicalSuppliesPage() {
        ReusableMethods.jseWithClick(Driver.getDriver(), patientProcedures_button);
        ReusableMethods.jseWithClick(Driver.getDriver(), operatingRoomProcedures_button);
        ReusableMethods.jseWithClick(Driver.getDriver(), surgicalSupplies_button);
    }

    public void theUserGoesDoctorOperatingRoomProceduresPage() {
        ReusableMethods.jseWithClick(Driver.getDriver(), patientProcedures_button);
        ReusableMethods.jseWithClick(Driver.getDriver(), operatingRoomProcedures_button);
        ReusableMethods.jseWithClick(Driver.getDriver(), doctorOperatingRoomProcedures_button);
    }

    public void theUserGoesOperatingRoomProceduresPage() {
        ReusableMethods.jseWithClick(Driver.getDriver(), patientProcedures_button);
        ReusableMethods.jseWithClick(Driver.getDriver(), operatingRoomProcedures_button);
        ReusableMethods.jseWithClick(Driver.getDriver(), operatingRoomProcedures2_button);
    }

    public void theUserGoesCreateSurgeryListPage() {
        ReusableMethods.jseWithClick(Driver.getDriver(), patientProcedures_button);
        ReusableMethods.jseWithClick(Driver.getDriver(), operatingRoomProcedures_button);
        ReusableMethods.jseWithClick(Driver.getDriver(), createSurgeryList_button);
    }
}
