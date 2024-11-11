package Nedelja4.b_Utorak;

import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {
        /*Napraviti program za Biblioteku, kao atribut imate clanarinu koja je 1000,
        zatim unesite vas status ("student","penzioner" ili "zaposlen).
        Penzioneri imaju 20% popusta na clanarinu dok studenti imaju 10%.
        Zaposleni nemaju nikakav popust.*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Upisite da li ste: student, penzioner ili zaposleni");
        String unos = sc.nextLine();
        double clanarina = 1000;

        if (unos.equals("student")) {
            System.out.println(clanarina * 0.9);
        } else if (unos.equals("penzioner")) {
            System.out.println(clanarina * 0.8);
        } else {
            System.out.println(clanarina);
        }
    }
}
