import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {
    @Test
    public void sumSalesTest() {
        StatsService statsService = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        assertEquals(180, statsService.sumSales(sales));
    }

    @Test
    public void averageSalesTest() {
        StatsService statsService = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        assertEquals(15.0, statsService.averageSales(sales));
    }

    @Test
    public void minSalesTest() {
        StatsService statsService = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        assertEquals(9, statsService.minSales(sales));
    }

    @Test
    public void maxSalesMonthTest() {
        StatsService statsService = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        assertEquals(6, statsService.maxSalesMonth(sales));
    }

    @Test
    public void countMonthsBelowAverageTest() {
        StatsService statsService = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        assertEquals(5, statsService.countMonthsBelowAverage(sales));
    }

    @Test
    public void countAboveAverageMonthsTest() {
        StatsService statsService = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        assertEquals(5, statsService.countAboveAverageMonths(sales));
    }

}
