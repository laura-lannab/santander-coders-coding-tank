import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

public class Investment {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Informe o valor inicial investido em R$.");
        BigDecimal investment = BigDecimal.valueOf(reader.nextDouble());
        System.out.println("Informe o juros ao mês em %.");
        int fees = reader.nextInt();
        System.out.println("Informe o tempo em meses que o dinheiro ficará investido.");
        int months = reader.nextInt();

        System.out.println(investment + " reais, " + fees + " de juros ao mês por " + months + " meses.");


        for (int i = 1; i <= months; i++) {
            BigDecimal calcFees;

            MathContext mc = new MathContext(3);
            calcFees = investment.multiply(BigDecimal.valueOf(fees).divide(BigDecimal.valueOf(100))).setScale(2);
            investment = investment.add((calcFees));

            System.out.println("Mês: " + i + " , Juros: R$ " + calcFees + " , Saldo: " + investment);
        }
        reader.close();
    }
}
