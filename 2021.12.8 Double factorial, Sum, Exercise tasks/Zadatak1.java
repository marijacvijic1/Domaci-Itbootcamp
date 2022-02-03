package ZadaciPostBean;// Za unet broj n, ispisati "Paran" ako je paran, a "Neparan" ako je neparan.

import java.util.Scanner;

public class Zadatak1 {

    public static void main(String[] args) {
            System.out.println("Uneti broj:");
            Scanner sc = new Scanner(System.in);
            int n=sc.nextInt();
            if (n % 2 == 0) {
                System.out.println("Paran");
            } else if (n % 2 > 0) {
                System.out.println("Neparan");

            } }
    }


