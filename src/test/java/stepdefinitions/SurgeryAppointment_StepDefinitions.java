package stepdefinitions;

import io.cucumber.datatable.DataTable;
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

    @And("select the service code {string}")
    public void selectTheServiceCode(String arg0) {
        sap.selectTheServiceCode(arg0);
    }

    @Then("assert the new surgery service unit {string}")
    public void assertTheNewSurgeryServiceUnit(String arg0) {
        sap.assertTheNewSurgeryServiceUnit(arg0);
    }

    @And("click delete button")
    public void clickDeleteButton() {
        sap.clickDeleteButton();
    }

    @Then("assert the popup message {string}")
    public void assertThePopupMessage(String arg0) {
        sap.assertThePopupMessage(arg0);
    }

    @And("click new appointment button")
    public void clickNewAppointmentButton() {
        sap.clickNewAppointmentButton();
    }

    @And("click hours button")
    public void clickHoursButton() {
        sap.clickHoursButton();
    }

    @And("click group definitions button")
    public void clickGroupDefinitionsButton() {
        sap.clickGroupDefinitionsButton();
    }

    @And("enter the group name {string}")
    public void enterTheGroupName(String arg0) {
        sap.enterTheGroupName(arg0);
    }

    @And("click cancellation reason button")
    public void clickCancellationReasonButton() {
        sap.clickCancellationReasonButton();
    }

    @And("enter {string} to reason of cancellation box")
    public void enterToReasonOfCancellationBox(String arg0) {
        sap.enterToReasonOfCancellationBox(arg0);
    }

    @Then("assert the service was deleted {string}")
    public void assertTheServiceWasDeleted(String arg0) {
        sap.assertTheServiceWasDeleted(arg0);
    }

    @Then("assert the reason was deleted")
    public void assertTheReasonWasDeleted() {
    }

    @And("delete the reason of cancellation")
    public void deleteTheReasonOfCancellation() {
        sap.deleteTheReasonOfCancellation();
    }

    @Then("assert the new surgery service unit")
    public void assertTheNewSurgeryServiceUnit() {
    }


    @And("click save button")
    public void clickSaveButton() {
        sap.clickSaveButton();
    }

    @And("close the warning message")
    public void closeTheWarningMessage() {
        sap.closeTheWarningMessage();
    }

    @And("click yes button")
    public void clickYesButton() {
        sap.clickYesButton();
    }

    @And("click passive box")
    public void clickPassiveBox() {
        sap.clickPassiveBox();
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

    @Then("change and assert the new capacity number")
    public void changeAndAssertTheNewCapacityNumber(DataTable dataTable) {
        sap.changeAndAssertTheNewCapacityNumber(dataTable);
    }

    @And("select the surgery code {string}")
    public void selectTheSurgeryCode(String arg0) {
        sap.selectTheSurgeryCode(arg0);
    }

    @And("select appointment time {string}")
    public void selectAppointmentTime(String arg0) {
        sap.selectAppointmentTime(arg0);
    }

    @And("select the date {string}")
    public void selectTheDate(String arg0) {
        sap.selectTheDate(arg0);
    }

    @And("enter service code {string} to unit code box")
    public void enterServiceCodeToUnitCodeBox(String arg0) {
        sap.enterServiceCodeToUnitCodeBox(arg0);
    }

    @And("enter service code {string} to service code box")
    public void enterServiceCodeToServiceCodeBox(String arg0) {
        sap.enterServiceCodeToServiceCodeBox(arg0);
    }

    @And("enter the daily capacity {string}")
    public void enterTheDailyCapacity(String arg0) {
        sap.enterTheDailyCapacity(arg0);
    }

    @And("enter the protocol number {string}")
    public void enterTheProtocolNumber(String arg0) {
        sap.enterTheProtocolNumber(arg0);
    }

    @Then("assert the service can not be deleted {string}")
    public void assertTheServiceCanNotBeDeleted(String arg0) {
        sap.assertTheServiceCanNotBeDeleted(arg0);
    }

    @And("enter service code {string} to branch code box")
    public void enterServiceCodeToBranchCodeBox(String arg0) {
        sap.enterServiceCodeToBranchCodeBox(arg0);
    }

    @Then("assert the new group {string}")
    public void assertTheNewGroup(String arg0) {
        sap.assertTheNewGroup(arg0);
    }

    @And("enter group code {string} to group code box")
    public void enterGroupCodeToGroupCodeBox(String arg0) {
        sap.enterGroupCodeToGroupCodeBox(arg0);
    }

    @Then("edit the group name")
    public void editTheGroupName(DataTable dataTable) {
        sap.editTheGroupName(dataTable);
    }

    @Then("assert the reason {string}")
    public void assertTheReason(String arg0) {
        sap.assertTheReason(arg0);
    }

    @And("enter {string} to reason of cancellation search box")
    public void enterToReasonOfCancellationSearchBox(String arg0) {
        sap.enterToReasonOfCancellationSearchBox(arg0);
    }
}

