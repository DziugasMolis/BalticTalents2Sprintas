package Paveldejimas;

public class Dog extends Animal{
    private String balsas = "Au";

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
