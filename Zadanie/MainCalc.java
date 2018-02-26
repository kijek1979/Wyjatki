package Wyjątki.Zadanie;

import java.util.Scanner;

public class MainCalc {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        boolean flaga = true;

        while (flaga) {
            double suma;
            System.out.print("podaj liczbe: ");
            calculator.setX(scanner.nextDouble());
            scanner.nextLine();
            System.out.print("podaj operator: ");
            String operator = scanner.nextLine();

            if (operator.equals("+")) {
                System.out.print("podaj liczbe: ");
                double nextDouble = scanner.nextDouble();
                scanner.nextLine();
                suma = calculator.czyDouble(calculator.getX()) + nextDouble;
                System.out.println(suma);
                System.out.print("podaj operator: ");
                String nextOperator = scanner.nextLine();
                if (nextOperator.equals("+")) {
                    continue;
                } else if (nextOperator.equals("=")) {
                    System.out.println(suma);
                    break;
                }

                flaga = true;

            }

        }
    }
}
