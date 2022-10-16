import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        java.util.Scanner reader = new Scanner(System.in);
        System.out.println("Qual sua altura em metros?");
        double height = reader.nextDouble();
        System.out.println("Qual seu peso em quilos?");

        double weight = reader.nextDouble();
        double imc = weight / (height * height);

        if (imc < 17) {
            System.out.println("O valor do seu IMC é " + imc + " (considerado muito abaixo do peso)");
        } else if (imc > 17 && imc < 18.49) {
            System.out.println("O valor do seu IMC é " + imc + " (considerado abaixo do peso)");
        } else if (imc > 18.50 && imc < 24.99) {
            System.out.println("O valor do seu IMC é " + imc + " (considerado peso normal)");
        } else if (imc > 25 && imc < 29.99) {
            System.out.println("O valor do seu IMC é " + imc + " (considerado acima do peso)");
        } else if (imc > 30 && imc < 34.99) {
            System.out.println("O valor do seu IMC é " + imc + " (considerado Obesidade I)");
        } else if (imc > 35 && imc < 39.99) {
            System.out.println("O valor do seu IMC é " + imc + " (considerado Obesidade II (severa))");
        } else {
            System.out.println("O valor do seu IMC é " + imc + " (Obesidade III (mórbida))");
        }

        reader.close();
    }
}
