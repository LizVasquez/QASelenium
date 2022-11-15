package testSuite.todoist;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class CRUDTaskTodoist extends TestBaseTodoist{

    @Test
    public void verifyTaskTodoist() {

        String projectCreated2="Proof"+new Date().getTime();

        String taskCreated = "PruebaTarea" + new Date().getTime();
        String taskUpdated = "TareaActualizada" + new Date().getTime();

        //Entra a la pagina
        mainPageTodoist.loginLabelTodoist.click();

        //se loguea
        loginTodoist.emailTxtBoxTodoist.setText(user);
        loginTodoist.passTxtBoxTodoist.setText(password);
        loginTodoist.loginButtonTodoist.click();
        Assertions.assertTrue(menuSectionTodoist.productivityButton.isControlDisplayed(), "Error! the login was failed");

        //crea un proyecto
        projectSection.newProjectButton.click();
        projectSection.nameNewProjectTxtBox.setText(projectCreated2);
        projectSection.createNewProjectSave.click();

        projectSection.clickOnProject(projectCreated2);
        Assertions.assertTrue(projectSection.isProjectDisplayedInList(projectCreated2),"ERROR! the project was not created");

        //crear una tarea
        taskSection.createNewTask.click();
        taskSection.editTaskTxtBox.setText(taskCreated);
        taskSection.saveNewTaskButton.click();

        taskSection.clickOnTask(taskCreated);
        Assertions.assertTrue(taskSection.isTaskDisplayedInList(taskCreated), "ERROR the task was not created");

        //editar una tarea
        taskSection.editTaskLabel.click();
        taskSection.getTask(taskCreated).waitControlIsNotInThePage();
        //taskSection.nameTaskLabel.click();
        //taskSection.editTaskTxtBox.cleanSetText(taskUpdated);
        //taskSection.saveUpdatedTaskButton.click();

        //Assertions.assertTrue(taskSection.isTaskDisplayedInList(taskUpdated), "Error the task was not updated");


        //eliminar
        taskSection.settingsTaksButton.click();
        taskSection.deleteTaskButton.click();
        taskSection.confirmDeleteTaskButton.click();
    }


}


