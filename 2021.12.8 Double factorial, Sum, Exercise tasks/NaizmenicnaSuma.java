
import java.util.Scanner;

public class NaizmenicnaSuma {


    public static void main(String[] args) {

        System.out.println("Prikazati sumu brojeva do unetog broja:");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int suma=0;

        for (int i = 1; i<=n; i++) {

if (i%2==0) {
    suma=suma-i;
} else if (i%2!=0){
    suma=suma+i;
}

System.out.println( suma );

}}}

