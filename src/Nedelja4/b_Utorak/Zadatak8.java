package Nedelja4.b_Utorak;

import java.util.Scanner;

public class Zadatak8 {
    public static void main(String[] args) {
        /*Pomocu for petlje proci kroz neku reci I izracunati broj pojavljivanja slova 'a'.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite neku rec: ");
        String rec = scanner.nextLine();
        int brojac = 0;
        for (int i = 0; i < rec.length(); i++) {
            if (rec.charAt(i) == 'a') {
                brojac++;
            }
        }
        System.out.println("Broj pojavljivanja slova 'a' je: " + brojac);
    }
}
