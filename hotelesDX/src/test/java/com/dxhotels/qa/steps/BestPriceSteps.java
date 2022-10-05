package com.dxhotels.qa.steps;

import com.dxhotels.qa.models.BookingData;
import com.dxhotels.qa.questions.TotalBy;
import com.dxhotels.qa.questions.ValueBy;
import com.dxhotels.qa.tasks.Booking;
import com.dxhotels.qa.tasks.OpenBrowser;
import com.dxhotels.qa.tasks.SelectBestPrice;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class BestPriceSteps {
    @Managed
    private WebDriver browser;

    @Before
    public void setUp(){
    browser.manage().window().maximize();
    setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(browser)));
    theActorCalled("A analyst");
    }
    @Given("^user is on the site$")
    public void userIsOnTheSite() {
        OnStage.theActorInTheSpotlight().attemptsTo(OpenBrowser.getUpBrowser());
    }

    @When("^user input details$")
    public void userInputDetails(List<BookingData> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(Booking.booking(data.get(0)));
    }

    @Then("^user can select the cheaper hotel price and \"([^\"]*)\"$")
    public void userCanSelectTheCheaperHotelPrice(String totalPay) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(TotalBy.days(),
                Matchers.equalTo(totalPay)), GivenWhenThen.seeThat(ValueBy.pay(), Matchers.equalTo(totalPay)));
    }
}
