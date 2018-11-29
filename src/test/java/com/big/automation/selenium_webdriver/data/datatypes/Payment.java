package com.big.automation.selenium_webdriver.data.datatypes;

public enum Payment {
    ANNUAL("A"), MONTHLY("I");

    final private String paymentType;

    Payment(String paymentType){
        this.paymentType = paymentType;
    }

    public String getPaymentType() {
        return paymentType;
    }
}
