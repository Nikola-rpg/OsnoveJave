package Nedelja7.d_Petak;

import java.util.ArrayList;

public class Pisac {
    private String ime;
    private int godinaRodjenja;
    private ArrayList<Knjiga> ListaKnjiga;

    public Pisac(String ime, int godinaRodjenja, ArrayList<Knjiga> listaKnjiga) {
        this.ime = ime;
        this.godinaRodjenja = godinaRodjenja;
        ListaKnjiga = listaKnjiga;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getGodinaRodjenja() {
        return godinaRodjenja;
    }

    public void setGodinaRodjenja(int godinaRodjenja) {
        this.godinaRodjenja = godinaRodjenja;
    }

    public ArrayList<Knjiga> getListaKnjiga() {
        return ListaKnjiga;
    }

    public void setListaKnjiga(ArrayList<Knjiga> listaKnjiga) {
        ListaKnjiga = listaKnjiga;
    }

    public String najpoznatijaKnjiga() {
        Knjiga najveca = getListaKnjiga().get(0);
        for (int i = 0; i < (getListaKnjiga().size()); i++) {
            if (getListaKnjiga().get(i).getBrojStrana() > najveca.getBrojStrana()) {
                najveca = getListaKnjiga().get(i);
            }
        }
        return najveca.getNaslov();
    }

    public Knjiga najmladjaKnjiga() {
        Knjiga najmladja = getListaKnjiga().get(0);
        for (int i = 0; i < (getListaKnjiga().size()); i++) {
            if (getListaKnjiga().get(i).getGodinaIzdanja() < najmladja.getGodinaIzdanja()) {
                najmladja = getListaKnjiga().get(i);
            }
        }
        return najmladja;
    }

    public Knjiga najstarijaKnjiga() {
        Knjiga najstarija = getListaKnjiga().get(0);
        for (int i = 0; i < (getListaKnjiga().size()); i++) {
            if (getListaKnjiga().get(i).getGodinaIzdanja() > najstarija.getGodinaIzdanja()) {
                najstarija = getListaKnjiga().get(i);
            }
        }
        return najstarija;
    }

    public int vremePisanja() {
        return najstarijaKnjiga().getGodinaIzdanja() - najmladjaKnjiga().getGodinaIzdanja();
    }

    public String toString() {
        return "Pisac{" +
                "ime='" + getIme() + '\'' +
                ", godinaRodjenja=" + getGodinaRodjenja() +
                ", ListaKnjiga=" + getListaKnjiga() +
                '}';
    }
}
