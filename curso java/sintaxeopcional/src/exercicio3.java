import java.util.Locale;
import java.util.Scanner;

public class exercicio3 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        int favorito = sc.nextInt();

        while (favorito != 4){
            if (favorito == 1){
                alcool += 1;
                favorito = sc.nextInt();
            }
            else if (favorito == 2){
                gasolina += 1 ;
                favorito = sc.nextInt();
            }
            else if (favorito == 3){
                diesel += 1;
                favorito = sc.nextInt();
            }
            else {
                System.out.println("Digite um codigo valido: 1-4");
                favorito = sc.nextInt();
            }
        }
        System.out.println("Muito Obrigado!");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}