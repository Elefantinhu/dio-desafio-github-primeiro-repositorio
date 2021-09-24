import java.util.Locale;
import java.util.Scanner;

public class testesintaxe {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int limite = 100;
        int excedeu;
        int sobra;
        double resultado = 0;
        double total = 50;
        int minutos = sc.nextInt();

        if (minutos <= limite){
            System.out.printf("Valor a pagar: R$ %.2f%n", total);
        }
        else {
            excedeu = minutos - 100;
            sobra = excedeu * 2;
            resultado = total + sobra;
            System.out.printf("Valor a pagar: R$ %.2f%n", resultado);
        }
    }
}