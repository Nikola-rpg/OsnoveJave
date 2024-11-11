package Nedelja6;

public class Zadatak1 {
    public static void main(String[] args) {
        int[] niz1 = unesiBrojeve();
        int[] niz2 = generisi();
        //stampac(niz1);
        //stampac(niz2);
        //System.out.println("prelom");
        bingo(niz1, niz2);
    }

    public static int[] unesiBrojeve() {
        int[] niz1 = new int[6];
        for (int i = 0; i < niz1.length; i++) {
            niz1[i] = (int) (Math.random() * 25);
        }
        return niz1;
    }

    public static int[] generisi() {
        int[] niz1 = new int[30];
        for (int i = 0; i < niz1.length; i++) {
            niz1[i] = (int) (Math.random() * 25);
        }
        return niz1;
    }

    public static void stampac(int[] niz1) {
        for (int i = 0; i < niz1.length; i++) {
            System.out.println(niz1[i]);
        }
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
            //System.out.println(trenutniBroj+ " " + brojac);//za pregled tacnosti podataka
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
