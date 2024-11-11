package Nedelja4.c_Cetvrtak;

public class Zadatak6 {
    public static void main(String[] args) {
        //Napraviti niz String-ova i definisati jos jedan String, ispisati poruku ukoliko se taj String nalazi u nizu.
        String[] niz1 = {"o", "kako", "sam", "se", "lozio"};
        String rec = "kako";
        int brojac = 0;
        for (int i = 0; i < niz1.length; i++) {
            if (niz1[i].equals(rec)) {
                brojac++;
            }
        }
        if (brojac == 0) {
            System.out.println("String \"" + rec + "\" se NE nalazi u nizu.");

        } else {
            System.out.println("String \"" + rec + "\" se nalazi u nizu.");
        }
    }
}


