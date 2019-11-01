package ru.rzn.sbt.javaschool.lesson6.abonents;

public class Result {
    /**
     * Количество абонентов в Рязанской области
     */
    private int regionRyazanCount;

    /**
     * Количество абонентов в Рязани
     */
    private int cityRyazanCount;

    /**
     * Количество пенсионеров в Рязанской области
     */
    private int pensionersCount;

    /**
     * Признак наличия модельеров в Рязани
     */
    private boolean hasFasionDesigners;

    public int getRegionRyazanCount() {
        return regionRyazanCount;
    }

    public void setRegionRyazanCount(int regionRyazanCount) {
        this.regionRyazanCount = regionRyazanCount;
    }

    public int getCityRyazanCount() {
        return cityRyazanCount;
    }

    public void setCityRyazanCount(int cityRyazanCount) {
        this.cityRyazanCount = cityRyazanCount;
    }

    public int getPensionersCount() {
        return pensionersCount;
    }

    public void setPensionersCount(int pensionersCount) {
        this.pensionersCount = pensionersCount;
    }

    public boolean isHasFasionDesigners() {
        return hasFasionDesigners;
    }

    public void setHasFasionDesigners(boolean hasFasionDesigners) {
        this.hasFasionDesigners = hasFasionDesigners;
    }

    public Result() {
        this(0, 0, 0, false);
    }

    public Result(int regionRyazanCount, int cityRyazanCount, int pensionersCount, boolean hasFasionDesigners) {
        this.regionRyazanCount = regionRyazanCount;
        this.cityRyazanCount = cityRyazanCount;
        this.pensionersCount = pensionersCount;
        this.hasFasionDesigners = hasFasionDesigners;
    }

    @Override
    public String toString() {
        return "Result{" +
                "regionRyazanCount=" + regionRyazanCount +
                ", cityRyazanCount=" + cityRyazanCount +
                ", pensionersCount=" + pensionersCount +
                ", hasFasionDesigners=" + hasFasionDesigners +
                '}';
    }
}
