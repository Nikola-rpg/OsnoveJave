package Nedelja7.d_Petak;

import java.util.ArrayList;

public class Eseista extends Pesnik {
    public Eseista(String ime, int godinaRodjenja, ArrayList<Knjiga> listaKnjiga) {
        super(ime, godinaRodjenja, listaKnjiga);
    }

    public int kratkiEseji() {
        int brojac = 0;
        for (int i = 0; i < (getListaKnjiga().size()); i++) {
            if (getListaKnjiga().get(i).getBrojStrana() < 50)
                brojac++;
        }
        return brojac;
    }
}

