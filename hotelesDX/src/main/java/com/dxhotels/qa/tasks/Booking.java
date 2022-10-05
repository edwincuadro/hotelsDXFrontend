package com.dxhotels.qa.tasks;

import com.dxhotels.qa.interactions.Wait;
import com.dxhotels.qa.models.BookingData;
import com.dxhotels.qa.utils.Quantity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.text.ParseException;

import static com.dxhotels.qa.ui.HotelSearch.*;

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

        try {
            //actor recuerda los dias calculados por las fechas ingresadas
            actor.remember("days", Quantity.ofDays(bookingData.getCheckIn(),
                    bookingData.getCheckOut()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    public static Booking booking(BookingData bookingData){
        return new Booking(bookingData);
    }
}
