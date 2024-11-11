package Nedelja7.d_Petak;

import Nedelja7.d_Petak.Eseista;
import Nedelja7.d_Petak.Knjiga;
import Nedelja7.d_Petak.Romanopisac;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Napraviti klasu Knjiga koja ima atribute: naslov, broj strana, i godina izdavanja.Napraviti klasu Pisac koja ima atribute: ime, godina rođenja, i lista knjiga (lista objekata klase Knjiga).
        //Napraviti metode:
        //najpoznatijaKnjiga() -> koja vraća naslov knjige sa najvećim brojem strana.
        //vremePisanja() -> koja vraća razliku između godine izdavanja prve i poslednje knjige.Napraviti klasu Romanopisac koji nasledjuje klasu Pisac i specifična metoda je:
        //dugometrazniRoman() -> vraća "dugometražni roman" ako knjiga ima više od 500 strana.Napraviti klasu Pesnik koji nasledjuje klasu Pisac i ima metodu:
        //brojZbirki() -> koja vraća broj knjiga koje imaju manje od 100 strana (pretpostavljamo da su zbirke poezije kraće).Napraviti klasu Esesista koja nasledjuje klasu Pisac i dodati metodu:
        //kratkiEseji() -> vraća broj eseja (knjiga) koji imaju manje od 50 strana.
        Knjiga k1 = new Knjiga("Kaput", 501, 2024);
        Knjiga k2 = new Knjiga("Zahvalan", 10, 2020);
        Knjiga k3 = new Knjiga("Pobeda sebe", 50, 2022);
        ArrayList<Knjiga> Lista = new ArrayList<>();
        Lista.add(k1);
        Lista.add(k2);
        Lista.add(k3);
        Romanopisac p1 = new Romanopisac("Marko", 1980, Lista);
        Pesnik p2 = new Pesnik("Marija", 1980, Lista);
        Eseista p3 = new Eseista("Marija", 1980, Lista);

        System.out.println("Najpoznatija knjiga je: " + p1.najpoznatijaKnjiga());
        System.out.println("Autor je stvarao godina: " + p1.vremePisanja());
        System.out.println("Dugometrazni roman je: " + p1.dugometrazniRoman());
        System.out.println("Broj zbirki manjih od 100 strana: " + p2.brojZbirki());
        System.out.println("Broj eseja manjih od 50 strana: " + p3.kratkiEseji());
    }
}
