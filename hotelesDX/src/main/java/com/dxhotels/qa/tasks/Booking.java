package com.dxhotels.qa.tasks;

import com.dxhotels.qa.models.BookingData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static com.dxhotels.qa.ui.HotelSearch.*;
import static com.dxhotels.qa.ui.Hotels.PRICE;

public class Booking implements Task {
    private BookingData bookingData;
    public Booking(BookingData bookingData){
        this.bookingData = bookingData;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LOCATION));
        actor.attemptsTo(Click.on(CITY.of(bookingData.getLocation())));
        actor.attemptsTo(Click.on(CHECKIN));
        actor.attemptsTo(Enter.theValue(bookingData.getCheckIn()).into(CHECKIN_WRITE_DATE).thenHit(Keys.ENTER));
        actor.attemptsTo(Click.on(SEARCH_BUTTON));
    }
    public static Booking booking(BookingData bookingData){
        return new Booking(bookingData);
    }
}
