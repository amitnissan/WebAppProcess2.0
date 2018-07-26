package com.example.WebAppProcess20.Entities;

/*
 * Created by Amit Nissan on 27/7/2018
 */

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "invoices", schema = "theprocess", catalog = "")
public class InvoicesEntity {
    private String invoiceId;
    private String orderId;

    @Id
    @Column(name = "invoice_id")
    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    @Basic
    @Column(name = "orderId")
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoicesEntity that = (InvoicesEntity) o;
        return Objects.equals(invoiceId, that.invoiceId) &&
                Objects.equals(orderId, that.orderId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(invoiceId, orderId);
    }
}
