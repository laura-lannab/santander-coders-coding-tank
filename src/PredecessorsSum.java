import java.util.Scanner;

public class PredecessorsSum {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int number = reader.nextInt();
        int sum = 0;

        for (int i = number; i >= 0; i--) {
            sum += i;
        }
        System.out.println("A soma do número informado com todos os antecessores é: " + sum);
    }
}
