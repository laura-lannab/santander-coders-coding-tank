import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String operationType;
        int number1, number2;
        final String sum = "+";
        final String sub = "-";
        final String div = "/";
        final String mult = "*";

        System.out.println("Qual operação deseja fazer? ( opções: + - / * )");
        operationType = reader.nextLine();
        if (!operationType.equals(sum) &&
                !operationType.equals(sub) &&
                !operationType.equals(div) &&
                !operationType.equals(mult)) {
            System.out.println("Operação desconhecida");
            return;
        } else {
            System.out.println("Digite um número: ");
            number1 = reader.nextInt();
            System.out.println("Digite outro número: ");
            number2 = reader.nextInt();
            int operation;

            if (operationType.equals(sum)) {
                operation = number1 + number2;
                System.out.println("A soma dos números é: " + operation);
            } else if (operationType.equals(sub)) {
                operation = number1 - number2;
                System.out.println("A subtração dos números é: " + operation);
            } else if (operationType.equals(div)) {
                operation = number1 / number2;
                System.out.println("A divisão dos números é: " + operation);
            } else if (operationType.equals(mult)) {
                operation = number1 * number2;
                System.out.println("A multiplicação dos números é: " + operation);
            }
            reader.close();
        }
    }
}
