package Paveldejimas;

public class Cat extends Animal {
    private String balsas = "Miau";

    public Cat() {
        super("Kates klase");
    }
    @Override
    public String toString() {
        return getKlase() + " " + getBalsas();
    }

    public String getBalsas() {
        return balsas;
    }

    public void setBalsas(String balsas) {
        this.balsas = balsas;
    }
}
