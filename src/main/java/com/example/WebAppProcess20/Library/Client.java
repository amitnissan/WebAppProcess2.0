package com.example.WebAppProcess20.Library;

import org.aspectj.weaver.ast.Or;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Client {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int clientID;
    private String clientName;
    private Date birthDate;
    private String homeAddress;
    private String city;
    private String country;
    private String gender;
    private String favouriteCategories;
    private String userName;
    private String password;
    private String emailAddress;

    @OneToMany(mappedBy = "clients")
    private Set<Order> orders = new HashSet<>();

    @Override
    public String toString() {
        return "Client{" +
                "clientID=" + clientID +
                ", clientName='" + clientName + '\'' +
                ", birthDate=" + birthDate +
                ", homeAddress='" + homeAddress + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", gender='" + gender + '\'' +
                ", favouriteCategories='" + favouriteCategories + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFavouriteCategories() {
        return favouriteCategories;
    }

    public void setFavouriteCategories(String favouriteCategories) {
        this.favouriteCategories = favouriteCategories;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Client() {
    }

    public Client(String clientName, Date birthDate, String homeAddress, String city, String country, String gender, String favouriteCategories, String userName, String password, String emailAddress) {
        this.clientName = clientName;
        this.birthDate = birthDate;
        this.homeAddress = homeAddress;
        this.city = city;
        this.country = country;
        this.gender = gender;
        this.favouriteCategories = favouriteCategories;
        this.userName = userName;
        this.password = password;
        this.emailAddress = emailAddress;
    }

    public Client(String clientName, Date birthDate, String homeAddress, String city, String country, String gender, String favouriteCategories, String userName, String password, String emailAddress, Set<Order> orders) {
        this.clientName = clientName;
        this.birthDate = birthDate;
        this.homeAddress = homeAddress;
        this.city = city;
        this.country = country;
        this.gender = gender;
        this.favouriteCategories = favouriteCategories;
        this.userName = userName;
        this.password = password;
        this.emailAddress = emailAddress;
        this.orders = orders;
    }
}
