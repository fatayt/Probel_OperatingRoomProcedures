package stepdefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.BasePage;
import pages.Login_Page;
import utilities.ConfigReader;

public class Login_StepDefinitions {


    Login_Page login_page = new Login_Page();
    BasePage basePage = new BasePage();

    @Given("The user logs in")
    public void the_user_logs_in() throws InterruptedException {
        Thread.sleep(2000);
        login_page.kullaniciKodu.sendKeys(ConfigReader.getProperty("userName"));
        login_page.sifre.sendKeys(ConfigReader.getProperty("password"));
        login_page.webSifre.sendKeys(ConfigReader.getProperty("web_password"));
        login_page.clickButton.click();
        login_page.okeyButton.click();
    }

    @And("The user goes Create Surgery List page")
    public void theUserGoesCreateSurgeryListPage() {
        basePage.theUserGoesCreateSurgeryListPage();
    }

    @And("The user goes Operating Room Procedures page")
    public void theUserGoesOperatingRoomProceduresPage() throws InterruptedException {
        Thread.sleep(2000);
        basePage.theUserGoesOperatingRoomProceduresPage();
        Thread.sleep(2000);
    }

    @And("The user goes Doctor Operating Room Procedures page")
    public void theUserGoesDoctorOperatingRoomProceduresPage() throws InterruptedException {
        Thread.sleep(5000);
        basePage.theUserGoesDoctorOperatingRoomProceduresPage();
        Thread.sleep(5000);
    }

    @And("The user goes Surgical Supplies page")
    public void theUserGoesSurgicalSuppliesPage() {
        basePage.theUserGoesSurgicalSuppliesPage();
    }

    @And("The user goes Surgery Appointment page")
    public void theUserGoesSurgeryAppointmentPage() {
        basePage.theUserGoesSurgeryAppointmentPage();
    }
}
