package StepDef;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepDashboardPage extends PageObject {

    @Step("Successful login")
    public void LoginVerify(){
        String dashboardTitle = $(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")).getText();
        assertEquals(dashboardTitle,"Dashboard");
    }
}
