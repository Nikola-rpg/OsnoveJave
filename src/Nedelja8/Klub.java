package Nedelja8;

import java.util.ArrayList;

public abstract class Klub {
    private String naziv;
    private String grad;
    private ArrayList<Igrac> Lista;

    public Klub(String naziv, String grad, ArrayList<Igrac> lista) {
        this.naziv = naziv;
        this.grad = grad;
        Lista = lista;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getGrad() {
        return grad;
    }

    public void setGrad(String grad) {
        this.grad = grad;
    }

    public ArrayList<Igrac> getLista() {
        return Lista;
    }

    public void setLista(ArrayList<Igrac> lista) {
        Lista = lista;
    }

    public String najiskusnijiIgrac() {
        Igrac najiskusniji = getLista().get(0);
        for (Igrac i : getLista()) {
            if (i.getGodineIskustva() > najiskusniji.getGodineIskustva()) {
                najiskusniji = i;
            }
        }
        return najiskusniji.getIme();
    }

    public int ukupnoPoena() {
        int zbir = 0;
        for (Igrac i : getLista()) {
            zbir += i.getBrojPoena();
        }
        return zbir;
    }

    public abstract int vrednostTima();

    public String toString() {
        return "Klub{" +
                "naziv='" + getNaziv() + '\'' +
                ", grad='" + getGrad() + '\'' +
                ", Lista=" + getLista() +
                '}';
    }
}
