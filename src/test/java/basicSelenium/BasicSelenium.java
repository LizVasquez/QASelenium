package basicSelenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Date;

public class BasicSelenium {
    WebDriver driver;

    @BeforeEach
    public void setup(){
        System.out.println("setup");
        System.setProperty("webdriver.chrome.driver","src/test/resources/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://todo.ly/");
    }

    @AfterEach
    public void cleanup(){
        System.out.println("cleanup");
        driver.quit();
    }

    @Test
    public void verifyCRUD() throws InterruptedException {
        // login
        driver.findElement(By.xpath("//img[contains(@src,'pagelogin')]")).click();
        driver.findElement(By.id("ctl00_MainContent_LoginControl1_TextBoxEmail")).sendKeys("liz7@liz.com");
        driver.findElement(By.id("ctl00_MainContent_LoginControl1_TextBoxPassword")).sendKeys("12345");
        driver.findElement(By.id("ctl00_MainContent_LoginControl1_ButtonLogin")).click();
        Thread.sleep(1000);
        Assertions.assertTrue(driver.findElement(By.id("ctl00_HeaderTopControl1_LinkButtonLogout")).isDisplayed()
                ,"ERROR login was incorrect");

        // create
        String nameProject="PruebaFinal";
        driver.findElement(By.xpath("//td[text()='Add New Project']")).click();
        driver.findElement(By.id("NewProjNameInput")).sendKeys(nameProject);
        driver.findElement(By.id("NewProjNameButton")).click();
        Thread.sleep(1000);
        int actualResult=driver.findElements(By.xpath(" //td[text()='"+nameProject+"'] ")).size();
        Assertions.assertTrue(actualResult >= 1
                ,"ERROR The project was not created");

        //nameProject="UpdateL"+new Date().getTime();

        //-------------- update
        //driver.findElement(By.xpath("//div[contains(@style,'block')]/img")).click();
        //driver.findElement(By.xpath("//ul[@id=\"projectContextMenu\"]//a[text()='Edit']")).click();
        //driver.findElement(By.xpath("//td/div/input[@id='ItemEditTextbox']")).clear();
        //driver.findElement(By.xpath("//td/div/input[@id='ItemEditTextbox']")).sendKeys(nameProject);
        //driver.findElement(By.xpath("//td/div/img[@id='ItemEditSubmit']")).click();
        //Thread.sleep(1000);
        //actualResult=driver.findElements(By.xpath(" //td[text()='"+nameProject+"'] ")).size();
        //Assertions.assertTrue(actualResult >= 1
         //       ,"ERROR The project was not updated");

        // -------------delete
        //driver.findElement(By.xpath("//div[contains(@style,'block')]/img")).click();
        //driver.findElement(By.id("ProjShareMenuDel")).click();
        //driver.switchTo().alert().accept();
        //Thread.sleep(1000);
        //actualResult=driver.findElements(By.xpath(" //td[text()='"+nameProject+"'] ")).size();
        //Assertions.assertTrue(actualResult == 0,"ERROR The project was not removed");

        //-------- create task
        String nameTask="PruebaNewTask";
        driver.findElement(By.xpath(" //td[text()='"+nameProject+"'] ")).click();
        driver.findElement(By.id("NewItemContentInput")).sendKeys(nameTask);
        driver.findElement(By.id("NewItemAddButton")).click();
        Thread.sleep(1000);

        //-------update task
        String nameTaskupdate="UpdateTask";
        driver.findElement(By.xpath("//div[@class='ItemContentDiv'] ")).click();
        driver.findElement(By.id("ItemEditTextbox")).clear();
        driver.findElement(By.id("ItemEditTextbox")).sendKeys(nameTaskupdate,Keys.ENTER);
        Thread.sleep(1000);
















    }
}
