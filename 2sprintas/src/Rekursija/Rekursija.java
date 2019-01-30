package Rekursija;

public class Rekursija {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        forLoop(2, array);

    }

    private static void forLoop(int i, int[] array) {
        if (i < array.length) {
            System.out.println(array[i]);
            forLoop(++i, array);
        }
    }

}
