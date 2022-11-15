package page.yopmail;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;


public class WriteEmailSection {

    public TextBox destinationTextBox = new TextBox(By.xpath("//input[@aria-label='Recipient']"));

    public TextBox subjectTextBox = new TextBox(By.id("msgsubject"));
    public TextBox bodyTextBox = new TextBox(By.id("msgbody"));
    public Button sendMsgButton = new Button(By.id("msgsend"));
}
