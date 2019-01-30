package Klase;

public class Mokinys {
    private String vardas;
    private String pavarde;
    private Integer klase;
    private Integer[] pazymiuMasyvas;

    public Mokinys(String vardas, String pavarde,
                   Integer klase, Integer[] pazymiuMasyvas) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.klase = klase;
        this.pazymiuMasyvas = pazymiuMasyvas;
    }

    public Mokinys() {

    }

    public Double vidurkis() {
        Double suma = 0.0;
        for (int i = 0; i < pazymiuMasyvas.length; i++) {
            suma += pazymiuMasyvas[i];
        }
        return suma / pazymiuMasyvas.length;
    }

    @Override
    public String toString() {
        return "Vardas: " + getVardas() + " Pavarde: " + getPavarde()
                + " Klase: " + getKlase() + " Pazymiu masyvas: " + gautiMasyvaString() + "\n";
    }
//    1,2,3,4,5
    public String gautiMasyvaString() {
        String masyvasString = "";
        for (int i = 0; i < pazymiuMasyvas.length; i++) {
            masyvasString += pazymiuMasyvas[i] + ",";
        }
        return masyvasString;
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public Integer getKlase() {
        return klase;
    }

    public void setKlase(Integer klase) {
        this.klase = klase;
    }

    public Integer[] getPazymiuMasyvas() {
        return pazymiuMasyvas;
    }

    public void setPazymiuMasyvas(Integer[] pazymiuMasyvas) {
        this.pazymiuMasyvas = pazymiuMasyvas;
    }
}
