package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SurgicalSupplies_Page;
import utilities.Driver;

public class SurgicalSupplies_StepDefinitions {


    SurgicalSupplies_Page ssp = new SurgicalSupplies_Page(Driver.getDriver());

    @When("select the surgery date {string}")
    public void selectTheSurgeryDate(String arg0) {
        ssp.selectTheSurgeryDate(arg0);

    }
    @And("click refresh button")
    public void clickRefreshButton() {
        ssp.clickRefreshButton();
    }

    @And("click saloon")
    public void clickSaloon() {
        ssp.clickSaloon();
    }

    @And("select patient")
    public void selectPatient() {
        ssp.selectPatient();
    }


    @And("click apply template")
    public void clickApplyTemplate() {
        ssp.clickApplyTemplate();
    }

    @And("click template name {string}")
    public void clickTemplateName(String arg0) {
        ssp.clickTemplateName(arg0);
    }

    @And("click approve box for materials")
    public void clickApproveBoxForMaterials() {
        ssp.clickApproveBoxForMaterials();
    }

    @And("click approve box for medicine")
    public void clickApproveBoxForMedicine() {
        ssp.clickApproveBoxForMedicine();
    }

    @And("click materials process and update button")
    public void clickMaterialsProcessAndUpdateButton() {
        ssp.clickMaterialsProcessAndUpdateButton();
    }

    @And("click okey button")
    public void clickOkeyButton() {
        ssp.clickOkeyButton();
    }

    @And("click medicine process and update button")
    public void clickMedicineProcessAndUpdateButton() {
        ssp.clickMedicineProcessAndUpdateButton();
    }

    @And("delete the material {string}")
    public void deleteTheMaterial(String arg0) {
        ssp.deleteTheMaterial(arg0);
    }

    @And("assert the material or medicine deleted {string}")
    public void assertTheMaterialOrMedicineDeleted(String arg0) {
        ssp.assertTheMaterialOrMedicineDeleted(arg0);
    }

    @And("delete the medicine {string}")
    public void deleteTheMedicine(String arg0) {
        ssp.deleteTheMedicine(arg0);
    }

    @And("enter barcode to barcode box {string}")
    public void enterBarcodeToBarcodeBox(String arg0) {
        ssp.enterBarcodeToBarcodeBox(arg0);
    }

    @And("double click barcode box")
    public void doubleClickBarcodeBox() {
        ssp.doubleClickBarcodeBox();
    }

    @And("assert popup page {string}")
    public void assertPopupPage(String arg0) {
        ssp.assertPopupPage(arg0);
    }

    @And("enter barcode to material code box {string}")
    public void enterBarcodeToMaterialCodeBox(String arg0) {
        ssp.enterBarcodeToMaterialCodeBox(arg0);
    }

    @And("close popup page")
    public void closePopupPage() {
        ssp.closePopupPage();
    }

    @And("click materials popup page button")
    public void clickMaterialsPopupPageButton() {
        ssp.clickMaterialsPopupPageButton();
    }

    @And("enter medicine code to add medicine box {string}")
    public void enterMedicineCodeToAddMedicineBox(String arg0) {
        ssp.enterMedicineCodeToAddMedicineBox(arg0);
    }

    @And("double click medicine code box")
    public void doubleClickMedicineCodeBox() {
        ssp.doubleClickMedicineCodeBox();
    }

    @And("enter medicine code to medicine code box {string}")
    public void enterMedicineCodeToMedicineCodeBox(String arg0) {
        ssp.enterMedicineCodeToMedicineCodeBox(arg0);
    }

    @And("click medicine popup page button")
    public void clickMedicinePopupPageButton() {
        ssp.clickMedicinePopupPageButton();
    }

    @And("assert the material or medicine {string} {string}")
    public void assertTheMaterialOrMedicine(String arg0, String arg1) {
        ssp.assertTheMaterialOrMedicine(arg0, arg1);
    }

    @And("click materials add button")
    public void clickMaterialsAddButton() {
        ssp.clickMaterialsAddButton();
    }

    @And("click medicine add button")
    public void clickMedicineAddButton() {
        ssp.clickMedicineAddButton();
    }

    @When("click template definitions button")
    public void clickTemplateDefinitionsButton() {
        ssp.clickTemplateDefinitionsButton();
    }

    @And("click new template add button")
    public void clickNewTemplateAddButton() {
        ssp.clickNewTemplateAddButton();
    }

    @And("select type of template {string}")
    public void selectTypeOfTemplate(String arg0) {
        ssp.selectTypeOfTemplate(arg0);
    }

    @And("enter template name {string}")
    public void enterTemplateName(String arg0) {
        ssp.enterTemplateName(arg0);
    }

    @And("enter branch code to branch box {string}")
    public void enterBranchCodeToBranchBox(String arg0) {
        ssp.enterBranchCodeToBranchBox(arg0);
    }

    @And("double click examination name box")
    public void doubleClickExaminationNameBox() {
        ssp.doubleClickExaminationNameBox();
    }

    @And("enter code to official code box {string}")
    public void enterCodeToOfficialCodeBox(String arg0) {
        ssp.enterCodeToOfficialCodeBox(arg0);
    }

    @Then("assert new template by name {string}")
    public void assertNewTemplateByName(String arg0) {
        ssp.assertNewTemplateByName(arg0);
    }

    @Then("assert the template deleted {string}")
    public void assertTheTemplateDeleted(String arg0) {
        ssp.assertTheTemplateDeleted(arg0);
    }

    @And("enter template name to name search box {string}")
    public void enterTemplateNameToNameSearchBox(String arg0) {
        ssp.enterTemplateNameToNameSearchBox(arg0);
    }

    @And("clear template name")
    public void clearTemplateName() {
        ssp.clearTemplateName();
    }

    @And("if material displayed delete the material {string}")
    public void ifMaterialDisplayedDeleteTheMaterial(String arg0) {
        ssp.ifMaterialDisplayedDeleteTheMaterial(arg0);
    }

    @And("if medicine displayed delete the medicine {string}")
    public void ifMedicineDisplayedDeleteTheMedicine(String arg0) {
        ssp.ifMedicineDisplayedDeleteTheMedicine(arg0);
    }
}
