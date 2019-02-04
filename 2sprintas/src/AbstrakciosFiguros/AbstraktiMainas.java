package AbstrakciosFiguros;

public class AbstraktiMainas {
    public static void main(String[] args) {
        Apskritimas aps = new Apskritimas(2.0);
        Kvadratas kvad = new Kvadratas(4.0);
        Trikampis trik = new Trikampis(3.0);
        Figura[] arr = new Figura[] {aps, kvad, trik};
        Figuros obj = new Figuros(arr);

        Figuros obj2 = new Figuros();
        obj.pridetiFigura(aps);
        obj.pridetiFigura(kvad);
        obj.pridetiFigura(trik);
        for (int i = 0; i < obj.getFiguruMasyvas().length; i++) {
            System.out.println(obj.getFiguruMasyvas()[i]);
        }
        System.out.println("----------------------------------");
        for (int i = 0; i < obj2.getFiguruMasyvas().length; i++) {
            System.out.println(obj2.getFiguruMasyvas()[i]);
        }
//        System.out.println(aps.Perimetas());
    }
}
