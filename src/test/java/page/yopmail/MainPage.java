package page.yopmail;


import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class MainPage {
    public TextBox userTxtBox = new TextBox(By.id("login"));
    public Button enterButton = new Button(By.id("refreshbut"));
}
