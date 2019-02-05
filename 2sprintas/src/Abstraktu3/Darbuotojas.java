package Abstraktu3;

public class Darbuotojas extends Zmogus {
    private Integer patirtis;
    private String specialybe;

    public Darbuotojas(String vardas, String pavarde, Integer amzius, Integer patirtis, String specialybe) {
        super(vardas, pavarde, amzius);
        this.patirtis = patirtis;
        this.specialybe = specialybe;
    }

    @Override
    public String toString() {
        return "Vardas: " + getVardas() + " Pavarde: " + getPavarde() +
                " Amzius: " + getAmzius() + " Patirtis: " + getPatirtis() +
                " Specialybe: " + getSpecialybe() + "\n";
    }

    public Integer getPatirtis() {
        return patirtis;
    }

    public void setPatirtis(Integer patirtis) {
        this.patirtis = patirtis;
    }

    public String getSpecialybe() {
        return specialybe;
    }

    public void setSpecialybe(String specialybe) {
        this.specialybe = specialybe;
    }
}
