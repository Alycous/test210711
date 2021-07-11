package com.bjpowernode.domain;

public class hero {
    private String superman;
    private String spiderman;
    private String ironman;

    public hero() {
    }

    public hero(String superman, String spiderman, String ironman) {
        this.superman = superman;
        this.spiderman = spiderman;
        this.ironman = ironman;
    }

    public String getSuperman() {
        return superman;
    }

    public void setSuperman(String superman) {
        this.superman = superman;
    }

    public String getSpiderman() {
        return spiderman;
    }

    public void setSpiderman(String spiderman) {
        this.spiderman = spiderman;
    }

    public String getIronman() {
        return ironman;
    }

    public void setIronman(String ironman) {
        this.ironman = ironman;
    }

    @Override
    public String toString() {
        return "hero{" +
                "superman='" + superman + '\'' +
                ", spiderman='" + spiderman + '\'' +
                ", ironman='" + ironman + '\'' +
                '}';
    }
}
