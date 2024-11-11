package Nedelja7.c_Cetvrtak;

public class Dolar extends Valuta {
    public Dolar(String naziv, char simbol, double kurs) {
        super("Dolar", '$', 104.9);
    }

    public double postaviKursNovi(double noviKurs) {
        setKurs(noviKurs);
        return getKurs();
    }
}
