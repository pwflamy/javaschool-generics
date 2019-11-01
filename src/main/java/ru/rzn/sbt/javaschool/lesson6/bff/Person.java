package ru.rzn.sbt.javaschool.lesson6.bff;

/**
 * Персона
 */
public class Person {

    /**
     * Имя
     */
    private final String name;

    /**
     * Лучший друг
     */
    private Person bestFriend;

    public String getName() {
        return name;
    }

    public Person getBestFriend() {
        return bestFriend;
    }

    public void setBestFriend(Person bestFriend) {
        this.bestFriend = bestFriend;
    }

    public Person(String name) {
        this.name = name;
        this.bestFriend = null;
    }
}
