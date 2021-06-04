package de;

public class SortTXT {
    private int value;

    private String name;
    private String country;
    private String category;
    private int year;


    public SortTXT(int year, String name, String country, int value, String category){
        super();

        this.year = year;
        this.name = name;
        this.country = country;
        this.value = value;
        this.category = category;
    }

    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) { this.year = year; }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }




}
