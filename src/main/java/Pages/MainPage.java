package Pages;

import Consts.Consts;

    public class MainPage extends BasePage{
        private static final String TRY_FOR_FREE = "#hero [href='./get-started'";

        public void navigateToMainPage(){
            webDriver.get(Consts.MAIN_URL);
        }
        public boolean isButtonVisible(){
            Boolean isVisible = elementExists(TRY_FOR_FREE);
            return isVisible;
        }
    }
