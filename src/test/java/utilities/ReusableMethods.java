package utilities;

import com.github.javafaker.Faker;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;
import pages.CreateSurgeryList_Page;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;

public class ReusableMethods {
    static String kimlikNo;


    public static String getScreenshot(String name) throws IOException {
//
        String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());

        TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
        File source = ts.getScreenshotAs(OutputType.FILE);

        String target = System.getProperty("user.dir") + "/test-output/Screenshots/" + name + date + ".png";
        File finalDestination = new File(target);

        FileUtils.copyFile(source, finalDestination);
        return target;
    }

    //========Switching Window=====//
    public static void switchToWindow(String targetTitle) {
        String origin = Driver.getDriver().getWindowHandle();
        for (String handle : Driver.getDriver().getWindowHandles()) {
            Driver.getDriver().switchTo().window(handle);
            if (Driver.getDriver().getTitle().equals(targetTitle)) {
                return;
            }
        }
        Driver.getDriver().switchTo().window(origin);
    }

    //========Hover Over=====//
    public static void hover(WebElement element) {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element).perform();
    }

    //==========Return a list of string given a list of Web Element====////
    public static List<String> getElementsText(List<WebElement> list) {
        List<String> elemTexts = new ArrayList<>();
        for (WebElement el : list) {
            if (!el.getText().isEmpty()) {
                elemTexts.add(el.getText());
            }
        }
        return elemTexts;
    }

    //========Returns the Text of the element given an element locator==//
    public static List<String> getElementsText(By locator) {
        List<WebElement> elems = Driver.getDriver().findElements(locator);
        List<String> elemTexts = new ArrayList<>();
        for (WebElement el : elems) {
            if (!el.getText().isEmpty()) {
                elemTexts.add(el.getText());
            }
        }
        return elemTexts;
    }

    //   HARD WAIT ==> THREAD.SLEEP ile
//   waitFor(5);  => waits for 5 second
    public static void waitFor(int sec) {
        try {
            Thread.sleep(sec * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //===============Explicit Wait==============//
    public static WebElement waitForVisibility(WebElement element, int timeToWaitInSec) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(3));
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static WebElement waitForVisibility(By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(3));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static WebElement waitForClickablility(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(3));
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static WebElement waitForClickablility(By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(3));
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }


    public static void clickWithTimeOut(WebElement element, int timeout) {
        for (int i = 0; i < timeout; i++) {
            try {
                element.click();
                return;
            } catch (WebDriverException e) {
                waitFor(1);
            }
        }
    }

    public static void waitForPageToLoad(long timeOutInSeconds) {
        ExpectedCondition<Boolean> expectation = driver -> {
            assert driver != null;
            return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
        };
        try {
            System.out.println("Waiting for page to load...");
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(3));
            wait.until(expectation);
        } catch (Throwable error) {
            System.out.println(
                    "Timeout waiting for Page Load Request to complete after " + timeOutInSeconds + " seconds");
        }
    }

    //======Fluent Wait====//
    public static WebElement fluentWait(final WebElement webElement, int timeinsec) {

        FluentWait<WebDriver> wait = new FluentWait<>(Driver.getDriver())
                .withTimeout(Duration.ofSeconds(3))
                .pollingEvery(Duration.ofSeconds(1));

        WebElement element;
        element = wait.until(driver -> webElement);

        return element;
    }

    public static void doubleClick(WebDriver driver, WebElement element) {
        new Actions(Driver.getDriver()).doubleClick(element).build().perform();
    }


    public static void selectCheckBox(WebElement element, boolean check) {
        if (check) {
            if (!element.isSelected()) {
                element.click();
            }
        } else {
            if (element.isSelected()) {
                element.click();
            }
        }
    }

    public static WebElement selectRandomTextFromDropdown(Select select) {
        Random random = new Random();
        List<WebElement> weblist = select.getOptions();
        int optionIndex = 1 + random.nextInt(weblist.size() - 1);
        select.selectByIndex(optionIndex);
        return select.getFirstSelectedOption();
    }


    // BRSH
    public static int getRandomNumberBetweenRange(int min, int max) {

        return (int) (Math.random() * (max - min) + min);
    }


    public static Boolean isEmailValid(String email) {
        if (email == null || email.isEmpty()) {
            return false;
        }
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(email).matches();

    }

    //a method calculates days between two dates
    public static Boolean daysBetweenDates(String dateStr) {
        boolean newborn = false;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate localDate = LocalDate.parse(dateStr, formatter);
        LocalDate currentDate = LocalDate.now();
        int daysBetween = (int) ChronoUnit.DAYS.between(localDate, currentDate);
        if (daysBetween <= 30 && daysBetween >= 0) {
            newborn = true;
        }
        return newborn;
    }

    public static Boolean isNumeric(String str) {
        //is numeric method
        boolean numeric = false;

        int length = str.length();
        for (int i = 0; i < length; i++) {

            if (Character.isDigit((str.charAt(i)))) {
                numeric = true;
                break;
            }
        }
        return numeric;
    }


    public static boolean isIdValid(String tckn) {
        boolean isValid;
        {
            isValid = false;
            if (tckn != null && tckn.length() == 11 && !tckn.startsWith("0") && isNumeric(tckn)) {
                long tcNo = Long.parseLong(tckn);
                long ad, a1, a2, a3, a4, a5, a6, a7, a8, a9, b1, b2;
                b2 = tcNo % 10;
                b1 = (tcNo / 10) % 10;
                ad = tcNo / 100;
                a9 = ad % 10;
                ad = ad / 10;
                a8 = ad % 10;
                ad = ad / 10;
                a7 = ad % 10;
                ad = ad / 10;
                a6 = ad % 10;
                ad = ad / 10;
                a5 = ad % 10;
                ad = ad / 10;
                a4 = ad % 10;
                ad = ad / 10;
                a3 = ad % 10;
                ad = ad / 10;
                a2 = ad % 10;
                ad = ad / 10;
                a1 = ad % 10;
                System.out.println("b2: " + b2 + " b1: " + b1 + " a1: " + a1 + " a2: " + a2 + " a3: " + a3 + " a4: " + a4 + " a5: " + a5 + " a6: " + a6 + " a7: " + a7 + " a8: " + a8 + " a9: " + a9);
                if (((a1 + a3 + a5 + a7 + a9) * 7 - (a2 + a4 + a6 + a8)) % 10 == b1 && ((a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + b1)) % 10 == b2) {
                    isValid = true;
                }
            }

            return isValid;
        }

    }

    public static String generateValidId() {

        Faker faker = new Faker();
        String validId = faker.number().randomDigitNotZero() + faker.number().digits(8);
        int a10 = ((validId.charAt(0) - '0' + validId.charAt(2) - '0' + validId.charAt(4) - '0' + validId.charAt(6) - '0' + validId.charAt(8) - '0') * 7 -
                (validId.charAt(1) - '0' + validId.charAt(3) - '0' + validId.charAt(5) - '0' + validId.charAt(7) - '0')) % 10;
        int a11 = (validId.charAt(0) - '0' + validId.charAt(1) - '0' + validId.charAt(2) - '0' + validId.charAt(3) - '0' + validId.charAt(4) - '0' + validId.charAt(5) - '0' +
                validId.charAt(6) - '0' + validId.charAt(7) - '0' + validId.charAt(8) - '0' + a10) % 10;
        validId = validId + a10 + a11;
        return validId;
    }

    public static String getElementText(WebElement element) {
        System.out.println(element.getText());

        return element.getText();
    }

    public static void jseWithClick(WebDriver driver, WebElement element) {

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].click();", element);

    }

    public static void doubleClickWithJS(WebDriver driver, WebElement element) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].dispatchEvent(new MouseEvent('dblclick', { bubbles: true }));", element);
    }

    public static void scrollPageDownWithJS(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,25)", "");
    }

    public static String generateProtokolNo() throws InterruptedException {
        Faker faker = new Faker();
        WebDriver driver = Driver.getDriver();
        ReusableMethods.jseWithClick(driver, driver.findElement(By.xpath("(//a[@class='open'])[1]")));
        ReusableMethods.jseWithClick(driver, driver.findElement(By.xpath("(//a[@href='/HBYS_WEB_PRODUCT/POL/POL/POLIKLINIKMUAYENE'])")));
        ReusableMethods.jseWithClick(driver, driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[4]/section[1]/form[1]/div[3]/div[1]/div[1]/div[1]/div[4]/a[2]")));
        driver.findElement(By.id("TXT_HASTA_KAYIT_ANA_KURUM_KODU")).sendKeys("27");
        driver.findElement(By.xpath("(//input[@class='inpt wpx50'])[4]")).sendKeys("0" + Keys.ENTER);
        ReusableMethods.sendKeysWithJS(driver, driver.findElement(By.id("TXT_HASTA_KAYIT_DOGUM_TARIHI")), "17.05.2000");
        String mobilePhone = "5" + faker.number().digits(9);
        driver.findElement(By.xpath("//input[@id='TXT_HASTA_KAYIT_CEP_TEL']")).sendKeys(mobilePhone + Keys.ENTER);
        Select select = new Select(driver.findElement(By.id("CMB_HASTA_KAYIT_CINSIYET")));
        select.selectByVisibleText("ERKEK");
        String lastName = faker.name().lastName();
        driver.findElement(By.id("TXT_HASTA_KAYIT_SOYADI")).sendKeys(lastName + Keys.ENTER);
        String firstName = faker.name().firstName();
        driver.findElement(By.id("TXT_HASTA_KAYIT_ADI")).sendKeys(firstName + Keys.ENTER);
        ReusableMethods.jseWithClick(driver, driver.findElement(By.id("TXT_HASTA_KAYIT_TC_KIMLIK_NO")));
        driver.findElement(By.id("TXT_HASTA_KAYIT_TC_KIMLIK_NO")).sendKeys(ReusableMethods.generateValidId());
        ReusableMethods.jseWithClick(driver, driver.findElement(By.id("PopupSaveButton_0"))); //Save
        ReusableMethods.jseWithClick(driver, driver.findElement(By.xpath("//span[@class='info item']"))); //Close
        ReusableMethods.jseWithClick(driver, driver.findElement(By.xpath("//span[normalize-space()='Kapat']")));
        Thread.sleep(1000);
        driver.findElement(By.id("POLIKLINIK_KODU")).sendKeys("107" + Keys.ENTER);
        ReusableMethods.jseWithClick(driver, driver.findElement(By.xpath("//a[@title='Kaydet(F10)']")));
        ReusableMethods.jseWithClick(driver, driver.findElement(By.xpath("//*[contains(text(),'Kapat')]")));
        WebElement protocolNoElement = driver.findElement(By.xpath("//input[@id='PROTOKOL_NO']"));
        ReusableMethods.waitForVisibility(protocolNoElement, 3).click();
        String protocolNo = protocolNoElement.getAttribute("value");
        System.out.println("protocolNo: " + protocolNo);
        return protocolNo;
    }

    public static void sendKeysWithJS(WebDriver driver, WebElement element, String text) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].value = arguments[1]", element, text);
    }

    public static long periodBetweenDates(String dateStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate localDate = LocalDate.parse(dateStr, formatter);
        LocalDate currentDate = LocalDate.now();
        Period period = localDate.until(currentDate);
        return period.getYears() * 365L + period.getMonths() * 30L + period.getDays();
    }

    public static WebElement locateServiceByText(String text) {
        return Driver.getDriver().findElement(By.xpath("//*[contains(@id,'lstServis_DXMainTable')]//td[contains(.,'" + text + "')]"));
    }

    public static WebElement locatePatientByText(String text) {
        return Driver.getDriver().findElement(By.xpath("//*[contains(@id,'dxGridHastaListe_DXMainTable')]//td[contains(.,'" + text + "')]"));
    }


    public static WebElement locateSelectHallByText(String text) {
        return Driver.getDriver().findElement(By.xpath("//*[contains(@id,'lstSalonMasaListesi_DXData')]//td[contains(.,'" + text + "')]"));
    }


    public static WebElement locateHallOptionsByText(String text) {
        return Driver.getDriver().findElement(By.xpath("//div[@class='content blckAcilirMenu']//a[contains(.,'" + text + "')]"));
    }

    public static WebElement locateChangeHallByText(String text) {
        return Driver.getDriver().findElement(By.xpath("//table[@id='SALONDEG_DXMainTable']//td[contains(.,'" + text + "')]"));
    }

    public static WebElement locateSelectChangeHallByText(String text) {
        return Driver.getDriver().findElement(By.xpath("//div[@class='content blckAcilirMenu']//a[contains(.,'" + text + "')]"));
    }

    public static void clickCurrentPage(int p) throws InterruptedException {
        String pageNumberCountText = Integer.toString(p);
        WebElement pageNumberNext = Driver.getDriver().findElement(By.xpath("//div[@id='lstServis_DXPagerBottom']//*[contains(@class,'dxp-num')][text()='" + pageNumberCountText + "']"));
        ReusableMethods.jseWithClick(Driver.getDriver(), pageNumberNext);
        CreateSurgeryList_Page surgeryList_Page = new CreateSurgeryList_Page();
        ReusableMethods.jseWithClick(Driver.getDriver(), surgeryList_Page.refreshButton);
        Thread.sleep(2000);
    }


    public static WebElement locateSelectHallFromHallListByText(String text) {
        return Driver.getDriver().findElement(By.xpath("//*[contains(@id,'amlSalonList')]//li[contains(.,'" + text + "')]"));
    }

    public static WebElement locateElementByText(String text) {
        return Driver.getDriver().findElement(By.xpath("//*[contains(@id,'lstSalonMasaListesi_DXData')]//td[contains(.,'" + text + "')]"));

    }


}