package com.ocr.amal;



import java.util.Map;

public class Bill {

    Cutomer cutomer ;
    Map<Product,Integer> products;

    public Cutomer getCutomer() {
        return cutomer;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }

    /**
     * Add a product with a quantity in the bill
     * @param product product to add
     * @param quantity quantity of the product
     */

    public void addProduct(Product product , Integer quantity){

             this.products.put(product,quantity);
    }

    public Bill(Cutomer cutomer) {
        this.cutomer = cutomer;
    }
}
