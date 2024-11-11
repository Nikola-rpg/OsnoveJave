package Nedelja6;

import java.util.Arrays;
import java.util.Random;

public class Zadatak2 {
    public static void main(String[] args) {
        //varijanta da se ne ponavljaju brojevi
        int[] niz1 = unesiBrojeve();
        int[] niz2 = generisi();
        System.out.println(Arrays.toString(niz1));
        System.out.println(Arrays.toString(niz2));
        bingo(niz1, niz2);
    }

    public static int[] randomiziraj(int[] niz1) {
        Random rand = new Random();
        for (int i = 0; i < niz1.length; i++) {
            int randomIndexToSwap = rand.nextInt(niz1.length);
            int temp = niz1[randomIndexToSwap];
            niz1[randomIndexToSwap] = niz1[i];
            niz1[i] = temp;
        }
        return niz1;
    }

    public static int[] unesiBrojeve() {
        int[] niz1 = new int[35];
        for (int i = 0; i < niz1.length; i++) {
            niz1[i] = i + 1;
        }
        niz1 = randomiziraj(niz1);
        int[] niz2 = new int[6];
        for (int i = 0; i < niz2.length; i++) {
            niz2[i] = niz1[i];
        }
        return niz2;
    }

    public static int[] generisi() {
        int[] niz1 = new int[35];
        for (int i = 0; i < niz1.length; i++) {
            niz1[i] = i + 1;
        }
        niz1 = randomiziraj(niz1);
        int[] niz3 = new int[30];
        for (int i = 0; i < niz3.length; i++) {
            niz3[i] = niz1[i];
        }
        return niz3;
    }

    public static void bingo(int[] niz1, int[] niz2) {
        int brojac2 = 0;
        for (int i = 0; i < niz1.length; i++) {
            int trenutniBroj = niz1[i];
            int brojac = 0;
            for (int j = 0; j < niz2.length; j++) {
                if (trenutniBroj == (niz2[j])) {
                    brojac++;
                }
            }
            //System.out.println(trenutniBroj + " " + brojac);
            if (brojac > 0) {
                brojac2++;
            }
        }
        String odgovor;
        if (brojac2 < 6) {
            System.out.println("Imate tačnih pogodaka: " + brojac2);
        } else {
            System.out.println("Bingo!");
        }
    }
}
