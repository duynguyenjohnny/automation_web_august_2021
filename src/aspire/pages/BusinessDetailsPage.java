package aspire.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.io.File;
import java.util.Random;


public class BusinessDetailsPage {

    /**

     * All WebElements are identified by @FindBy annotation

     */

    WebDriver driver;

    @FindBy(xpath = "//label[@class='q-field row no-wrap items-start q-input q-field--standard q-field--float q-field--with-bottom q-validation-component']")

    WebElement businessName;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/form[1]/div[1]/div[1]/div[2]/label[1]/div[1]/div[1]/div[1]/div[1]")

    WebElement entityCategory;

    @FindBy(xpath = "//div[contains(.,'Non profit organization')]")

    WebElement nonProfitOrganization;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/form[1]/div[1]/div[1]/div[3]/label[1]/div[1]/div[1]/div[1]/div[1]")

    WebElement entityType;

    @FindBy(xpath = "//div[contains(.,'Clubs and societies')]")

    WebElement clubsSocieties;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/form[1]/div[1]/div[1]/div[4]/label[1]")

    WebElement businessUEN;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/form[1]/div[1]/div[1]/div[5]/label[1]")

    WebElement industry;

    @FindBy(xpath = "//div[contains(.,'Manufacturing')]")

    WebElement manufacturing;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/form[1]/div[1]/div[1]/div[6]/label[1]")

    WebElement subIndustry;

    @FindBy(xpath = "//div[contains(.,'Commodities')]")

    WebElement commodities;

    @FindBy(xpath = "//span[contains(.,'Continue')]")

    WebElement btnContinue;

    @FindBy(xpath = "//div[contains(text(),'Enter your business’ details')]")

    WebElement verifyEnterBDetails;

    //Element Screen 2
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/form[1]/div[1]/div[1]/label[1]")

    WebElement businessActivities;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/form[1]/div[1]/div[2]/label[1]")

    WebElement detailsServices;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/form[1]/div[1]/div[4]/div[1]")

    WebElement cbNoWebsite;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/form[1]/div[1]/div[5]/label[1]")

    WebElement noEmployees;

    @FindBy(xpath = "//div[contains(.,'51-200')]")

    WebElement selectNoEmployee;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/form[1]/div[1]/div[6]/label[1]")

    WebElement annualRevenue;

    @FindBy(xpath = "//div[contains(.,'S$1,364 - S$2,728')]")

    WebElement selectAnnualRevenue;

    @FindBy(xpath = "//span[contains(.,'Submit')]")

    WebElement btnSubmit;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]")

    WebElement cbYes1Screen3;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/form[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]")

    WebElement cbNoScreen3;

    @FindBy(xpath = "//span[contains(.,'Continue')]")

    WebElement btnContinue2;

    //Elements screen 3
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/form[1]/div[1]/div[1]/label[1]")

    WebElement whatwill;

    @FindBy(xpath = "//div[contains(.,'Liquidity provision')]")

    WebElement liquidityProvision;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/form[1]/div[1]/div[2]/label[1]")

    WebElement whatis;

    @FindBy(xpath = "//div[contains(.,'Personal savings from previous jobs')]")

    WebElement personalSavings;

    @FindBy(xpath = "//span[contains(.,'Continue')]")

    WebElement btnContinue3;

    //Elements Screen 4 BusinessDetails
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/form[1]/div[1]/div[3]/div[1]/div[1]/img[1]")

    WebElement uploadIcon;

    @FindBy(xpath = "//div[contains(.,'Skip now, ask me later')]")

    WebElement skipNow;

    //Elements Screen 5
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]")

    WebElement sameAsBusinessAddress;

    @FindBy(xpath = "//span[contains(.,'Continue')]")

    WebElement btnContinue4;

    //Elements Screen 6
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/form[1]/div[1]/div[6]/div[1]/div[3]/div[1]/div[1]/button[1]")

    WebElement uploadSupportingDocument;

    @FindBy(xpath = "//span[contains(.,'Get Started')]")

    WebElement btnGetStart;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]")

    WebElement indentityDocument;

    @FindBy(xpath = "//span[contains(.,'Continue')]")

    WebElement btnContinue5;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[3]/div[1]/div[1]")

    WebElement internationalPassport;

    @FindBy(xpath = "//span[contains(.,'Continue')]")

    WebElement btnContinue6;

    @FindBy(xpath = "//div[contains(.,'or Upload file')]")

    WebElement uploadFile;

    @FindBy(xpath = "//span[contains(.,'Continue')]")

    WebElement btnContinue7;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")

    WebElement clickUploadFile;

    @FindBy(xpath = "//span[contains(.,'Continue')]")

    WebElement btnContinue8;

    @FindBy(xpath = "//span[contains(.,'Next')]")

    WebElement btnNext;

    @FindBy(xpath = "//span[contains(.,'Take selfie')]")

    WebElement btnTakeSelfie;

    public BusinessDetailsPage(WebDriver driver){

        this.driver = driver;

        //This initElements method will create all WebElements

        PageFactory.initElements(driver, this);

    }

    //Send key
    public void inputBusinessName(){

        businessName.sendKeys("Duy Nguyen");
    }

    protected String getUENNumber() {
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

    protected String getUENChar() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 1) { // length of the random number.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }

//    public boolean uploadFileElement(String fileName) {
//        if (fileName == "" | fileName == null) {
//            return false;
//        }
//        try {
//
//            userControl = new UserController(driver);
//            // Init data
//            String uri = System.getProperty("user.dir") + File.separator + "lib" + File.separator;
//            // Upload file
//            String filePath = uri + fileName;
//            userControl.addLog("Upload file : " + filePath);
//            String uploadWindow = "File Upload";
//            autoTool.winWait(uploadWindow, "", 12);
//            Thread.sleep(1000);
//            autoTool.winActivate(uploadWindow);
//            autoTool.ControlSetText(uploadWindow, "", "[Class:Edit1]", filePath.trim().toString());
//            Thread.sleep(3000);
//            autoTool.controlClick(uploadWindow, "", "[Text:&Open]");
//            Thread.sleep(2000);
//
//            if(autoTool.winExists(uploadWindow)){
//                userControl.addLog("File not found or not invalid");
//                String winID = autoTool.winGetHandle(uploadWindow);
//                autoTool.controlClick("[Handle:" + winID + "]", "", "[Text:OK]");
//                Thread.sleep(1000);
//                autoTool.controlClick(uploadWindow, "", "[Text:Cancel]");
//                return false;
//            }
//
//            return true;
//        } catch (NoSuchElementException e) {
//            userControl.addLog("No File name exception: " + fileName);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        return false;
//    }

    //Set UEN
    public void setUEN(){

        businessUEN.sendKeys(getUENNumber()+getUENChar());

    }

    public void fillBusinessDetails1 () throws InterruptedException {
        String sMethodName = new Object() {
        }.getClass().getEnclosingMethod().getName();

        this.inputBusinessName();
        Thread.sleep(100);
        entityCategory.click();
        Thread.sleep(200);
        nonProfitOrganization.click();
        Thread.sleep(200);
        entityType.click();
        Thread.sleep(200);
        clubsSocieties.click();
        Thread.sleep(200);
        this.setUEN();
        Thread.sleep(200);
        industry.click();
        Thread.sleep(200);
        manufacturing.click();
        Thread.sleep(200);
        subIndustry.click();
        Thread.sleep(200);
        commodities.click();
        Thread.sleep(200);
        btnContinue.click();
        Thread.sleep(6000);
        String as = verifyEnterBDetails.getText();
        Assert.assertTrue(as.contains("Enter your business’ details"),sMethodName + " was failed");

    }

    public void fillBusinessDetails2 () throws InterruptedException {
        String sMethodName = new Object() {
        }.getClass().getEnclosingMethod().getName();

        businessActivities.sendKeys("Provide full service of manufacturing details to support the finance intelligence technology information");
        Thread.sleep(150);
        detailsServices.sendKeys("Provide full service of manufacturing details to support the finance intelligence technology information");
        Thread.sleep(150);
        cbNoWebsite.click();
        Thread.sleep(150);
        noEmployees.click();
        Thread.sleep(150);
        selectNoEmployee.click();
        Thread.sleep(150);
        annualRevenue.click();
        Thread.sleep(150);
        selectAnnualRevenue.click();
        btnSubmit.click();

        Thread.sleep(5000);
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]")));
        Thread.sleep(5000);
        Assert.assertTrue(cbYes1Screen3.isDisplayed(), sMethodName + " was failed");

    }

    public void fillBusinessDetails3 () throws InterruptedException {
        String sMethodName = new Object() {
        }.getClass().getEnclosingMethod().getName();

        cbYes1Screen3.click();
        Thread.sleep(150);
        cbNoScreen3.click();
        Thread.sleep(150);
        btnContinue2.click();

        WebDriverWait wait = new WebDriverWait(driver, 25);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/form[1]/div[1]/div[1]/label[1]")));
        Thread.sleep(4000);
        Assert.assertTrue(whatwill.isDisplayed(), sMethodName + " was failed");

    }

    public void fillBusinessDetails4 () throws InterruptedException {
        String sMethodName = new Object() {
        }.getClass().getEnclosingMethod().getName();

        whatwill.click();
        Thread.sleep(150);
        liquidityProvision.click();
        Thread.sleep(150);
        whatwill.click();
        Thread.sleep(150);
        whatis.click();
        Thread.sleep(150);
        personalSavings.click();
        Thread.sleep(150);
        whatis.click();
        Thread.sleep(150);
        btnContinue3.click();

        Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver, 25);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]")));
        Thread.sleep(4000);
        Assert.assertTrue(sameAsBusinessAddress.isDisplayed(), sMethodName + " was failed");

    }

    public void fillBusinessDetails5 () throws InterruptedException {
        String sMethodName = new Object() {
        }.getClass().getEnclosingMethod().getName();

        sameAsBusinessAddress.click();
        Thread.sleep(150);
        btnContinue4.click();

        WebDriverWait wait = new WebDriverWait(driver, 25);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(.,'Skip now, ask me later')]")));
        Thread.sleep(4000);
        Assert.assertTrue(uploadSupportingDocument.isDisplayed(), sMethodName + " was failed");
        Actions act = new Actions(driver);
        act.click(uploadSupportingDocument).perform();
        // Init data
        String uri = System.getProperty("user.dir") + File.separator + "lib" + File.separator;
        // Upload file
        String filePath = uri + "ca.jpg";
        // copying File path to Clipboard
        StringSelection str = new StringSelection(filePath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
        driver.switchTo().activeElement().sendKeys(Keys.CONTROL +"v");
        driver.switchTo().activeElement().sendKeys(Keys.ENTER);
        btnContinue4.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(.,'Get Started')]")));
        Thread.sleep(4000);
        Assert.assertTrue(btnGetStart.isDisplayed(), sMethodName + " was failed");
        indentityDocument.click();
        Thread.sleep(150);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(.,'Continue')]")));
        Thread.sleep(1000);
        Assert.assertTrue(btnContinue5.isDisplayed(), sMethodName + " was failed");

    }

    public void fillBusinessDetails6 () throws InterruptedException {
        String sMethodName = new Object() {
        }.getClass().getEnclosingMethod().getName();

        btnContinue5.click();

        WebDriverWait wait = new WebDriverWait(driver, 25);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[3]/div[1]/div[1]")));
        Thread.sleep(4000);
        Assert.assertTrue(internationalPassport.isDisplayed(), sMethodName + " was failed");
        internationalPassport.click();
        Thread.sleep(150);
        btnContinue6.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(.,'or Upload file')]")));
        Thread.sleep(4000);
        Assert.assertTrue(uploadFile.isDisplayed(), sMethodName + " was failed");

    }

    public void fillBusinessDetails7 () throws InterruptedException {
        String sMethodName = new Object() {
        }.getClass().getEnclosingMethod().getName();

        uploadFile.click();
        Thread.sleep(3000);
        btnContinue7.click();
        Thread.sleep(3000);
        // Init data
        String uri = System.getProperty("user.dir") + File.separator + "lib" + File.separator;
        // Upload file
        String filePath = uri + "ca.jpg";
        // copying File path to Clipboard
        StringSelection str = new StringSelection(filePath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
        driver.switchTo().activeElement().sendKeys(Keys.CONTROL +"v");
        driver.switchTo().activeElement().sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        btnContinue8.click();
        Thread.sleep(1000);
        btnNext.click();

        WebDriverWait wait = new WebDriverWait(driver, 25);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(.,'Take selfie')]")));
        Thread.sleep(4000);
        Assert.assertTrue(btnTakeSelfie.isDisplayed(), sMethodName + " was failed");

    }

    //Fill Personal Details
    public void setBusinessDetails() throws InterruptedException {
        String sMethodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        Thread.sleep(1000);

        this.fillBusinessDetails1();
        this.fillBusinessDetails2();
        this.fillBusinessDetails3();
        this.fillBusinessDetails4();
        this.fillBusinessDetails5();
        this.fillBusinessDetails6();
        this.fillBusinessDetails7();

    }

}
