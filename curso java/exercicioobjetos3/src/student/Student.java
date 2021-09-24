package student;

public class Student {
    public String Name;
    public double notaA;
    public double notaB;
    public double notaC;

    public double finalGrade(){
         return notaA + notaB + notaC;
    }
    public double missingPoints(){
        if (finalGrade() < 60.0){
            return 60.0 - finalGrade();
        }
        else {
            return 0.0;
        }
    }
}

