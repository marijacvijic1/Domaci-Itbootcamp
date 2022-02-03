package Domaci5;



public class Zadatak42 {
    public static void main(String[] args) {

        String[] nizImena = {"Jovana", "Sanja", "Luka", "Strahinja", "Marija", "Aleksa"}; //Niz koji predstavlja ulazne podatke i zato je u main f-ji

        System.out.println(proveraNiza( nizImena));
    }

    public static String proveraNiza(String nizImena[]) {  //Fja je string jer su u pitanju imena tj tekst

        String Marija = "Ime Marija ne postoji u ovom nizu.";   //davanje stringu nove vrednosti koje ce se pozvati ukoliko
                                                                // uslov iz for petlje nije zadovoljen
        String Petar = "Ime Petar ne postoji u ovom nizu";

        for (int i = 0; i < nizImena.length; i++) {
            if (nizImena[i] == "Marija") {                    //ukoliko ime postoji ispisace vrednost stringa koja je u petlji, ukoliko ne
                                                             // poziva novu vrednost koju smo dodelili

                Marija = "Ime Marija postoji u ovom nizu.";

            } else if (nizImena[i] == "Petar") {
                Petar = "Ime Petar postoji u ovom nizu.";
            }
        }
        return Marija + " " + Petar + ".";       //return je moguc jer je f-ja String, a ne void
    }
}

