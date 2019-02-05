package Abstraktu3;

public class Studentas extends Zmogus{
    private Integer kursas;
    private String studijuKryptis;

    public Studentas(String vardas, String pavarde, Integer amzius, Integer kursas, String studijuKryptis) {
        super(vardas, pavarde, amzius);
        this.kursas = kursas;
        this.studijuKryptis = studijuKryptis;
    }

    @Override
    public String toString() {
        return "Vardas: " + getVardas() + " Pavarde: " + getPavarde() +
                " Amzius: " + getAmzius() + " Kursas: " + getKursas() +
                " Studiju kryptis: " + getStudijuKryptis() + "\n";
    }

    public Integer getKursas() {
        return kursas;
    }

    public void setKursas(Integer kursas) {
        this.kursas = kursas;
    }

    public String getStudijuKryptis() {
        return studijuKryptis;
    }

    public void setStudijuKryptis(String studijuKryptis) {
        this.studijuKryptis = studijuKryptis;
    }
}
