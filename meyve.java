import java.util.Scanner;

public class meyve {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double armut, elma, domates, muz, patlican, toplam;
        System.out.print("Armut Kaç Kilo: ");
        armut = inp.nextDouble();
        System.out.print("Elma Kaç Kilo: ");
        elma = inp.nextDouble();
        System.out.print("Domates Kaç Kilo: ");
        domates = inp.nextDouble();
        System.out.print("Muz Kaç Kilo: ");
        muz = inp.nextDouble();
        System.out.print("Patlıcan Kaç Kilo: ");
        patlican = inp.nextDouble();
        toplam = (armut* 2.14) + (elma * 3.67) +(domates * 1.11) + (muz * 0.95) + (patlican * 5);
        System.out.print("Toplam Tutar:" +toplam);

    }
}
