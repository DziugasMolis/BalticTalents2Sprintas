package Interfeisai;

public class Darbuotojas implements Mokejimas {

    private String bankoSaskaita;
    private String saskaitosTurejotas;

    public Darbuotojas(String bankoSaskaita, String saskaitosTurejotas) {
        this.bankoSaskaita = bankoSaskaita;
        this.saskaitosTurejotas = saskaitosTurejotas;
    }

    @Override
    public String toString() {
        return suma(bankoSaskaita,saskaitosTurejotas);
    }
    @Override
    public String bankoSaskaita() {
        return bankoSaskaita;
    }

    @Override
    public String saskaitosTuretojas() {
        return saskaitosTurejotas;
    }

    public Double suma() {
        return suma(2.0, 2.0);
    }

    @Override
    public String defaultinisMetodas() {
        return "UZrasem";
    }

}
