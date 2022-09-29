package com.dxhotels.qa.ui;

import net.serenitybdd.screenplay.targets.Target;

public class Hotels {

    public static final Target PRICE = Target.
            the("Price").locatedBy("//p[@class='rate-number']");

    public static final Target HOTELS_QUANTITY = Target.
            the("Quantity").locatedBy("//p[@class='count']");
}
