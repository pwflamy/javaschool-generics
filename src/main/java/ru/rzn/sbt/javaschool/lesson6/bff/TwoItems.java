package ru.rzn.sbt.javaschool.lesson6.bff;

public class TwoItems<T> {
    T one;
    T two;

    TwoItems(T one, T two) {
        this.one = one;
        this.two = two;
    }

    public T getOne() {
        return one;
    }

    public T getTwo() {
        return two;
    }
}
