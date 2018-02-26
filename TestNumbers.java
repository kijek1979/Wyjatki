package Wyjątki;

public class TestNumbers {

    public static void main(String[] args) {

        Numbers numbers = new Numbers();

        try {

        numbers.add(3, 4);

        int number3 = numbers.get(3);
        System.out.println(number3);

        numbers.add(20, 20);
        int nummer20 = numbers.get(20);
        System.out.println(nummer20);
    }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
    }

    }
}
