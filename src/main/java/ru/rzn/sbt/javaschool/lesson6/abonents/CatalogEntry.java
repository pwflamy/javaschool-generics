package ru.rzn.sbt.javaschool.lesson6.abonents;

public class CatalogEntry {
    /**
     * Персона
     */
    private Person person;

    /**
     * Город
     */
    private String city;

    /**
     * Регион
     */
    private String region;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public CatalogEntry(Person person, String city, String region) {
        this.person = person;
        this.city = city;
        this.region = region;
    }

    @Override
    public String toString() {
        return "CatalogEntry{" +
                "person=" + person +
                ", city='" + city + '\'' +
                ", region='" + region + '\'' +
                '}';
    }
}
