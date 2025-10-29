package week7;

public class BankAccount {

    private String accountNumber;
    private String ownerName;
    private String password;
    private long balance;
    private String[] transactionHistory  = new String[20];
    private int transactionCount = 0;

    public BankAccount(String accountNumber, String ownerName, String password) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.password = password;
        this.balance = 0;

    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public String getOwnerName() {
        return this.ownerName;
    }
    public String getPassword() {
        return this.password;
    }

    public long getBalance(String passInput) {
        if(password.equals(passInput)){
            return balance;
        }

        else{
            System.out.println("비밀번호를 잘못 입력하였습니다.");
            return -1;
        }

    }

    public void setPassword(String newPass) {
        this.password = newPass;
    }

    public String changePassword(String oldPass, String newPass){
        if(password.equals(oldPass)){
            password = newPass;
            System.out.println("비밀번호" + "가 변경되었습니다.");
            return newPass;
        }

        else{
            System.out.println("비밀번호를 잘못 입력하였습니다.");
            return oldPass;
        }
    }

    public void printTransactionHistory(){
        System.out.println("---거래 내역---");
        for(int i = 0; i < transactionHistory.length; i++){
            if(transactionHistory[i] != null){
                System.out.println(transactionHistory[i]);
            }
        }
    }

    public long deposit(long amount){
        if(amount < 0 ){
            System.out.println("입금 금액은 양수이어야 합니다.");
        }

        else{
            balance  += amount;
            System.out.println("입금이 완료되었습니다.");
            transactionHistory[transactionCount] = "[입금] 계좌 잔액: " +  (balance-amount) + "+" +amount +
                    "=" + balance;
            transactionCount++;
        }
        return balance;
    }

    public long withdraw(long amount, String passInput){

        if(password.equals(passInput) ){

            if(amount < 0 ){
                System.out.println("출금 금액은 양수이어야 합니다.");
                return balance;
            }

            else if (balance < amount) {

                System.out.println("잔액이 부족합니다.");
                return balance;
            } else{
                balance  -= amount;
                System.out.println("출금이 완료되었습니다.");
                transactionHistory[transactionCount] = "[출금] 계좌 잔액: " +  (balance+amount) + "-" +amount +
                        "=" + balance;
                transactionCount++;
            }

        }
        else{
            System.out.println("비밀번호를 잘못 입력하였습니다.");
            return balance;
        }

        return balance;
    }
}
