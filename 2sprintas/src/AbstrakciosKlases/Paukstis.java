package AbstrakciosKlases;

public abstract class Paukstis {
    private String pav = "default";

//    public Paukstis(String pav) {
//        this.pav = pav;
//    }

    public abstract String toString();

    public abstract String gautiPavadinima();
    public abstract Integer gautiGyvenimoAmziu();
    public abstract Double gautiSvori();

    public String getPav() {
        return pav;
    }

    public void setPav(String pav) {
        this.pav = pav;
    }
}
