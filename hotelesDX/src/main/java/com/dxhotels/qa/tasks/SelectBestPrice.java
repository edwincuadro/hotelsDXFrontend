package com.dxhotels.qa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static com.dxhotels.qa.ui.Hotels.HOTELS_QUANTITY;
import static com.dxhotels.qa.ui.Hotels.PRICE;

public class SelectBestPrice implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        String price = BrowseTheWeb.as(actor).findBy(PRICE.getCssOrXPathSelector()).getText();
        int bestPrice = Integer.parseInt(price);//price
        //System.out.println(bestPrice);
        String hQuantity = BrowseTheWeb.as(actor).findBy(HOTELS_QUANTITY.getCssOrXPathSelector()).getText();
        String spread = hQuantity.split(",")[0];
        int quantity = Integer.parseInt(spread);
        //System.out.println(quantity);
        int menor = bestPrice;
        for (int i = 0; i < quantity; i++) {
            if(menor > bestPrice){
                menor = bestPrice;
            }

        }
    }
    public static SelectBestPrice selectBestPrice(){
        return new SelectBestPrice();
    }
}
