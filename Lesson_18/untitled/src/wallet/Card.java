package wallet;

import java.util.Objects;

public class Card {
    private  final String userName;
    private  final String cardName;
    private   double amount;


    public Card(String userName, String cardName, double amount) {
        this.userName = userName;
        this.cardName = cardName;
        this.amount = amount;
    }

    public String getUserName() {
        return userName;
    }

    public String getCardName() {
        return cardName;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Card card)) return false;
        return Double.compare(getAmount(), card.getAmount()) == 0 && Objects.equals(getUserName(), card.getUserName()) && Objects.equals(getCardName(), card.getCardName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserName(), getCardName(), getAmount());
    }

    public void setAmount(double amount) {
        this.amount += amount;
    }

    @Override
    public String toString() {
        return "Card{" +
                "userName='" + userName + '\'' +
                ", cardName='" + cardName + '\'' +
                ", amount=" + amount +
                '}';
    }
}
