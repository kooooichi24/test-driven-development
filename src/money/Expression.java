package money;

/**
 * 貨幣の式を管理するクラス
 * Moneyは式の最小構成要素である。
 */
public interface Expression {
    Money reduce(String to);
}
