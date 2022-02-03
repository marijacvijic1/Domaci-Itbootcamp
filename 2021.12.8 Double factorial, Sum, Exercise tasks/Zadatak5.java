package ZadaciPostBean;//Za unet pozitivan ceo broj n, ispisati sve brojeve od i zakljucno sa -14 do i zakljucno sa 2n.

import java.util.Scanner;

public class Zadatak5 {

    public static void main(String[] args) {
        System.out.println("Uneti broj:");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i;
        for (i=-14; i<=2*n ; i++) {
            System.out.println("Brojevi su: " + i );
        }
    }
}


