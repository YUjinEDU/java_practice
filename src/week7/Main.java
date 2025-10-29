package week7;


public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("123456",
                "김한밭", "asdf123");

        String accountNumber =  bankAccount.getAccountNumber();
        String ownerName =  bankAccount.getOwnerName();

        System.out.printf("계좌번호: %s\n", accountNumber);
        System.out.printf("계좌주 명: %s\n", ownerName);

        bankAccount.deposit(100);
        bankAccount.deposit(-100);
        bankAccount.deposit(200);
        bankAccount.deposit(300);
        bankAccount.withdraw(50, "asdf123");
        bankAccount.withdraw(-50, "asdf123");
        bankAccount.withdraw(50, "123asdf");

        long balance = bankAccount.getBalance("asdf123");
        System.out.printf("현재 잔액: %d\n", balance);

        long balance2 = bankAccount.getBalance("ASDF123");
        System.out.printf("현재 잔액: %d\n", balance2);

        bankAccount.changePassword("ASDF123", "qwer123");
        bankAccount.changePassword("asdf123", "qwer123");

        bankAccount.withdraw(100, "qwer123");
        bankAccount.withdraw(500, "qwer123");

        bankAccount.printTransactionHistory();

    }

}
