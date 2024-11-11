package Nedelja4.b_Utorak;

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
        //Napraviti program gde cete uneti neki mesec, pomocu Swtich-a napraviti
        //ispis o tome Koliko taj mesec ima dana.
        Scanner sc=new Scanner(System.in);
        System.out.println("Unesite naziv nekog meseca i dobićete koliko taj mesec ima dana.");
        String unos=sc.nextLine();
        if (unos.toUpperCase().equals("JANUAR")){
            System.out.println("Mesec januar ima 31 dan.");
        }else if(unos.toUpperCase().equals("FEBRUAR")){
            System.out.println("Mesec februar ima 28 ili 29 dana.");
        }
    }
}
