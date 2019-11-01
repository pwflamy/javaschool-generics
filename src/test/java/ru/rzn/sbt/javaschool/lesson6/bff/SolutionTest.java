package ru.rzn.sbt.javaschool.lesson6.bff;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void findBestFriends() {
        List<Person> personsList = new ArrayList<>();
        personsList.add(new Person("Петров Петр"));
        personsList.add(new Person("Сидоров Сидр"));
        personsList.add(new Person("Иванов Иван"));
        personsList.add(new Person("Сергеев Сергей"));
        personsList.add(new Person("Мудров Мудр"));
        personsList.add(new Person("Николаев Николай"));
        personsList.add(new Person("Андреев Андрей"));
        personsList.add(new Person("Алексеев Алексей"));
        personsList.add(new Person("Денисов Денис"));

        personsList.get(0).setBestFriend(personsList.get(1));
        personsList.get(1).setBestFriend(personsList.get(2));
        personsList.get(2).setBestFriend(personsList.get(0));
        personsList.get(3).setBestFriend(personsList.get(4));
        personsList.get(5).setBestFriend(personsList.get(6));
        personsList.get(6).setBestFriend(personsList.get(5));
        personsList.get(7).setBestFriend(personsList.get(8));
        personsList.get(8).setBestFriend(personsList.get(7));

        int bestFriendsCount = Solution.findBestFriends(personsList);
        assertEquals(bestFriendsCount, 2);
    }
}