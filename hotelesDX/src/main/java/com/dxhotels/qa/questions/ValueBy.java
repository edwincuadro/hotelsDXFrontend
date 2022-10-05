package com.dxhotels.qa.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.dxhotels.qa.ui.Hotels.TOTAL_PAY;

public class ValueBy implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {

        return TOTAL_PAY.resolveFor(actor).getText().replace("$", "").trim();
    }
    public static ValueBy pay(){
        return new ValueBy();
    }
}
