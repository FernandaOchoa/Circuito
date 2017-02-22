package com.monsh.resistance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ColorsTemperatureCoefficientValues {

    public static Map<String, Double> getTemperatureCoefficientColorsValue() {
        Map<String, Double> colorsValues;
        colorsValues = new HashMap<>();
        colorsValues.put("#582900", 100.0); //brown
        colorsValues.put("#FF0000", 50.0); //red
        colorsValues.put("#FFFF00", 25.0); //yellow
        colorsValues.put("#ED7F10", 15.0); //orange
        colorsValues.put("#0000FF", 10.0); //blue
        colorsValues.put("#660099", 5.0); // violet
        colorsValues.put("#606060", 1.0); // gray

        return colorsValues;
    }

    public static List<String> ringsTemperatureCoefficientColors() {
        Set myColors = getTemperatureCoefficientColorsValue().keySet(); //retorna la lista de coef
        List<String> listOfMyColors = new ArrayList(myColors); //conversion del set de la lista
        AlgorithmToSort.sortListColorsRing6(listOfMyColors); //utiliamos el algoritmo para ordenar
        return listOfMyColors;
    }
}
