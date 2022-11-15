package page.todoist;

import control.Button;
import control.Label;
import control.TextBox;
import org.openqa.selenium.By;

public class TaskSection {
    //CREAR
    public Label createNewTask = new Label(By.xpath("//span[@class='icon_add']"));
    public Button saveNewTaskButton = new Button(By.xpath("//button[@data-testid='task-editor-submit-button']"));

    //ACTUALIZAR
    public Label editTaskLabel = new Label(By.xpath("//div/button[@aria-label='Editar']"));
    public Label nameTaskLabel = new Label(By.xpath("//div[@aria-label='Nombre de la tarea']"));
    public TextBox editTaskTxtBox = new TextBox(By.xpath("//div[@class='public-DraftStyleDefault-block public-DraftStyleDefault-ltr']"));
    public Button saveUpdatedTaskButton = new Button(By.xpath("//span[text()='Guardar']"));

    //ELIMINAR
    public Button settingsTaksButton = new Button(By.xpath("//button[@class='more_actions_button']"));
    public Button deleteTaskButton = new Button(By.xpath("//div[text()='Eliminar tarea']"));
    public Button confirmDeleteTaskButton = new Button(By.xpath("//span[text()='Eliminar']"));

    public TaskSection(){}

    public void clickOnTask(String nameTask){
        Label taskCreated = new Label(By.xpath("//div[text()='"+nameTask+"']"));
        taskCreated.click();
    }

    public boolean isTaskDisplayedInList(String nameTask){
        Label taskCreated = new Label(By.xpath("//div[text()='"+nameTask+"']"));
        return taskCreated.isControlDisplayed();
    }

    public Label getTask(String nameTask){
        Label taskCreated = new Label(By.xpath("//div[text()='"+nameTask+"']"));
        return taskCreated;
    }



}
