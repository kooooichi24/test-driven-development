package money;

/**
 * Moneyクラス
 * 貨幣の親クラス
 */
public class Money {
    protected int amount;

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount
                && getClass().equals(money.getClass());
    }
}
