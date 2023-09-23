package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import pages.SurgeryAppointment_Page;
import utilities.Driver;
import utilities.ReusableMethods;

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


    //todo EYUP

    Actions actions = new Actions(Driver.getDriver());

    @Then("appointment postponement click")
    public void appointment_postponement_click() {
        sap.randevuErtele.click();
    }
    @Then("Check the surgery appointment page")
    public void check_the_surgery_appointment_page() {
        Assert.assertTrue(sap.ameliyetRandevuErtelemePop.isDisplayed());
    }

    @Then("choose the reason for procrastination")
    public void choose_the_reason_for_procrastination() {
        Select select = new Select(sap.reasonPostpone);
        select.selectByIndex(1);
    }

    @Then("click on the refresh button")
    public void click_on_the_refresh_button() {
        sap.click_on_the_refresh_button();

    }



    @Given("click the delete appointment button")
    public void click_the_delete_appointment_button() {
        sap.click_the_delete_appointment_button();
    }

    @Given("click the fix appointment button")
    public void click_the_fix_appointment_button() {
        sap.apptEdit_button.click();
    }

    @Given("refresh page")
    public void refresh_page() {
        ReusableMethods.waitFor(2);
        sap.yenileButton.click();
    }

    @And("select the start date {string}")
    public void selectTheStartDate(String arg0) {
        sap.selectTheStartDate(arg0);
    }

    @And("select the end date {string}")
    public void selectTheEndDate(String arg0) {
        sap.selectTheEndDate(arg0);
    }

    @And("click patient settings button")
    public void clickPatientSettingsButton() {
        sap.clickPatientSettingsButton();
    }

    @And("search the protocol number {string}")
    public void searchTheProtocolNumber(String arg0) {
        sap.searchTheProtocolNumber(arg0);
    }

    @And("click on refresh button main")
    public void clickOnRefreshButtonMain() {
        sap.clickOnRefreshButtonMain();
    }

    @And("select the postpone date {string}")
    public void selectThePostponeDate(String arg0) {
        sap.selectThePostponeDate(arg0);
    }

    @Then("assert the appointment date {string}")
    public void assertTheAppointmentDate(String arg0) {
        sap.assertTheAppointmentDate(arg0);
    }

    @And("create new unit {string} {string}")
    public void createNewUnit(String code, String capacity) {
        sap.createNewUnit(code,capacity);

    }

    @And("delete a unit {string}")
    public void deleteAUnit(String code) {
        sap.deleteAUnit(code);
    }

    @And("close unit popUp edit page")
    public void closeUnitPopUpEditPage() {
        sap.closeUnitPopUpEditPage();
    }

    @When("create a new appointment")
    public void createANewAppointment(DataTable dataTable) {
        sap.createANewAppointment(dataTable);
    }

    @And("select cancel reason {string}")
    public void selectCancelReason(String arg0) {
        sap.selectCancelReason(arg0);
    }

    @And("click check box cancel appointment")
    public void clickCheckBoxCancelAppointment() {
        sap.clickCheckBoxCancelAppointment();
    }

    @And("assert the appointment title {string}")
    public void assertTheAppointmentTitle(String arg0) {
        sap.assertTheAppointmentTitle(arg0);
    }

    @And("add a postpone description {string}")
    public void addAPostponeDescription(String arg0) {
        sap.addAPostponeDescription(arg0);
    }

    @And("add a cancel description {string}")
    public void addACancelDescription(String arg0) {
        sap.addACancelDescription(arg0);
    }

    @And("select the surgery decision date and time {string}")
    public void selectTheSurgeryDecisionDateAndTime(String arg0) {
        sap.selectTheSurgeryDecisionDateAndTime(arg0);
    }

    @And("assert the surgery decision date and time {string}")
    public void assertTheSurgeryDecisionDateAndTime(String arg0) {
        sap.assertTheSurgeryDecisionDateAndTime(arg0);
    }

    @And("change the appointment number {string}")
    public void changeTheAppointmentNumber(String arg0) {
        sap.changeTheAppointmentNumber(arg0);
    }

    @And("assert the appointment number {string}")
    public void assertTheAppointmentNumber(String arg0) {
        sap.assertTheAppointmentNumber(arg0);
    }

    @And("select the second surgery {string}")
    public void selectTheSecondSurgery(String arg0) {
        sap.selectTheSecondSurgery(arg0);
    }

    @And("select the type of anesthesia {string}")
    public void selectTheTypeOfAnesthesia(String arg0) {
        sap.selectTheTypeOfAnesthesia(arg0);
    }

    @And("select the side {string}")
    public void selectTheSide(String arg0) {
        sap.selectTheSide(arg0);
    }

    @And("change the service date {string}")
    public void changeTheServiceDate(String arg0) {
        sap.changeTheServiceDate(arg0);
    }

    @And("add edit phone numbers {string} {string}")
    public void addEditPhoneNumbers(String phone1, String phone2) {
        sap.addEditPhoneNumbers(phone1,phone2);
    }

    @And("select group {string}")
    public void selectGroup(String arg0) {
        sap.selectGroup(arg0);
    }

    @And("select saloon {string}")
    public void selectSaloon(String arg0) {
        sap.selectSaloon(arg0);

    }

    @And("enter room no {string}")
    public void enterRoomNo(String arg0) {
        sap.enterRoomNo(arg0);
    }

    @And("change the doctor {string}")
    public void changeTheDoctor(String arg0) {
        sap.changeTheDoctor(arg0);
    }

    @And("enter surgery duration minute {string}")
    public void enterSurgeryDurationMinute(String arg0) {
        sap.enterSurgeryDurationMinute(arg0);
    }

    @And("enter description of appointment {string}")
    public void enterDescriptionOfAppointment(String arg0) {
        sap.enterDescriptionOfAppointment(arg0);
    }

    @And("assert the second surgery {string}")
    public void assertTheSecondSurgery(String arg0) {
    sap.assertTheSecondSurgery(arg0);
    }

    @And("assert the illness {string}")
    public void assertTheIllness(String arg0) {
        sap.assertTheIllness(arg0);
    }

    @And("assert the type of anesthesia {string}")
    public void assertTheTypeOfAnesthesia(String arg0) {
        sap.assertTheTypeOfAnesthesia(arg0);
    }

    @And("assert the side {string}")
    public void assertTheSide(String arg0) {
        sap.assertTheSide(arg0);
    }

    @And("assert the service date {string}")
    public void assertTheServiceDate(String arg0) {
        sap.assertTheServiceDate(arg0);
    }

    @And("assert phone numbers {string} {string}")
    public void assertPhoneNumbers(String phone1, String phone2) {
        sap.assertPhoneNumbers(phone1,phone2);
    }

    @And("assert group {string}")
    public void assertGroup(String arg0) {
        sap.assertGroup(arg0);
    }

    @And("assert saloon {string}")
    public void assertSaloon(String arg0) {
        sap.assertSaloon(arg0);
    }

    @And("assert room no {string}")
    public void assertRoomNo(String arg0) {
        sap.assertRoomNo(arg0);
    }

    @And("assert the doctor {string}")
    public void assertTheDoctor(String arg0) {
        sap.assertTheDoctor(arg0);
    }

    @And("assert appointment time {string}")
    public void assertAppointmentTime(String arg0) {
        sap.assertAppointmentTime(arg0);
    }

    @And("assert surgery duration minute {string}")
    public void assertSurgeryDurationMinute(String arg0) {
        sap.assertSurgeryDurationMinute(arg0);
    }

    @And("assert description of appointment {string}")
    public void assertDescriptionOfAppointment(String arg0) {
        sap.assertDescriptionOfAppointment(arg0);
    }

    @And("click clear button")
    public void clickClearButton() {
        sap.clickClearButton();
    }

    @And("assert the patient in the appointment list {string}")
    public void assertThePatientInTheAppointmentList(String arg0) {
        sap.assertThePatientInTheAppointmentList(arg0);
    }

    @And("click on the cancel appointment button")
    public void clickOnTheCancelAppointmentButton() {
        sap.clickOnTheCancelAppointmentButton();
    }

    @And("delete if")
    public void deleteIf() {
        sap.deleteIf();
    }

    @And("delete patient appt if protocol {string}")
    public void deletePatientApptIfProtocol(String protocol) {
        sap.deletePatientApptIfProtocol(protocol);
    }

    @And("delete unit if unit code {string}")
    public void deleteUnitIfUnitCode(String unitCode) {
        sap.deleteUnitIfUnitCode(unitCode);
    }


    @And("delete patient group if branch name {string}")
    public void deletePatientGroupIfBranchName(String branchName) {
        sap.deletePatientGroupIfBranchName(branchName);
    }

    @And("delete reason if reason is {string}")
    public void deleteReasonIfReasonIs(String arg0) {
        sap.deleteReasonIfReasonIs(arg0);
    }
}

