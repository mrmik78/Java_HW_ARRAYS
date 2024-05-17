package ru.netology.stats;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//import ru.netology.stats.StatsService;

public class StatsServiceTest {
    @Test
    public void salesAmount() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectSales = 180;
        long actualSales = service.sumSales(sales);

        Assertions.assertEquals(expectSales, actualSales);
    }

    @Test
    public void avgSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectSales = 15;
        long actualSales = service.avgSumSales(sales);

        Assertions.assertEquals(expectSales, actualSales);
    }

    @Test
    public void maxMonthSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectMonth = 8;
        int actualMonth = service.maxSales(sales);

        Assertions.assertEquals(expectMonth, actualMonth);
    }

    @Test
    public void minMonthSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectMonth = 9;
        int actualMonth = service.minSales(sales);

        Assertions.assertEquals(expectMonth, actualMonth);
    }

    @Test
    public void testLessAvsSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.lessAvsSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMoreAvsSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.lessAvsSales(sales);

        Assertions.assertEquals(expected, actual);
    }
}