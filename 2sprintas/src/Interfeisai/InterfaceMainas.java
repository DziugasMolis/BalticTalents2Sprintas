package Interfeisai;

public class InterfaceMainas {
    public static void main(String[] args) {
        Klientas[] arr = new Klientas[]{
                new Klientas("LT1", "Jonas", new Double[]{1d, 2d, 3d, 5d, 6d, 12d, 13d}),
                new Klientas("LT2", "Petras", new Double[]{9d, 2d, 3d, 5d, 9d}),
                new Klientas("LT3", "Andrius", new Double[]{1d, 7d, 3d, 9d}),
        };
        Integer daugiausiaMokejimu = didziausiasSkaiciusMokejimu(arr);
        spausdintiKlientusSuDaugiausiaMokejimu(arr, daugiausiaMokejimu);
        Double visuMokejimuVidurkis = visuMokejimuVidurkis(arr);
        spausdintiKlientaJeiVidurkisVirsyjamas(arr, 2, visuMokejimuVidurkis);
    }

    public static void spausdintiKlientaJeiVidurkisVirsyjamas(Klientas[] arr, Integer kiekKartuVirsijamas, Double vid) {
        System.out.println("Spausdina klienta jei vidurkis virsyjimas n kartu");
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].getMokejimai().length; j++) {
                if (arr[i].getMokejimai()[j] > vid * kiekKartuVirsijamas) {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }

    public static Double visuMokejimuVidurkis(Klientas[] arr) {
        Double suma = 0d;
        Integer mokejimuKiekis = 0;
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].getMokejimai().length; j++) {
                suma += arr[i].getMokejimai()[j];
            }
            mokejimuKiekis += arr[i].getMokejimai().length;
        }
        return suma / mokejimuKiekis;
    }


    public static Integer didziausiasSkaiciusMokejimu(Klientas[] arr) {
        Integer maxMokejimu = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].getMokejimai().length > maxMokejimu) {
                maxMokejimu = arr[i].getMokejimai().length;
            }
        }
        return  maxMokejimu;
    }

    public static void spausdintiKlientusSuDaugiausiaMokejimu(Klientas[] arr, Integer maxMokejimu) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].getMokejimai().length == maxMokejimu) {
                System.out.println(arr[i]);
            }
        }
    }
}
