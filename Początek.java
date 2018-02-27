package Wyjątki;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Początek {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
//        int[] numbers = new int[2];
////        boolean error = true;
////
////        while (error) {
////            try {
////                System.out.println("podaj 1 liczbe");
////                numbers[0]= scanner.nextInt();
////                scanner.nextLine();
////                System.out.println("podaj 2 liczbe");
////                numbers[1] = scanner.nextInt();
////                scanner.nextLine();
////                System.out.println("ktorą wartość wyswoetlic(1 czy 2)?");
////                System.out.println(numbers[scanner.nextInt()-1]);
////                error = false;
////            } catch (InputMismatchException ex) {
////                System.err.println("Nie podałes liczby całkowitej, spróbuj jeszcze raz");
////
////            }catch (ArrayIndexOutOfBoundsException ex) {
////                System.out.println("mialo byc 1 albo 2, zacznijmy od początku");
////            }finally {
////                scanner.nextLine();
////            }
////
////        }

//        int[] taqblica = new int[3];
//        int licznik = 0;
//        int licznik2 = 0;
//        //boolean flaga = true;
//
//
//           // while (taqblica.length <= 3){
//
//            try {
//                while (licznik <= 3) {
//
//                    System.out.println("podaj liczbe " + licznik2 + 1);
//                    taqblica[licznik] = scanner.nextInt();
//                    licznik++;
//
//
//                }
//            } catch (InputMismatchException ex) {
//                System.out.println(" podałes nieprawidłowy typ liczbowy");
//                System.out.println("pwiedz mi co dalej robić: koniec czy od nowa?");
//                scanner.nextLine();
//                String coDalej = scanner.nextLine();
//                if (coDalej.equals("koniec".toLowerCase().trim())) {
//                    System.out.println("koniec programu");
//                   //break;
//                } else if (coDalej.equals("od nowa".toLowerCase().trim())) {
//
//
//
//
//                }
//
//            }
        //}
//
//
//        try {
//            for (int x : taqblica
//                    ) {
//                System.out.print(x + ", ");
//            }
//        } catch (ArrayIndexOutOfBoundsException ex) {
//            System.out.println("wyswietalm błąd");


        //}
        int licznik = scanner.nextInt();
        int[] tablica = new int[2];
        boolean flaga = true;
while (flaga){
            try {
                for (int i = 0; i < licznik; i++) {
                    int liczba = scanner.nextInt();
                    tablica[i] = liczba;
                    System.out.println(tablica[i]);

                }

                flaga = false;


            } catch (Exception ex) {
                System.err.println("zly typ liczbowy");
                System.err.println("podales za duzo liczb");
                ex.printStackTrace();
            }finally {
                System.out.println("koniec");
            }
            //break;
        }


        scanner.close();

    }
}
