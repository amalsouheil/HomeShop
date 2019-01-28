package com.ocr.amal;

public class ExpressDelivery implements Delivery  {


    public String city;

    public ExpressDelivery(String city) {
        this.city = city;
    }

    @Override
    public double getPrice() {
        if (city.equals("Paris"))
            return 6.99;
        else
            return 9.99;
    }
}
