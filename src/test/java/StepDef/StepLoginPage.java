package StepDef;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class StepLoginPage extends PageObject {

    @Step("Enter Username")
    public void inputUserName(String username){
        $(By.xpath("//input[@placeholder='Username']")).sendKeys(username);

    }
    @Step("Enter Password")
    public void inuputPassword(String password){
        $(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
    }
    public void clickLogin(){
        $(By.xpath("//button[@type='submit']")).click();

    }
}
