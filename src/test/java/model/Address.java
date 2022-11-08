package model;

import lombok.Data;


@Data
public class Address {
    public static final String ADDRESS_PAGE_URL = "http://prestashop.qatestlab.com.ua/ru/address";
    public static final String ADDRESSES_PAGE_URL = "http://prestashop.qatestlab.com.ua/ru/addresses";

    private String firstName = "Ivan";
    private String lastName = "Ivanov";
    private String address = "Minsk";
    private String zip = "12345";
    private String city = "Minsk";
    private String country = "Украина";
    private String homePhone = "111";
    private String state = "Автономная Республика Крым";
    private String addressTitle = "Minsk";
    private String zipFalse= "12345678";

    public Address(String firstName, String lastName, String address, String zip, String city, String country, String homePhone, String state, String addressTitle, String zipFalse) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.zip = zip;
        this.city = city;
        this.country = country;
        this.homePhone = homePhone;
        this.state = state;
        this.addressTitle = addressTitle;
        this.zipFalse = zipFalse;
    }

    public Address() {
    }

}

