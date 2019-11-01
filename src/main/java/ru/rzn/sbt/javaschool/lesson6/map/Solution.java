package ru.rzn.sbt.javaschool.lesson6.map;

public class Solution {

    /**
     * 1. Интерфейс {@link CountMap} реализует контейнер, осуществляющий посчёт количества добавленных ссылок на объекты.
     * Например, если два раза вызвать метод {@link CountMap#add(Object)} с одинаковой ссылкой, то вызов метода
     * {@link CountMap#getCount(Object)} с той же ссылкой вернёт значение 2.
     *
     * 2. Сделайте интерфейс {@link CountMap} и метод {@link Solution#getCountMap()} обобщеными.
     *
     * 3. Реализуйте интерфейс {@link CountMap} в классе CountMapImpl.
     *
     * 4. Верните экземпляр объекта класса {@link CountMapImpl} в методе {@link Solution#getCountMap()}
     *
     * 5. Раскомментируйте тест для проверки.
     */
    public static <T> CountMap<T> getCountMap() {

        return new CountMapImpl<>();
    }
}
