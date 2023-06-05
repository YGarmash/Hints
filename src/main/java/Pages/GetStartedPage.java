package Pages;

public class GetStartedPage extends BasePage{
    public static final String GET_STARTED_HEADER = "//h1[text()='Get started']";
    public boolean isPageTitleVisible(){
        return elementExists(GET_STARTED_HEADER);
    }
}
