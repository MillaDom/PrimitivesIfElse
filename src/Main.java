public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.

        int account = 500;
        int recharge = 2000;
        int oneBonus = 100;
        int bonus = recharge / oneBonus;

        if (recharge >= 1000) {
            System.out.println("Количество бонусных рублей: " + bonus + " рублей");
            System.out.println("Общий счет: " + (account + bonus) + " рублей");
        } else {
            System.out.println("Количество бонусных рублей: 0 рублей");
            System.out.println("Общий счет: " + account + " рублей");
        }


    }
}