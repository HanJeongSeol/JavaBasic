package week04.homwork4;

import week04.homwork4.step4.CalculatorApp;

public class Main {
    public static void main(String[] args) {
        boolean calculateEnded = false;

        while (!calculateEnded) {
            try {
                calculateEnded = CalculatorApp.start();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
