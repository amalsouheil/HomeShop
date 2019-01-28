package com.ocr.amal;

public class Fridge extends Product {

    private int liter;
    private Boolean freezer;

    public Fridge(String name, String description, double price, int liter, Boolean freezer) {
        super(name, description, price);
        this.liter = liter;
        this.freezer = freezer;
    }

    public int getLiter() {
        return liter;
    }

    public Boolean getFreezer() {
        return freezer;
    }
}
