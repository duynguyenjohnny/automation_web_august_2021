package aspire.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class MobileVerificationPage {

    /**

     * All WebElements are identified by @FindBy annotation

     */

    WebDriver driver;

    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]")

    WebElement keyM1;

    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[2]")

    WebElement keyM2;

    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[3]")

    WebElement keyM3;

    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[4]")

    WebElement keyM4;

    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")

    WebElement textWohoo;

    @FindBy(xpath="//span[contains(.,'Continue')]")

    WebElement btnContinue;

    public MobileVerificationPage(WebDriver driver){

        this.driver = driver;

        //This initElements method will create all WebElements

        PageFactory.initElements(driver, this);

    }

    //Click continue button
    public void clickContinue(){

        Actions act = new Actions(driver);
        act.click(btnContinue).perform();

    }

    //Set key
    public void setKey() throws InterruptedException {

        Actions action = new Actions(driver);
        Thread.sleep(500);
        action.sendKeys(keyM1,"1").perform();
        Thread.sleep(1000);
        action.sendKeys(keyM2,"2").perform();
        action.sendKeys(keyM3,"3").perform();
        action.sendKeys(keyM4,"4").perform();

    }

    //Fill OTP Mobile
    public void setOTPMobile() throws InterruptedException {
        String sMethodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        Thread.sleep(1000);
        this.setKey();
        Thread.sleep(15000);
        String as = textWohoo.getText();
        Assert.assertTrue(as.contains("Wohoo"), sMethodName + " was failed");
        Thread.sleep(2000);
        btnContinue.click();

    }

}
