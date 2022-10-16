import java.util.Scanner;

public class CelsiusToFahrenheit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Informe uma temperatura em graus Celsius");
        float temp1 = reader.nextFloat();
        System.out.println("Informe uma temperatura em graus Celsius");
        float temp2 = reader.nextFloat();

        float fahrenheit1 = ((temp1 * 9) / 5) + 32;
        float fahrenheit2 = ((temp2 * 9) / 5) + 32;

        System.out.printf("Temperatura 1 %.1fºC são %.1fºF \n", temp1, fahrenheit1);
        System.out.printf("Temperatura 2 %.1fºC são %.1fºF ", temp2, fahrenheit2);
    }
}


