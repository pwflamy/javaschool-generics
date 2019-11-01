package ru.rzn.sbt.javaschool.lesson6.abonents;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * 1. Создайте класс Utils.
 *
 * 2. В классе Utils объявите статический обобщённый метод transform, который принимает в качестве аргументов
 * параметризованный {@link java.util.Collection}<T> src и {@link java.util.function.Function}<T, R> function и возвращает
 * параметризованный {@link java.util.Collection}<R>.
 * Реализуйте метод transform таким образом, чтобы в его теле к каждому элементу src применялся function.apply(),
 * формируя результат преобразования из объекта типа T в объект типа R.
 *
 * 3. Формирование справочника абонентов.
 * В методе {@link Solution#analyze(List, List)} осуществите преобразование списка абонентов List<Person> persons в справочник
 * Collection<CatalogEntry> catalog, используя метод {@link Utils#transform(Collection, Function)} и функциональный клас,
 * реализующий интерфейс {@link java.util.function.Function} (можно использовать как обычный так и анонимный класс) таким
 * образом, чтобы в методе apply  осуществлялось формирование объекта {@link CatalogEntry} из объекта {@link Person},
 * с определением названия города и области{@link CatalogEntry#city}  по коду из справочника кодов телефонных номеров
 * {@link PhoneCode} phoneCodesList.
 * Формат телефонного номер следующий: "+7" + код_города + номер, всего 11 цифр, например "+7920123567".
 *
 * 4. В классе Utils объявите статический обобщённый метод filter, который принимает в качестве аргументов
 * параметризованный {@link java.util.Collection}<T> src и {@link java.util.function.Predicate}<T> predicate, и возвращает
 * параметризованный {@link java.util.Collection}<T>.
 * Реализуйте метод filter таким образом, чтобы в его теле к каждому элементу src применялся predicate.test(),
 * и, в зависимости от результата проверки, формируя отфильтрованный {@link Collection}-результат.
 *
 * 5. Фильрация абонентов, зарегистрированых в Рязанской области
 * В методе {@link Solution#analyze(List, List)} осуществите фильтрацию {@link Collection}<CatalogEntry> catalog в
 * {@link Collection}<CatalogEntry> regionRyazanCatalog, используя метод {@link Utils#filter(Collection, Predicate)} и функциональный
 * класc, реализующий интерфейс {@link java.util.function.Predicate} таким образом, чтобы в методе test осуществлялось
 * проверка соответствия наименования региона строке "Рязанская область".
 *
 * 6. В классе Utils объявите статический обобщённый метод count, который принимает в качестве аргументов
 * параметризованный {@link java.util.Collection}<T> src, и {@link java.util.function.Predicate}<T> predicate и возвращает
 * int количество элементов.
 * Реализуйте метод count таким образом, чтобы в его теле к каждому элементу src применялся predicate.test(),
 * и, в зависимости от результата проверки, count возвращал количество элементов src, удволетворяющих условию из predicate.
 *
 * 7. Подсчёт количества абонентов-пенсионеров в Рязанской области.
 * В методе {@link Solution#analyze(List, List)} осуществите подсчёт количества абонентов пенсионного возраста в локальную
 * переменную int pensioners, используя метод {@link Utils#count(Collection, Predicate)} и функциональный
 * класc, реализующий интерфейс {@link java.util.function.Predicate} таким образом, чтобы в методе test осуществлялось
 * проверка соответствия возраста абонента пенсионному (>= 70).
 *
 * 8. Фильрация абонентов, зарегистрированых в Рязани
 * В методе {@link Solution#analyze(List, List)} осуществите фильтрацию {@link Collection}<CatalogEntry> regionRyazanCatalog в
 * {@link Collection}<CatalogEntry> cityRyazanCatalog, используя метод {@link Utils#filter(Collection, Predicate)} и функциональный
 * класc, реализующий интерфейс {@link java.util.function.Predicate} таким образом, чтобы в методе test осуществлялось проверка
 * соответствия наименования города строке "Рязань".
 *
 * 9. В классе Utils объявите статический обобщённый метод contains, который принимает в качестве аргументов
 * параметризованный {@link java.util.Collection}<T> src, и {@link java.util.function.Predicate}<T> predicate и возвращает
 * boolean признак наличия элемента в src, удволетворяющего условию.
 * Реализуйте метод contains таким образом, чтобы в его теле к каждому элементу src применялся predicate.test(),
 * и, в зависимости от результата проверки, contains возвращал признак наличия элемента удволетворяющего условию, в src.
 *
 * 10. Проверка наличия абонентов с профессией модельер в Рязани.
 * В методе {@link Solution#analyze(List, List)} осуществите проверку наличия абонентов с профессией модельер с записью
 * результата в локальную переменную hasFasionDesigners, используя метод {@link Utils#count(Collection, Predicate)} и функциональный
 * класc, реализующий интерфейс {@link java.util.function.Predicate} таким образом, чтобы в методе test осуществлялось
 * проверка соответствия профессии адонента строке "Модельер".
 *
 * 11. В методе {@link Solution#analyze(List, List)} создайте объект класса {@link Result}, заполните поля в соответствии с
 * результатами проверок и верните в качестве результата.
 */

public class Solution {

    public static Result analyze(List<Person> persons, List<PhoneCode> phoneCodesList) {
        Collection<CatalogEntry> catalog = Utils.transform(persons, person -> {
            for (PhoneCode phoneCode : phoneCodesList) {
                if (person.getPhoneNumber().indexOf(phoneCode.getCode()) == 2)
                    return new CatalogEntry(person, phoneCode.getCity(), phoneCode.getRegion());
            }
            return new CatalogEntry(person, "NOT FOUND", "NOT FOUND");
        });

        Collection<CatalogEntry> regionRyazanCatalog = Utils.filter(catalog,
                catalogEntry -> catalogEntry.getRegion().equals("Рязанская область") );

        int pensioners = Utils.count(regionRyazanCatalog, catalogEntry -> catalogEntry.getPerson().getAge() >= 70 );

        Collection<CatalogEntry> cityRyazanCatalog = Utils.filter(regionRyazanCatalog,
                catalogEntry -> catalogEntry.getCity().equals("Рязань") );

        boolean hasFasionDesigners = Utils.contains(persons, person -> person.getProfession().equals("Модельер"));

        return new Result(regionRyazanCatalog.size(),cityRyazanCatalog.size(),pensioners,hasFasionDesigners);
    }
}
