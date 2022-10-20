import java.util.Scanner;

public class MinAndMaxGrade {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Informe a quantidade de provas:");
        int numTests = reader.nextInt();

        int sum = 0;
        int minGrade = Integer.MAX_VALUE;
        int maxGrade = Integer.MIN_VALUE;

        for (int i = 1; i <= numTests; i++) {
            System.out.println("Informe a nota da prova " + i + " :");
            int grade = reader.nextInt();
            sum += grade;

            if(grade < minGrade){
                minGrade = grade;
            }
            if(grade > maxGrade){
                maxGrade = grade;
            }
        }

        int average = sum / numTests;

        System.out.println("A menor nota é: " + minGrade);
        System.out.println("A maior nota é: " + maxGrade);
        System.out.println("A média das notas é: " + average);
    }
}
