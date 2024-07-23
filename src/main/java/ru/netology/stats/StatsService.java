package ru.netology.stats;

public class StatsService {
    public long sumSales(long[] sales) { //сумма всех продаж
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public double averageSales(long[] sales) { //средняя сумма продаж в месяц
        if (sales.length == 0) {
            return 0;
        }
        return (double) sumSales(sales) / sales.length;
    }

    public int minSales(long[] sales) { //номер месяца с минимумом продаж
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int maxSalesMonth(long[] sales) { //номер месяца с пиком продаж
        int maxSalesMonth = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] > sales[maxSalesMonth]) {
                maxSalesMonth = i;
            }
        }
        return maxSalesMonth + 1;
    }

    public int countMonthsBelowAverage(long[] sales) { //кол-во месяцев с продажами ниже среднего
        double average = averageSales(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale < average) {
                count++;
            }
        }
        return count;
    }

    public int countAboveAverageMonths(long[] sales) { //количество месяцев с продажами выше среднего
        double average = averageSales(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale > average) {
                count++;
            }
        }
        return count;
    }

}
