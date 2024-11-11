package Nedelja4.c_Cetvrtak;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        //Napisati program koji trazi od korisnika da unese niz celih brojeva i vraca sumu svih elemenata niza
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi jedan ceo broj: ");
        int unos = sc.nextInt();
        int zbir = unos;
        while (true) {
            System.out.println("Unesi još jedan ceo broj: ");
            unos = sc.nextInt();
            zbir += unos;
            System.out.println("Suma svih do sada unetih brojeva iznosi: " + zbir);
        }
    }
}
