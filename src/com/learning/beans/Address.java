package com.learning.beans;

public class Address {
    private String houseno;
    private String colony;
    private String city;

    public void setHouseno(String houseno) {
        this.houseno = houseno;
    }

    public void setColony(String colony) {
        this.colony = colony;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return " # "+houseno+ ", "+colony+ " "+ city;
    }
}
