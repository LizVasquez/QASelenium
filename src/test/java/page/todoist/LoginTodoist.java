package page.todoist;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class LoginTodoist {
    public TextBox emailTxtBoxTodoist = new TextBox(By.xpath("//input[@id='element-0']"));
    public TextBox passTxtBoxTodoist = new TextBox(By.xpath("//input[@id='element-3']"));
    public Button loginButtonTodoist = new Button(By.xpath("//button[@data-gtm-id='start-email-login']"));
}
