public class OddOrEven {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.printf("Número inválido de argumentos, é esperado que seja informado um argumento");
        } else {
            int number = Integer.parseInt(args[0]);
            if (number % 2 == 0) {
                System.out.println("O numero " + number + " é par");
            } else {
                System.out.println("O numero " + number + " é impar");
            }
        }
    }
}
