public class Main {
    public static void main(String[] args) {
        BankAccount bank = new BankAccount ();
    bank.deposit(15000);
    bank.currentBalance();

        while (true) {
            try {
                bank.withDraw(6000);
                System.out.println("С вашего счета снято 6000 сом");
                bank.currentBalance();
                System.out.println();
            } catch (LimitException e) {
                try {
                    bank.withDraw(e.getRemainingAmount());
                    System.out.println(e.getMessage() + e.getRemainingAmount() + " сом");
                    System.out.println("Снята оставшаяся сумма");
                    bank.currentBalance();
                } catch (LimitException le) {
                    System.out.println("Возникла другая ошибка");
                }
                break;
            }
        }
    }
}

