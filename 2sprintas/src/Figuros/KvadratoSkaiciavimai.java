package Figuros;

public interface KvadratoSkaiciavimai {

    default Double perimetras(Double krastine) {
        return krastine * 4;
    }

    default Double plotas(Double krastine) {
        return Math.pow(krastine, 2);
    }
}
