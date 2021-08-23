package aspire.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class PersonalDetailsPage {

    /**

     * All WebElements are identified by @FindBy annotation

     */

    WebDriver driver;

    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/form[1]/div[1]/div[2]/label[1]/div[1]/div[1]/div[1]")

    WebElement dateofBirth;

    @FindBy(xpath = "//div[@class='relative-position overflow-hidden flex flex-center']")

    WebElement selectYearDOB;

    @FindBy(xpath = "//i[@class='fas fa-chevron-left q-icon notranslate']")

    WebElement backToYearDOB;

    @FindBy(xpath = "//button[@class='q-btn q-btn-item non-selectable no-outline q-btn--flat q-btn--rectangle text-null q-btn--actionable q-focusable q-hoverable q-btn--wrap q-btn--dense']")

    WebElement selectYear;

    @FindBy(xpath = "//button[@class='q-btn q-btn-item non-selectable no-outline q-btn--flat q-btn--rectangle q-btn--actionable q-focusable q-hoverable q-btn--wrap q-btn--dense']")

    WebElement selectDayDOB;

    @FindBy(xpath = "//label[@class='q-field row no-wrap items-start q-select q-field--auto-height q-select--with-input q-select--without-chips q-select--single q-field--standard q-field--with-bottom q-validation-component']")

    WebElement nationList;

    @FindBy(xpath="//div[contains(.,'Angola')]")

    WebElement selectNation;

    @FindBy(xpath = "//label[@class='q-field row no-wrap items-start q-select q-field--auto-height q-select--with-input q-select--without-chips q-select--single q-field--standard q-field--with-bottom q-validation-component']")

    WebElement gender;

    @FindBy(xpath="//div[contains(.,'Female')]")

    WebElement selectGender;

    @FindBy(xpath = "//button[@class='q-btn q-btn-item non-selectable no-outline aspire-button aspire-button--cta q-btn--standard q-btn--rectangle bg-primary text-white q-btn--actionable q-focusable q-hoverable q-btn--wrap']")

    WebElement btnSubmit;

    @FindBy(xpath = "//div[@class='q-mb-xs text-h4 text-weight-bolder']")

    WebElement emailOTP;

    public PersonalDetailsPage(WebDriver driver){

        this.driver = driver;

        //This initElements method will create all WebElements

        PageFactory.initElements(driver, this);

    }

    //Set key
    public void clickDOB(){

        dateofBirth.click();
    }

    //Fill Personal Details
    public void setDetails() throws InterruptedException {
        String sMethodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        Thread.sleep(1000);
        this.clickDOB();
        Thread.sleep(100);
        selectYearDOB.click();
        Thread.sleep(500);
        backToYearDOB.click();
        Thread.sleep(200);
        backToYearDOB.click();
        Thread.sleep(200);
        selectYear.click();
        Thread.sleep(200);
        selectDayDOB.click();
        Thread.sleep(200);
        nationList.click();
        Thread.sleep(200);
        selectNation.click();
        Thread.sleep(200);
        gender.click();
        Thread.sleep(200);
        selectGender.click();
        Thread.sleep(300);
        btnSubmit.click();

        Thread.sleep(20000);
        String as = emailOTP.getText();
        Assert.assertTrue(as.contains("Enter email OTP"),sMethodName + " was failed");

    }

}
