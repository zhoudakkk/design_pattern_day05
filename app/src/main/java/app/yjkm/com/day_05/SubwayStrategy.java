package app.yjkm.com.day_05;

public class SubwayStrategy implements CalculateStrategy {
    @Override
    public int calculatePrice(int km) {
        if (km < 6) {
            return 3;
        }
        if (km < 12) {
            return 4;
        }
        if (km < 22) {
            return 5;
        }
        if (km < 32) {
            return 6;
        }
        return 7;
    }
}
