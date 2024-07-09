public class RubBonus {
    public static void main(String[] args) {

        // Объявляем  переменные для входных данных и параметров программы

        int balanceNow = 100; //начальный счет
        int refill = 1000; //пополнение
        int bonus; // бонусные рубли
        int resultBalance1;
        int resultBalance2;

        //Производим расчет, с учетом порога пополнения

        if (refill > 1000) {
            bonus = (refill / 100);
            resultBalance1 = (balanceNow + refill + bonus);
            System.out.println("Начальная сумма: " + balanceNow + ", " + "Сумма пополнения: " + refill + ", " + "Бонус: " + bonus + ", Итоговая сумма: " + resultBalance1);
        } else {
            resultBalance2 = (balanceNow + refill);
            System.out.println("Начальная сумма: " + balanceNow + ", " + "Сумма пополнения: " + refill + ", " + "Итоговая сумма: " + resultBalance2);
        }
    }
}
