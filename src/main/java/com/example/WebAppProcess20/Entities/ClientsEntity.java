package com.example.WebAppProcess20.Entities;

/*
 * Created by Amit Nissan on 22/7/2018
 */

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "clients", schema = "theprocess")
public class ClientsEntity {
    private String clientId;
    private String clientName;
    private Timestamp dateOfBirth;
    private String homeAddress;
    private String city;
    private String country;
    private String gender;
    private String favouriteCategories;
    private String userName;
    private String password;
    private String emailAddress;

    @OnDelete(action = OnDeleteAction.CASCADE)
    @OneToMany
    private Set<OrdersEntity> orders = new HashSet<>();
    @Id
    @Column(name = "client_id")
    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    @Basic
    @Column(name = "client_name")
    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    @Basic
    @Column(name = "date_of_birth")
    public Timestamp getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Timestamp dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Basic
    @Column(name = "home_adress")
    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAdress) {
        this.homeAddress = homeAdress;
    }

    @Basic
    @Column(name = "city")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "country")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Basic
    @Column(name = "gender")
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Basic
    @Column(name = "favourite_categories")
    public String getFavouriteCategories() {
        return favouriteCategories;
    }

    public void setFavouriteCategories(String favouriteCategories) {
        this.favouriteCategories = favouriteCategories;
    }

    @Basic
    @Column(name = "user_name")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "emailAddress")
    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClientsEntity that = (ClientsEntity) o;
        return Objects.equals(clientId, that.clientId) &&
                Objects.equals(clientName, that.clientName) &&
                Objects.equals(dateOfBirth, that.dateOfBirth) &&
                Objects.equals(homeAddress, that.homeAddress) &&
                Objects.equals(city, that.city) &&
                Objects.equals(country, that.country) &&
                Objects.equals(gender, that.gender) &&
                Objects.equals(favouriteCategories, that.favouriteCategories) &&
                Objects.equals(userName, that.userName) &&
                Objects.equals(password, that.password) &&
                Objects.equals(emailAddress, that.emailAddress);
    }

    @Override
    public int hashCode() {

        return Objects.hash(clientId, clientName, dateOfBirth, homeAddress, city, country, gender, favouriteCategories, userName, password, emailAddress);
    }

    @Override
    public String toString() {
        return "ClientsEntity{" +
                "clientId='" + clientId + '\'' +
                ", clientName='" + clientName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", homeAddress='" + homeAddress + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", gender='" + gender + '\'' +
                ", favouriteCategories='" + favouriteCategories + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", orders=" + orders +
                '}';
    }
}
