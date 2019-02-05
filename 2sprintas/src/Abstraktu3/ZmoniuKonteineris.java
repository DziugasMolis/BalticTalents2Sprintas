package Abstraktu3;

public class ZmoniuKonteineris {
    private Zmogus[] zmoniuMasyvas;

    public ZmoniuKonteineris(Zmogus[] zmoniuMasyvas) {
        this.zmoniuMasyvas = zmoniuMasyvas;
    }

    public Zmogus rastiVyriausia() {
        int max = 0;
        int indeksas = 0;
        for(int i = 0; i < zmoniuMasyvas.length; i++) {
            if (max < zmoniuMasyvas[i].getAmzius()) {
                max = zmoniuMasyvas[i].getAmzius();
                indeksas = i;
            }
        }
        return zmoniuMasyvas[indeksas];
    }

    public Zmogus[] getZmoniuMasyvas() {
        return zmoniuMasyvas;
    }

    public void setZmoniuMasyvas(Zmogus[] zmoniuMasyvas) {
        this.zmoniuMasyvas = zmoniuMasyvas;
    }
}
