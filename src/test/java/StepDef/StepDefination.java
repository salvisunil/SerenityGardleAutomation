package StepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class StepDefination {
    @Steps
    StepLoginPage loginPage;
    @Steps
    StepDashboardPage dashPage;

    @Given("User is on Home page")
    public void openApplication(){

        loginPage.open();
        try {
            Thread.sleep(30);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("page is opened");
    }
    @When("User enters username as {string}")
        public void enterUsername(String userName){
        System.out.println("Enter Username");
        loginPage.inputUserName(userName);
    }
    @When("User enters password as{string}")
    public void enterPassword(String password){
        loginPage.inuputPassword(password);
        loginPage.clickLogin();

    }
    @Then("User should be able to able to login successfully")
    public void clickQnLoginButton(){
        dashPage.LoginVerify();
    }

}
