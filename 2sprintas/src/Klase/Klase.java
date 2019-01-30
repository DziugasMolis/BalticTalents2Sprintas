package Klase;

import SpecifinioFailoSkaitymas.Zmogus;

import java.io.*;

public class Klase {
    public static void main(String[] args) {
        String duomenys = "C:\\Users\\Dziugas\\Desktop\\java objektinio pagrindai\\2sprintas\\src\\Klase\\Duomenys.txt";
        String atsakymai = "C:\\Users\\Dziugas\\Desktop\\java objektinio pagrindai\\2sprintas\\src\\Klase\\Atsakymai.txt";
        Integer[] pazMasyvas = {1,2,3,4,5};
        Mokinys mok = new Mokinys("Jonas", "Jonaitis", 5, pazMasyvas);
        Mokinys mok1 = new Mokinys();
        mok1.setVardas("Jonas");
        mok1.setPavarde("Jonaitis");
        mok1.setKlase(5);
        mok1.setPazymiuMasyvas(pazMasyvas);
        mok1.gautiMasyvaString();
//        System.out.println(mok1);
        Mokinys[] mokiniuMasyvas = skaityti(duomenys);
        Integer[] skaiciai = new Integer[0];
        for(int i = 0; i < mokiniuMasyvas.length; i++) {
            System.out.println(mokiniuMasyvas[i].vidurkis());
        }
        rasyti(atsakymai, mokiniuMasyvas);
    }

    public static Mokinys[] skaityti(String failas) {
        Mokinys[] objektuMasyvas = new Mokinys[0];
        String[] objektas = null;
        try (BufferedReader br = new BufferedReader(new FileReader(failas))) {
            String line = br.readLine();
            while (line != null) {
                objektas = line.split(" ");
                String vardas = objektas[0];
                String pavarde = objektas[1];
                Integer amzius = Integer.parseInt(objektas[2]);
                String[] pazymiuMasyvasString = objektas[3].split(",");
                Integer[] pazymiai = gautiSkaiciuMasyva(pazymiuMasyvasString);

                 Mokinys obj = new Mokinys(vardas, pavarde, amzius, pazymiai);
                objektuMasyvas = pridetiMokiny(objektuMasyvas, obj);
                line = br.readLine();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Failas nerastas");
        } catch (Exception e) {
            System.out.println("something else went wrong");
        }

        return objektuMasyvas;
    }

    public static void rasyti(String failas, Mokinys[] mokiniuMasyvas) {
        try (BufferedWriter output = new BufferedWriter(new FileWriter(failas))) {
            for(int i = 0; i < mokiniuMasyvas.length; i++) {
                output.write(mokiniuMasyvas[i].toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Integer[] gautiSkaiciuMasyva(String[] skaiciai) {
        Integer[] skaiciuMasyvas = new Integer[skaiciai.length];
        for (int i = 0; i < skaiciai.length; i++) {
            try {
                skaiciuMasyvas[i] = Integer.parseInt(skaiciai[i]);
            } catch (NumberFormatException ex) {
                System.out.println(skaiciai[i] + " nera skaicius");
//                skaiciuMasyvas[i] = 0;
            }
        }
        return skaiciuMasyvas;
    }

    private static Mokinys[] pridetiMokiny(Mokinys[] products, Mokinys productToAdd) {
        Mokinys[] newProducts = new Mokinys[products.length + 1];
        System.arraycopy(products, 0, newProducts, 0, products.length);
        newProducts[newProducts.length - 1] = productToAdd;
        return newProducts;
    }
}
