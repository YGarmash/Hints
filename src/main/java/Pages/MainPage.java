package Pages;

import Consts.Consts;
import Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BasePage {

    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


//
//
//
//        private static final String TRY_FOR_FREE = "#hero [href='./get-started'";
//        private static final String GET_STARTED_PAGE = "//h1[text()='Get started']";






    @FindBy(css = "#hero [href='./get-started'")
    public WebElement tryForFree;


    public void navigateToMainPage(){
        webDriver.get(Consts.MAIN_URL);
    }






//        public boolean isButtonVisible(){
//            Boolean isVisible = elementExists(TRY_FOR_FREE);
//            return isVisible;
//        }
//        public GetStartedPage openGetStartedTub(){
//            clickElementByCSS(TRY_FOR_FREE);
//            return new GetStartedPage();
//        }
}