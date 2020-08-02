package com.ysuturin.springdoc.example14SpringExpressionLanguige;

public class UsualPerson {
    private int id;
    private String name;
    private int age;
    private Country country;
    private String countryName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @Override
    public String toString() {
        return "UsualPerson{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", country=" + country +
                ", countryName='" + countryName + '\'' +
                '}';
    }
}
