package wojtacha.gp.automation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import wojtacha.gp.automation.pages.WilliamHillDefaultFootballPage;
import wojtacha.gp.automation.questions.CustomerPageTitle;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.GivenWhenThen.then;
import static net.serenitybdd.screenplay.GivenWhenThen.when;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.hamcrest.Matchers.is;
import static wojtacha.gp.automation.questions.CustomerPageTitle.customerPageTitle;

public class Start implements Task {

    private WilliamHillDefaultFootballPage williamHillDefaultFootballPage;

    private static final String William_Hill_title = "William Hill Sports homepage";

    @Step
    public <T extends Actor> void performAs(T actor) {
        when(actor).attemptsTo(
                Open.browserOn().the(williamHillDefaultFootballPage));
        seeThat(customerPageTitle(),is(William_Hill_title));
    }

    public static Start navigatingWilliamHillWebsite() {
        return instrumented(Start.class);
    }
}