package Nedelja8;

import java.util.ArrayList;

public class OdbojkaskiKlub extends Klub {
    public OdbojkaskiKlub(String naziv, String grad, ArrayList<Igrac> lista) {
        super(naziv, grad, lista);
    }

    @Override
    public int vrednostTima() {
        int zbir = 0;
        for (Igrac d : getLista()) {
            zbir += d.getBrojPoena() * 100;
        }
        return zbir;
    }

    public String odbrambeniAs() {
        String odgovor = "";
        int brojac = 0;
        for (Igrac i : getLista()) {
            if (i.getGodineIskustva() < 3) {
                brojac++;
            }
            if (brojac > 0) {
                Igrac sampion = null;
                for (Igrac a : getLista()) {
                    if (a.getGodineIskustva() < 3) {
                        sampion = a;
                    }
                }
                for (Igrac b : getLista()) {
                    if ((b.getBrojPoena() > sampion.getBrojPoena()) && (b.getGodineIskustva() < 3)) {
                        sampion = b;
                    }
                }
                odgovor = sampion.getIme();
            } else {
                odgovor = "nema";
            }
        }
        return odgovor;
    }
}
