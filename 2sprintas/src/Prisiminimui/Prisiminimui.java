package Prisiminimui;

import java.io.*;

public class Prisiminimui {
    public static void main(String[] args) {
        String duomenys1 = "C:\\Users\\Dziugas\\Desktop\\java objektinio pagrindai\\2sprintas\\src\\Prisiminimui\\Duomenys1.txt";
        String duomenys2 = "C:\\Users\\Dziugas\\Desktop\\java objektinio pagrindai\\2sprintas\\src\\Prisiminimui\\Duomenys2.txt";
        String atsakymai = "C:\\Users\\Dziugas\\Desktop\\java objektinio pagrindai\\2sprintas\\src\\Prisiminimui\\Atsakymai.txt";

//        Nuskaitomas pirmas failas
        String duomenys1Skaiciai = skaityti(duomenys1);
        String[] skaiciuMasyvas1String = duomenys1Skaiciai.split(" ");
        Integer[] skaiciuMasyvas1 = gautiSkaiciuMasyva(skaiciuMasyvas1String);
        Double vid1 = vidurkis(skaiciuMasyvas1);
//    Nuskaitomas antras failas
        String duomenys2Skaiciai = skaityti(duomenys2);
        String[] skaiciuMasyvas2String = duomenys2Skaiciai.split(" ");
        Integer[] skaiciuMasyvas2 = gautiSkaiciuMasyva(skaiciuMasyvas1String);
        Double vid2 = vidurkis(skaiciuMasyvas2);

        rasyti(atsakymai, skaiciuMasyvas1, vid1, skaiciuMasyvas2, vid2);
    }

    public static Integer kiekSkaiciuDidesniuUzVidurki(Integer[] masyvas, Double vid) {
        int skaicius = 0;
        for (int i = 0; i < masyvas.length; i++) {
            if (masyvas[i] > vid) {
                skaicius++;
            }
        }
        return skaicius;
    }

    public static Double vidurkis(Integer[] masyvas) {
        Integer suma = 0;
        for (int i = 0; i < masyvas.length; i++) {
            suma += masyvas[i];
        }
        return (double) suma / masyvas.length;
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
        }

        return visosEilutes;
    }

    public static void rasyti(String failas, Integer[] masyvas1, Double vid1, Integer[] masyvas2,  Double vid2) {
//        BufferedWriter output = null;
        try(BufferedWriter output = new BufferedWriter(new FileWriter(failas));) {

            if(vid1 > vid2) {
                output.write("Pirmo masyvo vidurkis didesnis\n");
            } else {
                output.write("Antro masyvo vidurkis didesnis\n");
            }

            if(kiekSkaiciuDidesniuUzVidurki(masyvas1,vid1) > kiekSkaiciuDidesniuUzVidurki(masyvas2,vid2)) {
                output.write("Pirmas masyvas turi daugiau skaiciu didesniu uz vidurki\n");
                for(int i = 0; i < masyvas1.length; i++) {
                    output.write(masyvas1[i]);
                }
            } else {
                output.write("Antras masyvas turi daugiau skaiciu didesniu uz vidurki\n");
                for(int i = 0; i < masyvas2.length; i++) {
                    output.write(masyvas2[i] + " ");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
