import java.util.Scanner;

     class Main {

        public static int FirstFactorial(int num) {
            // code goes here
            return num;
        }

        public static void main (String[] args) {
            // keep this function call here
   /* Scanner s = new Scanner(System.in);
    System.out.print(FirstFactorial(s.nextLine())); */
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