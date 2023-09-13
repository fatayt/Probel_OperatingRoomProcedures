package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.DoctorOperatingRoomProcedures_Page;
import utilities.Driver;


public class DoctorOperatingRoomProcedures_StepDefinitions {

    DoctorOperatingRoomProcedures_Page dorp = new DoctorOperatingRoomProcedures_Page(Driver.getDriver());


    @Given("User clicks the close buttom")
    public void userClicksTheCloseButtom() {
        dorp.clickTheCloseButtom();
    }

    @Given("User enters the claim date {string}")
    public void userEntersTheClaimDate(String arg0) {
        dorp.enterTheClaimDate(arg0);
    }

    @And("User clicks select saloon button")
    public void userClicksSelectSaloonButton() {
        dorp.clickSelectSaloonButton();
    }

    @And("User clicks on patient information \\(name surname)")
    public void userClicksOnPatientInformationNameSurname() {
        dorp.clickOnPatientInformationNameSurname();
    }

    @And("User clicks add surgery button")
    public void userClicksAddSurgeryButton() {
        dorp.clickAddSurgeryButton();
    }

    @And("User clicks the select button of the surgery to be performed")
    public void userClicksTheSelectButtonOfTheSurgeryToBePerformed() {
        dorp.clickTheSelectButtonOfTheSurgeryToBePerformed();
    }

    @And("User chooses the direction of surgery {string}")
    public void userChoosesTheDirectionOfSurgery(String arg0) {
        dorp.chooseTheDirectionOfSurgery(arg0);
    }

    @And("User selects incision information {string}")
    public void userSelectsIncisionInformation(String arg0) {

        dorp.selectsIncisionInformation(arg0);
    }

    @And("User clicks select doctor button {string}")
    public void userClicksSelectDoctorButton(String arg0) {
        dorp.clickSelectDoctorButton(arg0);
    }

    @And("User clicks save button on add surgery screen")
    public void userClicksSaveButtonOnAddSurgeryScreen() {
        dorp.clickSaveButtonOnAddSurgeryScreen();
    }


    @Then("Verifies that the new surgery is added")
    public void verifiesThatTheNewSurgeryIsAdded() {
        dorp.verifiesThatTheNewSurgeryIsAdded();
    }

    @And("User clicks delete surgeries button")
    public void userClicksDeleteSurgeriesButton() {
        dorp.clickDeleteSurgeriesButton();
    }

    @And("User clicks yes button on continue popup")
    public void userClicksYesButtonOnContinuePopup() {
        dorp.clicksYesButtonOnContinuePopup();
    }

    @Then("Verifies that surgeries are deleted")
    public void verifiesThatSurgeriesAreDeleted() {
        dorp.verifiesThatSurgeriesAreDeleted();
    }

    @And("User clicks the trash icon of the operation will be deleted")
    public void userClicksTheTrashIconOfTheOperationWillBeDeleted() {
        dorp.clickTheTrashIconOfTheOperationWillBeDeleted();
    }


    @Then("Verifies that the surgery is deleted")
    public void verifiesThatTheSurgeryIsDeleted() {
        dorp.verifiesThatTheSurgeryIsDeleted();
    }


    @And("User clicks add diagnosis button")
    public void userClicksAddDiagnosisButton() {
        dorp.clickAddDiagnosisButton();
    }

    @And("User clicks on surgery name")
    public void userClicksOnSurgeryName() {
        dorp.clicksOnSurgeryName();
    }

    @And("User clicks detail surgery button")
    public void userClicksDetailSurgeryButton() {
        dorp.clicksDetailSurgeryButton();
    }

    @And("User selects diagnosis")
    public void userSelectsDiagnosis() {
        dorp.selectsDiagnosis();
    }

    @And("User clicks select and close button")
    public void userClicksSelectAndCloseButton() {
        dorp.clicksSelectAndCloseButton();
    }

    @And("User clicks save button on surgery details screen")
    public void userClicksSaveButtonOnSurgeryDetailsScreen() {
        dorp.clicksSaveButtonOnSurgeryDetailsScreen();
    }

    @Then("Verifies that new diagnosis is displayed")
    public void verifiesThatNewDiagnosisIsDisplayed() {
        dorp.verifiesThatNewDiagnosisIsDisplayed();
    }

    @And("User enters details")
    public void userEntersDetails() {
        dorp.entersDetails();
    }

    @Then("Verifies that new details are displayed")
    public void verifiesThatNewDetailsAreDisplayed() {
        dorp.verifiesThatNewDetailsAreDisplayed();
    }

    @And("User selects the doctor")
    public void userSelectsTheDoctor() {
        dorp.selectsTheDoctor();
    }

    @Then("Verifies that the doctor is added")
    public void verifiesThatTheDoctorIsAdded() {
        dorp.verifiesThatTheDoctorIsAdded();
    }

    @And("User clicks on the trash icon in the Anesthesia team section")
    public void userClicksOnTheTrashIconInTheAnesthesiaTeamSection() {
        dorp.clickOnTheTrashIconInTheSurgicalTeamSection();
    }

    @Then("Verifies that the surgical team is deleted")
    public void verifiesThatTheSurgicalTeamIsDeleted() {
    }


    @And("User clicks add doctor button on surgical team section")
    public void userClicksAddDoctorButtonOnSurgicalTeamSection() {
        dorp.clicksAddDoctorButtonOnSurgicalTeamSection();
    }

    @And("User clicks add doctor button on Anesthesia surgery team section")
    public void userClicksAddDoctorButtonOnAnesthesiaSurgeryTeamSection() {
        dorp.clickAddDoctorButtonOnAnesthesiaSurgeryTeamSection();
    }

    @And("User selects the anesthesia doctor")
    public void userSelectsTheAnesthesiaDoctor() {
        dorp.selectTheAnesthesiaDoctor();
    }

    @Then("Verifies that the anesthesia doctor is added")
    public void verifiesThatTheAnesthesiaDoctorIsAdded() {
        dorp.verifiesThatTheAnesthesiaDoctorIsAdded();
    }

    @And("User clicks on the trash icon in the Anesthesia surgery team section")
    public void userClicksOnTheTrashIconInTheAnesthesiaSurgeryTeamSection() {

    }

    @Then("Verifies that the Anesthesia surgery team is deleted")
    public void verifiesThatTheAnesthesiaSurgeryTeamIsDeleted() {

    }

    @And("User enters the surgery date")
    public void userEntersTheSurgeryDate() {


    }

    @And("User clicks the start session")
    public void userClicksTheStartSession() {
        dorp.clickTheStartSession();
    }

    @Then("Verifies that the warning messeage")
    public void verifiesThatTheWarningMesseage() {
    }

    @Then("Verifies that the warning messeage of You must choose the responsible person")
    public void verifiesThatTheWarningMesseageOfYouMustChooseTheResponsiblePerson() {
        dorp.verifiesThatTheWarningMesseageOfYouMustChooseTheResponsiblePerson();
    }

    @Then("Verifies that the warning messeage of Patient is not hospitalized")
    public void verifiesThatTheWarningMesseageOfPatientIsNotHospitalized() {
        dorp.verifiesThatTheWarningMesseageOfPatientIsNotHospitalized();
    }

    @Given("User clicks Postop")
    public void userClicksPostop() {
        dorp.clicksPostop();
    }

    @And("User clicks refresh button")
    public void userClicksRefreshButton() {
        dorp.clickRefreshButton();
    }

    @And("User clicks on send patient to service button")
    public void userClicksOnSendPatientToServiceButton() {
        dorp.clickOnSendPatientToServiceButton();
    }

    @Then("Verifies the patient's condition")
    public void verifiesThePatientSCondition() {
        dorp.verifiesThePatientSCondition();
    }

    @Then("Verifies that the patient's condition is displayed")
    public void verifiesThatThePatientSConditionIsDisplayed() {
        dorp.verifieThatThePatientSConditionIsDisplayed();
    }

    @Then("Verifies that the patient's saloon is displayed")
    public void verifiesThatThePatientSSaloonIsDisplayed() {
        dorp.verifieThatThePatientSSaloonIsDisplayed();
    }

    @Then("Verifies that the patient's service is displayed")
    public void verifiesThatThePatientSServiceIsDisplayed() {
        dorp.verifieThatThePatientSServiceIsDisplayed();
    }

    @Then("User displays the message of {string}")
    public void userDisplaysTheMessageOf(String arg0) {
        dorp.displayTheMessageOf(arg0);
    }

    @And("Verifies that the refresh button is working by viewing the patients")
    public void verifiesThatTheRefreshButtonIsWorkingByViewingThePatients() {
        dorp.verifiesThatTheRefreshButtonIsWorkingByViewingThePatients();
    }


    @And("User clicks Okey button")
    public void userClicksOkeyButton() {
        dorp.clickOkeyButton();
    }

    @And("User selects responsible doctor on surgical team")
    public void userSelectsResponsibleDoctorOnSurgicalTeam() {
        dorp.selectResponsibleDoctorOnSurgicalTeam();
    }

    @Given("User enters the claim date on Postop {string}")
    public void userEntersTheClaimDateOnPostop(String arg0) {
        dorp.enterTheClaimDateOnPostop(arg0);
    }

    @Then("Verifies that the patient's service code is displayed")
    public void verifiesThatThePatientSServiceCodeIsDisplayed() {
        dorp.verifiesThatThePatientSServiceCodeIsDisplayed();
    }

    @And("User chooses and clicks the patient")
    public void userChoosesAndClicksThePatient() {
        dorp.chooseAndClickThePatient();
    }


    @Then("Verify that only the selected doctor is deleted")
    public void verifyThatOnlyTheSelectedDoctorIsDeleted() {
        dorp.verifyThatOnlyTheSelectedDoctorIsDeleted();
    }

    @And("User clicks on the trash icon in the surgical team section")
    public void userClicksOnTheTrashIconInTheSurgicalTeamSection() {
        dorp.clicksOnTheTrashIconInTheSurgicalTeamSection();
    }

    @And("User clicks the trash icon for selected doctor")
    public void userClicksTheTrashIconForSelectedDoctor() {
        dorp.clicksTheTrashIconForSelectedDoctor();
    }

    @And("User clean the page")
    public void userCleanThePage() {
        dorp.cleanThePage();

    }

    @And("User cleans the page")
    public void userCleansThePage() {
        dorp.cleansThePage();
    }

    @And("User clicks refresh button on Doctor Operating Room Procedures page")
    public void userClicksRefreshButtonOnDoctorOperatingRoomProceduresPage() {
        dorp.clicksRefreshButtonOnDoctorOperatingRoomProceduresPage();
    }

    @Then("Verify that the selected doctor is deleted")
    public void verifyThatTheSelectedDoctorIsDeleted() {
        dorp.verifyThatTheSelectedDoctorIsDeleted();
    }

    @Then("Verifys that the message Goruntulenecek veri yok is not displayed")
    public void verifysThatTheMessageGoruntulenecekVeriYokIsNotDisplayed() {
        dorp.verifysThatTheMessageGörüntülenecekVeriYokIsNotDisplayed();
    }


    @And("User clicks select saloon button \\(saloon eight)")
    public void userClicksSelectSaloonButtonSaloonEight() {
        dorp.clicksSelectSaloonButtonSaloonEight();
    }

    @Then("Verifys that the surgical team^s doctor is deleted")
    public void verifysThatTheSurgicalTeamSDoctorIsDeleted() {
        dorp.verifysThatTheSurgicalTeamSDoctorIsDeleted();
    }

    @And("User clicks the sended service radio Button")
    public void userClicksTheSendedServiceRadioButton() {
        dorp.clicksTheSendedServiceRadioButton();
    }

    @Then("Verifies that the situation")
    public void verifiesThatTheSituation() {
        dorp.verifiesThatTheSituation();
    }

    @And("User selects the new doctor")
    public void userSelectsTheNewDoctor() {
        dorp.selectsTheNewDoctor();
    }

    @And("User clicks select and close button for new doktor")
    public void userClicksSelectAndCloseButtonForNewDoktor() {
        dorp.clicksSelectAndCloseButtonForNewDoktor();
    }
}

