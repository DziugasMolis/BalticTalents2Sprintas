package uzduotis1;

import java.io.*;
import java.util.Arrays;

public class uzduotis1 {
    public static void main(String[] args) {
        String file = "C:\\Users\\Dziugas\\Desktop\\java objektinio pagrindai\\2sprintas\\src\\uzduotis1\\Duomenys.txt";
        String atsakymai = "C:\\Users\\Dziugas\\Desktop\\java objektinio pagrindai\\2sprintas\\src\\uzduotis1\\Atsakymai.txt";
        try {
            String skaiciaiString = skaityti(file);
            String[] skaiciuMasyvasString = skaiciaiString.split(" ");
            Integer[] skaiciuMasyvas = GautiSkaiciuMasyva(skaiciuMasyvasString);
            Double suma = suma(1.0, 2.0);
            Double vidurkis = vidurkis(skaiciuMasyvas);
            Integer minimumas = minimumas(skaiciuMasyvas);
            rasyti(atsakymai, skaiciuMasyvas, suma, vidurkis, minimumas);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Integer[] grazintiMasyva(Integer[] masyvas) {
        Integer[] tmp = new Integer[0];
        for(int i = 0; i < masyvas.length; i++) {
            if(masyvas[i] < 10) {
                tmp = pridetiElementa(tmp, masyvas[i]);
            }
        }
        return tmp;
    }

    public static Integer[] pridetiElementa(Integer[] masyvas, Integer skaicius) {
        masyvas = Arrays.copyOf(masyvas, masyvas.length + 1);
        masyvas[masyvas.length - 1] = skaicius;
        return masyvas;
    }

    public static Double suma(Double a, Double b) {
        return a + b;
    }

    public static Double vidurkis(Integer[] masyvas) {
        Integer suma = 0;
        for (int i = 0; i < masyvas.length; i++) {
            suma += masyvas[i];
        }
//        return suma / masyvas.length;
        return (double) suma / masyvas.length;
    }

    public static Integer minimumas(Integer[] masyvas) {
        Integer min = 999;
        for (int i = 0; i < masyvas.length; i++) {
            if (min > masyvas[i]) {
                min = masyvas[i];
            }
        }
        return min;
    }

    public static Integer[] GautiSkaiciuMasyva(String[] skaiciai) {
        Integer[] skaiciuMasyvas = new Integer[skaiciai.length];
        for (int i = 0; i < skaiciai.length; i++) {
            skaiciuMasyvas[i] = Integer.parseInt(skaiciai[i]);
        }
        return skaiciuMasyvas;
    }

    public static String skaityti(String failas) throws Exception, FileNotFoundException {
        String visosEilutes = "";
        BufferedReader br = new BufferedReader(new FileReader(failas));
        try {
            String line = br.readLine();
            while (line != null) {
                visosEilutes += line + " ";
                line = br.readLine();
            }
            if(line == null) {
                throw new Exception("Baigesi failas");
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Failas nerastas");
        } catch (Exception e) {
            System.out.println("isoko i exception");
        } finally {
            br.close();
        }

        return visosEilutes;
    }


    public static void rasyti(String failas, Integer[] masyvas, Double sum, Double vidurkis, Integer minimumas) throws IOException {
        BufferedWriter output = null;
        try {
            output = new BufferedWriter(new FileWriter(failas));
            output.write("1 uzduotis\n");
            for (int i = 0; i < masyvas.length; i++) {
                output.write(masyvas[i] + " ");
            }
            output.write("\n");
            output.write("-------------------\n");
            output.write("2 uzduotis\n");
            output.write("Suma = " + sum + "\n");
            output.write("-------------------\n");
            output.write("3 uzduotis\n");
            for (int i = 0; i < masyvas.length; i++) {
                if (arLyginisSkaicius(masyvas[i])) {
                    output.write("Skaicius = " + masyvas[i] + " yra lyginis\n");
                } else {
                    output.write("Skaicius = " + masyvas[i] + " yra nera lyginis\n");
                }
            }
            output.write("-------------------\n");
            output.write("4 uzduotis\n");
            output.write("Vidurkis = " + vidurkis + "\n");
            output.write("-------------------\n");
            output.write("5 uzduotis\n" + "Minimumas = " + minimumas + "\n" + "-------------------\n");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (output != null) {
                output.close();
            }
        }
    }

    public static boolean arLyginisSkaicius(Integer skaicius) {
        if (skaicius % 2 == 0) {
            return true;
        }
        return false;
    }
}
