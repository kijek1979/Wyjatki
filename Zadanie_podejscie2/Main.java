package Wyjątki.Zadanie_podejscie2;

import javafx.scene.transform.Scale;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean flaga = true;

        while (flaga) {
            try {
                System.out.println("podal liczbe 1-szą");
                double liczba1 = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("podaj operator działania +,-,* lub /");
                String operator = scanner.nextLine();
                System.out.println("podaj liczbe 2-gą");
                double liczba2 = scanner.nextByte();
                Calculator calculator1 = new Calculator(liczba1, liczba2);
                if (operator.equals("+".trim())) {
                    System.out.println(calculator1.add(calculator1.getX(), calculator1.getY()));
                    break;
                } else if (operator.equals("-".trim())) {
                    System.out.println(calculator1.getX() - calculator1.getY());
                    break;
                } else if (operator.equals("*".trim())) {
                    System.out.println(calculator1.getX() * calculator1.getY());
                    break;
                } else if (operator.equals("/")) {
                    System.out.println(calculator1.getX() / calculator1.getY());
                    break;
                } else {
                    throw new WrongOperatorException();

                }

            } catch (InputMismatchException ex) {
                System.err.println("podano nieprawidłowy typ liczbowy");

            } catch (WrongOperatorException ex) {
                System.err.println("zły operator");
            }
        }
        scanner.close();

    }


}
