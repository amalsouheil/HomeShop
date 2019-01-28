package com.ocr.amal;

public class DirectDelivrey implements Delivery  {
    @Override
    public double getPrice() {
        return 4.99 ;
    }
    public String getInfo(){

        return "Livraison a domicile 4.99€";

    }



}
