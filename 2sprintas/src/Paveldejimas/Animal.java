package Paveldejimas;

public class Animal {
    private String klase = "tevine";

    public Animal() {

    }
    public Animal(String klase) {
        this.klase = klase;
    }
    @Override
    public String toString() {
        return getKlase();
    }

    public String getKlase() {
        return klase;
    }

    public void setKlase(String klase) {
        this.klase = klase;
    }
}
