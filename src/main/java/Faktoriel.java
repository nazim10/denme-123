import java.util.Scanner;

public class Faktoriel {

    public static void main (String[] args) {
        // keep this function call here
        int a = 1;
        int x;

        Scanner s = new Scanner(System.in);
        System.out.println("bir sayi giriniz...");
         x = s.nextInt();
        //System.out.print(FirstFactorial(s.nextLine()));


        for (int i = 1; i <= x; i++) {
            a = a * i;
        }
        System.out.println("sonuc   = " + a);

        }



}
