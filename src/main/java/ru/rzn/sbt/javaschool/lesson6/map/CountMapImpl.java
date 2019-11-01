package ru.rzn.sbt.javaschool.lesson6.map;

import java.util.*;

public class CountMapImpl<T> implements CountMap<T> {

    private Map<T, Integer> container = new HashMap<>();

    @Override
    public void add(T o) {
        Objects.requireNonNull(o);
        if (container.containsKey(o)) {
            int x = container.get(o);
            container.put(o,++x);
        } else container.put(o,1);
    }

    @Override
    public int getCount(T o) {
        Objects.requireNonNull(o);
        return container.get(o);
    }

    @Override
    public int remove(T o) {
        Objects.requireNonNull(o);
        int result = 0;
        if (container.containsKey(o)) {
            result = container.get(o);
            if (--result == 0) container.remove(o);
            else container.put(o, result);
        }
        return result;
    }

    @Override
    public int size() {
        return container.size();
    }

    @Override
    public void addAll(CountMap<T> source) {
        Map<T, Integer> src = source.toMap();
        src.forEach( (t,  i) -> {
            if (container.containsKey(t)) {
                int x = container.get(t);
                container.put(t, x+i);
            } else container.put(t, i);
        });
    }

    @Override
    public Map<T, Integer> toMap() {
        return new HashMap<>(container);
    }

    @Override
    public void toMap(Map<T, Integer> destination) {
        Objects.requireNonNull(destination);
        destination.clear();
        destination.putAll(container);
    }
}
