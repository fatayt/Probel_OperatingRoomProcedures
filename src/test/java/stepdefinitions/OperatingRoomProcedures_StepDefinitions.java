package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.Assertion;
import pages.BasePage;
import pages.Login_Page;
import pages.OperatingRoomProcedures_Page;
import utilities.Driver;


public class OperatingRoomProcedures_StepDefinitions {

    Login_Page login_page = new Login_Page();
    BasePage basePage = new BasePage();
    Actions actions = new Actions(Driver.getDriver());

    OperatingRoomProcedures_Page operatingRoomProcedures_page_ = new OperatingRoomProcedures_Page();
    Faker faker = new Faker();




    @Given("User enters date")
    public void user_enters_date() throws InterruptedException {
       Thread.sleep(2000);
       operatingRoomProcedures_page_.requestDate.click();
        Thread.sleep(2000);
        operatingRoomProcedures_page_.requestDate.sendKeys("15.09.2023");
        Thread.sleep(2000);

    }


    @Given(" The User clicks the refresh button")
    public void Theuser_clicks_the_refresh_button() throws InterruptedException {
        operatingRoomProcedures_page_.refreshButton.click();
        Thread.sleep(1000);

    }

    @Given("User selects hall")
    public void user_selects_hall() throws InterruptedException {
        Thread.sleep(1000);
        operatingRoomProcedures_page_.selectHallName.click();
        Thread.sleep(1000);

    }

    @Given("User selects patient")
    public void user_selects_patient() throws InterruptedException {
        Thread.sleep(1000);
        operatingRoomProcedures_page_.selectPatient.click();
        Thread.sleep(1000);



    }

    @Given("User clicks on salon operations")
    public void user_clicks_on_salon_operations() throws InterruptedException {
        Thread.sleep(3000);
        operatingRoomProcedures_page_.HallOperations.click();
        Thread.sleep(1000);

    }

    @Given("User hall approves")
    public void user_hall_approves() throws InterruptedException {
        operatingRoomProcedures_page_.hallApprove.click();
        Thread.sleep(1000);
        operatingRoomProcedures_page_.DoYouWantToContinuePopupYESbutton.click();
        Thread.sleep(1000);

    }



    @Given("User verifies patient")
    public void user_verifies_patient() {
        Assertion assertion = new Assertion();
        Assert.assertEquals("Salon onaylanmıştır.", operatingRoomProcedures_page_.hallStatus.getText());
        org.junit.Assert.assertTrue("Bilgiler kaydedildi.", true);

    }

    @Given("User cancels the salon")
    public void user_cancels_the_salon() throws InterruptedException {
        Thread.sleep(1000);
        operatingRoomProcedures_page_.hallCanceled.click();

        Thread.sleep(1000);
        operatingRoomProcedures_page_.DoYouWantToContinuePopupYESbutton.click();
        Thread.sleep(1000);

    }

    @Given("User verify that the hall has been cancelled")
    public void user_confirms_that_the_hall_has_been_cancelled() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertFalse(operatingRoomProcedures_page_.hallStatus.getText().contains("Salon onaylanmıştır."));


    }

    @Given("User confirms all halls")
    public void user_confirms_all_halls() throws InterruptedException {
        Thread.sleep(1000);
        operatingRoomProcedures_page_.HallOperations.click();
        Thread.sleep(1000);
        operatingRoomProcedures_page_.AllhallApprove.click();
        Thread.sleep(1000);
        operatingRoomProcedures_page_.DoYouWantToContinuePopupYESbutton.click();
        Thread.sleep(1000);
    }

    @Given("User cancels all halls")
    public void user_cancels_all_halls() throws InterruptedException {
        Thread.sleep(1000);
        operatingRoomProcedures_page_.HallOperations.click();
        Thread.sleep(1000);
        operatingRoomProcedures_page_.AllhallCancelled.click();
        Thread.sleep(1000);
        operatingRoomProcedures_page_.DoYouWantToContinuePopupYESbutton.click();
        Thread.sleep(1000);
    }

    @Given("The user clicks on the patient operations button")
    public void the_user_clicks_on_the_patient_operations_button() throws InterruptedException {
        Thread.sleep(1000);
        operatingRoomProcedures_page_.patientOperations.click();

    }

    @Given("User clicks on change hall button")
    public void user_clicks_on_change_hall_button() {
        operatingRoomProcedures_page_.changeHall.click();

    }

    @Given("User selects new hall")
    public void user_selects_new_hall() throws InterruptedException {
        operatingRoomProcedures_page_.chooseNewHall.click();
        Thread.sleep(1000);
        operatingRoomProcedures_page_.DoYouWantToContinuePopupYESbutton.click();
        Thread.sleep(1000);


    }

    @Given("user finds patient with protocol number")
    public void user_finds_patient_with_protocol_number() throws InterruptedException {
        Thread.sleep(1000);
        operatingRoomProcedures_page_.protocolSearch.click();
        Thread.sleep(1000);
        operatingRoomProcedures_page_.protocolSearch.sendKeys("15384267");
        Thread.sleep(2000);
        operatingRoomProcedures_page_.findPatient.click();
        Thread.sleep(2000);

    }
/*
    @Given("The user clicks on the hall  has selected")
    public void the_user_clicks_on_the_hall_he_she_has_selected() {


    }
    @Given("Confirms that the user left has changed")
    public void confirms_that_the_user_left_has_changed() {

    }
*/


    @Given("User clicks on the surgery details button")
    public void user_clicks_on_the_surgery_details_button() throws InterruptedException {
        Thread.sleep(1000);
        operatingRoomProcedures_page_.operationDetails.click();
    }

    @Given("User selects Diagnosis")
    public void user_selects_diagnosis() {
        operatingRoomProcedures_page_.operationDiagnosis.click();

    }

    @Given("User writes diagnosis")
    public void user_writes_diagnosis() throws InterruptedException {
        operatingRoomProcedures_page_.operationDiagnosis.sendKeys("Merhaba bu bir deneme yayınıdır.Şimdi  buraya AMELİYAT TANISI listesinden bütün tanıları seçeceğim.");
        Thread.sleep(1000);

        operatingRoomProcedures_page_.addDiagnosis.click();
        Thread.sleep(1000);
        operatingRoomProcedures_page_.sellectAllDiagnosis.click();
        Thread.sleep(1000);
        operatingRoomProcedures_page_.selelctAndCloseButton.click();
        Thread.sleep(1000);


    }

    @Given("User writes description")
    public void user_writes_description() throws InterruptedException {
        operatingRoomProcedures_page_.operationDescription.click();
        operatingRoomProcedures_page_.operationDescription.sendKeys("Merhaba bu bir deneme yayınıdır. buraya ACIKLAMA girilmelidir.");
        Thread.sleep(1000);
    }

    @Given("User writes a hospitalization note")
    public void user_writes_a_hospitalization_note() throws InterruptedException {
        operatingRoomProcedures_page_.hospitalizationNote.click();
        operatingRoomProcedures_page_.hospitalizationNote.sendKeys("Merhaba bu bir deneme yayınıdır. buraya YATIS NOTU girilmelidir.");
        Thread.sleep(1000);
    }

    @Given("User clicks the Save button on the Surgery details page")
    public void user_clicks_the_save_button_on_the_surgery_details_page() {
        operatingRoomProcedures_page_.saveOperationDetailsButton.click();

    }

    @Given("User clicks on the button Patient entered the operating room")
    public void user_clicks_on_the_button_patient_entered_the_operating_room() throws InterruptedException {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        operatingRoomProcedures_page_.operatingRoomEntranceButton.click();
        Thread.sleep(1000);
        operatingRoomProcedures_page_.DoYouWantToContinuePopupYESbutton.click();
        Thread.sleep(1000);



    }
 /*   @Given("The user verifies the patient's entry into the operating room")
    public void the_user_verifies_the_patient_s_entry_into_the_operating_room() {

        Assert.assertTrue(ameliyathaneIslemleri_page_i.statusButton.getText().contains("Ameliyathaneye İndirildi"));
    //    Assert.assertEquals("Ameliyathaneye İndirildi",ameliyathaneIslemleri_page_i.statusButton.getText());
    }
*/


    @Given("User cancels the patient's entrance to the operating room of the patient")
    public void user_cancels_the_patient_s_entrance_to_the_operating_room_of_the_patient() throws InterruptedException {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        operatingRoomProcedures_page_.operatingRoomCancelsEntranceButton.click();
        Thread.sleep(1000);
        operatingRoomProcedures_page_.DoYouWantToContinuePopupYESbutton.click();
        Thread.sleep(1000);
        actions.sendKeys(Keys.PAGE_UP).perform();

    }

    @Given("User clicks the patient operating room login cancel button")
    public void user_clicks_the_patient_operating_room_login_cancel_button() throws InterruptedException {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        operatingRoomProcedures_page_.operatingRoomCancelsEntranceButton.click();
        Thread.sleep(1000);
        operatingRoomProcedures_page_.DoYouWantToContinuePopupYESbutton.click();
    }

    @Given("User clicks on Add patient to list button")
    public void user_clicks_on_add_patient_to_list_button() throws InterruptedException {
        operatingRoomProcedures_page_.addPatientListButton.click();
        Thread.sleep(1000);

    }

    @Given("The user enters the protocol number of the patient they want to add")
    public void the_user_enters_the_protocol_number_of_the_patient_they_want_to_add() throws InterruptedException {
        operatingRoomProcedures_page_.popup1protokolNo.click();
        operatingRoomProcedures_page_.popup1protokolNo.sendKeys("15384267");
        Thread.sleep(1000);

    }

    @Given("User clicks on the questioning button")
    public void user_clicks_on_the_Questioning_button() {
        operatingRoomProcedures_page_.protokolNoQuestioningButton.click();


    }

    @Given("User clicks on the poup1 salon button")
    public void user_clicks_on_the_poup1_salon_button() throws InterruptedException {
        Thread.sleep(1000);
        operatingRoomProcedures_page_.popup1selectSalonButton.click();
        Thread.sleep(1000);

    }

    @Given("User popup2 selects hall")
    public void user_popup2_selects_hall() {
        operatingRoomProcedures_page_.selectSalonButtonFromList.click();

    }

    @Given("User clicks popup1 on Add patient to list button")
    public void user_clicks_popup1_on_add_patient_to_list_button() {
        operatingRoomProcedures_page_.popup1addPatientListButton.click();
    }



    @Given("User enter data POstop page")
    public void user_enter_data_p_ostop_page() throws InterruptedException {
        operatingRoomProcedures_page_.POstopPageDataButton.click();
        operatingRoomProcedures_page_.POstopPageDataButton.sendKeys("15.09.2023" + Keys.ENTER);
        Thread.sleep(1000);
    }

    @Given("User click the refresh button POstop page")
    public void user_click_the_refresh_button_p_ostop_page() {
        operatingRoomProcedures_page_.POstopPageRefreshButton.click();

    }

    @Given("User enter protokol number Postop page")
    public void user_enter_protokol_number_postop_page() throws InterruptedException {
        operatingRoomProcedures_page_.POstopProtokolNoButton.click();
        operatingRoomProcedures_page_.POstopProtokolNoButton.sendKeys("15384267" + Keys.ENTER);
        Thread.sleep(1000);

    }

    @Given("The user selects the patient they want to send to the service")
    public void the_user_selects_the_patient_they_want_to_send_to_the_service() throws InterruptedException {
        Thread.sleep(3000);
        operatingRoomProcedures_page_.POstopSelectPatient.click();
        Thread.sleep(2000);

    }

    @Given("User clicks on Send patient to ward button")
    public void user_clicks_on_send_patient_to_ward_button() throws InterruptedException {
        operatingRoomProcedures_page_.POstopSEndPatientServiceButton.click();
        Thread.sleep(1000);
        operatingRoomProcedures_page_.POstopCloseButton.click();

    }

    @Given("User verifies that the patient has been sent to the service")
    public void user_verifies_that_the_patient_has_been_sent_to_the_service() {
        Assertion assertion = new Assertion();
        Assert.assertEquals("Servise Gönderildi", operatingRoomProcedures_page_.serviceStatus.getText());
        org.junit.Assert.assertTrue("Servise Gönderildi", true);
    }

    @Given("The user enters the protocol number2 of the patient they want to add")
    public void the_user_enters_the_protocol_number2_of_the_patient_they_want_to_add() {
        operatingRoomProcedures_page_.popup1protokolNo.click();
        operatingRoomProcedures_page_.popup1protokolNo.sendKeys("9951101");

    }

    @Given("User clicks on the query button")
    public void user_clicks_on_the_query_button() {
        operatingRoomProcedures_page_.protokolNoQuestioningButton.click();

    }
    @Given("User clicks the service button")
    public void user_clicks_the_service_button() throws InterruptedException {
        operatingRoomProcedures_page_.popup1serviceButton.click();
        Thread.sleep(1000);

    }
    @Given("User selects the EMERGENCY CHILD DAY CARE Service")
    public void user_selects_the_EMERGENCY_CHILD_DAY_CARE_service() throws InterruptedException {
        operatingRoomProcedures_page_.EMERGENCYCHILDDAYCAREServiceButton.click();
        Thread.sleep(3000);


    }
    @Given("The user clicks Add to patient list button")
    public void the_user_clicks_add_to_patient_list_button() throws InterruptedException {
        operatingRoomProcedures_page_.popup1addPatientListButton.click();
        Thread.sleep(1000);

    }

    @And("the user selects the salon popup add list page")
    public void theUserSelectsTheSalonPopupAddListPage() throws InterruptedException {
        operatingRoomProcedures_page_.popup1selectSalonButton.click();
        Thread.sleep(2000);
        operatingRoomProcedures_page_.selectSalonButtonFromList.click();
        Thread.sleep(1000);
        operatingRoomProcedures_page_.popup1addPatientListButton.click();

    }

    @And("The user enters the protocol number of the patient they want to add1")
    public void theUserEntersTheProtocolNumberOfThePatientTheyWantToAdd() throws InterruptedException {
        Thread.sleep(2000);
        operatingRoomProcedures_page_.homePageProtokolButton.click();
        operatingRoomProcedures_page_.homePageProtokolButton.sendKeys("9951101");
        Thread.sleep(1000);
        operatingRoomProcedures_page_.findPatient.click();


    }

    @And("User verifies that the patient has been added to the list")
    public void userVerifiesThatThePatientHasBeenAddedToTheList() throws InterruptedException {
        Assertion assertion = new Assertion();
        Assert.assertEquals("ACİL ÇOCUK GÜNÜBİRLİK", operatingRoomProcedures_page_.homePageServiceName.getText());
        org.junit.Assert.assertEquals("ACİL ÇOCUK GÜNÜBİRLİK", false);
        Thread.sleep(2000);
    }

    @And("User clicks the exit from the table button")
    public void userClicksTheExitFromTheTableButton() throws InterruptedException {
    operatingRoomProcedures_page_.takeOfTableButton.click();
    Thread.sleep(1000);
    operatingRoomProcedures_page_.DoYouWantToContinuePopupYESbutton.click();
     Thread.sleep(1000);
     operatingRoomProcedures_page_.takeOfTablepageAddButton.click();
        Thread.sleep(1000);
    }

    @And("User selects the GUNUBIRLIK KADIN HAST.VE DOGUM SERVISI Service")
    public void userSelectsTheGUNUBIRLIKKADINHASTVEDOGUMSERVISIService() throws InterruptedException {
        operatingRoomProcedures_page_.poupServisNameButton.click();
        operatingRoomProcedures_page_.poupServisNameButton.sendKeys("kadın"+Keys.ENTER);
        Thread.sleep(1000);
        operatingRoomProcedures_page_.poupKadınDogumServiceButton.click();
    }

    @And("User verifies GUNUBIRLIK KADIN HAST.VE DOGUM SERVISI that the patient has been added to the list")
    public void userVerifiesGUNUBIRLIKKADINHASTVEDOGUMSERVISIThatThePatientHasBeenAddedToTheList() throws InterruptedException {
        Assertion assertion = new Assertion();
        Assert.assertEquals("GÜNÜBİRLİK KADIN HAST.VE DOĞUM SERVİSİ", operatingRoomProcedures_page_.homePageServiceName.getText());
        org.junit.Assert.assertEquals("GÜNÜBİRLİK KADIN HAST.VE DOĞUM SERVİSİ", false);
        Thread.sleep(2000);

    }


    @Given("User selects patient ilyas")
    public void userSelectsPatientIlyas() {
        operatingRoomProcedures_page_.selectilyas.click();
    }
}



