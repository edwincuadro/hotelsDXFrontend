package com.dxhotels.qa.ui;

import net.serenitybdd.screenplay.targets.Target;

public class HotelSearch {
    public static final Target LOCATION = Target.
            the("Select location").locatedBy("(//input[@class='dx-texteditor-input'])[1]");

    public static final Target CITY = Target.
            the("Select location").locatedBy("//div[@class='dx-item-content dx-list-item-content'][normalize-space()='{0}']");
}

