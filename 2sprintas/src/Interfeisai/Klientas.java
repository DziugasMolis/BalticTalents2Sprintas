package Interfeisai;

public class Klientas implements Mokejimas {

    private String bankoSaskaita;
    private String saskaitosTurejotas;
    private Double[] mokejimai;

    public Klientas(String bankoSaskaita, String saskaitosTurejotas, Double[] mokejimai) {
        this.bankoSaskaita = bankoSaskaita;
        this.saskaitosTurejotas = saskaitosTurejotas;
        this.mokejimai = mokejimai;
    }

    @Override
    public String toString() {
        return "Klientas: " + saskaitosTuretojas() + " Banko saskaita: "
                + bankoSaskaita() + " Mokejimu kiekis = " + getMokejimai().length;
    }

    @Override
    public String bankoSaskaita() {
        return bankoSaskaita;
    }

    @Override
    public String saskaitosTuretojas() {
        return saskaitosTurejotas;
    }

    public String getBankoSaskaita() {
        return bankoSaskaita;
    }

    public void setBankoSaskaita(String bankoSaskaita) {
        this.bankoSaskaita = bankoSaskaita;
    }

    public String getSaskaitosTurejotas() {
        return saskaitosTurejotas;
    }

    public void setSaskaitosTurejotas(String saskaitosTurejotas) {
        this.saskaitosTurejotas = saskaitosTurejotas;
    }

    public Double[] getMokejimai() {
        return mokejimai;
    }

    public void setMokejimai(Double[] mokejimai) {
        this.mokejimai = mokejimai;
    }
}
