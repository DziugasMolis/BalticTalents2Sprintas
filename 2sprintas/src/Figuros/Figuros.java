package Figuros;

public class Figuros {
    private Figura[] figuruMasyvas = new Figura[0];

    public Figuros() {

    }

    public Figura didziausiasPerimetras() {
        Double didz = 0.0;
        int indeksas = 0;
        for (int i = 0; i < getFiguruMasyvas().length; i++) {
            if(didz < figuruMasyvas[i].perimetras()) {
                didz = figuruMasyvas[i].perimetras();
                indeksas = i;
            }
        }
        return getFiguruMasyvas()[indeksas];
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
