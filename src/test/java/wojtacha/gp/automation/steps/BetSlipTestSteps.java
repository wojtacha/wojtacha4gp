package wojtacha.gp.automation.steps;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Steps;
import wojtacha.gp.automation.outcome.FootballMatchOutcome;
import wojtacha.gp.automation.tasks.SelectFootballEvent;
import wojtacha.gp.automation.tasks.Start;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class BetSlipTestSteps {

    @Steps
    UserSteps user;

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that (.*) opens William Hill premier league betting page$")
    public void thatJohnOpensWilliamHillPremierLeagueBettingPage(String name) throws Throwable {
        theActorCalled(name).wasAbleTo(Start.navigatingWilliamHillWebsite());
    }

    @And("^he selects (.*) football event with \"([^\"]*)\" outcome$")
    public void heSelectsAnyFootballEventWithOutcome(String eventName, FootballMatchOutcome footballMatchOutcome) throws Throwable {
        theActorInTheSpotlight().attemptsTo(SelectFootballEvent.named(eventName));
    }

    @When("^s?he bets £ '(.*)' for the home team to 'Win'$")
    public void heBets£AmountForTheHomeTeamToWin(double amount) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^user's prize should be properly calculated against the odds$")
    public void userSPrizeShouldBeProperlyCalculatedAgainstTheOdds() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

}
