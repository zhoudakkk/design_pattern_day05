package app.yjkm.com.day_05;

/**
 * 公交车
 */
public class BusStrategy implements CalculateStrategy {
    @Override
    public int calculatePrice(int km) {
        int extraTotal = km - 10;
        int extraFactor = extraTotal / 5;
        int fraction = extraTotal % 5;
        int price = 1 + extraFactor * 1;
        price = fraction > 0 ? ++price : price;
        return price;
    }
}
