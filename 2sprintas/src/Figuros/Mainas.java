package Figuros;

import java.io.*;

public class Mainas {
    public static void main(String[] args) {
        String Duomenys = new File("").getAbsolutePath() + "\\src\\Figuros\\Duomenys.txt";
        String Atsakymai = new File("").getAbsolutePath() + "\\src\\Figuros\\Rezultatai.txt";;
        Figura[] objektuMasyvas = skaityti(Duomenys);
        rasyti(Atsakymai, objektuMasyvas);
    }

    public static Figura[] skaityti(String failas) {
        Figura[] objektuMasyvas = new Figura[7];
        String[] objektas = null;
        Integer eilutesIndeksas = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(failas))) {
            String line = br.readLine();
            while (line != null) {
                objektas = line.split(" ");
                Figura obj = new Figura();
                if (objektas.length == 1) {
                    obj = new Kvadratas(Double.parseDouble(objektas[0]));
                } else if (objektas.length == 2) {
                    obj = new Staciakampis(Double.parseDouble(objektas[0]), Double.parseDouble(objektas[1]));
                } else {
                    obj = new StaciakampisTrikampis(Double.parseDouble(objektas[0]),
                            Double.parseDouble(objektas[1]), Double.parseDouble(objektas[2]));
                }
                objektuMasyvas[eilutesIndeksas] = obj;
                eilutesIndeksas++;
                line = br.readLine();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Failas nerastas");
        } catch (Exception e) {
            System.out.println("something else went wrong");
        }
        return objektuMasyvas;
    }
    public static void rasyti(String failas, Figura[] figuruMasyvas) {
        try (BufferedWriter output = new BufferedWriter(new FileWriter(failas))) {
            for(int i = 0; i < figuruMasyvas.length; i++) {
                output.write(figuruMasyvas[i].toString()+"\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
