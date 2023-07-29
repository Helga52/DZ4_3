public class CreditPaymentService {
    public int calculate(int credit, int period, float percent) {
        float mPercent = (percent / 12) /100; // ежемесячная ставка
        return (int) (credit * ((mPercent * (Math.pow((1+mPercent),period)))  / ((Math.pow((1+mPercent),period))-1)));

    }
}
