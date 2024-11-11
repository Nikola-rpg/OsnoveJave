package Nedelja5;

public class Zadatak2 {
    public static void main(String[] args) {
        //Napisati metodu za vracanje niza sa obrnutim redosledom elemenata niza
        //Napisati metodu za vracanje broja brojeva vecih od proseka

        int[] niz = {15, 78, 90, -54, 10};
        int[] niz2 = veciOdProseka(niz);
        System.out.println(niz2[0]);
        System.out.println(niz2[niz2.length - 1]);
    }

    public static int[] obrnutiNiz(int[] niz) {
        int[] niz2 = new int[niz.length];
        for (int i = 0; i < niz.length; i++) {
            niz2[niz.length - 1 - i] = niz[i];
        }
        return niz2;
    }

    public static int[] veciOdProseka(int[] niz) {
        int zbir = 0;
        int prosek = 0;
        for (int i = 0; i < niz.length; i++) {
            zbir += niz[i];
        }
        prosek = zbir / niz.length;
        int brojac = 0;
        for (int i = 0; i < niz.length; i++) {
            if (niz[i] > prosek) {
                brojac++;
            }
        }
        int[] niz2 = new int[brojac];
        int a = 0;
        for (int i = 0; i < niz.length; i++) {
            if (niz[i] > prosek) {
                niz2[a] = niz[i];
                a++;
            }
        }
        return niz2;
    }
}
