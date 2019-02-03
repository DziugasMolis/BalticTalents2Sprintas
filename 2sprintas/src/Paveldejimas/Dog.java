package Paveldejimas;

public class Dog extends Animal{
    private String balsas = "Au";

    public Dog() {
        this("Pakeitem suns balsa");
    }

    public Dog(String balsas) {
        this.balsas = balsas;
    }
    public String suoFainas() {
        return "suo fainas";
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
