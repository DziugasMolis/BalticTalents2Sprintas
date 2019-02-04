package AbstrakciosKlases;

public class MainKlase {
    public static void main(String[] args) {

        Varna v = new Varna();
        System.out.println(v.gautiPavadinima());
        System.out.println(v.gautiGyvenimoAmziu());
        System.out.println(v.gautiSvori());
        System.out.println(v.toString());

        System.out.println(v.getPav());
    }
}
