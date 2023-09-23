package stepdefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CreateSurgeryList_Page;

import java.text.ParseException;

public class CreateSurgeryList_StepDefinitions {



    CreateSurgeryList_Page createSurgeryList_Page = new CreateSurgeryList_Page();

    @Given("The user clicks on Operating Room Operations   Page")
    public void theUserClicksOnOperatingRoomOperationsPage() {
        createSurgeryList_Page.clickPatientProceduresTitle();
    }

    @And("The user clicks on Creating a Surgery List Page")
    public void theUserClicksOnCreatingASurgeryListPage() {
        createSurgeryList_Page.clickCreatingASurgeryListTitle();
    }

    @And("The user selects a service on Surgery List Page")
    public void theUserSelectsAServiceOnSurgeryListPage() {
        createSurgeryList_Page.clickService();
    }

    @And("The user selects an appointment date on Surgery List Page")
    public void theUserSelectsAnAppointmentDateOnSurgeryListPage() {
        createSurgeryList_Page.selectAppointmentDate();
    }

    @And("register a patient with Protocol no on Surgery List Page")
    public void registerAPatientWithProtocolNoOnSurgeryListPage() throws InterruptedException {
        createSurgeryList_Page.registerPatientWithProtocolNo();
    }

    @And("The user selects a patient on Surgery List Page")
    public void theUserSelectsAPatientOnSurgeryListPage() {
        createSurgeryList_Page.selectAPatient();
    }

    @And("The user adds a hall on Surgery List Page")
    public void theUserAddsAHallOnSurgeryListPage() {
        createSurgeryList_Page.addsHall();
    }


    @And("The user adds the patient to  the hall on Surgery List Page")
    public void theUserAddsThePatientToTheHallOnSurgeryListPage() {
        createSurgeryList_Page.addsPatientToHall();
    }


    @And("The user adds a surgery team on Surgery List Page")
    public void theUserAddsASurgeryTeamOnSurgeryListPage() {
        createSurgeryList_Page.addsSurgeryTeam();
    }

    @And("The user selects surgery time on Surgery List Page")
    public void theUserSelectsSurgeryTimeOnSurgeryListPage() {
        createSurgeryList_Page.selectSurgeryTime();
    }

    @And("The user adds a  surgery on Surgery List Page")
    public void theUserAddsASurgeryOnSurgeryListPage() {
        createSurgeryList_Page.addsSurgery();
    }

    @And("The user selects a surgical team leader on Surgery List Page")
    public void theUserSelectsASurgicalTeamLeaderOnSurgeryListPage() {
        createSurgeryList_Page.selectSurgicalTeamLeader();
    }

    @And("The user adds an anesthesia team on Surgery List Page")
    public void theUserAddsAnAnesthesiaTeamOnSurgeryListPage() {
        createSurgeryList_Page.addAnesthesiaTeam();
    }

    @And("The user selects an anesthesia team leader on Surgery List Page")
    public void theUserSelectsAnAnesthesiaTeamLeaderOnSurgeryListPage() {
        createSurgeryList_Page.selectAnesthesiaTeamLeader();
    }

    @And("The user sends the operating room Report on Surgery List Page")
    public void theUserSendsTheOperatingRoomReportOnSurgeryListPage() {
        createSurgeryList_Page.sendOperatingRoomReport();
    }

    @And("The user can cancel  the approved surgery on Surgery List Page.")
    public void theUserCanCancelTheApprovedSurgeryOnSurgeryListPage() {
        createSurgeryList_Page.cancelApprovedSurgery();
    }

    @Then("The user verifies that the approved surgery is canceled on Surgery List Page.")
    public void theUserVerifiesThatTheApprovedSurgeryIsCanceledOnSurgeryListPage() {
        createSurgeryList_Page.verifyApprovedSurgeryCanceled();
    }


    @Then("A pop up alert should appear for the past date on Surgery List Page")
    public void aPopUpAlertShouldAppearForThePastDateOnSurgeryListPage() {
        createSurgeryList_Page.checkRequestDate();
    }

    @Then("The user cannot add a patient to a hall on Surgery List Page")
    public void theUserCannotAddAPatientToAHallOnSurgeryListPage() {
        createSurgeryList_Page.verifyPatientCannotAddToHall();
    }


    @And("The user adds another patient to  the hall on Surgery List Page")
    public void theUserAddsAnotherPatientToTheHallOnSurgeryListPage() {
        createSurgeryList_Page.addsAnotherPatientToHall();
    }


    @And("The user selects another patient on Surgery List Page")
    public void theUserSelectsAnotherPatientOnSurgeryListPage() {
        createSurgeryList_Page.selectAnotherPatient();
    }


    @Given("The user enters  {string} as a surgery time on Surgery List Page")
    public void the_user_enters_as_a_surgery_time_on_surgery_list_page(String string) {
        createSurgeryList_Page.enterSurgeryTime(string);
    }


    @And("The user adds  {string} hall on Surgery List Page")
    public void theUserAddsHallOnSurgeryListPage(String string) {
        createSurgeryList_Page.addAnyHall(string);
    }

    @And("The user adds the same patient to  the hall on Surgery List Page")
    public void theUserAddsTheSamePatientToTheHallOnSurgeryListPage() {
        createSurgeryList_Page.addsTheSamePatientToTheHall();
    }

    @Then("More than one hall should not be seen on Surgery List Page")
    public void moreThanOneHallShouldNotBeSeenOnSurgeryListPage() {
        createSurgeryList_Page.verifyMoreThanOneHall();
    }


    @Then("Only one patient should be added to a hall on Surgery List Page.")
    public void onlyOnePatientShouldBeAddedToAHallOnSurgeryListPage() {
        createSurgeryList_Page.verifyPatientMoreThanOneHall();
    }


    @And("The user change {string}  the hall {string} with the hall {string} on Surgery List Page")
    public void theUserChangeTheHallWithTheHallOnSurgeryListPage(String text, String hall1, String hall2) {
        createSurgeryList_Page.changeTheHallWithTheOtherHall(text, hall1, hall2);
    }

    @Then("The user verifies {string} is empty and  {string} has a patient on Surgery List Page")
    public void the_user_verifies_is_empty_and_has_a_patient_on_surgery_list_page(String hall1, String hall2) {
        createSurgeryList_Page.verifyWherePatient(hall1, hall2);
    }

    @Then("Any service should be selected on  Surgery List Page")
    public void anyServiceShouldBeSelectedOnSurgeryListPage() throws InterruptedException {
        createSurgeryList_Page.selectAnyService();
    }

    @Then("The option to postpone the surgery should not be displayed in the transactions section")
    public void theOptionToPostponeTheSurgeryShouldNotBeDisplayedInTheTransactionsSection() {
        createSurgeryList_Page.optionToPostponeNotDisplayed();
    }


    @Then("Surgery List should not be created on Surgery List Page")
    public void surgeryListShouldNotBeCreatedOnSurgeryListPage() {
        createSurgeryList_Page.surgeryListNotBeCreated();
    }

    @And("The user selects an appointment date on a Public Holiday day  {string} on Surgery List Page")
    public void theUserSelectsAnAppointmentDateOnAPublicHolidayDayOnSurgeryListPage(String date) {

        createSurgeryList_Page.selectAppointmentOnPublicHoliday(date);
    }

    @Then("The user can cancel the hall on Surgery List Page")
    public void theUserCanCancelTheHallOnSurgeryListPage() {
        createSurgeryList_Page.cancelTheHall();
    }

    @And("The user selects an appointment date {string} on Surgery List Page")
    public void theUserSelectsAnAppointmentDateOnSurgeryListPage(String date) {
        createSurgeryList_Page.enterAppointmentDate(date);
    }

    @And("The user selects a service {string} on Surgery List Page")
    public void theUserSelectsAServiceOnSurgeryListPage(String service) {
        createSurgeryList_Page.selectService(service);

    }

    @And("The user selects a patient {string} on Surgery List Page")
    public void theUserSelectsAPatientOnSurgeryListPage(String patient) {
        createSurgeryList_Page.selectPatientWithText(patient);
    }

    @And("The user adds the patient {string} to  the hall on Surgery List Page")
    public void theUserAddsThePatientToTheHallOnSurgeryListPage(String patient) {
        createSurgeryList_Page.addPatientWithText(patient);
    }

    @Then("Surgery List should be created on Surgery List Page")
    public void surgeryListShouldBeCreatedOnSurgeryListPage() {
        createSurgeryList_Page.surgeryListCreated();
    }


    @Given("The user selects a past appointment date {string} on Surgery List Page")
    public void the_user_selects_a_past_appointment_date_on_surgery_list_page(String requestDate) throws ParseException {
        createSurgeryList_Page.selectAppointmentDateForThePastAndTheFuture(requestDate);
    }


    @When("User clicks on Surgery appointment procedures")
    public void userClicksOnSurgeryAppointmentProcedures() {

        createSurgeryList_Page.SurgeryAppointmentProcedures();


    }


    @And("User clicks on th e New Appointment tab")
    public void userClicksOnThENewAppointmentTab() {
        createSurgeryList_Page.ClicksOnThENewAppointmentTab();
    }


    @And("User enters Appointment Date")
    public void userEntersAppointmentDate() {
        createSurgeryList_Page.EntersAppointmentDate();
    }


    @And("User enters Protocol no.")
    public void userEntersProtocolNo() {
        createSurgeryList_Page.EntersProtocolNo();
    }

    @And("User cliks patient no")
    public void userCliksPatientNo() {
        createSurgeryList_Page.CliksPatientNo();
    }

    @And("User enters Surgery")
    public void userEntersSurgery() {
        createSurgeryList_Page.EntersSurgery();
    }

    @And("User clicks clocks")
    public void userClicksClocks() {
        createSurgeryList_Page.ClicksClocks();
    }

    @And("User enters plan time")
    public void userEntersPlanTime() {
        createSurgeryList_Page.EntersPlanTime();
    }

    @And("User presses the save button")
    public void userPressesTheSaveButton() {
    }


    @And("User Operation goes to list creation")
    public void userOperationGoesToListCreation() {
    }

    @And("User enters date from Appointment Patients Section")
    public void userEntersDateFromAppointmentPatientsSection() {
    }

    @And("User verifies the Saved Patient")
    public void userVerifiesTheSavedPatient() {
    }
    //*************************************************


    @When("User clicks on Patient transactions")
    public void userClicksOnPatientTransactions() {
        createSurgeryList_Page.ClicksOnPatientTransactions();


    }

    @And("The user clicks on Operation")
    public void theUserClicksOnOperation() {
        createSurgeryList_Page.ClicksOnOperation();
    }

    @And("User clicks to create an operation list")
    public void userClicksToCreateAnOperationList() {
        createSurgeryList_Page.ClicksToCreateAnOperationList();
    }


    @And("User Selects Date from Appointment Patients section")
    public void userSelectsDateFromAppointmentPatientsSection() {
        createSurgeryList_Page.DateFromAppointmentPatientsSection();
    }


    @And("User Selects Service")
    public void userSelectsService() {
        createSurgeryList_Page.SelectsService();


    }


    @And("User adds new hall")
    public void userAddsNewHall() {
        createSurgeryList_Page.clickNewHall();
    }


    @And("User double clicks on Patient")
    public void userDoubleClicksOnPatient() {
        createSurgeryList_Page.DoubleClicksOnPatient();

    }

    @And("The user clicks on the operations tab")
    public void theUserClicksOnTheOperationsTab() {
        createSurgeryList_Page.UserClicksOnTheOperationsTab();

    }


    @And("User Verifies Patient's Arrival")
    public void userVerifiesPatientSArrival() {

        createSurgeryList_Page.VerifiesPatientSArrival();

    }
//*************************************************


    @And("the user clicks devam edilsinmi popup")
    public void theUserClicksDevamEdilsinmiPopup() {
        createSurgeryList_Page.UserClicksDevamEdilsinmiPopup();
    }

    @And("User Selects  {string}Hall")
    public void userSelectsHall(String string) {
        createSurgeryList_Page.UserSelectsHall(string);

    }

    @And("User Selects a hall")
    public void userSelectsAHall() {
        createSurgeryList_Page.addSelectsAHall();
    }

    @And("User clicks operations button")
    public void userClicksOperationsButton() {
        createSurgeryList_Page.ClicksOperationsButton();
    }

    @And("User clicks islemler masadan cikar")
    public void userClicksIslemlerMasadanCikar() {
        createSurgeryList_Page.ClicksIslemlerMasadanCikar();
    }

    @And("User clicks uyari popup evet butonuna")
    public void userClicksUyariPopupEvetButonuna() {
        createSurgeryList_Page.ClicksUyariPopupEvetButonuna();

    }

    @And("thr user clicks masadan cikar  ekle button tab")
    public void thrUserClicksMasadanCikarEkleButtonTab() {
        createSurgeryList_Page.UserClicksMasadanCikarEkleButtonTab();

    }

    @And("User verifies ameliyat edilecek hasta listesi")
    public void userVerifiesAmeliyatEdilecekHastaListesi() {
        createSurgeryList_Page.VerifiesAmeliyatEdilecekHastaListesi();

    }

    @And("The user clicks on Operating Room Procedures   Page")
    public void theUserClicksOnOperatingRoomProceduresPage() {
        createSurgeryList_Page.ClicksOnOperatingRoomProceduresPage();
    }


    @And("User clicks on the Cancel Hall button")
    public void userClicksOnTheCancelHallButton() {
        createSurgeryList_Page.ClicksOnUserCancelHall();
    }

    @And("User Hall gives consent to the popup whether to be cancelled")
    public void userHallGivesConsentToThePopupWhetherToBeCancelled() {
        createSurgeryList_Page.HallGivesConsentToThePopupWhetherToBeCancelled();
    }

    @And("User confirms hall cancellation")
    public void userConfirmsHallCancellation() {
        createSurgeryList_Page.ConfirmsHallCancellation();
    }

    @And("User clicks on Hall operations")
    public void userClicksOnHallOperations() {
        createSurgeryList_Page.ClicksOnHallOperations();
    }


    @And("User selects a different hall")
    public void userSelectsADifferentHall() {
        createSurgeryList_Page.SelectsADifferentHall();

    }

    @And("User Salon Change secer")
    public void userSalonChangeSecer() {
        createSurgeryList_Page.UserSalonChangeSecer();
    }


    @And("User gives consent from the Warning tab")
    public void userGivesConsentFromTheWarningTab() {

        createSurgeryList_Page.UserGivesConsentFromTheWarningTab();
    }

    @And("The user confirms that the patient's Hall has changed")
    public void theUserConfirmsThatThePatientSHallHasChanged() {
        createSurgeryList_Page.theUserConfirmsThatThePatientSHallHasChanged();
    }

    @And("User clicks Add {string} lounge")
    public void userClicksAddLounge(String string) {
        createSurgeryList_Page.ClicksAddLounge(string);

    }

    @And("The User clicks the refresh button")
    public void theUserClicksTheRefreshButton() {
        createSurgeryList_Page.ClicksTheRefreshButton();
    }

    @Then("Rollback all steps taken on Surgery List Page")
    public void rollbackAllStepsTakenOnSurgeryListPage() {
        createSurgeryList_Page.rollbackAllSteps();
    }

    @Then("Surgery List should not be created because of more than one operation on Surgery List Page")
    public void surgeryListShouldNotBeCreatedBecauseOfMoreThanOneOperationOnSurgeryListPage() {
        createSurgeryList_Page.patientNotMoreThanOneOperation();
    }


    @Then("The user verifies {string} is empty, {string} has a patient and rollback all steps on Surgery List Page")
    public void theUserVerifiesIsEmptyHasAPatientAndRollbackAllStepsOnSurgeryListPage(String hall1, String hall2) {
        createSurgeryList_Page.verifyWherePatientRollback(hall1, hall2);
    }

    @Then("Surgery List should be created outpatients on Surgery List Page")
    public void surgeryListShouldBeCreatedOutpatientsOnSurgeryListPage() {
        createSurgeryList_Page.surgeryListShouldBeCreatedOutpatients();
    }
    @And("Check if there are any hall or patient on the table on Surgery List Page")
    public void checkIfThereAreAnyHallOrPatientOnTheTableOnSurgeryListPage() {
        createSurgeryList_Page.checkIfAnyHallOnTheTable();
    }
}





































