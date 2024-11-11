package Nedelja4.b_Utorak;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        //Izbroj koliko puta se javlja slovo 'a' u unetom stringu.
        Scanner sc = new Scanner(System.in);
        System.out.println("Upiši neki string i saznaj koliko se puta slovo \"a\" nalazi u njemu: ");
        String unos = sc.nextLine();
        char slovo = 'a';
        int brojac = 0;
        for (int i = 0; i < unos.length(); i++) {
            if (unos.charAt(i) == slovo) {
                brojac++;
            }
        }
        System.out.println("Slovo \"a\" se u stringu \"" + unos + "\" nalazi " + brojac + " puta.");
    }
}
