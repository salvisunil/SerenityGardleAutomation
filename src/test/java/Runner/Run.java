package Runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions (plugin = {"pretty"},features = "C:\\javapro\\SerenityGardleAutomation\\src\\test\\resources\\Features\\Login.feature",
        glue = "StepDef")
public class Run {

}
