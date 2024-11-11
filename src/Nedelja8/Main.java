package Nedelja8;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*Napraviti klasu Igrac koja ima atribute: ime, godine iskustva, i broj postignutih poena.
        Napraviti klasu Klub koja ima atribute: naziv, grad, i lista igraca (lista objekata klase Igrac).
        Napraviti metode:
        - najiskusnijiIgrac() -> vraca ime igrača sa najvise godina iskustva.
        - ukupnoPoena() -> vraća ukupan broj poena koje su postigli svi igrači u klubu.
        - vrednostTima() -> vraca vrednost tima (apstraktan metod)
        Napraviti klasu KosarkaskiKlub koja nasleđuje klasu Klub, i dodati specifičnu metodu:
        - sampionTima() -> vraća ime igraca koji ima više od 1000 postignutih poena.
        Napraviti klasu FudbalskiKlub koja nasleđuje klasu Klub, i dodati metodu:
        - najboljiStrelac() -> vraca ime igraca sa najvise postignutih golova (golove cemo interpretirati kao postignute poene).
        Napraviti klasu OdbojkaškiKlub koja nasleđuje klasu Klub, i dodati metodu:
        - odbrambeniAs() -> vraća ime igrača koji ima najvise poena,
        ali je igrao manje od 3 godine.vrednostTima() -> za kosarkaski tim racunamo da igrac vredi 50 za svaki postignut poen,
        za fudbalski tim racunamo da igrac vredi po 1000 za svaki postignut gol,
        dok za odbojkaski tim svaki igrac vredi 100 po poenu.
        Vrednost tima predstavlja sumu cena svih njegovih igraca*/

        Igrac i1 = new Igrac("Petar", 2, 2);
        Igrac i2 = new Igrac("Marko", 5, 3);
        Igrac i3 = new Igrac("Nikola", 3, 5);

        ArrayList<Igrac> Lista1 = new ArrayList<>();
        Lista1.add(i1);
        Lista1.add(i2);
        Lista1.add(i3);

        KosarkaskiKlub k1 = new KosarkaskiKlub("Lepenica", "Kragujevac", Lista1);
        FudbalskiKlub k2 = new FudbalskiKlub("Lepenica", "Kragujevac", Lista1);
        OdbojkaskiKlub k3 = new OdbojkaskiKlub("Lepenica", "Kragujevac", Lista1);

        System.out.println(k1.najiskusnijiIgrac());
        System.out.println(k1.ukupnoPoena());
        System.out.println(k1.sampionTima());

        System.out.println(k2.najboljiStrelac());
        System.out.println(k3.odbrambeniAs());

        System.out.println(k1.vrednostTima());
        System.out.println(k2.vrednostTima());
        System.out.println(k3.vrednostTima());
    }
}
