package com.company;

public class ClubCreate {
    String country;
    String nameClub;

    public ClubCreate() {
    }

    ;

    public ClubCreate(String country, String nameClub) {
        this.country = country;
        this.nameClub = nameClub;
    }

    void printClub() {
        System.out.println("Country: " + country + ", Club: " + nameClub);
    }

    public String getCountry() {
        return country;
    }

    public String getNameClub() {
        return nameClub;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setNameClub(String nameClub) {
        this.nameClub = nameClub;
    }
}
