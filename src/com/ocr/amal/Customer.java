package com.ocr.amal;

public class Customer {


    String fullname;

    public String getAdress() {
        return adress;
    }

    String adress;

    public String getFullname() {
        return fullname;
    }

    public Customer(String fullname, String adress) {
        this.fullname = fullname;
        this.adress = adress;
    }

}
