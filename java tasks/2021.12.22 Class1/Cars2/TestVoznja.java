package Automobil2;

public class TestVoznja {
    public static void main(String[] args) {

        Automobil2 auto1 = new Automobil2("Ford", "Fiesta", 4, "Katarina Cvijic");
        Automobil2 auto2 = new Automobil2("BMW", "120d", 7, "Jovan Cucic");
        //bez vlasnika
        Automobil2 auto3 = new Automobil2("Honda", "Civic", 5);

        System.out.println(auto1);
        System.out.println(auto2);
        System.out.println(auto3);

        // moze i ovako
        /*System.out.println(auto1.toString());
        System.out.println(auto2.toString());
        System.out.println(auto3.toString());*/


    }


}
