package Topshiriq_1;

public class Money implements  Comparable<Money>{
    private  int amount;
    private int count;

    public Money(int amount, int count) {
        this.amount = amount;
        this.count = count;
    }

    public int getAmount() {
        return amount;
    }

    public int getCount() {
        return count;
    }

    public void setAmount(int amount) {
        this.amount += amount;
    }

    public void setCount(int count) {
        this.count += count;
    }

    @Override
    public String toString() {
        return "Money{" +
                "amount=" + amount +
                ", count=" + count +
                '}';
    }

    @Override
    public int compareTo(Money o) {
        return Integer.valueOf(this.amount).compareTo(Integer.valueOf(o.getAmount()));
    }
}
