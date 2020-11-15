package money;

/**
 * 為替レートを管理するクラス
 */
public class Bank {
    Money reduce(Expression source, String to) {
        return source.reduce(to);
    }
}
