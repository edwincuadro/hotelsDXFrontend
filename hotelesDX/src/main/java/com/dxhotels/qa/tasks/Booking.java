package com.dxhotels.qa.tasks;

import com.dxhotels.qa.models.BookingData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.dxhotels.qa.ui.HotelSearch.CITY;
import static com.dxhotels.qa.ui.HotelSearch.LOCATION;

public class Booking implements Task {
    private BookingData bookingData;
    public Booking(BookingData bookingData){
        this.bookingData = bookingData;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LOCATION));
        actor.attemptsTo(Click.on(CITY.of(bookingData.getLocation())));

    }
    public static Booking booking(BookingData bookingData){
        return new Booking(bookingData);
    }
}
