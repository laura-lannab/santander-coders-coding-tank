import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Scanner;

public class Investment {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Informe o valor inicial investido em R$.");
        BigDecimal investment = BigDecimal.valueOf(reader.nextDouble());
        System.out.println("Informe o juros ao mês em %.");
        int interest = reader.nextInt();
        System.out.println("Informe o tempo em meses que o dinheiro ficará investido.");
        int months = reader.nextInt();

        System.out.println(investment + " reais, " + interest + "% de juros ao mês por " + months + " meses.");


        for (int i = 1; i <= months; i++) {
            BigDecimal calcInterests;

            calcInterests = investment.multiply(BigDecimal.valueOf(interest).divide(BigDecimal.valueOf(100),2, RoundingMode.HALF_UP)).setScale(2, RoundingMode.HALF_UP);
            investment = investment.add((calcInterests)).setScale(2, RoundingMode.HALF_UP);

            System.out.println("Mês: " + i + " , Juros: R$ " + calcInterests + " , Saldo: " + investment);
        }
        reader.close();
    }
}
