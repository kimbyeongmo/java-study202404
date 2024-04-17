package day07.encap.practice;

public class BankAccount {

    private String accountNumber;
    private String accountHolder;
    private long balance;

    public BankAccount(String accountNumber, String accountHolder, long balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // 계좌 잔액 조회
    public long getBalance() {
        return balance;
    }

    // 입금
    public void deposit(int money) {
        if (money < 0) {
            System.out.println("입금액은 음수일 수 없습니다.");
            return;
        }
        this.balance += money;
    }

    // 출금
    public void withdraw(int money) {
        if (money < 0 || money > this.balance) {
            System.out.println("잔액이 부족하거나 잘못된 출금액입니다.");
            return;
        }
        this.balance -= money;
    }
}
