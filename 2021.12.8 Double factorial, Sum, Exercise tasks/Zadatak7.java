package ZadaciPostBean;
// Napraviti program koji za unet mesec i dan ispisuje odgovarajuci horoskopski znak.


import java.util.Scanner;

public class Zadatak7 {

    public static void main(String[] args) {
        System.out.println("Uneti dan i mesec rodjenja:");
        Scanner sc = new Scanner(System.in);
        int dan=sc.nextInt();
        String mesec=sc.next();
        String znak_u_horoskopu="";
        if (dan < 1 || dan > 31){
            System.out.println("Broj dana koji ste uneli, nije moguc. ");
        }

        if (mesec.equals("decembar")){

            if (dan < 22)
                znak_u_horoskopu = "Strelac";
            else
                znak_u_horoskopu ="Jarac";
        } else if (mesec.equals("januar")){

            if (dan < 20)
                znak_u_horoskopu = "Jarac";
            else
                znak_u_horoskopu = "Vodolija";
        } else if (mesec.equals("februar")){
            if (dan < 19)
                znak_u_horoskopu = "Vodolija";
            else
                znak_u_horoskopu = "Riba";
        } else if(mesec.equals("mart")){
            if (dan < 21)
                znak_u_horoskopu = "Riba";
            else
                znak_u_horoskopu = "Ovan";
        } else if (mesec.equals("april")){
            if (dan < 20)
                znak_u_horoskopu = "Ovan";
            else
                znak_u_horoskopu = "Bik";
        } else if (mesec.equals("maj")){
            if (dan < 21)
                znak_u_horoskopu = "Bik";
            else
                znak_u_horoskopu = "Blizanac";
        } else if(mesec.equals("jun")){
            if (dan < 21)
                znak_u_horoskopu = "Blizanac";
            else
                znak_u_horoskopu = "Rak";
        } else if (mesec.equals("jul")){
            if (dan < 23)
                znak_u_horoskopu = "Rak";
            else
                znak_u_horoskopu = "Lav";
        } else if(mesec.equals("avgust")){
            if (dan < 23)
                znak_u_horoskopu = "Lav";
            else
                znak_u_horoskopu = "Devica";
        } else if (mesec.equals("septembar")){
            if (dan < 23)
                znak_u_horoskopu = "Devica";
            else
                znak_u_horoskopu = "Vaga";
        } else if (mesec.equals("oktobar")){
            if (dan < 23)
                znak_u_horoskopu = "Vaga";
            else
                znak_u_horoskopu = "Skorpija";
        } else if (mesec.equals("novembar")){
            if (dan < 22)
                znak_u_horoskopu = "Skorpija";
            else
                znak_u_horoskopu = "Strelac";
        }

        System.out.println("U horoskopu ste " + znak_u_horoskopu + ".");
    }



}



