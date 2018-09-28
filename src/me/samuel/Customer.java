package me.samuel;

public class Customer {

    //All these are methods.

    //Shortcut for all variables: Alt+insert, then ctrl a.

    public int getAppleQuantity() {
        return apples;
    }

    //'this' refers to the class you are currently in.
    //These variables all need the other page to instantiate these variables. In the other page, use the get method.
    public void setAppleQuantity(int apples) {
        this.apples = apples;
    }

    public int getBananaQuantity() {
        return bananas;
    }

    public void setBananaQuantity(int bananas) {
        this.bananas = bananas;
    }

    private int apples;
    private int bananas;
}
