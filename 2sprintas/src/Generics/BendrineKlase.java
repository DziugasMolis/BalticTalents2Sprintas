package Generics;

public class BendrineKlase<T> {
    private T t;

    public void prideti(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    @Override
    public String toString() {
        return t.toString();
    }
}
