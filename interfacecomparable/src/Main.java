public class Main {
    public static void main(String[] args) {

    User firstUser = new User("Popote");
    User secondUser = new User("kokote");

    firstUser.spendMoney(500.0);
    secondUser.spendMoney(100.0);

        System.out.println(firstUser.compareTo(secondUser));

    }
}