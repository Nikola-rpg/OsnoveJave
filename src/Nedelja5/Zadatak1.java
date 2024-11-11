package Nedelja5;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        /*Napisati program koji omogucava korisniku da unese niz celih brojeva. Program treba da ima sledeće metode:
        - Metoda za unos niza
        - Metoda za stampanje niza
        - Metoda za racunanje srednje vredsnoti brojeva u nizu
        - Metoda za sabiranje svih dvocifrenih brojeva
        - Metoda za vracanje razlike izmedju minimalnog i maksimalnog elementa niza
        */
        Scanner sc = new Scanner(System.in);
        int[] niz1 = unosNiza();
        stampaj(niz1);
        System.out.println("Srednja vrednost iznosi: " + srednjaVrednost(niz1));
        System.out.println("Zbir dvocifrenih brojeva iznosi: " + zbirDvocifrenih(niz1));
        System.out.println("Razlika između minimalnog i maksimalnog elementa iznosi: " + razlikaMaxMin(niz1));

    }

    public static void stampaj(int[] niz) {
        for (int i = 0; i < niz.length; i++) {
            System.out.println(niz[i]);
        }
    }

    public static int srednjaVrednost(int[] niz) {
        int zbir = 0;
        int srVr = 0;
        for (int i = 0; i < niz.length; i++) {
            zbir += niz[i];
        }
        return srVr = zbir / niz.length;
    }

    public static int zbirDvocifrenih(int[] niz) {
        int zbir = 0;
        for (int i = 0; i < niz.length; i++) {
            if (9 < niz[i] && niz[i] < 100) {
                zbir += niz[i];
            }
        }
        return zbir;
    }

    public static int razlikaMaxMin(int[] niz) {
        int min = niz[0];
        int max = niz[0];
        int razlika = 0;
        for (int i = 1; i < niz.length; i++) {
            if (niz[i] < min) {
                min = niz[i];
            }
        }
        for (int i = 1; i < niz.length; i++) {
            if (niz[i] > max) {
                max = niz[i];
            }
        }
        razlika = min - max;
        return razlika;
    }

    public static int[] unosNiza() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Naparavicemo niz od 5 celih brojeva.");
        System.out.println("Unesite jedan ceo broj: ");
        int[] niz1 = new int[5];
        niz1[0] = sc.nextInt();
        for (int i = 1; i < 5; i++) {
            System.out.println("Unesite još jedan ceo broj: ");
            niz1[i] = sc.nextInt();
        }
        return niz1;
    }
}
