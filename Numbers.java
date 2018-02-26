package Wyjątki;

public class Numbers {
    private int[] numbers;

    public Numbers() {
        numbers = new int[10];
    }

    public void add(int index, int number) throws ArrayIndexOutOfBoundsException {
        if (index < 0){
            throw new ArrayIndexOutOfBoundsException("indeks musi byc wiekszy od 0");
        }else  if (index >= numbers.length){
            throw new ArrayIndexOutOfBoundsException("indeks musi byc mniejszy od rozmiaru tablicy "+numbers.length);
        }
        numbers[index] = number;
    }

    public int get(int index) throws ArrayIndexOutOfBoundsException {
        if (index < 0 || index >= numbers.length){
            throw  new ArrayIndexOutOfBoundsException(index);
        }
        return numbers[index];
    }



}
