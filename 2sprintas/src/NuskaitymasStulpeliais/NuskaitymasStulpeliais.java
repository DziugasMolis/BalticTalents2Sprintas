package NuskaitymasStulpeliais;

import java.io.*;
import java.util.Arrays;

public class NuskaitymasStulpeliais {
    public static void main(String[] args) {
    String duomenys = "C:\\Users\\Dziugas\\Desktop\\java objektinio pagrindai\\BalticTalents2Sprintas\\2sprintas\\src\\NuskaitymasStulpeliais\\Duomenys.txt";
    String atsakymai = "C:\\Users\\Dziugas\\Desktop\\java objektinio pagrindai\\BalticTalents2Sprintas\\2sprintas\\src\\NuskaitymasStulpeliais\\Atsakymai.txt";
    String[] vardai = null;
    String[] pavardes = null;
    Integer[] amziai = null;
    String[] profesijos = null;

    skaityti(duomenys, vardai, pavardes, amziai, profesijos);
    rasyti(atsakymai, vardai, pavardes, amziai, profesijos);
    }

    public static void skaityti(String failas, String[] vardai, String[] pavardes,
                                Integer[] amziai, String[] profesijos) {
        String[] tarpinesReiksmes = null;
        try (BufferedReader br = new BufferedReader(new FileReader(failas))) {
            String line = br.readLine();
            while (line != null) {
                tarpinesReiksmes = line.split(" ");
                vardai = pridetiElementaString(vardai, tarpinesReiksmes[0]);
                pavardes = pridetiElementaString(pavardes, tarpinesReiksmes[1]);
                amziai = pridetiElementaInteger(amziai, Integer.parseInt(tarpinesReiksmes[2]));
                profesijos = pridetiElementaString(profesijos, tarpinesReiksmes[3]);
                line = br.readLine();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Failas nerastas");
        } catch (Exception e) {
            System.out.println("something else went wrong");
        } finally {
            System.out.println("Skaitymas baigtas");
        }
    }

    public static void rasyti(String failas, String[] vardai, String[] pavardes,
                              Integer[] amziai, String[] profesijos) {
        try (BufferedWriter output = new BufferedWriter(new FileWriter(failas))) {
            for(int i = 0; i < vardai.length; i++) {
                output.write(vardai[i] + " " + pavardes[i]
                        + " " + amziai[i] + " " + profesijos[i] + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Integer[] pridetiElementaInteger(Integer[] masyvas, Integer skaicius) {
        masyvas = Arrays.copyOf(masyvas, masyvas.length + 1);
        masyvas[masyvas.length - 1] = skaicius;
        return masyvas;
    }

    public static String[] pridetiElementaString(String[] masyvas, String zodis) {
        masyvas = Arrays.copyOf(masyvas, masyvas.length + 1);
        masyvas[masyvas.length - 1] = zodis;
        return masyvas;
    }
}
