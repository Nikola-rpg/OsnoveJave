package Nedelja3.b_Petak;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        //1. Napisati program koji izracunava povrsinu i obim kruga za radijus r. (2 * r * PI)
        Scanner sc = new Scanner(System.in);
        System.out.println("Upiši koliko iznosi radijus kruga: ");
        double radijus = sc.nextDouble();
        double obim = 2 * radijus * Math.PI;
        double povrsina = Math.PI * (radijus * radijus);
        System.out.println("Obim kruga za uneti radijus iznosi: " + obim);
        System.out.println("Površina kruga za uneti radijus iznosi: " + povrsina);
    }
}
