package com.dxhotels.qa.calculator;

import java.util.ArrayList;
import java.util.List;

public class CalculePrice {
    static double value = 0;
    private static String valueBack;
    static int position;

    public static List<String>menorPrice(ArrayList<ArrayList<String>> list1) {
        List<String> result = new ArrayList<>();
        value = Double.parseDouble(list1.get(0).get(0).replace("$", ""));

        for (int i = 0; i < list1.size(); i++) {
            if (Double.parseDouble(list1.get(i).get(0).replace("$", "")) <= value) {
                valueBack = list1.get(i).get(0);
                position = i + 1;
            }
        }
        result.add(String.valueOf(position));
        result.add(valueBack);

        return result;
    }
}
