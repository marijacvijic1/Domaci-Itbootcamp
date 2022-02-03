import java.util.Scanner;

public class Duplifaktorijel {

    public static void main(String[] args) {


                System.out.println("Unesite broj:");
                Scanner sc = new Scanner(System.in);

                int  n=sc.nextInt();
                int duplifaktorijel = n ;
                int i;

                for (i = (n-2); i > 0; i-=2) {

                    duplifaktorijel = duplifaktorijel * i;
                }

                System.out.println("Dupli faktorijel broja " + n + " je " + duplifaktorijel + ".");



            }
        }