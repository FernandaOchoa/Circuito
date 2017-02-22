package com.monsh.resistance;

import java.util.ArrayList;
import java.util.List;


public class ResitancesValuesList {

    /**
     * this class is to register the list of values of resistances from AddResistance class
     */

    private static List<String> valuesList = new ArrayList<>();

    public ResitancesValuesList(String resValue) {
        valuesList.add(resValue);
    }

    public static List<String> getValuesList() {
        return valuesList;
    }

    public static void setValuesList(List<String> valuesList) {
        ResitancesValuesList.valuesList = valuesList;
    }
}
