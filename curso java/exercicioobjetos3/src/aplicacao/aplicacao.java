import student.Student;

import java.util.Locale;
import java.util.Scanner;

public class aplicacao {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        System.out.println("Name: ");
        student.Name = sc.nextLine();
        System.out.println("Primeira Nota: ");
        student.notaA = sc.nextDouble();
        System.out.println("Segunda Nota: ");
        student.notaB = sc.nextDouble();
        System.out.println("Terceira Nota: ");
        student.notaC = sc.nextDouble();

        System.out.printf("FINAL GRADE = %.2f%n", student.finalGrade());

        if (student.finalGrade() < 60.0){
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
        }
        else {
            System.out.println("PASS");
        }

        sc.close();

    }
}