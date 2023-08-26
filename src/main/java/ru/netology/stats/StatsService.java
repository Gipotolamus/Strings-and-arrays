package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        return totalSale;
    }

    public long average(long[] sales) {
        long totalSale = sum(sales);
        long averageSale = totalSale / 12;
        return averageSale;
    }

    public int month(long[] sales) {
        int maximumMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maximumMonth]) {
                maximumMonth = i;
            }
        }
        return maximumMonth + 1;
    }

    public int miniMonth(long[] sales) {
        int minimumMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minimumMonth]) {
                minimumMonth = i;
            }
        }
        return minimumMonth + 1;
    }

    public int monthBelowAverage(long[] sales) {
        int counter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale < averageSale) {
                counter++;
            }
        }
        return counter;
    }

    public int monthHigherAverage(long[] sales) {
        int counter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale > averageSale) {
                counter++;
            }
        }
        return counter;
    }
}