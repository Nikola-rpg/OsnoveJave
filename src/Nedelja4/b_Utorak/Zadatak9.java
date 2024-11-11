package Nedelja4.b_Utorak;

public class Zadatak9 {
    public static void main(String[] args) {
        /*Napraviti program koji ide od 1 do 30 I stampa svaki broj uz poruku da li je paran ili neparan.*/
        for(int i=1; i<=30; i++) {
            if(i%2==0) {
                System.out.println("Broj " + i + " je paran.");
            } else {
                System.out.println("Broj " + i + " je neparan");
            }
        }
    }
}
