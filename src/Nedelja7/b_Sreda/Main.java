package Nedelja7.b_Sreda;

public class Main {
    /*Kreirati klasu BankovniRacun koja modeluje bankovni racun. Svaki bankovni racun ima svoj jedinstveni broj,
    ime vlasnika racuna, i trenutno stanje na racunu.
    Implementirati konstruktor koji postavlja vrednosti ovih atributa pri kreiranju racuna.
    Dodati metode uplata i isplata koje omogucavaju uplatu i isplatu novca sa racuna.
    Obe metode primaju iznos kao argument. Metoda uplata povecava trenutno stanje racuna za dati iznos,
    dok metoda skidanje smanjuje trenutno stanje racuna.
    Implementirati provere da li je iznos uplate ili skidanja pozitivan i da li postoji dovoljno
    sredstava na racunu za skidanje.
    Napisati metodu toString koja generise string reprezentaciju objekta, uključujući broj racuna,
    ime vlasnika i trenutno stanje na racunu.
    U main metodi, kreirati objekat klase BankovniRacun, ispisati informacije o računu pomocu
    metode toString, izvrsiti nekoliko uplata i skidanja novca na računu pomoću metoda uplata i
    skidanje, te na kraju ispisati azurirane informacije o racunu.*/
    public static void main(String[] args) {
        BankovniRacun2 a= new BankovniRacun2(123456, "Darko", 1000);
        System.out.println(a);
        a.uplata();
        a.isplata();
        a.isplata();
        a.uplata();
        System.out.println("Trenutno stanje " + a.getStanje());
    }
}