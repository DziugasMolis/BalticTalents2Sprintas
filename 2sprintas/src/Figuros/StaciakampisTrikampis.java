package Figuros;

public class StaciakampisTrikampis extends Figura {
    private Double krastine1;
    private Double krastine2;
    private Double krastine3;

    public StaciakampisTrikampis(Double krastine1, Double krastine2, Double krastine3) {
        this.krastine1 = krastine1;
        this.krastine2 = krastine2;
        this.krastine3 = krastine3;
    }

    public Double perimetras() {
        return krastine1 * +krastine2 + krastine3;
    }

    public Double plotas() {
        if(krastine1 > krastine2 && krastine1 > krastine3) {
            return krastine2 * krastine3;
        } else if (krastine2 > krastine1 && krastine2 > krastine3) {
            return krastine1 * krastine3;
        } else {
            return krastine1 * krastine2;
        }
    }

    @Override
    public String toString() {
        return "Perimetras = " + perimetras() + " Plotas = " + plotas();
    }


}
