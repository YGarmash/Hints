import Pages.MainPage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ManePageTest extends UseCaseBase {
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
    }

}
