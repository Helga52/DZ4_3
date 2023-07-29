public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int credit = 1_000_000;
        float percent = 9.99F;

        int period = 12;
        int payment = service.calculate(credit, period, percent); // должно получиться 87911
        System.out.println("Сумма кредита " + credit + "; Срок кредита " + period);
        System.out.println("Процентная ставка " + percent + "; Ежемесячный платеж " + payment);

        int period1 = 24;
        int payment1 = service.calculate(credit, period1, percent); // должно получиться 46140
        System.out.println("Сумма кредита " + credit + "; Срок кредита " + period1);
        System.out.println("Процентная ставка " + percent + "; Ежемесячный платеж " + payment1);

        int period2 = 36;
        int payment2 = service.calculate(credit, period2, percent); // должно получиться 32262
        System.out.println("Сумма кредита " + credit + "; Срок кредита " + period2);
        System.out.println("Процентная ставка " + percent + "; Ежемесячный платеж " + payment2);
    }
}