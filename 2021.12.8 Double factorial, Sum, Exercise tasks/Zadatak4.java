package ZadaciPostBean;// Za unet negativan ceo broj n, ispisati sve brojeve od i zakljucno sa n do i zakljucno sa 0

import java.util.Scanner;

public class Zadatak4 {

    public static void main(String[] args) {
        System.out.println("Uneti broj:");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i;
        for (i=n; i<=0 ; i++) {
            System.out.println("Brojevi su: " + i );
        }
    }
}


