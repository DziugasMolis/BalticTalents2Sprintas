package AbstrakciosKlases;

public class Varna extends Paukstis {
    public Varna() {
//        super("Test");
    }

    @Override
    public String toString() {
        return "Vaikine klase";
    }

    public String gautiPavadinima() {
        return "Varna";
    }

    public Integer gautiGyvenimoAmziu() {
        return 5;
    }

    public Double gautiSvori() {
        return 0.7;
    }

}
