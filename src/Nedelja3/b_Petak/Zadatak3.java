package Nedelja3.b_Petak;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite jedan broj: ");
        double a = sc.nextDouble();
        System.out.println("Unesite još jedan broj: ");
        double b = sc.nextDouble();
        System.out.println("Unesite znak (+ ili -): ");
        char znak = sc.next().charAt(0);
        //char znak='+';
        if (znak == '+') {
            System.out.println("Zbir unetih brojeva iznosi: " + (a + b));
        } else if (znak == '-') {
            System.out.println("Razlika unetih brojeva iznosi: " + (a - b));
        } else {
            System.out.println("Unos nije odgovarajući.");
        }
    }
}
