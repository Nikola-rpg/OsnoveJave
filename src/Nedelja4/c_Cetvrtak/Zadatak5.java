package Nedelja4.c_Cetvrtak;

public class Zadatak5 {
    public static void main(String[] args) {
        //Napraviti niz String-ova i stampati sve stringove koji imaju duzinu manju od 5.
        String[] niz1 = {"ja", "sam", "se", "lozio"};
        int duzina = 0;
        for (int i = 0; i < niz1.length; i++) {
            if (5 > niz1[i].length()) {
                System.out.println(niz1[i]);
            }
        }
    }
}
