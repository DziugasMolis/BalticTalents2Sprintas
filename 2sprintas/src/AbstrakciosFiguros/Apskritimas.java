package AbstrakciosFiguros;

public class Apskritimas extends Figura {
    private Double spindulys;

    public Apskritimas(Double spindulys) {
        this.spindulys = spindulys;
    }

    @Override
    public String toString() {
        return "Apskritimo Perimetras = " + Perimetas() + " Plotas = " + Plotas() + "\n";
    }

    @Override
    public Double Perimetas() {
        return 2 * Math.PI * spindulys;
    }

    @Override
    public Double Plotas() {
        return Math.PI * Math.pow(spindulys, 2);
    }

    public Double getSpindulys() {
        return spindulys;
    }

    public void setSpindulys(Double spindulys) {
        this.spindulys = spindulys;
    }


}
