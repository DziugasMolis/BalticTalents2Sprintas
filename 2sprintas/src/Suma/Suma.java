package Suma;

public class Suma {
    private Integer pirmasSkaicius;
    private Integer antrasSkaicius;

    public Suma(Integer pirmasSkaicius, Integer antrasSkaicius) {
        this.pirmasSkaicius = pirmasSkaicius;
        this.antrasSkaicius = antrasSkaicius;
    }

    @Override
    public String toString() {
        return (pirmasSkaicius + antrasSkaicius) + "";
    }
}
