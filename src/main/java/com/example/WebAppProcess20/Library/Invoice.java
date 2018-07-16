package com.example.WebAppProcess20.Library;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Invoice {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int invoiceID;
    private int orderId;

    //TODO: Do we need something in here? I don't think so...

    @Override
    public String toString() {
        return "Invoice{" +
                "invoiceID=" + invoiceID +
                ", orderId=" + orderId +
                '}';
    }

    public int getInvoiceID() {
        return invoiceID;
    }

    public void setInvoiceID(int invoiceID) {
        this.invoiceID = invoiceID;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Invoice(int orderId) {
        this.orderId = orderId;
    }

    public Invoice() {
    }
}
