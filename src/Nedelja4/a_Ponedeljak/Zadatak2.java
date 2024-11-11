package Nedelja4.a_Ponedeljak;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        /*Napisi program koji koristi for petlju da proveri da li je broj N prost.
        Korisnik treba da unese vrednost N, a program treba da ispita da li je taj broj
        deljiv samo sa 1 i sa samim sobom. Ispiši odgovarajuću poruku.
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite neki prirodni broj: ");
        int broj = sc.nextInt();
        int brojac = 0;
        if (broj > 0) {
            for (int i = 1; i <= broj; i++) {
                if (broj % i == 0) {
                    brojac += 1;
                }
            }
            if (brojac == 2) {
                System.out.println("Prost");
            } else {
                System.out.println("Nije prost");
            }
        }
    }
}

