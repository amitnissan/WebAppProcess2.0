package com.example.WebAppProcess20.bootstrap;

/*
 * Created by Amit Nissan on 22/7/2018
 */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "invoices", schema = "theprocess")
public class InvoicesEntity {
    private String invoiceId;

    @Id
    @Column(name = "invoice_id")
    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoicesEntity that = (InvoicesEntity) o;
        return Objects.equals(invoiceId, that.invoiceId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(invoiceId);
    }
}
