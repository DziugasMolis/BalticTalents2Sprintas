package AbstrakciosFiguros;

public class Trikampis extends Figura {
    private Double krastine;

    public Trikampis(Double krastine) {
        this.krastine = krastine;
    }

    @Override
    public String toString() {
        return "Trikampis Perimetras = " + Perimetas() + " Plotas = " + Plotas() + "\n";
    }

    @Override
    public Double Perimetas() {
        return krastine * 3;
    }

    @Override
    public Double Plotas() {
        return Math.sqrt((Perimetas()/2 )
                * ((Perimetas()/2) - krastine*3));
    }

    public Double getKrastine() {
        return krastine;
    }

    public void setKrastine(Double krastine) {
        this.krastine = krastine;
    }
}
