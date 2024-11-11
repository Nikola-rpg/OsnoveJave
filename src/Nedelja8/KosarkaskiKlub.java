package Nedelja8;

import java.util.ArrayList;

public class KosarkaskiKlub extends Klub {
    public KosarkaskiKlub(String naziv, String grad, ArrayList<Igrac> lista) {
        super(naziv, grad, lista);
    }

    @Override
    public int vrednostTima() {
        int zbir = 0;
        for (Igrac d : getLista()) {
            zbir += d.getBrojPoena() * 50;
        }
        return zbir;
    }

    public String sampionTima() {
        Igrac sampion = getLista().get(0);
        for (Igrac d : getLista()) {
            if (d.getBrojPoena() > sampion.getBrojPoena()) {
                sampion = d;
            }
        }
        return sampion.getIme();
    }
}
