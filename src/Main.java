public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int summa = 1_000_000; // величина кредита в рублях
        int period = 36; // период кредитования в месяцах
        double rate = 9.99; // годовая ставка %

        double CreditPayment = service.calculate(summa, period, rate);
        System.out.println((int) CreditPayment + " Ваш ежемесячный платеж");
    }
}