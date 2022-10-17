import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        int number1, number2;
        Scanner reader = new Scanner(System.in);

        if (args.length == 0) {
            System.out.println("Digite um número: ");
            number1 = reader.nextInt();
            System.out.println("Digite outro número: ");
            number2 = reader.nextInt();
        } else if (args.length == 1) {
            System.out.println("Informe um número: ");
            number2 = reader.nextInt();
        } else if (args.length == 2) {
            number1 = Integer.parseInt(args[0]);
            number2 = Integer.parseInt(args[1]);
            int sum = number1 + number2;
            System.out.println("A soma dos números é: " + sum);
        } else {
            System.out.println("O número máximo de argumentos deve ser 2!");
        }
    }
}
