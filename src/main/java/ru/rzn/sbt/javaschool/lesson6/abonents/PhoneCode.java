package ru.rzn.sbt.javaschool.lesson6.abonents;

public class PhoneCode {
    /**
     * Телефонный код
     */
    private final String code;

    /**
     * Город
     */
    private final String city;

    /**
     * Регион
     */
    private final String region;

    public String getCode() {
        return code;
    }

    public String getCity() {
        return city;
    }

    public String getRegion() {
        return region;
    }

    public PhoneCode(String code, String city, String region) {
        this.code = code;
        this.city = city;
        this.region = region;
    }

    @Override
    public String toString() {
        return "PhoneCode{" +
                "code='" + code + '\'' +
                ", city='" + city + '\'' +
                ", region='" + region + '\'' +
                '}';
    }
}
