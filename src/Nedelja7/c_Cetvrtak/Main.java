package Nedelja7.c_Cetvrtak;

import Nedelja7.c_Cetvrtak.Dolar;
import Nedelja7.c_Cetvrtak.Euro;

public class Main {
    public static void main(String[] args) {
    /*Definisati hijerarhiju klasa koje predstavljaju razlicite valute u menjacnici.
    Osnovna Klasa: Valuta
    promenljive: naziv , simbol, i kurs.
    Konstruktor: Postavlja vrednosti za naziv, simbol i kurs valute.
    Metoda: konvertujUdinare(iznos), koja konvertuje zadati iznos u dinare koristeci trenutni kurs valute.
    Dolar:
    Nasledjuje klasu Valuta.
    Konstruktor: Postavlja vrednosti za naziv "Dolar", simbol "USD", i trenutni kurs prema dinarima.
    Dodatna Metoda: postaviKursNovi(kurs), koja postavlja novi kurs dolara.
    Euro:
    Nasledjuje klasu Valuta.
    Konstruktor: Postavlja vrednosti za naziv "Euro", simbol "EUR", i trenutni kurs prema dinarima.
    Dodatna Metoda: postaviKursNovi(kurs: number), koja postavlja novi kurs evra.
    Napisati glavni program koji kreira objekte za dolar i evro, postavlja njihove kurseve,
    i vrsi konverziju odredjenih iznosa iz jedne valute u drugu.*/

        Dolar d = new Dolar("", ' ', 0);
        Euro e = new Euro("", ' ', 0);

        System.out.println(d);
        d.postaviKursNovi(100);
        System.out.println(d);
        System.out.println(d.konvertujUDinare(100));
        System.out.println(" ");

        System.out.println(e);
        e.postaviKursNovi(50);
        System.out.println(e);
        System.out.println(e.konvertujUDinare(100));
        System.out.println(" ");

        System.out.println(konvertujDolareUEvre(d, e, 100));
        System.out.println(konvertujEvreUDolare(d, e, 100));
    }

    public static double konvertujDolareUEvre(Dolar d, Euro e, double iznos) {
        double odnos = d.getKurs() / e.getKurs();
        return iznos * odnos;
    }

    public static double konvertujEvreUDolare(Dolar d, Euro e, double iznos) {
        double odnos = e.getKurs() / d.getKurs();
        return iznos * odnos;
    }
}
