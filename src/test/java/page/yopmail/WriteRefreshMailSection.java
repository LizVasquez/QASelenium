package page.yopmail;

import control.Button;
import control.Label;
import org.openqa.selenium.By;

public class WriteRefreshMailSection {
    public Button writeMailButton = new Button(By.id("newmail"));
    public Button refreshMailButton = new Button(By.id("refresh"));

    public WriteRefreshMailSection(){}

    public void clickOnMail(String nameMail){
        Label mailCreated = new Label(By.xpath("//button/div[text()='"+nameMail+"']"));
        mailCreated.click();
    }

    public boolean isMailDisplayedInList(String nameMail){
        Label mailCreated = new Label(By.xpath("//button/div[text()='"+nameMail+"']"));
        return mailCreated.isControlDisplayed();
    }

    public Label getMail(String nameMail){
        Label mailCreated = new Label(By.xpath("//button/div[text()='"+nameMail+"']"));
        return mailCreated;
    }
}
