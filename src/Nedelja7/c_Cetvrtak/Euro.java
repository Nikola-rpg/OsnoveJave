package Nedelja7.c_Cetvrtak;

public class Euro extends Valuta {
    public Euro(String naziv, char simbol, double kurs) {
        super("Euro", '€', 117.09);
    }

    public double postaviKursNovi(double noviKurs) {
        setKurs(noviKurs);
        return getKurs();
    }
}
