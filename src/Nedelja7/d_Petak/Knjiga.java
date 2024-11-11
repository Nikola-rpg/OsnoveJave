package Nedelja7.d_Petak;

public class Knjiga {
    private String naslov;
    private int brojStrana;
    private int godinaIzdanja;

    public Knjiga(String naslov, int brojStrana, int godinaIzdanja) {
        this.naslov = naslov;
        this.brojStrana = brojStrana;
        this.godinaIzdanja = godinaIzdanja;
    }

    public String getNaslov() {
        return naslov;
    }

    public void setNaslov(String naslov) {
        this.naslov = naslov;
    }

    public int getBrojStrana() {
        return brojStrana;
    }

    public void setBrojStrana(int brojStrana) {
        this.brojStrana = brojStrana;
    }

    public int getGodinaIzdanja() {
        return godinaIzdanja;
    }

    public void setGodinaIzdanja(int godinaIzdanja) {
        this.godinaIzdanja = godinaIzdanja;
    }

    @Override
    public String toString() {
        return "Knjiga{" +
                "naslov='" + getNaslov() + '\'' +
                ", brojStrana=" + getBrojStrana() +
                ", godinaIzdanja=" + getGodinaIzdanja() +
                '}';
    }
}
