package GautiMasyvoElementa;


/*
Parašyti metodą, kuris gražintų iš masyvo bet kokį elementą,
įvedus netinkamą, programa aptiktų klaidą ir atspausdintų
į failą paskutinį masyvo elementą.

 */
public class GautiMasyvoElementa {

    public static void main(String[] args) {
        Integer[] masyvas = {1,2,3,4,5,6,7,8};
//        masyvas = iterptiElementaPagalIndeksa(masyvas, 2,10);
//        atspausdintiZodzioRaide();
        parseKlaida();
    }


    public static void masyvoKlaida() {
        int[] arr = new int[4];

        try {
            int i = arr[4];
            System.out.println("Inside try block");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(arr[arr.length-1]);
            System.out.println("Exception caught in catch block");
        } finally {
            System.out.println("finally block executed");
        }
    }

    public static void parseKlaida() {
        try {
            String str = "12s3";
            double num = Double.parseDouble(str);
            System.out.println("try block fully executed");
        } catch (NumberFormatException ex) {
            System.out.println("catch block executed...");

        } finally {
            System.out.println("finally block executed");
        }

        System.out.println("Outside try-catch-finally clause");
    }

    public static void atspausdintiZodzioRaide() {
        System.out.println(charAt("labas", 2));
    }

    public static char charAt(String zodis, int index) {
//        try {
            if ((index < 0) || (index >= zodis.length())) {
                throw new StringIndexOutOfBoundsException(index + " neegzistuoja");
            }
//        } catch (StringIndexOutOfBoundsException ex) {
//            System.out.println("Indekso reiksme neegzistuoja");
//        }
        return zodis.toCharArray()[index];
    }


    public static Integer[] iterptiElementaPagalIndeksa(Integer[] masyvas, Integer skaicius, Integer indeksas) {
        if((indeksas < 0) || (indeksas >= masyvas.length)) {
            throw new StringIndexOutOfBoundsException(indeksas + " neegzistuoja");
        }
        Integer[] tmp = new Integer[masyvas.length + 1];
        int pridejimoIndeksas = 0;
        for (int i = 0; i < masyvas.length; i++) {
            if (i == indeksas) {
                tmp[pridejimoIndeksas++] = skaicius;
            }
            tmp[pridejimoIndeksas++] = masyvas[i];

        }
        return tmp;
    }
}

