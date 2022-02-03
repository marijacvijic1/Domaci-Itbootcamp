package DomaciDuplaPetlja;

import java.util.ArrayList;

public class Atletika {

    public static void main(String[] args){

        //kreirati listu sa kapacitetom 5
        ArrayList<String> atletika = new ArrayList<>();

        //u listu dodati vase omiljene iteme hobija
        atletika.add("Viseboj");
        atletika.add("Skok motkom");
        atletika.add("Skok u dalj");
        atletika.add("Stafeta");
        atletika.add("400m");
        atletika.add("1500m");
        atletika.add("400m prepone");
        System.out.println(atletika);

        //dohvatiti treci element i ispisati
        String a =atletika.get(3);
        System.out.println(a);

        //promeniti naziv prvog elementa
        atletika.set(1, "Zajedno sami");
        System.out.println(atletika);

        //uklanjaniti 5-ti element
        atletika.remove(5);
        System.out.println(atletika);

        //Ispis velicine liste
        int s = atletika.size();
        System.out.println(s);

        //Pomocu for petlje ispisati elemente liste
        //1. nacin
        System.out.println("Elementi ove liste su: ");
        for (int i = 0; i< atletika.size(); i++){
            System.out.println((i+1)+(".") + atletika.get(i) + " ");
            System.out.println();
        }
        //2. nacin
        System.out.println("Elementi ove liste su: ");
        for (String i : atletika){
            System.out.println( i  + " ");
        }


    }
}
