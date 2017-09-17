package wojtacha.gp.automation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Attribute;

import static wojtacha.gp.automation.user_interface.WilliamHillMainComponents.CUSTOMER_TITLE;

public class CustomerPageTitle implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return Attribute.of(CUSTOMER_TITLE).named("title")
                .viewedBy(actor)
                .asString();
    }

    public static CustomerPageTitle customerPageTitle() {
        return new CustomerPageTitle();
    }
}
