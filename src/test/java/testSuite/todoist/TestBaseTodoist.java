package testSuite.todoist;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import page.todoist.*;
import session.Session;
import util.GetProperties;

public class TestBaseTodoist {
    MainPageTodoist mainPageTodoist = new MainPageTodoist();
    LoginTodoist loginTodoist = new LoginTodoist();
    RedNavigationSection menuSectionTodoist= new RedNavigationSection();

    ProjectSection projectSection = new ProjectSection();
    SettingsProject settingsProject = new SettingsProject();
    TaskSection taskSection = new TaskSection();

    String user=GetProperties.getInstance().getUser();
    String password =GetProperties.getInstance().getPwd();

    @BeforeEach
    public void openBrowser(){
        Session.getInstance().getBrowser().get(GetProperties.getInstance().getHost());

    }

    @AfterEach
    public void closeBrowser(){
        Session.getInstance().closeSession();

    }

}
