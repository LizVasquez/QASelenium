package testSuite.yopmail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class TestYopMail  extends TestBase{
    @Test
    public void verifyMail(){
        String subject="Test"+new Date().getTime();
        String body="prueba"+new Date().getTime();


        //Entrar con usuario
        mainPage.userTxtBox.click();
        mainPage.userTxtBox.setText(user);
        mainPage.enterButton.click();
        Assertions.assertTrue(navigationPage.navigationInicioButton.isControlDisplayed(),"ERROR! the login was faield" );

        //EscribirEmail
        writeRefreshMailSection.writeMailButton.click();
        session.iframe("ifmail");
        writeEmailSection.destinationTextBox.setText(user);
        writeEmailSection.subjectTextBox.setText(subject);
        writeEmailSection.bodyTextBox.setText(body);
        writeEmailSection.sendMsgButton.click();

        session.backToMain();

        writeRefreshMailSection.refreshMailButton.click();




        //session.iframe("ifinbox");
        //writeRefreshMailSection.clickOnMail(subject);


        //writeRefreshMailSection.clickOnMail(subject);

        //writeRefreshMailSection.getMail(subject).waitControlIsNotInThePage();
        //Assertions.assertTrue(writeRefreshMailSection.isMailDisplayedInList(subject),"Error!");




    }
}
