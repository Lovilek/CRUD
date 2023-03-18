package com.company;

public class Sell extends Club {
    String customer;
    int price;

    public Sell() {
    }

    ;

    public Sell(String customer, int price) {
        this.customer = customer;
        this.price = price;
    }

    String getClubData() {
        return "Продано: " + customer + ", Цена: $ " + price+" ";
    }

    public int getPrice() {
        return price;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
