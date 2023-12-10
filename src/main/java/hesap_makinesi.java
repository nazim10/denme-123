import java.util.Scanner;

public class hesap_makinesi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("birinci sayiyi giriniz...");
        int x = scanner.nextInt();
        System.out.println("ikinci  sayiyi giriniz...");
        int y = scanner.nextInt();
        System.out.println("bir islem seviniz ...  \nTOPLAMA ICIN --> 1 \nCIKARMA ICIN --> 2   \nCARPMA ICIN --> 3   \nBÖLME ICIN --> 4");
        int islem = scanner.nextInt();

        switch (islem) {
            case 1:
                System.out.println("islem sonucu  = " + (x + y));
                break;
            case 2:
                System.out.println("islem sonucu  = " + (x - y));
                break;
            case 3:
                System.out.println("islem sonucu  = " + (x * y));
                break;
            case 4:
                System.out.println("islem sonucu  = " + (x / y));
                break;

        }
    }
}
