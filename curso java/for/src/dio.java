import java.util.Locale;
import java.util.Scanner;

public class dio {

    public static void main(String[] args) {
        //complete os espaços com sua solução
        Locale.setDefault(Locale.ENGLISH);
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double X, Y;
        double resultado;
        for (int i = 0; i < N; i++) {
            X = sc.nextInt();
            Y = sc.nextInt();
            if (Y == 0){
                System.out.println("divisao impossivel");
            }
            else {
                resultado = (X / Y);
                System.out.printf("%.1f%n", resultado);
            }
        }
    }
}