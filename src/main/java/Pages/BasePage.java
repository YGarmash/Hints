package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.How.CSS;

public class BasePage {
    protected static WebDriver webDriver;
    protected static WebDriverWait wait;


    public void setWebDriver(WebDriver webDriver) {
        this.webDriver = webDriver;
        wait = new WebDriverWait(webDriver,5);
    }
    protected void clickElementByXpath(String xpath){

        findElementByXpath(xpath).click();
    }
    protected void clickElementByCSS(String CSS){

        findElementByXpath(CSS).click();
    }
    protected void sendTextToElementByXpath(String xpath, String text){
        findElementByXpath(xpath).sendKeys(text);
    }
    protected boolean elementExists(String CSS){
        try {
            webDriver.findElement(By.cssSelector(CSS));
            return true;
        }
        catch (Exception err){
            return false;
        }
    }
    protected WebElement findElementByXpath(String xpath){
        WebElement element;
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
        element= webDriver.findElement(By.xpath(xpath));
        return element;
    }
    protected WebElement findElementByCSS(String CSS){
        WebElement element;
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(CSS)));
        element= webDriver.findElement(By.cssSelector(CSS));
        return element;
    }
    protected String getCurrentPageURL(){
        return webDriver.getCurrentUrl();
    }
}
