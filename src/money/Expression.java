package money;

/**
 * 貨幣の式を管理するクラス
 * Moneyは式の最小構成要素である。
 */
public interface Expression {
    Expression times(int multiplier);
    Expression plus(Expression addend);
    Money reduce(Bank bank, String to);
}
