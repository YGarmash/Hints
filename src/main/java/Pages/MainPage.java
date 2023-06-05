package Pages;

import Consts.Consts;

    public class MainPage extends BasePage{
        private static final String TRY_FOR_FREE = "#hero [href='./get-started'";
        private static final String GET_STARTED_PAGE = "//h1[text()='Get started']";

        public void navigateToMainPage(){
            webDriver.get(Consts.MAIN_URL);
        }
        public boolean isButtonVisible(){
            Boolean isVisible = elementExists(TRY_FOR_FREE);
            return isVisible;
        }
        public GetStartedPage openGetStartedTub(){
            clickElementByCSS(TRY_FOR_FREE);
            return new GetStartedPage();
        }
    }
