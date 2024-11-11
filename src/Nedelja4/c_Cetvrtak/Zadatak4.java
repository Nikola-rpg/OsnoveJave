package Nedelja4.c_Cetvrtak;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        /*Napisati program koji trazi od korisnika da unese niz celih brojeva,
        zatim vraca odgovor da li je veca apsolutna vrednost zbira pozitivnih brojeva ili apsolutna vrednost zbira negativnih brojeva.
        Funkcija za dobijanje apsoultne vrednosti broja je: Math.abs(broj).
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi niz od 5 celih brojeva: ");
        int unos;
        int[] niz = new int[5];
        int brojac1 = 0;
        int brojac2 = 0;
        for (int i = 0; i < niz.length; i++) {
            System.out.println("Unesi " + (i + 1) + ". ceo broj: ");
            unos = sc.nextInt();
            niz[i] = unos;
            if (unos > 0) {
                brojac1++;
            } else {
                brojac2++;
            }
        }
        int p = 0;
        int zbir = 0;
        int[] niz2 = new int[brojac1];
        for (int i = 0; i < niz.length; i++) {
            if (niz[i] > 0) {
                niz2[p] = niz[i];
                p++;
                zbir += niz[i];
            }
        }
        int d = 0;
        int zbirNegativnih = 0;
        int[] niz3 = new int[brojac2];
        for (int i = 0; i < niz.length; i++) {
            if (niz[i] < 0) {
                niz3[d] = niz[i];
                d++;
                zbirNegativnih += niz[i];
            }
        }
        int apsZbirNeg = Math.abs(zbirNegativnih);
        System.out.println("Apsolutna vrednost zbira pozitivnih brojeva iznosi: " + zbir);
        System.out.println("Apsolutna vrednost zbira negativnih brojeva iznosi: " + apsZbirNeg);
        if (zbir == apsZbirNeg) {
            System.out.println("Zbirovi su jednaki.");
        } else if (zbir > apsZbirNeg) {
            System.out.println("Veća je apsolutna vrednost zbira pozitivnih brojeva.");
        } else {
            System.out.println("Veća je apsolutna vrednost zbira negativnih brojeva.");
        }
    }
}
