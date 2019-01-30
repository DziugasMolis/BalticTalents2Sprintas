package SpecifinioFailoSkaitymas;

public class Zmogus {
    public String vardas;
    public String pavarde;
    public Integer amzius;
    public String pareigos;

    public Zmogus(String vardas, String pavarde, Integer amzius, String pareigos) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.amzius = amzius;
        this.pareigos = pareigos;
    }

    @Override
    public String toString() {
        return "Vardas: "+ getVardas() + " Pavarde: " + getPavarde()
                + " Amzius: " + getAmzius() + " Pareigos: " + getPareigos() + "\n";
    }


    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public Integer getAmzius() {
        return amzius;
    }

    public void setAmzius(Integer amzius) {
        this.amzius = amzius;
    }

    public String getPareigos() {
        return pareigos;
    }

    public void setPareigos(String pareigos) {
        this.pareigos = pareigos;
    }


}
