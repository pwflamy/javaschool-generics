package ru.rzn.sbt.javaschool.lesson6.abonents;

/**
 * Персона
 */
public class Person {
    /**
     * Имя
     */
    private final String name;

    /**
     * Телефонный номер
     */
    private final String phoneNumber;

    /**
     * Возраст
     */
    private final int age;

    /**
     * Профессия
     */
    private final String profession;

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public String getProfession() {
        return profession;
    }

    public Person(String name, String phoneNumber, int age, String profession) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.profession = profession;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", age='" + age + '\'' +
                ", profession='" + profession + '\'' +
                '}';
    }
}
