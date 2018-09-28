package me.samuel;

import java.util.ArrayList;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Limits the kind of object that can be listed; here, accepts custom object 'Person'.
        ArrayList<Customer>groceryList = new ArrayList<>();

        //Set names as strings.
        String appleName = "Apple";
        String bananaName = "Banana";

        //Set prices as doubles.
        double applePrice = 2.25;
        double bananaPrice = 1.50;

        //Instantiating thePerson object to give attributes to. Giving attributes is done with setters.
        Customer theCustomer = new Customer();

        //Ask customer for number of apples bought, then store amount as an integer.
        Scanner input = new Scanner(System.in);
        System.out.println("How many apples would you like to buy today? ");
        int apples = input.nextInt();
        theCustomer.setAppleQuantity(apples);

        //Ask customer for number of bananas bought, then store amount as an integer.
        System.out.println("How many bananas would you like to buy today? ");
        int bananas = input.nextInt();
        theCustomer.setBananaQuantity(bananas);

        //Multiply price by quantity to find cost.
        double costApples = apples*applePrice;
        double costBananas = bananas*bananaPrice;
        double costTotal = costApples+costBananas;

        //Calculate how many types of items bought.
        int typeApple=0;
        if(apples>=1)
            typeApple=typeApple+1;
        else
            typeApple=0;

        int typeBanana = 0;
        if(bananas>=1)
            typeBanana=typeBanana+1;
        else
            typeBanana=0;

        //Calculate total types of items bought.
        int typeTotal = typeApple + typeBanana;

        System.out.println("\nItem Name \tPrice \tQuantity \tCost");
        System.out.printf("%s \t\t$%.2f \t%d \t\t\t$%.2f", appleName, applePrice, theCustomer.getAppleQuantity(), costApples);
        System.out.printf("\n%s \t\t$%.2f \t%d \t\t\t$%.2f", bananaName, bananaPrice, theCustomer.getBananaQuantity(), costBananas);
        System.out.println("\n-------------------------------------");
        System.out.printf("\nTotal Purchase Amount: $%.2f", costTotal);
        System.out.printf("\nTotal Items Purchased: %d\n", typeTotal);

        if(costTotal>20)
            System.out.println("\nYou spent too much today...");
        else
            System.out.println("\nThank you for shopping at my market!");

        groceryList.add(theCustomer);
    }
}