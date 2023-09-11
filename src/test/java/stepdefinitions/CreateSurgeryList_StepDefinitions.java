package stepdefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.CreateSurgeryList_Page;

import java.text.ParseException;

public class CreateSurgeryList_StepDefinitions {





    //  Select select=new Select();
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
    public void theUserSelectsAServiceOnSurgeryListPage() throws InterruptedException {
        createSurgeryList_Page.clickService();
    }

    @And("The user selects an appointment date on Surgery List Page")
    public void theUserSelectsAnAppointmentDateOnSurgeryListPage() throws InterruptedException {
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
    public void theUserAddsAHallOnSurgeryListPage() throws InterruptedException {
        createSurgeryList_Page.addsHall();
    }


    @And("The user adds the patient to  the hall on Surgery List Page")
    public void theUserAddsThePatientToTheHallOnSurgeryListPage() throws InterruptedException {
        createSurgeryList_Page.addsPatientToHall();
    }



    @And("The user adds a surgery team on Surgery List Page")
    public void theUserAddsASurgeryTeamOnSurgeryListPage() {
        createSurgeryList_Page.addsSurgeryTeam();
    }

    @And("The user selects surgery time on Surgery List Page")
    public void theUserSelectsSurgeryTimeOnSurgeryListPage() throws InterruptedException {
        createSurgeryList_Page.selectSurgeryTime();
    }

    @And("The user adds a  surgery on Surgery List Page")
    public void theUserAddsASurgeryOnSurgeryListPage() {
        createSurgeryList_Page.addsSurgery();
    }

    @And("The user selects a surgical team leader on Surgery List Page")
    public void theUserSelectsASurgicalTeamLeaderOnSurgeryListPage() throws InterruptedException {
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
    public void theUserSendsTheOperatingRoomReportOnSurgeryListPage() throws InterruptedException {
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
    public void the_user_enters_as_a_surgery_time_on_surgery_list_page(String string) throws InterruptedException {
        createSurgeryList_Page.enterSurgeryTime(string);
    }


    @And("The user adds  {string} hall on Surgery List Page")
    public void theUserAddsHallOnSurgeryListPage(String string) throws InterruptedException {
        createSurgeryList_Page.addAnyHall(string);
    }

    @And("The user adds the same patient to  the hall on Surgery List Page")
    public void theUserAddsTheSamePatientToTheHallOnSurgeryListPage() throws InterruptedException {
        createSurgeryList_Page.addsTheSamePatientToTheHall();
    }

    @Then("More than one hall should not be seen on Surgery List Page")
    public void moreThanOneHallShouldNotBeSeenOnSurgeryListPage() {
        createSurgeryList_Page.verifyMoreThanOneHall();
    }


    @Then("Only one patient should be added to a hall on Surgery List Page.")
    public void onlyOnePatientShouldBeAddedToAHallOnSurgeryListPage() throws InterruptedException {
        createSurgeryList_Page.verifyPatientMoreThanOneHall();
    }


    @And("The user change {string}  the hall {string} with the hall {string} on Surgery List Page")
    public void theUserChangeTheHallWithTheHallOnSurgeryListPage(String text, String hall1, String hall2) throws InterruptedException {
        createSurgeryList_Page.changeTheHallWithTheOtherHall(text,hall1,hall2);
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
    public void theOptionToPostponeTheSurgeryShouldNotBeDisplayedInTheTransactionsSection() throws InterruptedException {
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
    public void theUserCanCancelTheHallOnSurgeryListPage() throws InterruptedException {
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
    public void theUserSelectsAPatientOnSurgeryListPage(String patient) throws InterruptedException {
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


}





































