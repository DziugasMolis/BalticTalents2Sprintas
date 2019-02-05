package Interfeisai;

public interface Mokejimas {
    String bankoSaskaita();
    String saskaitosTuretojas();
    Double suma();

    default String defaultinisMetodas() {
        return "Defaultinis";
    }
}
