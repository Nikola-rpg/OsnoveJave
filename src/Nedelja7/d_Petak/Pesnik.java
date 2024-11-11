package Nedelja7.d_Petak;

import java.util.ArrayList;

public class Pesnik extends Pisac {

    public Pesnik(String ime, int godinaRodjenja, ArrayList<Knjiga> listaKnjiga) {
        super(ime, godinaRodjenja, listaKnjiga);
    }

    public int brojZbirki() {
        int brojac = 0;
        for (int i = 0; i < (getListaKnjiga().size()); i++) {
            if (getListaKnjiga().get(i).getBrojStrana() < 100)
                brojac++;
        }
        return brojac;
    }
}
