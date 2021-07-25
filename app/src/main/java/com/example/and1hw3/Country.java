package com.example.and1hw3;

public class Country {
    private String countryName;
    private String capitalName;
    private int flag;

    public Country(String countryName, String capitalName, int flag) {
        this.countryName = countryName;
        this.capitalName = capitalName;
        this.flag = flag;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCapitalName() {
        return capitalName;
    }

    public void setCapitalName(String capitalName) {
        this.capitalName = capitalName;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }
}
