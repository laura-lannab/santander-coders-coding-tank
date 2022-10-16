import java.util.Scanner;

public class GradeAverage {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Informe a nota da prova 1:");
        double grade1 = reader.nextDouble();
        if (grade1 < 0 || grade1 > 10) {
            System.out.println("O valor da nota 1 é inválido!");
            return;
        }
        System.out.println("Informe a nota da prova 2:");
        double grade2 = reader.nextDouble();
        if (grade2 < 0 || grade2 > 10) {
            System.out.println("O valor da nota 2 é inválido!");
            return;
        }
        System.out.println("Informe a nota da prova 3:");
        double grade3 = reader.nextDouble();
        if (grade3 < 0 || grade3 > 10) {
            System.out.println("O valor da nota 3 é inválido!");
            return;
        }
        System.out.println("Informe a nota da prova 4:");
        double grade4 = reader.nextDouble();
        if (grade4 < 0 || grade4 > 10) {
            System.out.println("O valor da nota 4 é inválido!");
            return;
        }
        double average = (grade1 + grade2 + grade3 + grade4) / 4;
        System.out.println("A média do aluno foi " + average);
    }
}