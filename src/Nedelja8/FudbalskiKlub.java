package Nedelja8;

import java.util.ArrayList;

public class FudbalskiKlub extends Klub {
    public FudbalskiKlub(String naziv, String grad, ArrayList<Igrac> lista) {
        super(naziv, grad, lista);
    }

    @Override
    public int vrednostTima() {
        int zbir = 0;
        for (Igrac d : getLista()) {
            zbir += d.getBrojPoena() * 1000;
        }
        return zbir;
    }

    public String najboljiStrelac() {
        Igrac strelac = getLista().get(0);
        for (Igrac i : getLista()) {
            if (i.getBrojPoena() > strelac.getBrojPoena()) {
                strelac = i;
            }
        }
        return strelac.getIme();
    }
}
