package Nedelja7.b_Sreda;

import java.util.Scanner;

public class BankovniRacun2 {
    private int brojRacuna;
    private String imeVlasnika;
    private double stanje;

    public BankovniRacun2(int brojRacuna, String imeVlasnika, double stanje) {
        this.brojRacuna = brojRacuna;
        this.imeVlasnika = imeVlasnika;
        this.stanje = stanje;
    }

    public int getBrojRacuna() {
        return brojRacuna;
    }
    public void setBrojRacuna(int noviBrojRacuna) {
        this.brojRacuna = noviBrojRacuna;
    }
    public String getImeVlasnika() {
        return imeVlasnika;
    }
    public void setImeVlasnika(String novoImeVlasnika) {
        this.imeVlasnika = novoImeVlasnika;
    }
    public double getStanje() {
        return stanje;
    }
    public void setStanje(double novoStanje) {
        this.stanje = novoStanje;
    }

    Scanner sc = new Scanner(System.in);
    public double uplata() {
        System.out.println("Unesite iznos uplate: ");
        double uplata = sc.nextDouble();
        if (uplata < 0) {
            System.out.println("Ne možete da uplatite negativan iznos.");
        } else {
            setStanje(getStanje() + uplata);
        }
        return getStanje();
    }

    public double isplata() {
        System.out.println("Unesite iznos za ispaltu.");
        double isplata = sc.nextDouble();
        if (getStanje() < Math.abs(isplata)) {
            System.out.println("Nemte dovoljno sredstava na računu da biste napravili takvu transakciju!");
        } else {
            setStanje(getStanje() - Math.abs(isplata));
        }
        return getStanje();
    }

    public String toString() {
        return "BankovniRacun{" + "brojRacuna=" + getBrojRacuna() + ", imeVlasnika='" + getImeVlasnika() + '\'' + ", stanje=" + getStanje() + '}';
    }
}
