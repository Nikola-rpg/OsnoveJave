package Nedelja4.d_Petak;

public class Zadatak1 {
    public static void main(String[] args) {
        //Napisati program koji koristi metode za ispisivanje kvadrata i korena unetog broja.
        int x = 9;
        stampajStepenIKoren(x);
    }

    public static void stampajStepenIKoren(int a) {
        double c = a * a;
        double d = Math.sqrt(a);
        System.out.println("Kvadrat broja " + a + " iznosi: " + c);
        System.out.println("Koren broja " + a + " iznosi: " + d);
    }
}
