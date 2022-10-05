package com.dxhotels.qa.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Quantity {
    private Quantity() {
    }

    public static int ofDays(String fechaInicial, String fechaFinal) throws ParseException {

        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date initialDate = dateFormat.parse(fechaInicial);
        Date endDate = dateFormat.parse(fechaFinal);
        return (int)((endDate.getTime()-initialDate.getTime())/86400000)+1;

    }
}
