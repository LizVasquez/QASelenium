package page.todoist;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class SettingsProject {

    //Actualizar
    public Button settingProjectButton = new Button(By.xpath("//*[@id='editor']/div[2]/header/div/div/button[3]"));
    public Button editProjectButton = new Button(By.xpath("//div[text()='Editar proyecto']"));
    public TextBox editProjectTextBox = new TextBox(By.xpath("//input[@id='edit_project_modal_field_name']"));
    public Button saveEditProjectButton = new Button(By.xpath("//button[text()='Guardar']"));

    //Eliminar
    public Button deleteProjectButton = new Button(By.xpath("//div[text()='Eliminar proyecto']"));
    public Button confirmDeleteProject = new Button(By.xpath("//span[text()='Eliminar']"));

}
