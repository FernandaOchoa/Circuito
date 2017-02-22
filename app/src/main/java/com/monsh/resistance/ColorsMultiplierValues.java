package com.monsh.resistance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ColorsMultiplierValues {

    public static Map<String, Double> getMultiplierColorsValue() {
        Map<String, Double> colorsValues;
        colorsValues = new HashMap<>();
        colorsValues.put("#000000", 0.0); //black
        colorsValues.put("#582900", 1.0); //brown
        colorsValues.put("#FF0000", 2.0); //red
        colorsValues.put("#ED7F10", 3.0); //orange
        colorsValues.put("#FFFF00", 4.0); //yellow
        colorsValues.put("#096A09", 5.0); //green
        colorsValues.put("#0000FF", 6.0); //blue
        colorsValues.put("#660099", 7.0); //violet
        colorsValues.put("#FFD700", -1.0); //gold
        colorsValues.put("#CECECE", -2.0); //silver

        return colorsValues;
    }

    public static List<String> ringsMultiplierColors() {
        Set myColors = getMultiplierColorsValue().keySet(); //retourne la liste des clés du Map
        List listOfMyColors = new ArrayList(myColors); //conversion du Set en List
        AlgorithmToSort.sortListColorsRing4(listOfMyColors); // utilisation de l'algorithme de trie
        return listOfMyColors;
    }

}
