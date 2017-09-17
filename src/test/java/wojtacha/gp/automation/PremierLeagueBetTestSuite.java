package wojtacha.gp.automation;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        tags = {"@grandparade"},
        features="src/test/resources/features/bet_on_football_premier_league")
public class PremierLeagueBetTestSuite {}
