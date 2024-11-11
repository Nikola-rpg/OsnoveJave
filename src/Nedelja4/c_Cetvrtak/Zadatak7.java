package Nedelja4.c_Cetvrtak;

public class Zadatak7 {
    public static void main(String[] args) {
        //Napraviti dva niza String-ova i proveriti da li su jednaki.
        String[] niz1 = {"jedan", "dva", "tri"};
        String[] niz2 = {"jedan", "dva", "tri"};
        boolean isti = true;
        if(niz1.length==niz2.length) {  // ako su nizovi jednaki znaci moraju imati isti broj elemenata
            for(int i=0; i<niz1.length; i++) {
                if(niz1[i]!=niz2[i]) {
                    isti = false;
                    break;
                }
            }
        } else {
            isti = false;
        }

        if(isti) {
            System.out.println("Nizovi su jednaki");
        } else {
            System.out.println("Nizovi NISU jednaki");
        }
    }
}
