package wojtacha.gp.automation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;
import wojtacha.gp.automation.pages.InPlayFootballPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectFootballEvent implements Task {

    private InPlayFootballPage inPlayFootballPage;

    private final String eventName;

    @Step
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(inPlayFootballPage.named(eventName))
        );
    }

    public static SelectFootballEvent named(String eventName) {
        return instrumented(SelectFootballEvent.class, eventName);
    }

    public SelectFootballEvent(String eventName) {
        this.eventName = eventName;
    }

}
