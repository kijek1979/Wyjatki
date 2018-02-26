package Wyjątki.Zadanie;

import java.util.InputMismatchException;

public class Calculator {

    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Calculator(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Calculator(double x) {
        this.x = x;
    }

    public Calculator() {
    }

    public double czyDouble(double x) {

        try {
            x = getX();

        } catch (InputMismatchException ex) {
            System.out.println("podano nieprawidłowy typ liczby");
        }

        return x;

    }


}
