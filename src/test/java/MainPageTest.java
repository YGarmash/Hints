import Pages.MainPage;
import org.junit.jupiter.api.Test;

public class MainPageTest extends UseCaseBase {



    @Test
    public void mainPageLoadTest(){
        MainPage mainPage= new MainPage(webDriver);
        mainPage.navigateToMainPage();
        mainPage.tryForFree.click();


    }
    
    

    @Test
    public void openGetStartedPageTest(){

    }

//    @Test
//    public void openGetStartedPage(){
//        GetStartedPage getStartedPage = mainPage.openGetStartedTub();
//        boolean isLoaded = getStartedPage.isPageTitleVisible();
//        assertTrue(isLoaded);
//
//    }

}