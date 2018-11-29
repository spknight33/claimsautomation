package com.big.automation.selenium_webdriver.data.datatypes;

public enum Product {
    SIX_THOUSAND("6000"), EIGHT_THOUSAND("8000"), TEN_THOUSAND("10000");

    final private String productMiles;

    Product(String productMiles){
        this.productMiles = productMiles;
    }

    public String getProductMiles() {
        return productMiles;
    }
}
