package aspire.pages;

import aspire.utilities.SecuredProperties;
import aspire.utilities.SecuredPropertiesConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.File;
import java.util.List;
import java.util.Random;

public class RegisterPage {

    /**

     * All WebElements are identified by @FindBy annotation

     */

    WebDriver driver;

    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/header[1]/div[2]/div[1]/div[1]/div[1]")

    WebElement titleRegister;

    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/form[1]/div[1]/div[1]/label[1]/div[1]/div[1]/div[1]/input[1]")

    WebElement txtFullName;

    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/form[1]/div[1]/div[2]/label[1]/div[1]/div[1]/div[1]/input[1]")

    WebElement txtEmail;

    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/form[1]/div[1]/div[3]/div[2]/label[2]/div[1]/div[1]/div[1]/input[1]")

    WebElement nbPhone;

    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/form[1]/div[1]/div[6]/div[1]/div[1]/div[1]")

    WebElement cbTerms;

    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/form[1]/div[2]/div[1]/button[1]/span[2]/span[1]/span[1]")

    WebElement btnContinue;

    //Assert pass
    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/form[1]/button[1]/span[2]/span[1]/span[1]")

    WebElement resendCode;

    public RegisterPage(WebDriver driver){

        this.driver = driver;

        //This initElements method will create all WebElements

        PageFactory.initElements(driver, this);

    }

    //Set user full name in textbox
    public void setFullName(String strFullName){

        txtFullName.sendKeys(strFullName);
    }

    //Set email
    public void setEmail(){

        txtEmail.sendKeys(getEmailString()+"@gmail.com");

    }

    //Set Mobile Number
    public void setMobile(){

        nbPhone.sendKeys(getMobileNumber());

    }

    //Click on terms checkbox
    public void clickTerms(){

        cbTerms.click();

    }

    //Click on Continue button
    public void clickContinue(){

        btnContinue.click();

    }

    protected String getEmailString() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }

    protected String getMobileNumber() {
        String SALTCHARS = "1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 8) { // length of the random number.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }

    public void register() throws InterruptedException {
        String sMethodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        Thread.sleep(500);
        final SecuredPropertiesConfig config = new SecuredPropertiesConfig()
                .withSecretFile(new File("./src/aspire/tests/registersuite/mysecret.key"))
                .initDefault();
        SecuredProperties.encryptNonEncryptedValues(config,
                new File("./src/aspire/tests/registersuite/Register.properties"),
                "FullName");
        String FullName = SecuredProperties.getSecretValue(config,
                new File("./src/aspire/tests/registersuite/Register.properties"),
                "FullName");

        Thread.sleep(3000);
        //Fill full name
        this.setFullName(FullName);
        Thread.sleep(200);
        //Fill email
        this.setEmail();
        Thread.sleep(200);
        //Fill Mobile Number
        this.setMobile();
        Thread.sleep(200);
        //Click terms checkbox
        this.clickTerms();
        //Click Continue button
        this.clickContinue();

        WebDriverWait wait = new WebDriverWait(driver, 45);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/form[1]/button[1]/span[2]/span[1]/span[1]")));
        Thread.sleep(4000);
        Assert.assertTrue(resendCode.isDisplayed(),sMethodName + " was failed");
    }

}
