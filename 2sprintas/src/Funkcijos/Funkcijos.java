package Funkcijos;

public class Funkcijos {

    public static void main(String[] args) {


//        Integer skaicius = 1;
        //atspausdintiString("aaaa", "bbbb", "cccc");

//        Primitive tipo, kopijuojama tik reiksme
//        int skaiciusPrim = 1;
//        padidintiReiksmeVienetu(skaiciusPrim);
//        System.out.println(skaiciusPrim);

//        masyvas ar objektas
//        int[] array = {1, 2, 3, 4, 5};
//        pakeistiMasyva(array);
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
//        Integer skaicius = 1;
//        padidintiReiksmeVienetu(skaicius);
//        System.out.println(skaicius);
//        String
//        String a = "Labas";
//        String b = a;
//        pakeistiString(a);
//        System.out.println(a);
//        System.out.println(b);
        Integer[] masyvas = {1, 2, 3, 4, 5, 6, 7, 8};
//        Integer suma = suma(masyvas);
        pakeistiMasyva(masyvas);
        for (int i = 0; i < masyvas.length; i++) {
            System.out.println(masyvas[i]);
        }
    }

    public static void padidintiReiksmeVienetu(Integer a) {
        a += 1;
        System.out.println("Metode " + a);
    }

    public static void pakeistiMasyva(int[] masyvas) {
        masyvas[0] = 999;
    }

    public static void pakeistiString(String a) {
        a = a + "Vakaras";
    }

    public static void atspausdintiString(String... args) {
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
    }

    public static Integer suma(Integer[] masyvas) {
        int suma = 0;
        for (int i = 0; i < masyvas.length; i++) {
            if (suma > 4) {
                return suma;
            }
            suma += masyvas[i];
        }
        return suma;
    }


    public static void pakeistiMasyva(Integer[] masyvas) {
        int suma = 0;
        for (int i = 0; i < masyvas.length; i++) {
            if (suma > 4) {
                masyvas[i] = 999;
                continue;
            }
            suma += masyvas[i];
        }
    }
}
