package page.todoist;

import control.Label;
import org.openqa.selenium.By;

public class MainPageTodoist {
    public Label loginLabelTodoist = new Label(By.xpath("//ul/li/a[@href='/auth/login']"));
}
