package Nedelja4.d_Petak;

public class Zadatak3 {
    public static void main(String[] args) {
        //Napisati program koji koristi metodu da proveri da li su dva uneta niza jednaka.
        int[] nizx = {1, 2, 3, 4};
        int[] nizy = {1, 2, 3, 18};
        jednakiLiSu(nizx, nizy);
    }

    public static void jednakiLiSu(int niz1[], int niz2[]) {
        boolean isti = true;
        if (niz1.length == niz2.length) {
            for (int i = 0; i < niz1.length; i++) {
                if (niz1[i] == niz2[i]) {
                    continue;
                } else {
                    isti = false;
                    break;
                }
            }
            if (isti) {
                System.out.println("Nizovi su jednaki.");
            } else {
                System.out.println("Nizovi nisu jednaki.");
            }
        }

    }
}
