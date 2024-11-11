package Nedelja7.a_Ponedeljak;

public class Main {
    public static void main(String[] args) {
        BankovniRacun a= new BankovniRacun(123456, "Darko", 1000);
        System.out.println(a);
        a.uplata();
        a.isplata();
        a.isplata();
        a.uplata();
        System.out.println("Trenutno stanje " + a.stanje);
    }
}
