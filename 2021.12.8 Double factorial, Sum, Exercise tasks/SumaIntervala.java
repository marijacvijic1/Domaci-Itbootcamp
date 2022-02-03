import java.util.Scanner;

public class SumaIntervala {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Uneti dva cela broja: ");
       int m=sc.nextInt();
       int n=sc.nextInt();

        int suma=0;
      for (int i=m; i<=n; i++ ){
          suma=suma+i;
      }
        System.out.println("Suma brojeva od " + m + " do " + n + " je " + suma + ".");


    }
}
