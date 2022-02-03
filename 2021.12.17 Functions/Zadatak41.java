package Domaci5;

public class Zadatak41 {
    public static void main(String[] args) {


        double[] nizBrojeva = {1.8, 2.8, 18.7, 4.3, 5.97, 0.05, 17.35};  //Niz je u main f-ji jer predstavlja ulazne podatke

        System.out.println("Prosecna vrednost niza je jednaka broju " + prosecnaVrednost(nizBrojeva) + ".");


    }
    //F-je double jer je tako zahtevano u zadatku, sto znaci da u nizu mogu postojati decimalni brojevi.
    // Iz tog razloga su i suma i prosecna vrednost double
        public static double prosecnaVrednost(double nizBrojeva[]){

            double suma = 0; //suma je skoro uvek =0 sem kada je u pitanju proizvod
            double prosecnavrednost; //deklarisanje nove "promenjive"

            for (int i = 0; i < nizBrojeva.length; i++) {  //for petlja u kojoj pisemo pocetnu tacku, ciljnu tacku i  inkrement

                suma = suma + nizBrojeva[i]; // posto je u pitanju prosecna vrednost, prvo moramo da izracunamo sumu svih brojeva u datom nizu,

            }
            prosecnavrednost = suma / nizBrojeva.length;  //prosecna vrednost je kolicnik sume i broja elemenata u nizu
           return prosecnavrednost;                       //vraca se rezultat prosecne vrednosti jer smo u double f-iji

        }
    }
