package Nedelja4.b_Utorak;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        //Izbroj koliko se samoglasnika nalazi u unetom stringu
        Scanner sc = new Scanner(System.in);
        System.out.println("Upiši neki string i saznaj koliko se puta slovo \"a\" nalazi u njemu: ");
        String unos = sc.nextLine();
        char slovo1 = 'a';
        char slovo2 = 'e';
        char slovo3 = 'i';
        char slovo4 = 'o';
        char slovo5 = 'u';
        int brojac1 = 0;
        int brojac2 = 0;
        int brojac3 = 0;
        int brojac4 = 0;
        int brojac5 = 0;
        for (int i = 0; i < unos.length(); i++) {
            if (unos.charAt(i) == slovo1) {
                brojac1++;
            }
        }
        for (int i = 0; i < unos.length(); i++) {
            if (unos.charAt(i) == slovo2) {
                brojac2++;
            }
        }
        for (int i = 0; i < unos.length(); i++) {
            if (unos.charAt(i) == slovo3) {
                brojac3++;
            }
        }
        for (int i = 0; i < unos.length(); i++) {
            if (unos.charAt(i) == slovo4) {
                brojac4++;
            }
        }
        for (int i = 0; i < unos.length(); i++) {
            if (unos.charAt(i) == slovo5) {
                brojac5++;
            }
        }
        System.out.println("U stringu \"" + unos + "\" se nalazi " + (brojac1 + brojac2 + brojac3 + brojac4 + brojac5) + " samoglasnika.");
    }
}
