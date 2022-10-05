package com.dxhotels.qa.tasks;

import com.dxhotels.qa.utils.CalculePrice;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.ArrayList;
import java.util.List;

import static com.dxhotels.qa.ui.Hotels.*;

public class SelectBestPrice implements Task {

    private ArrayList<String> values = new ArrayList<>();
    ArrayList<ArrayList<String>> listHotels = new ArrayList<>();
    @Override
    public <T extends Actor> void performAs(T actor) {
        for (int i = 0; i < HOTELS_DETAILS.resolveAllFor(actor).size(); i++) {
            values.add(PRICE.of(String.valueOf(i + 1)).resolveFor(actor).getText());
            listHotels.add(i, values);
            values = new ArrayList<>();
        }
        List<String> result = CalculePrice.menorPrice(listHotels);

        //To remember the best price
        actor.remember("cheaper", result.get(1).replace("$", ""));

        actor.attemptsTo(WaitUntil.the(BEST_PRICE.of(result.get(1).replace("$", "")),
                WebElementStateMatchers.isVisible()).forNoMoreThan(20).seconds(), Click.on(BEST_PRICE.of(result.get(1).replace("$", ""))));
    }
    public static SelectBestPrice selectBestPrice(){
        return Tasks.instrumented(SelectBestPrice.class);
    }
}
