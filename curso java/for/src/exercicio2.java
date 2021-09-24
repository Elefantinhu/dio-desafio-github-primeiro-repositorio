import java.util.Locale;
import java.util.Scanner;

public class exercicio2 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int out = 0;
        int in = 0;
        for (int i=0; i<N; i++){
            int x = sc.nextInt();
            if (x >= 10 && x <= 20){
                in += 1;
            }
            else {
                out += 1;
            }


        }
        System.out.println(in + " in");
        System.out.println(out + " out");

        sc.close();
    }
}