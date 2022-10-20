import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class TabelaPrice {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Informe o valor do empréstimo em R$:");
        BigDecimal loan = BigDecimal.valueOf(reader.nextDouble());
        System.out.println("Informe a taxa de juros:");
        BigDecimal interestRate = BigDecimal.valueOf(reader.nextDouble()).divide(BigDecimal.valueOf(100), 3, RoundingMode.HALF_UP);
        System.out.println("Informe o tempo para pagamento em meses:");
        int paymentTime = reader.nextInt();

        BigDecimal installment = getInstallment(loan, interestRate, paymentTime);
        System.out.println("Valor fixo da parcela R$ " + installment + " , Saldo devedor total R$ " + loan);

        BigDecimal debitBalance = loan;
        BigDecimal sumInstallment = installment.multiply(BigDecimal.valueOf(paymentTime)).setScale(2, RoundingMode.HALF_UP);
        BigDecimal sumFees = BigDecimal.valueOf(0);

        for (int i = 1; i <= paymentTime; i++) {
            BigDecimal fees = debitBalance.multiply(interestRate).setScale(2, RoundingMode.HALF_UP);
            BigDecimal amortization = installment.subtract(fees).setScale(2, RoundingMode.HALF_UP);
            debitBalance = debitBalance.subtract(amortization).setScale(2, RoundingMode.HALF_UP);
            sumFees = sumFees.add(fees);

            System.out.println("Parcela " + i + " | Juros: R$ " + fees + " | Amortização: R$ " + amortization + " | Saldo devedor: R$ " + debitBalance);
        }

        System.out.println("Total: Prestação R$ " + sumInstallment + " , Juros R$ " + sumFees.setScale(2, RoundingMode.HALF_UP) + ", Amortização R$ " + loan);
    }

    public static BigDecimal getInstallment(BigDecimal loan, BigDecimal interestRate, int paymentTime) {
        BigDecimal aux = interestRate.add(BigDecimal.valueOf(1)).pow(paymentTime);

        BigDecimal numerator = aux.multiply(interestRate);
        BigDecimal denominator = aux.subtract(BigDecimal.valueOf(1));

        return loan.multiply(numerator).divide(denominator, 2, RoundingMode.HALF_UP);
    }
}
