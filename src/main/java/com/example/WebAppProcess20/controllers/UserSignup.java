package com.example.WebAppProcess20.controllers;

/*
 * Created by Amit Nissan on 29/7/2018
 */

import java.sql.Date;

public class UserSignup {
    private String city;
    private String clientName;
    private String country;
    private Date dateOfBirth;
    private String emailAddress;
    private String favouriteCategories;
    private String gender;
    private String homeAdress;
    private String password;
    private String userName;

    public UserSignup(String city, String clientName, String country, Date dateOfBirth, String emailAddress, String favouriteCategories, String gender, String homeAdress, String password, String userName) {
        this.city = city;
        this.clientName = clientName;
        this.country = country;
        this.dateOfBirth = dateOfBirth;
        this.emailAddress = emailAddress;
        this.favouriteCategories = favouriteCategories;
        this.gender = gender;
        this.homeAdress = homeAdress;
        this.password = password;
        this.userName = userName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getFavouriteCategories() {
        return favouriteCategories;
    }

    public void setFavouriteCategories(String favouriteCategories) {
        this.favouriteCategories = favouriteCategories;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHomeAdress() {
        return homeAdress;
    }

    public void setHomeAdress(String homeAdress) {
        this.homeAdress = homeAdress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "UserSignup{" +
                "city='" + city + '\'' +
                ", clientName='" + clientName + '\'' +
                ", country='" + country + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", emailAddress='" + emailAddress + '\'' +
                ", favouriteCategories='" + favouriteCategories + '\'' +
                ", gender='" + gender + '\'' +
                ", homeAdress='" + homeAdress + '\'' +
                ", password='" + password + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }
}
