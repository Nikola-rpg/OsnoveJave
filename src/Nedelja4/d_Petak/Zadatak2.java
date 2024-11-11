package Nedelja4.d_Petak;

public class Zadatak2 {
    public static void main(String[] args) {
        //Napisati program koji koristi metodu za izracunavanje faktorijela unetog broja.
        int x = 6;
        System.out.println(faktor(x));
    }

    public static int faktor(int a) {
        int broj = 1;
        for (int i = 1; i <= a; i++) {
            broj *= i;
        }
        return broj;
    }
}
