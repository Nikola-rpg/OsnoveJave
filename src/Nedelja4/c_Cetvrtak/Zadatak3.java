package Nedelja4.c_Cetvrtak;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        /*Napisati program koji trazi od korisnika da unese niz celih brojeva,
        pronalazi minimalni i maksimalni element u nizu i racuna kvadrat njihove razlike.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi niz od 5 celih brojeva: ");
        int unos;
        int[] niz = new int[5];
        int najveci = niz[0];
        for (int i = 0; i < niz.length; i++) {
            System.out.println("Unesi " + (i + 1) + ". ceo broj: ");
            unos = sc.nextInt();
            niz[i] = unos;
        }
        int najmanji = niz[0];
        for (int i = 0; i < niz.length; i++) {
            if (niz[i] > najveci) {
                najveci = niz[i];
            }
        }
        for (int i = 0; i < niz.length; i++) {
            if (niz[i] < najmanji) {
                najmanji = niz[i];
            }
        }
        int kvdratRazlike = najveci * najveci - 2 * najveci * najmanji + najmanji * najmanji;
        System.out.println("Od svih unetih brojeva najveći je: " + najveci);
        System.out.println("Od svih unetih brojeva najmanji je: " + najmanji);
        System.out.println("Kvadrat njihove razlike iznosi: " + kvdratRazlike);
    }
}
