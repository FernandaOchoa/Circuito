package com.monsh.resistance;

import java.util.List;

public class AlgorithmToSort {

    public static void sortListColorsRing123(List<String> list) {
        String tmp;
        int k = 0;

        for (int i = 0; i < list.size(); i++) {
            tmp = list.get(k);
            if (list.get(i).equals("#000000")) { //Black">#000000
                list.set(k, list.get(i));
                list.set(i, tmp);
            }
        }
        k++;
        for (int i = 0; i < list.size(); i++) {
            tmp = list.get(k);
            if (list.get(i).equals("#582900")) {//Brown">#582900
                list.set(k, list.get(i));
                list.set(i, tmp);
            }
        }
        k++;
        for (int i = 0; i < list.size(); i++) {
            tmp = list.get(k);
            if (list.get(i).equals("#FF0000")) {//Red">#FF0000
                list.set(k, list.get(i));
                list.set(i, tmp);
            }
        }
        k++;
        for (int i = 0; i < list.size(); i++) {//Orange">#ED7F10
            tmp = list.get(k);
            if (list.get(i).equals("#ED7F10")) {
                list.set(k, list.get(i));
                list.set(i, tmp);
            }
        }
        k++;
        for (int i = 0; i < list.size(); i++) {
            tmp = list.get(k);
            if (list.get(i).equals("#FFFF00")) {//Yellow">#FFFF00
                list.set(k, list.get(i));
                list.set(i, tmp);
            }
        }
        k++;
        for (int i = 0; i < list.size(); i++) {//Green">#096A09
            tmp = list.get(k);
            if (list.get(i).equals("#096A09")) {
                list.set(k, list.get(i));
                list.set(i, tmp);
            }
        }
        k++;
        for (int i = 0; i < list.size(); i++) {
            tmp = list.get(k);
            if (list.get(i).equals("#0000FF")) {//Blue">#0000FF
                list.set(k, list.get(i));
                list.set(i, tmp);
            }
        }
        k++;
        for (int i = 0; i < list.size(); i++) {
            tmp = list.get(k);
            if (list.get(i).equals("#660099")) {//Violet">#660099
                list.set(k, list.get(i));
                list.set(i, tmp);
            }
        }
        k++;
        for (int i = 0; i < list.size(); i++) {
            tmp = list.get(k);
            if (list.get(i).equals("#606060")) {//Gray">#606060
                list.set(k, list.get(i));
                list.set(i, tmp);
            }
        }
        k++;
        for (int i = 0; i < list.size(); i++) {
            tmp = list.get(k);
            if (list.get(i).equals("#FFFFFF")) {//White">#FFFFFF
                list.set(k, list.get(i));
                list.set(i, tmp);
            }
        }

    }

    public static void sortListColorsRing4(List<String> list) {
        String tmp;
        int k = 0;
        for (int i = 0; i < list.size(); i++) {
            tmp = list.get(k);
            if (list.get(i).equals("#CECECE")) { //#CECECE SILVER
                list.set(k, list.get(i));
                list.set(i, tmp);
            }
        }
        k++;
        for (int i = 0; i < list.size(); i++) {
            tmp = list.get(k);
            if (list.get(i).equals("#FFD700")) { //#FFD700 GOLD
                list.set(k, list.get(i));
                list.set(i, tmp);
            }
        }
        k++;
        for (int i = 0; i < list.size(); i++) {
            tmp = list.get(k);
            if (list.get(i).equals("#000000")) { //Black">#000000
                list.set(k, list.get(i));
                list.set(i, tmp);
            }
        }
        k++;
        for (int i = 0; i < list.size(); i++) {
            tmp = list.get(k);
            if (list.get(i).equals("#582900")) {//Brown">#582900
                list.set(k, list.get(i));
                list.set(i, tmp);
            }
        }
        k++;
        for (int i = 0; i < list.size(); i++) {
            tmp = list.get(k);
            if (list.get(i).equals("#FF0000")) {//Red">#FF0000
                list.set(k, list.get(i));
                list.set(i, tmp);
            }
        }
        k++;
        for (int i = 0; i < list.size(); i++) {//Orange">#ED7F10
            tmp = list.get(k);
            if (list.get(i).equals("#ED7F10")) {
                list.set(k, list.get(i));
                list.set(i, tmp);
            }
        }
        k++;
        for (int i = 0; i < list.size(); i++) {
            tmp = list.get(k);
            if (list.get(i).equals("#FFFF00")) {//Yellow">#FFFF00
                list.set(k, list.get(i));
                list.set(i, tmp);
            }
        }
        k++;
        for (int i = 0; i < list.size(); i++) {//Green">#096A09
            tmp = list.get(k);
            if (list.get(i).equals("#096A09")) {
                list.set(k, list.get(i));
                list.set(i, tmp);
            }
        }
        k++;
        for (int i = 0; i < list.size(); i++) {
            tmp = list.get(k);
            if (list.get(i).equals("#0000FF")) {//Blue">#0000FF
                list.set(k, list.get(i));
                list.set(i, tmp);
            }
        }
        k++;
        for (int i = 0; i < list.size(); i++) {
            tmp = list.get(k);
            if (list.get(i).equals("#660099")) {//Violet">#660099
                list.set(k, list.get(i));
                list.set(i, tmp);
            }
        }
    }

    public static void sortListColorsRing5(List<String> list) {
        String tmp;
        int k = 0;
        k++;
        for (int i = 0; i < list.size(); i++) {
            tmp = list.get(k);
            if (list.get(i).equals("#CECECE")) { //#CECECE"); SILVER
                list.set(k, list.get(i));
                list.set(i, tmp);
            }
        }
        k++;
        for (int i = 0; i < list.size(); i++) {
            tmp = list.get(k);
            if (list.get(i).equals("#FFD700")) { //#FFD700"); GOLD
                list.set(k, list.get(i));
                list.set(i, tmp);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            tmp = list.get(k);
            if (list.get(i).equals("#000000")) { //Black">#000000
                list.set(k, list.get(i));
                list.set(i, tmp);
            }
        }
        k++;
        for (int i = 0; i < list.size(); i++) {
            tmp = list.get(k);
            if (list.get(i).equals("#582900")) {//Brown">#582900
                list.set(k, list.get(i));
                list.set(i, tmp);
            }
        }
        k++;
        for (int i = 0; i < list.size(); i++) {
            tmp = list.get(k);
            if (list.get(i).equals("#FF0000")) {//Red">#FF0000
                list.set(k, list.get(i));
                list.set(i, tmp);
            }
        }
        k++;
        for (int i = 0; i < list.size(); i++) {//Green">#096A09
            tmp = list.get(k);
            if (list.get(i).equals("#096A09")) {
                list.set(k, list.get(i));
                list.set(i, tmp);
            }
        }
        k++;
        for (int i = 0; i < list.size(); i++) {
            tmp = list.get(k);
            if (list.get(i).equals("#0000FF")) {//Blue">#0000FF
                list.set(k, list.get(i));
                list.set(i, tmp);
            }
        }
        k++;
        for (int i = 0; i < list.size(); i++) {
            tmp = list.get(k);
            if (list.get(i).equals("#660099")) {//Violet">#660099
                list.set(k, list.get(i));
                list.set(i, tmp);
            }
        }
        k++;
        for (int i = 0; i < list.size(); i++) {
            tmp = list.get(k);
            if (list.get(i).equals("#606060")) {//Gray">#606060
                list.set(k, list.get(i));
                list.set(i, tmp);
            }
        }
        k++;
    }

    public static void sortListColorsRing6(List<String> list) {
        String tmp;
        int k = 0;
        for (int i = 0; i < list.size(); i++) {
            tmp = list.get(k);
            if (list.get(i).equals("#582900")) {//Brown">#582900
                list.set(k, list.get(i));
                list.set(i, tmp);
            }
        }
        k++;
        for (int i = 0; i < list.size(); i++) {
            tmp = list.get(k);
            if (list.get(i).equals("#FF0000")) {//Red">#FF0000
                list.set(k, list.get(i));
                list.set(i, tmp);
            }
        }
        k++;
        for (int i = 0; i < list.size(); i++) {//Orange">#ED7F10
            tmp = list.get(k);
            if (list.get(i).equals("#ED7F10")) {
                list.set(k, list.get(i));
                list.set(i, tmp);
            }
        }
        k++;
        for (int i = 0; i < list.size(); i++) {
            tmp = list.get(k);
            if (list.get(i).equals("#FFFF00")) {//Yellow">#FFFF00
                list.set(k, list.get(i));
                list.set(i, tmp);
            }
        }
        k++;
        for (int i = 0; i < list.size(); i++) {
            tmp = list.get(k);
            if (list.get(i).equals("#0000FF")) {//Blue">#0000FF
                list.set(k, list.get(i));
                list.set(i, tmp);
            }
        }
        k++;
        for (int i = 0; i < list.size(); i++) {
            tmp = list.get(k);
            if (list.get(i).equals("#660099")) {//Violet">#660099
                list.set(k, list.get(i));
                list.set(i, tmp);
            }
        }
        k++;
        for (int i = 0; i < list.size(); i++) {
            tmp = list.get(k);
            if (list.get(i).equals("#FFFFFF")) {//White">#FFFFFF
                list.set(k, list.get(i));
                list.set(i, tmp);
            }
        }

    }

}
