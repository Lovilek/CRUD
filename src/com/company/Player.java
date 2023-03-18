package com.company;

public class Player extends Club {
    String name;
    String surname;
    String position;
    int number;
    int id;

    public Player() {
    }

    public Player(String name, String surname, String position, int number, int id) {
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.number = number;
        this.id = id;


    }


    String getClubData() {
        return "Name: " + name + ", Surname: " + surname + ", Position: " + position + ", Number: " + number + ", ID: " + id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getId() {
        return id;
    }

    public int getNumber() {
        return number;
    }

    public String getPosition() {
        return position;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setPosition(String position) {
        this.position = position;
    }

}
