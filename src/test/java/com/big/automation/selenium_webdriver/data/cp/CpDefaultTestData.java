package com.big.automation.selenium_webdriver.data.cp;


import com.big.automation.selenium_webdriver.common.utilities.TimeStampUtils;
import com.big.automation.selenium_webdriver.data.datatypes.HomeOwner;
import com.big.automation.selenium_webdriver.data.datatypes.Payment;
import org.apache.commons.lang3.RandomStringUtils;

public class CpDefaultTestData implements CpTestData {

    // Page 1
    private static final String TITLE = "Mr";
    private static final String FIRST_NAME = "WDtest";
    private static final String SURNAME = RandomStringUtils.randomAlphabetic(10);
    private static final String DATE_OF_BIRTH_DAY = "5";
    private static final String DATE_OF_BIRTH_MONTH = "May";
    private static final String DATE_OF_BIRTH_YEAR = "1995";
    private static final String OCCUPATION = "Farmer";
    private static final String UK_SINCE_MONTH = "May";
    private static final String UK_SINCE_YEAR = "2015";
    private static final String MARITAL_STATUS = "Single";
    private static final String ADDRESS_HOUSE_NUMBER = "19";
    private static final String ADDRESS_POST_CODE = "ne2 2ah";
    private static final String ADDRESS_LINE_1 = "19 Osborne Road";
    private static final String HOME_OWNER_STATUS = HomeOwner.TRUE.getHomeOwnerStatus();
    private static final String HOW_DID_YOU_HEAR_ABOUT_US = "Recommendation";


    // Page 2 step 1
    private static final String DRIVING_LICENCE_TYPE = "Full UK Licence";
    private static final String TEST_PASSED_SINCE_MONTH = "April";
    private static final String TEST_PASSED_SINCE_YEAR = "2014";
    private static final String ADDITIONAL_QUALIFICATIONS = "No";
    private static final String MEDICAL_CONDITIONS = "No";
    private static final String DRIVE_OTHER_VEHICLES = "No";
    private static final String NON_MOTORING_OFFENCES = "no";
    private static final String CANCELLED_BY_INSURER = "no";
    private static final String HAS_CONVICTIONS = "false";
    private static final String HAS_CLAIMS = "false";


    // Page 3
    private static final String REGISTRATION_NUMBER = "LJ06 PVX";
    private static final String WHEN_DID_YOU_BUY_THE_CAR_MONTH = "February";
    private static final String WHEN_DID_YOU_BUY_THE_CAR_YEAR = "2015";
    private static final String SECURITY_DEVICES = "None";
    private static final String VALUE_OF_CAR = "2010";
    private static final String ESTIMATED_ANNUAL_MILEAGE = "6000";
    private static final String CAR_MODIFIED = "No";
    private static final String DAY_TIME_PARKING = "Garaged At Home";
    private static final String NIGHT_TIME_PARKING = "Garaged Overnight";
    private static final String HOW_DO_YOU_USE_YOUR_CAR = "Social Domestic and Pleasure only (including commuting)";
    private static final String NUMBER_OF_YEARS_HELD_NO_CLAIM_DISCOUNT = "1";
    private static final String CAR_DESCRIPTION = "NISSAN MICRA SE 2006 1386 CC 5 DOORS PETROL AUTOMATIC";
    private static final String PAYMENT_TYPE = Payment.ANNUAL.getPaymentType();
    private static final String CAR_HAS_SECURITY_TRACKER = "No";
    private static final String CAR_IMPORTED = "no";
    private static final String REGISTERED_KEEPER_STATUS = "yes";
    private static final String RIGHT_HAND_DRIVE_STATUS = "yes";
    private static final String LESS_THAN_EIGHT_SEATS_STATUS = "yes";

    // Page 4 addons
    //private static final String timeStandardStamp = new SimpleDateFormat("HHmmssddMMyyyy").format(new java.util.Date());
    private static final String EMAIL_ID = TimeStampUtils.createEmailAddressWithTimeStamp(TimeStampUtils.createEmailTimeStamp());

    // Page 5 step 1
    private static final String POLICY_HOLDER_MOBILE_NO = "07845454214";

    private static final String CARD_IN_YOUR_NAME = "true";

    private static final String TP_PAYER_FIRST_NAME = "John";

    private static final String TP_PAYER_SURNAME = "Smith";

    // Page 5 Instalment Journey

    private static final String ACCOUNT_NAME = "test";

    private static final String ACCOUNT_NUMBER = "02149187";

    private static final String SORT_CODE = "938611";

    // Page 5 step 2
    private static final String CARD_NUMBER = "4929000000006";

    private static final String START_MONTH = "03";

    private static final String START_YEAR = "2010";

    private static final String EXPIRY_YEAR = "2020";

    private static final String EXPIRY_MONTH = "03";

    private static final String SECURITY_CODE = "123";

    private static final String SAGEPAY_PASSWORD = "password";

    private static final String SUB_TITLE_FORM = "Please enter your password to verify your identification.";

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }

    // Page 1
    @Override
    public String getTitle() {
        return TITLE;
    }

    @Override
    public String getFirstName() {
        return FIRST_NAME;
    }

    @Override
    public String getSurname() {
        return SURNAME;
    }

    @Override
    public String getDateOfBirthDay() {
        return DATE_OF_BIRTH_DAY;
    }

    @Override
    public String getDateOfBirthMonth() {
        return DATE_OF_BIRTH_MONTH;
    }

    @Override
    public String getDateOfBirthYear() {
        return DATE_OF_BIRTH_YEAR;
    }

    @Override
    public String getOccupation() {
        return OCCUPATION;
    }

    @Override
    public String getUkSinceMonth() {
        return UK_SINCE_MONTH;
    }

    @Override
    public String getUkSinceYear() {
        return UK_SINCE_YEAR;
    }

    @Override
    public String getMaritalStatus() {
        return MARITAL_STATUS;
    }

    @Override
    public String getAddressHouseNumber() {
        return ADDRESS_HOUSE_NUMBER;
    }

    @Override
    public String getAddressPostCode() {
        return ADDRESS_POST_CODE;
    }

    @Override
    public String getAddressLine1() {
        return ADDRESS_LINE_1;
    }

    @Override
    public String getHomeOwnerStatus() { return HOME_OWNER_STATUS;
    }

    @Override
    public String getHowDidYouHearAboutUs() { return HOW_DID_YOU_HEAR_ABOUT_US; }

    // Page 2 step 1

    @Override
    public String getDrivingLicenceType() {
        return DRIVING_LICENCE_TYPE;
    }

    @Override
    public String getTestPassedSinceMonth() {
        return TEST_PASSED_SINCE_MONTH;
    }

    @Override
    public String getTestPassedSinceYear() {
        return TEST_PASSED_SINCE_YEAR;
    }

    @Override
    public String getAdditionalQualifications() {
        return ADDITIONAL_QUALIFICATIONS;
    }

    @Override
    public String getMedicalConditions() {

        return MEDICAL_CONDITIONS;
    }

    @Override
    public String getDriveOtherVehicles() {
        return DRIVE_OTHER_VEHICLES;
    }

    @Override
    public String getNonMotoringOffences() {
        return NON_MOTORING_OFFENCES;
    }

    @Override
    public String getCancelledByInsurer() {
        return CANCELLED_BY_INSURER;
    }

    @Override
    public String getHasConvictions() {
        return HAS_CONVICTIONS;
    }

    @Override
    public String getHasClaims() {
        return HAS_CLAIMS;
    }


    // Page 3
    @Override
    public String getRegistrationNumber() {
        return REGISTRATION_NUMBER;
    }

    @Override
    public String getWhenDidYouBuyTheCarMonth() {
        return WHEN_DID_YOU_BUY_THE_CAR_MONTH;
    }

    @Override
    public String getWhenDidYouBuyTheCarYear() {
        return WHEN_DID_YOU_BUY_THE_CAR_YEAR;
    }

    @Override
    public String getSecurityDevices() {
        return SECURITY_DEVICES;
    }

    @Override
    public String getValueOfCar() {
        return VALUE_OF_CAR;
    }

    @Override
    public String getEstimatedAnnualMileage() {return ESTIMATED_ANNUAL_MILEAGE;}

    @Override
    public String getCarModified() {
        return CAR_MODIFIED;
    }

    @Override
    public String getDayTimeParking() {
        return DAY_TIME_PARKING;
    }

    @Override
    public String getNightTimeParking() {
        return NIGHT_TIME_PARKING;
    }

    @Override
    public String getHowDoYouUseYourCar() {
        return HOW_DO_YOU_USE_YOUR_CAR;
    }

    @Override
    public String getCarDescription() {
        return CAR_DESCRIPTION;

    }
    @Override
    public String getNumberOfYearsHeldNoClaimDiscount() {
        return NUMBER_OF_YEARS_HELD_NO_CLAIM_DISCOUNT;
    }

    @Override
    public String getCarHasSecurityTracker() {
        return CAR_HAS_SECURITY_TRACKER;
    }

    @Override
    public String getCarImported() {
        return CAR_IMPORTED;
    }

    @Override
    public String getRegisteredKeeperStatus() {
        return REGISTERED_KEEPER_STATUS;
    }

    @Override
    public String getRightHandDriveStatus() {
        return RIGHT_HAND_DRIVE_STATUS;
    }

    @Override
    public String getLessThan8SeatsStatus() {
        return LESS_THAN_EIGHT_SEATS_STATUS;
    }


    //ItbRqYourQuotePOM
    @Override
    public String getPaymentType() { return PAYMENT_TYPE; }

    // Page 4 addons
    @Override
    public String getEmailId() {
        return EMAIL_ID;
    }

    // Page 5 step 1
    @Override
    public String getPolicyHolderMobileNo() {
        return POLICY_HOLDER_MOBILE_NO;
    }

    @Override
    public String getCardInYourName() {
        return CARD_IN_YOUR_NAME;
    }

    @Override
    public String getTpPayerFirstName() {
        return TP_PAYER_FIRST_NAME;
    }

    @Override
    public String getTpPayerSurname() {
        return TP_PAYER_SURNAME;
    }

    // Page 5 Instalment Journey
    @Override
    public String getAccountName() { return ACCOUNT_NAME; }

    @Override
    public String getAccountNumber() { return ACCOUNT_NUMBER; }

    @Override
    public String getSortCode() { return SORT_CODE; }

    // Page 5 payment

    @Override
    public String getCardNumber() {
        return CARD_NUMBER;
    }

    @Override
    public String getStartMonth() {
        return START_MONTH;
    }

    @Override
    public String getStartYear() {
        return START_YEAR;
    }

    @Override
    public String getExpiryYear() {
        return EXPIRY_YEAR;
    }

    @Override
    public String getExpiryMonth() {
        return EXPIRY_MONTH;
    }

    @Override
    public String getSecurityCode() {
        return SECURITY_CODE;
    }

    @Override
    public String getSagepayPassword() { return SAGEPAY_PASSWORD; }

    @Override
    public String getSubTitleForm() {
        return SUB_TITLE_FORM;
    }
}
