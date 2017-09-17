package wojtacha.gp.automation.steps;

import net.thucydides.core.annotations.Step;
import wojtacha.gp.automation.outcome.FootballMatchOutcome;
import wojtacha.gp.automation.pages.InPlayFootballPage;
import wojtacha.gp.automation.pages.WilliamHillDefaultFootballPage;

public class UserSteps {

    private WilliamHillDefaultFootballPage williamHillDefaultFootballPage;

    private InPlayFootballPage inPlayFootballPage;

    private static final String William_Hill_title = "William Hill Sports homepage";


    @Step
    public UserSteps selectFootballEventNamed(String keyword) {
        return null;
    }

    @Step
    public void with(FootballMatchOutcome footballMatchOutcome) {

    }


    @Step
    public void is_the_home_page() {
        inPlayFootballPage.open();
    }

}