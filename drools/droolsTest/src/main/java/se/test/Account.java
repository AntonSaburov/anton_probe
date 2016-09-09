package se.test;

/**
 * Created by SaburovAG on 02.06.2015.
 */
public class Account {
    private long accountNo;
    private double balance;

    public long getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(long accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Account account = (Account) o;

        if (accountNo != account.accountNo) return false;
        return Double.compare(account.balance, balance) == 0;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = (int) (accountNo ^ (accountNo >>> 32));
        temp = Double.doubleToLongBits(balance);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
