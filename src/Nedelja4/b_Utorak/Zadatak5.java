package Nedelja4.b_Utorak;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        /*Napraviti program gde cete uneti neki proizvoljan broj preko Scanner-a,
zatim ispitati da li je taj broj paran ili neparan, proveriti da li spada
u brojeve visokog ranga(da li je veci od 50), takodje proveriti da li je
taj broj deljiv sa 2 i sa 3.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite neki ceo broj: ");
        int unos=sc.nextInt();
        if (unos % 2 == 0){
            System.out.println("Uneti broj je paran.");
        }else{
            System.out.println("Uneti broj je neparan.");
        }
        if(unos>50){
            System.out.println("Uneti broj je veći od 50 zato spada u brojeve visokog ranga.");
        }else{
            System.out.println("Uneti brj je manji od 50 zato ne spada u bojeve visokog ranga.");
        }
        if(unos%2==0 && unos%3==0){
            System.out.println("Broj je deljiv i sa 2 i sa 3.");
        }else if(unos%2==0){
            System.out.println("Broj je deljiv sa 2 ali nije deljiv sa 3.");
        }else if(unos%3==0){
            System.out.println("Broj je deljiv sa 3 ali nije deljiv sa 2.");
        }else{
            System.out.println("Broj nije deljiv ni sa 2 ni sa 3.");
        }
    }
}
