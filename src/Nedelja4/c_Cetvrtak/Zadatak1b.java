package Nedelja4.c_Cetvrtak;

import java.util.Scanner;

public class Zadatak1b {
    public static void main(String[] args) {
        //Napisati program koji trazi od korisnika da unese niz celih brojeva i vraca sumu svih elemenata niza
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi niz od 5 celih brojeva: ");
        int unos;
        int[] niz = new int[5];
        int zbir = 0;
        for (int i = 0; i < niz.length; i++) {
            System.out.println("Unesi " + (i + 1) + ". ceo broj: ");
            unos = sc.nextInt();
            niz[i] = unos;
            zbir += unos;
        }
        System.out.println("Suma svih do sada unetih brojeva iznosi: " + zbir);
    }
}
