package Interfeisai;

public interface Mokejimas {
    String bankoSaskaita();
    String saskaitosTuretojas();
    default Double suma(Double skaicius1, Double skaicius2) {
        return skaicius1 + skaicius2;
    }

    default String suma(String kintamasis1, String kintamasis2) {
        return kintamasis1 + " " + kintamasis2 + "\n";
    }

    default String defaultinisMetodas() {
        return "Defaultinis";
    }
}
