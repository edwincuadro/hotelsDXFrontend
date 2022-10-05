package com.dxhotels.qa.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.text.DecimalFormat;

public class TotalBy implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        int days = actor.recall("days");
        double total = Double.parseDouble(actor.recall("cheaper"));
        total = total * days;
        return decimals(total);
    }
    private String decimals(double total){
        DecimalFormat mf = new DecimalFormat("0.00");
        mf.setMinimumFractionDigits(2);
        return mf.format(total);
    }
    public static TotalBy days(){
        return new TotalBy();
    }
}
