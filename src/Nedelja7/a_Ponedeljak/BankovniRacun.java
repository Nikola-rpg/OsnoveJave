package Nedelja7.a_Ponedeljak;

import java.util.Scanner;

public class BankovniRacun {
    int brojRacuna;
    String imeVlasnika;
    double stanje;

    public BankovniRacun(int brojRacuna, String imeVlasnika, double stanje) {
        this.brojRacuna = brojRacuna;
        this.imeVlasnika = imeVlasnika;
        this.stanje = stanje;
    }

    Scanner sc = new Scanner(System.in);

    public double uplata() {
        System.out.println("Unesite iznos uplate: ");
        double uplata = sc.nextDouble();
        if(uplata<0){
            System.out.println("Ne možete da uplatite negativan iznos.");
        }else {
            stanje += uplata;
        }
        return stanje;
    }

    public double isplata(){
        System.out.println("Unesite iznos za ispaltu.");
        double isplata = sc.nextDouble();
        if(stanje<Math.abs(isplata)){
            System.out.println("Nemte dovoljno sredstava na računu da biste napravili takvu transakciju!");
        }else{
            stanje-=Math.abs(isplata);
        }
        return stanje;
    }


    public String toString() {
        return "BankovniRacun{" + "brojRacuna=" + brojRacuna + ", imeVlasnika='" + imeVlasnika + '\'' + ", stanje=" + stanje + '}';
    }
}
