public class Main {
    public static void main(String[] args) {

        BankAccountCommission bankAccountCommission = new BankAccountCommission("yo",0.01);
        BankAccountOverdraft bankAccountOverdraft = new BankAccountOverdraft("pepe",1000.0);

        bankAccountOverdraft.deposit(700.0);
        bankAccountCommission.deposit(700.0);

        bankAccountOverdraft.withdraw(1200.0);
        bankAccountCommission.withdraw(100.0);

        Check check = new Check("yo",3000.0);

        bankAccountCommission.deposit(check);

    }
}