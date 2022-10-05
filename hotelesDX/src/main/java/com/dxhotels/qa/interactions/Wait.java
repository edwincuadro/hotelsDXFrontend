package com.dxhotels.qa.interactions;

import net.serenitybdd.core.time.InternalSystemClock;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

public class Wait implements Interaction {
    private int seconds;
    public Wait(int seconds){
        this.seconds = seconds;
    }
    @Override
    public <T extends Actor> void performAs(T time) {
        new InternalSystemClock().pauseFor(seconds*1000);

    }
    public static Wait waitTime(int seconds){
        return Tasks.instrumented(Wait.class, seconds);
    }
}

