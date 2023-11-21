package org.example;
/**
 * Класс для замера времени
 * @author Razinkova_Elizaveta
 */
public class TimeMeasurement {
    /**
     * Метод, который возвращает время выполнения операции
     * @param fun лямбда функция
     * @return время в ms
     */
    public static long time (Runnable fun) {
        long beginTime = System.currentTimeMillis();

        fun.run();

        return System.currentTimeMillis() - beginTime;
    }
}
