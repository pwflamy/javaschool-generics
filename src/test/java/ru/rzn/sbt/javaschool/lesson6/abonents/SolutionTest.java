package ru.rzn.sbt.javaschool.lesson6.abonents;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SolutionTest {

    @Test
    public void testAnalyze() {
        List<Person> personsList = new ArrayList<>();
        personsList.add(new Person("Петров Петр", "+74912000001", 25, "Слесарь"));
        personsList.add(new Person("Сидоров Сидр", "+74912000002", 75, "Фрезировщик"));
        personsList.add(new Person("Иванов Иван", "+74913700003", 25, "Инженер"));
        personsList.add(new Person("Сергеев Сергей", "+74913700004", 25, "Инженер"));
        personsList.add(new Person("Мудров Мудр", "+74262200005", 32, "Повар"));
        personsList.add(new Person("Николаев Николай", "+74915600006", 30, "Безработный"));
        personsList.add(new Person("Андреев Андрей", "+74913700007", 80, "Пенсионер"));
        personsList.add(new Person("Алексеев Алексей", "+74990000008", 70, "Пенсионер"));
        personsList.add(new Person("Денисов Денис", "+74262200009", 28, "Инженер"));

        List<PhoneCode> phoneCodesList = new ArrayList<>();
        phoneCodesList.add(new PhoneCode("499", "Москва", "Московская область"));
        phoneCodesList.add(new PhoneCode("49663", "Луховицы", "Московская область"));
        phoneCodesList.add(new PhoneCode("4912", "Рязань", "Рязанская область"));
        phoneCodesList.add(new PhoneCode("49137", "Рыбное", "Рязанская область"));
        phoneCodesList.add(new PhoneCode("49156", "Скопин", "Рязанская область"));
        phoneCodesList.add(new PhoneCode("42622", "Биробиджан", "Еврейская автономная область"));

        Result result = Solution.analyze(personsList, phoneCodesList);
        Assert.assertEquals(result.getRegionRyazanCount(), 6);
        Assert.assertEquals(result.getCityRyazanCount(), 2);
        Assert.assertEquals(result.getPensionersCount(), 2);
        Assert.assertEquals(result.isHasFasionDesigners(), false);

        personsList.add(new Person("Зверев Зверь", "+74912000010", 76, "Модельер"));
        result = Solution.analyze(personsList, phoneCodesList);
        Assert.assertEquals(result.getRegionRyazanCount(), 7);
        Assert.assertEquals(result.getCityRyazanCount(), 3);
        Assert.assertEquals(result.getPensionersCount(), 3);
        Assert.assertEquals(result.isHasFasionDesigners(), true);
    }


}
