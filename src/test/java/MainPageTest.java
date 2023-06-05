import Pages.GetStartedPage;
import Pages.MainPage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainPageTest extends UseCaseBase {
    private static MainPage mainPage;

    @BeforeAll
    public static void classSetup(){
        mainPage= new MainPage();
    }
    @BeforeEach
    public void beforeTest(){
        mainPage.navigateToMainPage();
    }
    @Test
    public void mainPageLoadTest(){
        Boolean success = mainPage.isButtonVisible();
        assertTrue(success);
        mainPage.

    }
    @Test
    public void openGetStartedPageTest(){

    }

    @Test
    public void openGetStartedPage(){
        GetStartedPage getStartedPage = mainPage.openGetStartedTub();
        boolean isLoaded = getStartedPage.isPageTitleVisible();
        assertTrue(isLoaded);

    }

}
