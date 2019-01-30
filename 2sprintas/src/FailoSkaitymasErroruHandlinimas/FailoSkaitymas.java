package FailoSkaitymasErroruHandlinimas;

import java.io.*;

public class FailoSkaitymas {

    public static void main(String[] args) {
        String file = "C:\\Users\\Dziugas\\Desktop\\java objektinio pagrindai\\2sprintas\\src\\FailoSkaitymasErroruHandlinimas\\Duomenys1.txt";
        String atsakymai = "C:\\Users\\Dziugas\\Desktop\\java objektinio pagrindai\\2sprintas\\src\\FailoSkaitymasErroruHandlinimas\\Atsakymai.txt";
        System.out.println(skaityti(file));
        rasyti(atsakymai);
    }

    public static String skaityti(String failas) {
        String atsarginisFailas = "C:\\Users\\Dziugas\\Desktop\\java objektinio pagrindai\\2sprintas\\src\\FailoSkaitymasErroruHandlinimas\\Duomenys.txt";
        String visosEilutes = "";

        try (BufferedReader br = new BufferedReader(new FileReader(failas))) {
            String line = br.readLine();
            while (line != null) {
                visosEilutes += line + " ";
                line = br.readLine();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Failas nerastas");
            visosEilutes = skaityti(atsarginisFailas);
        } catch (Exception e) {
            System.out.println("something else went wrong");
        } finally {
            System.out.println("Skaitymas baigtas");
        }

        return visosEilutes;
    }

    public static void rasyti(String failas) {
        Integer[] masyvas = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        try (BufferedWriter output = new BufferedWriter(new FileWriter(failas))) {
        output.write(grazintiMasyvoNari(masyvas, 1) + "\n");
            output.write(grazintiMasyvoNari(masyvas, 99) + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Integer grazintiMasyvoNari(Integer[] masyvas, Integer indeksas) {
        try {
            return masyvas[indeksas];
        } catch (ArrayIndexOutOfBoundsException ex) {
            return masyvas[masyvas.length - 1];
        }
    }

    public static char grazintiMasyvoNari(String zodis, Integer indeksas) {
        char[] zodzioRaides = zodis.toCharArray();
        try {
            return zodzioRaides[indeksas];
        } catch (ArrayIndexOutOfBoundsException ex) {
            return zodzioRaides[zodzioRaides.length - 1];
        }
    }
}
