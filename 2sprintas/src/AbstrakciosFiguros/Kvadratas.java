package AbstrakciosFiguros;

public class Kvadratas extends Figura {
    private Double krastine;

    public Kvadratas(Double krastine) {
        this.krastine = krastine;
    }

    @Override
    public Double Perimetas() {
        return krastine * 4;
    }

    @Override
    public Double Plotas() {
        return Math.pow(krastine, 2);
    }

    public Double getKrastine() {
        return krastine;
    }

    public void setKrastine(Double krastine) {
        this.krastine = krastine;
    }
}
