package com.dxhotels.qa.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class HotelSearch {
    public static final Target LOCATION = Target.
            the("Select location").locatedBy("(//input[@class='dx-texteditor-input'])[1]");

    public static final Target CITY = Target.
            the("Select location").locatedBy("//div[@class='dx-item-content dx-list-item-content'][normalize-space()='{0}']");

    public static final Target CHECKIN = Target
            .the("Select checkin calendar")
            .locatedBy("(//div[@class='dx-field-item-content dx-field-item-content-location-bottom']//div[@style='width: 100%; height: 29px;'])[1]");

    public static final Target CHECKIN_WRITE_DATE = Target
            .the("Write checkin date")
            .locatedBy("(//div[@class='dx-texteditor-container']//*[@class='dx-texteditor-input'])[2]");

    public static final Target SEARCH_BUTTON = Target
            .the("Search")
            .locatedBy("//div[@aria-label='SEARCH']//div[@class='dx-button-content']");
}

