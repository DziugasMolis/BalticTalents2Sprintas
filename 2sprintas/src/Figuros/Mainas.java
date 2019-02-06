package Figuros;

import java.io.*;

public class Mainas {
    public static void main(String[] args) {
        String Duomenys = new File("").getAbsolutePath() + "\\src\\Figuros\\Duomenys.txt";
        String Atsakymai = new File("").getAbsolutePath() + "\\src\\Figuros\\Rezultatai.txt";;
//        Figuros objektuMasyvas = skaityti(Duomenys);
//        System.out.println(objektuMasyvas.didziausiasPerimetras().toString());
//        didziausias(objektuMasyvas);
//        rasyti(Atsakymai, objektuMasyvas);
        Kvadratas kvad = new Kvadratas(2d);
        kvad.perimetras();
        kvad.perimetras(kvad.getKrastine());
    }

    public static void didziausias(Figuros objektuMasyvas) {

        for(int i = 0; i < objektuMasyvas.getFiguruMasyvas().length; i++) {
            System.out.println(objektuMasyvas.getFiguruMasyvas()[i].perimetras());
        }


    }

    public static Figuros skaityti(String failas) {
        Figuros objektai = new Figuros();
        String[] objektas = null;
//        Integer eilutesIndeksas = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(failas))) {
            String line = br.readLine();
            while (line != null) {
                objektas = line.split(" ");
                Figura obj = new Figura();
                if (objektas.length == 1) {
                    obj = new Kvadratas(Double.parseDouble(objektas[0]));
                    objektai.pridetiFigura(obj);
                } else if (objektas.length == 2) {
                    obj = new Staciakampis(Double.parseDouble(objektas[0]), Double.parseDouble(objektas[1]));
                    objektai.pridetiFigura(obj);
                } else {
                    obj = new StaciakampisTrikampis(Double.parseDouble(objektas[0]),
                            Double.parseDouble(objektas[1]), Double.parseDouble(objektas[2]));
                    objektai.pridetiFigura(obj);
                }
//                objektuMasyvas[eilutesIndeksas] = obj;
//                eilutesIndeksas++;
                line = br.readLine();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Failas nerastas");
        } catch (Exception e) {
            System.out.println("something else went wrong");
        }
        return objektai;
    }
    public static void rasyti(String failas, Figuros figuruMasyvas) {
        try (BufferedWriter output = new BufferedWriter(new FileWriter(failas))) {
            for(int i = 0; i < figuruMasyvas.getFiguruMasyvas().length; i++) {
                output.write(figuruMasyvas.getFiguruMasyvas()[i].toString()+"\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
