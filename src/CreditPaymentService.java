public class CreditPaymentService {
    public int calculate(int summa, int period, double rate) {
        int result;

        double monthRate = (rate / 100 / 12);
        double monthPay = ((monthRate * Math.pow ((1+monthRate), period)) / (Math.pow((1+monthRate), period)-1));
        result = (int) (summa * monthPay);
        return result;
    }
}