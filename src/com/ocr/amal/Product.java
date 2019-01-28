package com.ocr.amal;



public class Product {

    String name;
    String description;
    double price;

    public  Product(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    /**
     * diplay a full description of the product
     */
    public void look(){
        System.out.println(String.format(name + " : " + price + "%n" + description));
    }

    public void buy(Bill facture, Integer quantite){

    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
