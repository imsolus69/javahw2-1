public class Main {
    public static void main(String[] args) {
        int balance = 0;
        int refill = 2300;


        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп
        int bonus = (refill > 1000) ? (refill / 100) : 0;

        int summ = balance + refill + bonus;
        System.out.println("Ваш баланс: " + summ);
        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}