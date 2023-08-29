package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SurgeryAppointment_Page;
import utilities.Driver;

public class SurgeryAppointment_StepDefinitions {
    SurgeryAppointment_Page sap = new SurgeryAppointment_Page(Driver.getDriver());

    @When("click settings button")
    public void clickSettingsButton() {
        sap.clickSettingsButton();
    }

    @And("click unit definitions button")
    public void clickUnitDefinitionsButton() {
        sap.clickUnitDefinitionsButton();
    }

    @And("click new add button")
    public void clickNewAddButton() {
        sap.clickNewAddButton();
    }

    @And("click service button")
    public void clickServiceButton() {
        sap.clickServiceButton();
    }

    @And("enter {string} to service name box")
    public void enterToServiceNameBox(String arg0) {
        sap.enterToServiceNameBox(arg0);
    }

    @And("select the service code {int}")
    public void selectTheServiceCode(int arg0) {
        sap.selectTheServiceCode(arg0);
    }

    @And("enter the new daily capacity {int}")
    public void enterTheNewDailyCapacity(int arg0) {
        sap.enterTheNewDailyCapacity(arg0);
    }

    @Then("assert the new surgery service unit {int}")
    public void assertTheNewSurgeryServiceUnit(int arg0) {
        sap.assertTheNewSurgeryServiceUnit(arg0);
    }

    @And("click delete button")
    public void clickDeleteButton() {
    }

    @Then("assert the popup message {string}")
    public void assertThePopupMessage(String arg0) {
    }

    @And("click new appointment button")
    public void clickNewAppointmentButton() {
    }

    @And("click find patient button")
    public void clickFindPatientButton() {
    }

    @Then("assert the page of patient history")
    public void assertThePageOfPatientHistory() {
    }

    @And("enter the “k” in the name box")
    public void enterTheKInTheNameBox() {
    }

    @And("click on the first patient")
    public void clickOnTheFirstPatient() {
    }

    @Then("assert the patient history")
    public void assertThePatientHistory() {
    }

    @And("click the transfer button")
    public void clickTheTransferButton() {
    }

    @And("assert the patient at popup page")
    public void assertThePatientAtPopupPage() {
    }

    @And("click calendar")
    public void clickCalendar() {
    }

    @And("select the date")
    public void selectTheDate() {
    }

    @And("click first surgery button")
    public void clickFirstSurgeryButton() {
    }

    @And("select the surgery code {int}")
    public void selectTheSurgeryCode(int arg0) {
    }

    @And("click hours button")
    public void clickHoursButton() {
    }

    @And("select appointment time")
    public void selectAppointmentTime() {
    }

    @Then("assert appointment warning message {string}")
    public void assertAppointmentWarningMessage(String arg0) {
    }

    @And("click on the second patient")
    public void clickOnTheSecondPatient() {
    }


    @And("click group definitions button")
    public void clickGroupDefinitionsButton() {
    }

    @And("enter the group name {string}")
    public void enterTheGroupName(String arg0) {
    }

    @Then("assert the new group")
    public void assertTheNewGroup() {
    }

    @And("click settings button of group code {int}")
    public void clickSettingsButtonOfGroupCode(int arg0) {
    }

    @And("delete the group name")
    public void deleteTheGroupName() {
    }

    @And("click cancellation reason button")
    public void clickCancellationReasonButton() {
    }

    @And("enter {string} to reason of cancellation box")
    public void enterToReasonOfCancellationBox(String arg0) {
    }

    @Then("assert the service was deleted")
    public void assertTheServiceWasDeleted() {
    }

    @And("delete the reason {string}")
    public void deleteTheReason(String arg0) {
    }

    @Then("assert the reason was deleted")
    public void assertTheReasonWasDeleted() {
    }

    @Then("assert the reason")
    public void assertTheReason() {
    }

    @And("click settings button of reason {string}")
    public void clickSettingsButtonOfReason(String arg0) {
    }

    @And("delete the reason of cancellation")
    public void deleteTheReasonOfCancellation() {
    }

    @Then("assert the reason can not be created")
    public void assertTheReasonCanNotBeCreated() {
    }

    @Then("assert the new group can not be created")
    public void assertTheNewGroupCanNotBeCreated() {

    }


    @And("enter the new daily capacity {string}")
    public void enterTheNewDailyCapacity(String arg0) {
    }


    @And("delete the daily capacity")
    public void deleteTheDailyCapacity() {
        sap.deleteTheDailyCapacity();

    }

    @Then("assert the new surgery service unit")
    public void assertTheNewSurgeryServiceUnit() {
    }


    @And("click save button")
    public void clickSaveButton() {
        sap.clickSaveButton();
    }

    @And("click search")
    public void clickSearch() {
        sap.clickSearch();
    }

    @And("close the warning message")
    public void closeTheWarningMessage() {

    }

    @And("click yes button for delete")
    public void clickYesButtonForDelete() {
    }

    @And("click passive box")
    public void clickPassiveBox() {
    }

    @Then("assert the unit is passive")
    public void assertTheUnitIsPassive() {
    }

    @And("click active box")
    public void clickActiveBox() {
    }

    @Then("assert the unit is active")
    public void assertTheUnitIsActive() {
    }

    @Then("assert the warning message {string}")
    public void assertTheWarningMessage(String arg0) {
        sap.assertTheWarningMessage(arg0);
    }


    @And("click edit button")
    public void clickEditButton() {
        sap.clickEditButton();
    }

    @And("click settings button of service code {int}")
    public void clickSettingsButtonOfServiceCode(int arg0) {
    }

    @And("enter service code {int} to service code box")
    public void enterServiceCodeToServiceCodeBox(int arg0) {
        sap.enterServiceCodeToServiceCodeBox(arg0);
    }

    @Then("assert the new capacity number {string}")
    public void assertTheNewCapacityNumber(String arg0) {
        sap.assertTheNewCapacityNumber(arg0);
    }

    @When("go to home")
    public void goToHome() {
        sap.goToHome();
    }

    @And("eat something")
    public void eatSomething() {
    }
}

