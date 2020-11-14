package ru.netology.statistic;

public class StatisticService {
    /**
     * Calculate index of max income
     *
     * @param incomes — array of incomes
     * @return — index of first max value
     */

    public long findMax(long[] incomes) {
//        показать работу в дебаггере
        long current_max_index = 0;
        long current_max = incomes[0];
//        берем за основу первый, перебираем по порядку
        for (long income : incomes)
//        каждый раз сравниваем
            if (current_max < income)
//        если тот, что у нас меньше чем текущий
                current_max = income;
//        выкладывваем в место него кладем
        return current_max;
    }
}
