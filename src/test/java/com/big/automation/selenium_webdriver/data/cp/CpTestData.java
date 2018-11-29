package com.big.automation.selenium_webdriver.data.cp;


public interface CpTestData  {


    String getUsername();

    String getPassword();

    // Page 1
    String getTitle();

    String getFirstName();

    String getSurname();

    String getDateOfBirthDay();

    String getDateOfBirthMonth();

    String getDateOfBirthYear();

    String getOccupation();

    String getUkSinceMonth();

    String getUkSinceYear();

    String getMaritalStatus();

    String getAddressHouseNumber();

    String getAddressPostCode();

    String getAddressLine1();

    String getHomeOwnerStatus();

    String getHowDidYouHearAboutUs();

    // Page 2 step 1
    String getDrivingLicenceType();

    String getTestPassedSinceMonth();

    String getTestPassedSinceYear();

    String getAdditionalQualifications();

    String getMedicalConditions();

    String getDriveOtherVehicles();

    String getNonMotoringOffences();

    String getCancelledByInsurer();

    String getHasConvictions();

    String getHasClaims();


    // Page 3
    String getRegistrationNumber();

    String getWhenDidYouBuyTheCarMonth();

    String getWhenDidYouBuyTheCarYear();

    String getSecurityDevices();

    String getValueOfCar();

    String getEstimatedAnnualMileage();

    String getCarModified();

    String getDayTimeParking();

    String getNightTimeParking();

    String getHowDoYouUseYourCar();

    String getCarDescription();

    String getNumberOfYearsHeldNoClaimDiscount();

    String getCarHasSecurityTracker();

    String getCarImported();

    String getRegisteredKeeperStatus();

    String getRightHandDriveStatus();

    String getLessThan8SeatsStatus();

    //page4
    String  getPaymentType();


    // Page 4 addons
    String getEmailId();

    // Page 5 step 1
    String getPolicyHolderMobileNo();

    String getCardInYourName();

    String getTpPayerFirstName();

    String getTpPayerSurname();

    //Page 5 Instalment Journey
    String getAccountName();

    String getAccountNumber();

    String getSortCode();

    // Page 5 payment
    String getCardNumber();

    String getStartMonth();

    String getStartYear();

    String getExpiryYear();

    String getExpiryMonth();

    String getSecurityCode();

    String getSagepayPassword();

    String getSubTitleForm();


}
