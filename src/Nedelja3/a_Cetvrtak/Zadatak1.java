package Nedelja3.a_Cetvrtak;

public class Zadatak1 {
    public static void main(String[] args) {
        // Napisati program koji računa površinu i obim pravougaonika sa zadatim dimenzijama a = 5 i b = 13 (dužine stranica).
        int a = 5;
        int b = 13;
        int povrsina;
        int obim;
        povrsina = a * b;
        obim = 2 * a + 2 * b;
        System.out.println("Površina pravougaonika iznosi: " + povrsina);
        System.out.println("Obim pravougaonika iznosi: " + obim);
    }
}
