import java.util.Locale;
import java.util.Scanner;

public class aula3 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner sc = new Scanner(System.in);

        String x;
        int y;
        double z;
        char w;
        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();
        w = sc.next().charAt(0);
        System.out.println("Voce digitou: " + x);
        System.out.println("Voce digitou: " + y);
        System.out.printf("Voce digitou: %.2f%n", z);
        System.out.println("Voce digitou: " + w);


        sc.close();
    }
}
