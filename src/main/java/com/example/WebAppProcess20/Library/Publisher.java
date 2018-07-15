package com.example.WebAppProcess20.Library;

/*
 * Created by Amit Nissan on 14/5/2018
 */

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String PublisherName;
    private String PublisherAddress;

    public Publisher() {
    }

    public Publisher(String publisherName, String publisherAddress) {
        PublisherName = publisherName;
        PublisherAddress = publisherAddress;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPublisherName() {
        return PublisherName;
    }

    public void setPublisherName(String publisherName) {
        PublisherName = publisherName;
    }

    public String getPublisherAddress() {
        return PublisherAddress;
    }

    public void setPublisherAddress(String publisherAddress) {
        PublisherAddress = publisherAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Publisher publisher = (Publisher) o;
        return Objects.equals(id, publisher.id) &&
                Objects.equals(PublisherName, publisher.PublisherName) &&
                Objects.equals(PublisherAddress, publisher.PublisherAddress);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, PublisherName, PublisherAddress);
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "id=" + id +
                ", PublisherName='" + PublisherName + '\'' +
                ", PublisherAddress='" + PublisherAddress + '\'' +
                '}';
    }
}
