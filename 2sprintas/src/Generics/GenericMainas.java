package Generics;

import java.util.HashMap;

import static com.sun.org.apache.bcel.internal.classfile.Utility.printArray;

public class GenericMainas {

//    1 UZD
//public static void main(String[] args) {
//    Integer[] intArray = { 1, 2, 3, 4, 5 };
//    Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
//    Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
//
//    System.out.println("Array integerArray contains:");
//    atspausdinti(intArray);   // pass an Integer array
//
//    System.out.println("\nArray doubleArray contains:");
//    atspausdinti(doubleArray);   // pass a Double array
//
//    System.out.println("\nArray characterArray contains:");
//    atspausdinti(charArray);   // pass a Character array
//}
//


    public static void main(String[] args) {
//        BendrineKlase<Integer> intBendr = new BendrineKlase<>();
//        intBendr.prideti(5);
//        System.out.println(intBendr);
//
//        BendrineKlase<String> strBendr = new BendrineKlase<>();
//        strBendr.prideti("Labas, cia bendrine klase");
//        System.out.println(strBendr);
//
//        DviejuTipu<String, Integer> p1 = new DviejuTipu<>("Even", 8);
//        DviejuTipu<String, String> p2 = new DviejuTipu<>("hello", "world");
//        System.out.println(p1.getKey() + " " + p1.getValue());
//        HashMap<String, Integer> map = new HashMap<>();
//        map.put("key", 0);
//        map.put("key", 1);
//        System.out.println(map.toString());
//        System.out.println(map.get("key"));


        Integer[] arr = {3, 4, 1, 5};
        selectionSort(arr);
        atspausdinti(arr);

        String[] arrStr = {"bbb", "abc", "ABC", "B", "C", "ccccc", "dd"};
        selectionSort(arrStr);
        atspausdinti(arrStr);
    }

    public static <E> void atspausdinti( E[] inputArray ) {
        // Display array elements
        for(E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    public <T> int reikšmiųKiekis(T[] visos, T reikšmė) {
        int kiekis = 0;
        if (reikšmė == null) {
            for (T eilinė : visos)
                if (eilinė == null) kiekis++;
        } else {
            for (T eilinė : visos)
                if (reikšmė.equals(eilinė)) kiekis++;
        }
        return kiekis;
    }

    private static <E> void swap(E[] a, int i, int j) {
        if (i != j) {
            E temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }

    public static <E extends Comparable<E>> void selectionSort(E[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            // find index of smallest element
            int smallest = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j].compareTo(a[smallest]) <= 0) {
                    smallest = j;
                }
            }
            swap(a, i, smallest);  // swap smallest to front
        }
    }


}
