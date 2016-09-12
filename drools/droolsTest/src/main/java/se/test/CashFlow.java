package se.test;

import java.util.Date;

/**
 * Created by SaburovAG on 02.06.2015.
 */
public class CashFlow
{
    public static final int CREDIT = 1;
    public static final int DEBIT = 2;

    private Date date;
    private double amount;
    private int type;
    private long accountNo;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public long getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(long accountNo) {
        this.accountNo = accountNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CashFlow cashFlow = (CashFlow) o;

        if (Double.compare(cashFlow.amount, amount) != 0) return false;
        if (type != cashFlow.type) return false;
        if (accountNo != cashFlow.accountNo) return false;
        return date.equals(cashFlow.date);

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = date.hashCode();
        temp = Double.doubleToLongBits(amount);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + type;
        result = 31 * result + (int) (accountNo ^ (accountNo >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "CashFlow{" + "date=" + date + ", amount=" + amount + ", type=" + type + ", accountNo=" + accountNo + '}';
    }

    public static boolean checkFunction() {
        return false;
    }
}
