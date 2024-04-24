package com.yourOrganization.autoservicetask;

public class Tool {

    double price;
    String name;
    double weight;

    public Tool(String name1) {
        this.name = name1;
    }

    public Tool() {
        System.out.println("O nouă uneltă a fost creată în cadrul programului. Detalii nume unealta: "
                + name + " Si greutatea este de: " + weight);
    }

    public Tool( double price1, double weight1) {
        this.price = price1;
        this.weight = weight1;
    }
}
