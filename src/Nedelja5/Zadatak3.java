package Nedelja5;

public class Zadatak3 {
    public static void main(String[] args) {
        //Napraviti metodu koja prima niz celih brojeva i vraca true ukoliko je niz rastuci.
        int[] niz1 = {1, 2, 3, 4, 5};
        int[] niz2 = {5, 4, 3, 2, 1};
        System.out.println(rastuci(niz2));
    }

    public static boolean rastuci(int[] niz) {
        boolean result = true;
        for (int i = 0; i < niz.length - 1; i++) {
            if (niz[i] >= niz[i + 1]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
