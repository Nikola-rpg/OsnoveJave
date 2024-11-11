package Nedelja3.b_Petak;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj poena (0-100): ");
        double a = sc.nextDouble();
        if (a >= 51 && a <= 60) {
            System.out.println("Položili ste sa ocenom 6.");
        } else if (a >= 61 && a <= 70) {
            System.out.println("Položili ste sa ocenom 7.");
        } else if (a >= 71 && a <= 80) {
            System.out.println("Položili ste sa ocenom 8.");
        } else if (a >= 81 && a <= 90) {
            System.out.println("Položili ste sa ocenom 9.");
        } else if (a >= 91 && a <= 100) {
            System.out.println("Čestitamo! Položili ste sa ocenom 10.");
        } else if (a < 51 && a > -1) {
            System.out.println("Taj broj bodova je nedovoljan za polaganje ispita.");
        } else {
            System.out.println("Neodgovarajući unos");
        }
    }
}
