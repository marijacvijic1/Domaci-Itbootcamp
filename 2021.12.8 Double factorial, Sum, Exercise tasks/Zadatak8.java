package ZadaciPostBean;

import java.util.Scanner;

public class Zadatak8 {



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite Vase ime:");
        String ime = sc.next();
        System.out.println("Unesite Vase prezime:");

        String prezime = sc.next();
        System.out.println("Unesite godinu Vaseg rodjenja:");
        int godinaRodjenja = sc.nextInt();


        int trenutnaGodina = 2021;

        int godisteNajmladjegUcenika = trenutnaGodina - 7;

        int brojRazreda = 12;

        int godisteNajstarijegUcenika = godisteNajmladjegUcenika - brojRazreda;

        if (godinaRodjenja > godisteNajmladjegUcenika) {
            System.out.println(ime + prezime + " tek treba da zapocne obrazovanje.");
        } else if (godinaRodjenja < godisteNajstarijegUcenika){
            System.out.println(ime + prezime + " je zavrsio/la obrazovanje.");
        }
        int razred = 1;

        for (int i = godisteNajmladjegUcenika; i > godisteNajstarijegUcenika; i--) {
            if (godinaRodjenja==i){
                System.out.println("Dobrodosao/la u " + razred + ". razred " +  ime + " " + prezime + "." );

            }
            razred ++;

        }

    }
}

