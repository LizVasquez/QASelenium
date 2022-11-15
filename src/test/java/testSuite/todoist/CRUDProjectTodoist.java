package testSuite.todoist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class CRUDProjectTodoist extends TestBaseTodoist {

    @Test
    public void verifyCRUDTodoist(){
        //EJERCICIO 2
        String projectCreated="Prueba"+new Date().getTime();
        String projectUpdated="Actualizado"+new Date().getTime();

        mainPageTodoist.loginLabelTodoist.click();

        loginTodoist.emailTxtBoxTodoist.setText(user);
        loginTodoist.passTxtBoxTodoist.setText(password);
        loginTodoist.loginButtonTodoist.click();
        Assertions.assertTrue(menuSectionTodoist.productivityButton.isControlDisplayed(), "Error! the login was failed");

        projectSection.newProjectButton.click();
        projectSection.nameNewProjectTxtBox.setText(projectCreated);
        projectSection.createNewProjectSave.click();

        projectSection.clickOnProject(projectCreated);

        Assertions.assertTrue(projectSection.isProjectDisplayedInList(projectCreated),"ERROR! the project was not created");

//------ACTUALIZA PROJECT

        settingsProject.settingProjectButton.click();
        settingsProject.editProjectButton.click();
        settingsProject.editProjectTextBox.cleanSetText(projectUpdated);
        settingsProject.saveEditProjectButton.click();

        Assertions.assertTrue(projectSection.isProjectDisplayedInList(projectUpdated));
        projectSection.clickOnProject(projectUpdated);

//----------ELIMINA PROJECT
        settingsProject.settingProjectButton.click();
        settingsProject.deleteProjectButton.click();
        settingsProject.confirmDeleteProject.click();

        projectSection.getProject(projectUpdated).waitControlIsNotInThePage();
        Assertions.assertFalse(projectSection.isProjectDisplayedInList(projectUpdated),"ERROR! the project was not deleted");







    }
}
