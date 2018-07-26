package com.example.WebAppProcess20.Entities;

/*
 * Created by Amit Nissan on 27/7/2018
 */

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "clients", schema = "theprocess", catalog = "")
public class ClientsEntity {
    private String clientId;
    private String city;
    private String clientName;
    private String country;
    private Timestamp dateOfBirth;
    private String favouriteCategories;
    private String gender;
    private String homeAdress;
    private String password;
    private String userName;
    private String emailAddress;

    @Id
    @Column(name = "client_id")
    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
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
    @Column(name = "client_name")
    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
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
    @Column(name = "date_of_birth")
    public Timestamp getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Timestamp dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
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
    @Column(name = "gender")
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Basic
    @Column(name = "home_adress")
    public String getHomeAdress() {
        return homeAdress;
    }

    public void setHomeAdress(String homeAdress) {
        this.homeAdress = homeAdress;
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
    @Column(name = "user_name")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "email_address")
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
                Objects.equals(city, that.city) &&
                Objects.equals(clientName, that.clientName) &&
                Objects.equals(country, that.country) &&
                Objects.equals(dateOfBirth, that.dateOfBirth) &&
                Objects.equals(favouriteCategories, that.favouriteCategories) &&
                Objects.equals(gender, that.gender) &&
                Objects.equals(homeAdress, that.homeAdress) &&
                Objects.equals(password, that.password) &&
                Objects.equals(userName, that.userName) &&
                Objects.equals(emailAddress, that.emailAddress);
    }

    @Override
    public int hashCode() {

        return Objects.hash(clientId, city, clientName, country, dateOfBirth, favouriteCategories, gender, homeAdress, password, userName, emailAddress);
    }
}
