package SpecifinioFailoSkaitymas;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class SpecifinioFailoSkaitymas {
    public static void main(String[] args) {
        String duomenys = "C:\\Users\\Dziugas\\Desktop\\java objektinio pagrindai\\2sprintas\\src\\SpecifinioFailoSkaitymas\\Duomenys.txt";
        Zmogus[] objektuMasyvas = skaityti(duomenys);
        for(int i = 0; i < objektuMasyvas.length; i++) {
            System.out.println(objektuMasyvas[i].toString());
        }
    }

    public static Zmogus[] skaityti(String failas) {
        Zmogus[] objektuMasyvas = new Zmogus[0];
        String[] objektas = null;
        try (BufferedReader br = new BufferedReader(new FileReader(failas))) {
            String line = br.readLine();
            while (line != null) {
                objektas = line.split(" ");
                String vardas = objektas[0];
                String pavarde = objektas[1];
                Integer amzius = Integer.parseInt(objektas[2]);
                String specialybe = objektas[3];
                Zmogus obj = new Zmogus(vardas, pavarde, amzius, specialybe);
                objektuMasyvas = pridetiZmogu(objektuMasyvas, obj);
                line = br.readLine();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Failas nerastas");
        } catch (Exception e) {
            System.out.println("something else went wrong");
        }

        return objektuMasyvas;
    }

    private static Zmogus[] pridetiZmogu(Zmogus[] products, Zmogus productToAdd) {
        Zmogus[] newProducts = new Zmogus[products.length + 1];
        System.arraycopy(products, 0, newProducts, 0, products.length);
        newProducts[newProducts.length - 1] = productToAdd;

        return newProducts;
    }
}
