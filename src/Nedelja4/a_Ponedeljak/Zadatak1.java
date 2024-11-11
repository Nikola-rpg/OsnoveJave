package Nedelja4.a_Ponedeljak;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        /*Napisi program koji korisnika pita da unese ocenu ucenika kao celobrojni broj (na primer, 5, 4, 3, 2, 1).
        Koristiti switch za konvertovanje ocenu u slovnu ocenu prema sledećem kljucu:
        Ako je ocena 5, slovna ocena je "Odlican".
        Ako je ocena 4, slovna ocena je "Vrlo dobar".
        Ako je ocena 3, slovna ocena je "Dobar".
        Ako je ocena 2, slovna ocena je "Dovoljan".
        Ako je ocena 1, slovna ocena je "Nedovoljan".
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi ocenu učenika kao celobrojni broj (na primer: 1, 2, 3, 4, 5): ");
        //int ocena=sc.nextInt();
        String ocena = sc.nextLine();
        switch (ocena) {
            case "1":
                System.out.println("Ako je ocena 1, slovna ocena je \"Nedovoljan\"");
                break;
            case "2":
                System.out.println("Ako je ocena 2, slovna ocena je \"Dovoljan\"");
                break;
            case "3":
                System.out.println("Ako je ocena 3, slovna ocena je \"Dobar\"");
                break;
            case "4":
                System.out.println("Ako je ocena 4, slovna ocena je \"Vrlo dobar\"");
                break;
            case "5":
                System.out.println("Ako je ocena 5, slovna ocena je \"Odlican\"");
                break;
            default:
                System.out.println("Pogrešan unos!");
                break;
        }
    }
}
