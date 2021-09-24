import java.util.Scanner;

public class exercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horainicio = sc.nextInt();
        int horafinal = sc.nextInt();
        int duracao;

        if (horainicio < horafinal) {
            duracao = horafinal - horainicio;
        }
        else {
            duracao = 24 - horainicio + horafinal;
        }
        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
        sc.close();
    }
}