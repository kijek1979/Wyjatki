package Wyjątki.Zadanie_podejscie2;

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

    public double add(double a, double b) {
        setX(a);
        setY(b);

        return getX() + getY();
    }

    public double subt(double a, double b) throws InputMismatchException {
        if (this.getX() == 4) {
            throw new InputMismatchException("zły typ liczbowy");
        }


        setX(a);
        setY(b);

        return getX() - getY();
    }

    public double multi(double a, double b) {
        setX(a);
        setY(b);

        return getX() * getY();
    }

    public double divid(double a, double b) throws ArithmeticException {
        if (this.getY() == 0) {
            throw new ArithmeticException("nie dzielimy przez zero");
        }
        setX(a);
        setY(b);


        return getX() / getY();
    }


}
