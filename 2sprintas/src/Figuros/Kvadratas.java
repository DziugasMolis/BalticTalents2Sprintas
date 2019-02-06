package Figuros;

public class Kvadratas extends Figura implements KvadratoSkaiciavimai {
    private Double krastine;

    public Kvadratas(Double krastine) {
        this.krastine = krastine;
    }

    public Kvadratas() {
        this.krastine = 0.0;
    }

//    public Double perimetras() {
//        return 4 * krastine;
//    }
//
//    public Double plotas() {
//        return Math.pow(krastine, 2);
//    }

    @Override
    public String toString() {
        return "Perimetras = " + perimetras() + " Plotas = " + plotas();
    }

    public Double getKrastine() {
        return krastine;
    }

    public void setKrastine(Double krastine) {
        this.krastine = krastine;
    }
}
