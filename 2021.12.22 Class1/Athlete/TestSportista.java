package Sportista;

public class TestSportista {
    public static void main(String[] args) {

        Sportista sp1 = new Sportista("Vlade Divac", "kosarka", "Lakers", 15);
        Sportista sp2 = new Sportista("Nikola Jokic", "kosarka", 13);

        Sportista sp3 = new Sportista("Nikola Grbic", "odbojka","Zaks", 10);

        //Nikola Grbic je promenio klub iz Zaks u Crvena Zvezda
        sp3.setKlub("Crvena zvezda");

        System.out.println(sp1.toString());
        System.out.println(sp2.toString());
        System.out.println(sp3.toString());

    }
}



