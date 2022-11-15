package page.todoist;

import control.Button;
import control.Label;
import control.TextBox;
import org.openqa.selenium.By;

public class ProjectSection {

    public Button newProjectButton = new Button(By.xpath("//*[local-name()='svg'][@height='13']"));
    public TextBox nameNewProjectTxtBox = new TextBox(By.xpath("//input[@id='edit_project_modal_field_name']"));
    public Button createNewProjectSave = new Button(By.xpath("//button[@class='ist_button ist_button_red']"));

    public ProjectSection(){}

    public void clickOnProject(String nameProject){
        Label projectCreated = new Label(By.xpath("//a/span[text()='"+nameProject+"']"));
        projectCreated.click();
    }

    public boolean isProjectDisplayedInList(String nameProject){
        Label projectCreated = new Label(By.xpath("//a/span[text()='"+nameProject+"']"));
        return projectCreated.isControlDisplayed();
    }

    public Label getProject(String nameProject){
        Label projectCreated = new Label(By.xpath("//a/span[text()='"+nameProject+"']"));
        return projectCreated;
    }
}
