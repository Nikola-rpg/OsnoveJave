package Nedelja7.d_Petak;

import java.util.ArrayList;

public class Romanopisac extends Pisac {
    public Romanopisac(String ime, int godinaRodjenja, ArrayList<Knjiga> listaKnjiga) {
        super(ime, godinaRodjenja, listaKnjiga);
    }

    public String dugometrazniRoman() {
        String odgovor = "";
        for (int i = 0; i < (getListaKnjiga().size()); i++) {
            if (getListaKnjiga().get(i).getBrojStrana() > 500) {
                odgovor = getListaKnjiga().get(i).getNaslov();
            }
        }
        return odgovor;
    }
}
