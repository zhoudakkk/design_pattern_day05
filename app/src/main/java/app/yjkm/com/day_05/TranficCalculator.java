package app.yjkm.com.day_05;

/**
 * 价格计算器
 */
public class TranficCalculator {
    private CalculateStrategy mStrategy;
    public TranficCalculator(CalculateStrategy strategy) {
        mStrategy = strategy;
    }

    public int getPrice(int km) {
        return mStrategy.calculatePrice(km);
    }
}
