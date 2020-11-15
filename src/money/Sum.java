package money;

/**
 * Moneyを加算に関するクラス
 *
 * 2つのフィールドを持つ
 * - augend(被加算数)
 * - addend(加数)
 */
public class Sum implements Expression {
    Money augend;
    Money addend;

    Sum(Money augend, Money addend) {
        this.augend = augend;
        this.addend = addend;
    }

    public Money reduce(String to) {
        int amount = augend.amount + addend.amount;
        return new Money(amount, to);
    }
}

