package testSuite.yopmail;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import page.yopmail.MainPage;
import page.yopmail.NavigationPage;
import page.yopmail.WriteEmailSection;
import page.yopmail.WriteRefreshMailSection;
import session.Session;
import util.GetProperties;

public class TestBase {
    MainPage mainPage = new MainPage();
    NavigationPage navigationPage = new NavigationPage();
    WriteRefreshMailSection writeRefreshMailSection = new WriteRefreshMailSection();
    WriteEmailSection writeEmailSection = new WriteEmailSection();

    String user= GetProperties.getInstance().getUser();
    Session session = Session.getInstance();

    @BeforeEach
    public void openBrowser(){
        // todo create property file
        session.getBrowser().get(GetProperties.getInstance().getHost());

    }

    @AfterEach
    public void closeBrowser(){
        session.closeSession();
    }


}
