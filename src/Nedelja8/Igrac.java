package Nedelja8;

public class Igrac {
    private String ime;
    private int godineIskustva;
    private int brojPoena;

    public Igrac(String ime, int godineIskustva, int brojPoena) {
        this.ime = ime;
        this.godineIskustva = godineIskustva;
        this.brojPoena = brojPoena;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getGodineIskustva() {
        return godineIskustva;
    }

    public void setGodineIskustva(int godineIskustva) {
        this.godineIskustva = godineIskustva;
    }

    public int getBrojPoena() {
        return brojPoena;
    }

    public void setBrojPoena(int brojPoena) {
        this.brojPoena = brojPoena;
    }

    public String toString() {
        return "Igrac{" +
                "ime='" + getIme() + '\'' +
                ", godineIskustva=" + getGodineIskustva() +
                ", brojPoena=" + getBrojPoena() +
                '}';
    }
}
