package AbstrakciosFiguros;

public class Figuros {
    private Figura[] figuruMasyvas = new Figura[0];

    public Figuros() {

    }

    public Figuros(Figura[] figuruMasyvas) {
        this.figuruMasyvas = figuruMasyvas;
    }
    public void pridetiFigura(Figura figura) {
        Figura[] naujasMasyvas = new Figura[figuruMasyvas.length + 1];
        System.arraycopy(figuruMasyvas, 0, naujasMasyvas, 0, figuruMasyvas.length);
        naujasMasyvas[naujasMasyvas.length - 1] = figura;
        figuruMasyvas = naujasMasyvas;
    }

    public Figura[] getFiguruMasyvas() {
        return figuruMasyvas;
    }

    public void setFiguruMasyvas(Figura[] figuruMasyvas) {
        this.figuruMasyvas = figuruMasyvas;
    }
}
