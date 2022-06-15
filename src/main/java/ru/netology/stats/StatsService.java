package ru.netology.stats;

public class StatsService {

    int totalSales = 0;
    int month = 0;

    public int salesTotal(long[] sales) {
        for (long sale : sales) {
            totalSales += sale;
        }
        return totalSales;
    }

    public int averageSales(long[] sales) {
        int totalSales = salesTotal(sales);
        return totalSales/sales.length;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month++;
        }
        return maxMonth;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month++;
        }
        return minMonth;
    }

    public int belowAverageSales(long[] sales) {
        int averSales = averageSales(sales);
        for (long sale : sales) {
            if (sale < averSales) {
                month++;
            }
        }
        return month;
    }

    public int aboveAverageSales(long[] sales) {
        int averSales = averageSales(sales);
        for (long sale : sales) {
            if (sale > averSales) {
                month++;
            }
        }
        return month;
    }
}
