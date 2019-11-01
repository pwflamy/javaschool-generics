package ru.rzn.sbt.javaschool.lesson6.bff;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Solution {

    /**
     * 1. Создайте обобщённый класс TwoItems, параметризовынный типом <T> и хранящий две ссылки на объекты типа T.
     * Введите конструктор, принимающий два аргумента и get-методы.
     *
     * 2. В {@link Collection} persons найдите персоны, у которых взаимно совпадают ссылки на лучших друзей
     * {@link Person#bestFriend}, сформируйте из них экземпляры класса TwoItems<Person> и разместите
     * в {@link Collection}<TwoItems>.
     *
     * 3. В качестве результата выполнения метода {@link Solution#findBestFriends(Collection)} верните размер коллекции
     * с парами лучших друзей.
     */
    public static int findBestFriends(Collection<Person> persons) {
        Collection<TwoItems> result = new ArrayList<>();
        out:   for (Person p : persons) {
            if ((p.getBestFriend() != null) && (p.getBestFriend().getBestFriend()==p)) {
                for (TwoItems twoItems : result) {
                    if ((twoItems.one == p) || (twoItems.two == p)) continue out;
                }
                result.add(new TwoItems<>(p, p.getBestFriend()));
            }
        }
        return result.size();
    }
}
