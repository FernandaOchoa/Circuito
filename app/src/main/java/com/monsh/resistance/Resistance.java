package com.monsh.resistance;



public class Resistance {

    private static int nbAnneaux;
    private double[] tabDouble = {0.0, 0.0, 1.0, 0.0, 20.0, 0.0};
    private static double valResistance;
    private static double val, val2, val3, val4, val5, val6;

    public Resistance(double val, double val2, double val3, double val4) {
        tabDouble[0] = val;
        tabDouble[1] = val2;
        tabDouble[2] = val3;
        tabDouble[3] = val4;
        tabDouble[4] = 20.0;
        tabDouble[5] = 0.0;

    }

    public static int getNbAnneaux() {
        return nbAnneaux;
    }

    public static void setNbAnneaux(int nbAnneaux) {
        Resistance.nbAnneaux = nbAnneaux;
    }

    public double[] getTabDouble() {
        return tabDouble;
    }

    public void setTabDouble(double[] tabDouble) {
        this.tabDouble = tabDouble;
    }

    public static double getValResistance() {
        return valResistance;
    }

    public static void setValResistance(double valResistance) {
        Resistance.valResistance = valResistance;
    }

    public static double getVal() {
        return val;
    }

    public static void setVal(double val) {
        Resistance.val = val;
    }

    public static double getVal2() {
        return val2;
    }

    public static void setVal2(double val2) {
        Resistance.val2 = val2;
    }

    public static double getVal3() {
        return val3;
    }

    public static void setVal3(double val3) {
        Resistance.val3 = val3;
    }

    public static double getVal4() {
        return val4;
    }

    public static void setVal4(double val4) {
        Resistance.val4 = val4;
    }

    public static double getVal5() {
        return val5;
    }

    public static void setVal5(double val5) {
        Resistance.val5 = val5;
    }

    public static double getVal6() {
        return val6;
    }

    public static void setVal6(double val6) {
        Resistance.val6 = val6;
    }
}
