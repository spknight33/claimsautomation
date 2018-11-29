package com.big.automation.selenium_webdriver.data.datatypes;

public enum HomeOwner {
    TRUE("T"), FALSE("F");

    final private String homeOwnerStatus;

    HomeOwner(String homeOwnerStatus){
        this.homeOwnerStatus = homeOwnerStatus;
    }

    public String getHomeOwnerStatus() {
        return homeOwnerStatus;
    }
}
