package ZadaciPostBean;//Ispisati proizvod prvih n celih brojeva [1, n].

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {

        System.out.println("Uneti broj:");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int proizvod=1;
        for ( int i=1; i<=n ; i++) {
           proizvod=proizvod*i;
        }

        System.out.println("Zadatak6 brojeva od 1 do " + n + " je " + proizvod + "." );
    }
}




