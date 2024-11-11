package Nedelja7.c_Cetvrtak;

public class Valuta {
    private String naziv;
    private char simbol;
    private double kurs;

    public Valuta(String naziv, char simbol, double kurs) {
        this.naziv = naziv;
        this.simbol = simbol;
        this.kurs = kurs;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public char getSimbol() {
        return simbol;
    }

    public void setSimbol(char simbol) {
        this.simbol = simbol;
    }

    public double getKurs() {
        return kurs;
    }

    public void setKurs(double kurs) {
        this.kurs = kurs;
    }

    public double konvertujUDinare(double iznos) {
        return iznos * getKurs();
    }

    public String toString() {
        return getNaziv() + " " + getSimbol() + " " + getKurs();
    }
}
