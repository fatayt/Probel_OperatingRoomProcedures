package stepdefinitions;


import com.github.javafaker.Faker;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.BasePage;
import pages.Login_Page;
import pages.SurgeryList_Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.text.ParseException;
import java.time.LocalDate;

public class SurgeryList_StepDefinitions {

    BasePage basePage = new BasePage();


    Faker faker = new Faker();
    //  Select select=new Select();
    SurgeryList_Page surgeryList_Page = new SurgeryList_Page();

    @Given("The user clicks on Operating Room Operations   Page")
    public void theUserClicksOnOperatingRoomOperationsPage() {
        surgeryList_Page.clickPatientProceduresTitle();
    }

    @And("The user clicks on Creating a Surgery List Page")
    public void theUserClicksOnCreatingASurgeryListPage() {
        surgeryList_Page.clickCreatingASurgeryListTitle();
    }

    @And("The user selects a service on Surgery List Page")
    public void theUserSelectsAServiceOnSurgeryListPage() throws InterruptedException {
        surgeryList_Page.clickService();
    }

    @And("The user selects an appointment date on Surgery List Page")
    public void theUserSelectsAnAppointmentDateOnSurgeryListPage() throws InterruptedException {
        surgeryList_Page.selectAppointmentDate();
    }

    @And("register a patient with Protocol no on Surgery List Page")
    public void registerAPatientWithProtocolNoOnSurgeryListPage() throws InterruptedException {
        surgeryList_Page.registerPatientWithProtocolNo();
    }
    @And("The user selects a patient on Surgery List Page")
    public void theUserSelectsAPatientOnSurgeryListPage() {
        surgeryList_Page.selectAPatient();
    }

    @And("The user adds a hall on Surgery List Page")
    public void theUserAddsAHallOnSurgeryListPage() throws InterruptedException {
        surgeryList_Page.addsHall();
    }


    @And("The user adds the patient to  the hall on Surgery List Page")
    public void theUserAddsThePatientToTheHallOnSurgeryListPage() throws InterruptedException {
        surgeryList_Page.addsPatientToHall();
    }



    @And("The user adds a surgery team on Surgery List Page")
    public void theUserAddsASurgeryTeamOnSurgeryListPage() {
        surgeryList_Page.addsSurgeryTeam();
    }

    @And("The user selects surgery time on Surgery List Page")
    public void theUserSelectsSurgeryTimeOnSurgeryListPage() throws InterruptedException {
        surgeryList_Page.selectSurgeryTime();
    }

    @And("The user adds a  surgery on Surgery List Page")
    public void theUserAddsASurgeryOnSurgeryListPage() {
        surgeryList_Page.addsSurgery();
    }

    @And("The user selects a surgical team leader on Surgery List Page")
    public void theUserSelectsASurgicalTeamLeaderOnSurgeryListPage() throws InterruptedException {
        surgeryList_Page.selectSurgicalTeamLeader();
    }

    @And("The user adds an anesthesia team on Surgery List Page")
    public void theUserAddsAnAnesthesiaTeamOnSurgeryListPage() {
        surgeryList_Page.addAnesthesiaTeam();
    }

    @And("The user selects an anesthesia team leader on Surgery List Page")
    public void theUserSelectsAnAnesthesiaTeamLeaderOnSurgeryListPage() {
        surgeryList_Page.selectAnesthesiaTeamLeader();
    }

    @And("The user sends the operating room Report on Surgery List Page")
    public void theUserSendsTheOperatingRoomReportOnSurgeryListPage() throws InterruptedException {
        surgeryList_Page.sendOperatingRoomReport();
    }

    @And("The user can cancel  the approved surgery on Surgery List Page.")
    public void theUserCanCancelTheApprovedSurgeryOnSurgeryListPage() {
        surgeryList_Page.cancelApprovedSurgery();
    }

    @Then("The user verifies that the approved surgery is canceled on Surgery List Page.")
    public void theUserVerifiesThatTheApprovedSurgeryIsCanceledOnSurgeryListPage() {
        surgeryList_Page.verifyApprovedSurgeryCanceled();
    }



    @Then("A pop up alert should appear for the past date on Surgery List Page")
    public void aPopUpAlertShouldAppearForThePastDateOnSurgeryListPage() {
        surgeryList_Page.checkRequestDate();
    }

    @Then("The user cannot add a patient to a hall on Surgery List Page")
    public void theUserCannotAddAPatientToAHallOnSurgeryListPage() {
        surgeryList_Page.verifyPatientCannotAddToHall();
    }


    @And("The user adds another patient to  the hall on Surgery List Page")
    public void theUserAddsAnotherPatientToTheHallOnSurgeryListPage() {
        surgeryList_Page.addsAnotherPatientToHall();
    }


    @And("The user selects another patient on Surgery List Page")
    public void theUserSelectsAnotherPatientOnSurgeryListPage() {
        surgeryList_Page.selectAnotherPatient();
    }


    @Given("The user enters  {string} as a surgery time on Surgery List Page")
    public void the_user_enters_as_a_surgery_time_on_surgery_list_page(String string) throws InterruptedException {
        surgeryList_Page.enterSurgeryTime(string);
    }


    @And("The user adds  {string} hall on Surgery List Page")
    public void theUserAddsHallOnSurgeryListPage(String string) throws InterruptedException {
        surgeryList_Page.addAnyHall(string);
    }

    @And("The user adds the same patient to  the hall on Surgery List Page")
    public void theUserAddsTheSamePatientToTheHallOnSurgeryListPage() throws InterruptedException {
        surgeryList_Page.addsTheSamePatientToTheHall();
    }

    @Then("More than one hall should not be seen on Surgery List Page")
    public void moreThanOneHallShouldNotBeSeenOnSurgeryListPage() {
        surgeryList_Page.verifyMoreThanOneHall();
    }


    @Then("Only one patient should be added to a hall on Surgery List Page.")
    public void onlyOnePatientShouldBeAddedToAHallOnSurgeryListPage() throws InterruptedException {
        surgeryList_Page.verifyPatientMoreThanOneHall();
    }


    @And("The user change {string}  the hall {string} with the hall {string} on Surgery List Page")
    public void theUserChangeTheHallWithTheHallOnSurgeryListPage(String text, String hall1, String hall2) throws InterruptedException {
        surgeryList_Page.changeTheHallWithTheOtherHall(text,hall1,hall2);
    }

    @Then("The user verifies {string} is empty and  {string} has a patient on Surgery List Page")
    public void the_user_verifies_is_empty_and_has_a_patient_on_surgery_list_page(String hall1, String hall2) {
        surgeryList_Page.verifyWherePatient(hall1, hall2);
    }

    @Then("Any service should be selected on  Surgery List Page")
    public void anyServiceShouldBeSelectedOnSurgeryListPage() throws InterruptedException {
        surgeryList_Page.selectAnyService();
    }

    @Then("The option to postpone the surgery should not be displayed in the transactions section")
    public void theOptionToPostponeTheSurgeryShouldNotBeDisplayedInTheTransactionsSection() throws InterruptedException {
        surgeryList_Page.optionToPostponeNotDisplayed();
    }


    @Then("Surgery List should not be created on Surgery List Page")
    public void surgeryListShouldNotBeCreatedOnSurgeryListPage() {
        surgeryList_Page.surgeryListNotBeCreated();
    }

    @And("The user selects an appointment date on a Public Holiday day  {string} on Surgery List Page")
    public void theUserSelectsAnAppointmentDateOnAPublicHolidayDayOnSurgeryListPage(String date) {

        surgeryList_Page.selectAppointmentOnPublicHoliday(date);
    }

    @Then("The user can cancel the hall on Surgery List Page")
    public void theUserCanCancelTheHallOnSurgeryListPage() {
        surgeryList_Page.cancelTheHall();
    }

    @And("The user selects an appointment date {string} on Surgery List Page")
    public void theUserSelectsAnAppointmentDateOnSurgeryListPage(String date) {
        surgeryList_Page.enterAppointmentDate(date);
    }

    @And("The user selects a service {string} on Surgery List Page")
    public void theUserSelectsAServiceOnSurgeryListPage(String service) {
        surgeryList_Page.selectService(service);

    }

    @And("The user selects a patient {string} on Surgery List Page")
    public void theUserSelectsAPatientOnSurgeryListPage(String patient) throws InterruptedException {
        surgeryList_Page.selectPatientWithText(patient);
    }

    @And("The user adds the patient {string} to  the hall on Surgery List Page")
    public void theUserAddsThePatientToTheHallOnSurgeryListPage(String patient) {
        surgeryList_Page.addPatientWithText(patient);
    }

    @Then("Surgery List should be created on Surgery List Page")
    public void surgeryListShouldBeCreatedOnSurgeryListPage() {
        surgeryList_Page.surgeryListCreated();
    }


    @Given("The user selects a past appointment date {string} on Surgery List Page")
    public void the_user_selects_a_past_appointment_date_on_surgery_list_page(String requestDate) throws ParseException {
        surgeryList_Page.selectAppointmentDateForThePastAndTheFuture(requestDate);
    }


}





































