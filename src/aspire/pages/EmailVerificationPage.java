package aspire.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class EmailVerificationPage {

    /**

     * All WebElements are identified by @FindBy annotation

     */

    WebDriver driver;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]")

    WebElement keyE1;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]")

    WebElement keyE2;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[3]")

    WebElement keyE3;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[4]")

    WebElement keyE4;

    @FindBy(xpath = "//div[@class='q-mb-xs text-h4 text-weight-bolder']")

    WebElement businessDetails;

    public EmailVerificationPage(WebDriver driver){

        this.driver = driver;

        //This initElements method will create all WebElements

        PageFactory.initElements(driver, this);

    }


    //Set key email
    public void setKeyEmail() throws InterruptedException {

        Actions action = new Actions(driver);
        Thread.sleep(500);
        action.sendKeys(keyE1,"1").perform();
        Thread.sleep(1000);
        action.sendKeys(keyE2,"2").perform();
        action.sendKeys(keyE3,"3").perform();
        action.sendKeys(keyE4,"4").perform();

    }

    //Fill OTP Mobile
    public void setEmailOTP() throws InterruptedException {
        String sMethodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        Thread.sleep(1000);
        this.setKeyEmail();
        Thread.sleep(15000);
        String as = businessDetails.getText();
        Assert.assertTrue(as.contains("Business Details"), sMethodName + " was failed");

    }

}
