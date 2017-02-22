package com.monsh.resistance;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class ColorsValue {


    public static Map<String, Integer> getColorsValue() {
        Map<String, Integer> colorsValues;
        colorsValues = new HashMap<>();
        colorsValues.put("#000000", 0); //black
        colorsValues.put("#582900", 1); //brown
        colorsValues.put("#FF0000", 2); //red
        colorsValues.put("#ED7F10", 3); //orange
        colorsValues.put("#FFFF00", 4); //yellow
        colorsValues.put("#096A09", 5); //green
        colorsValues.put("#0000FF", 6); //blue
        colorsValues.put("#660099", 7); //violet
        colorsValues.put("#606060", 8); //gray
        colorsValues.put("#FFFFFF", 9); //white


        return colorsValues;
    }

    public static List<String> ringsColors() {
        Set myColors = getColorsValue().keySet();
        List<String> listOfMyColors = new ArrayList(myColors);
        AlgorithmToSort.sortListColorsRing123(listOfMyColors);
        return listOfMyColors;
    }


}
