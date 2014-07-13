package com.ba.streams;

import java.util.List;

public class Invoice {

    private final List<InvoiceItem> items;

    public Invoice(final String shop, final String customer, final List<InvoiceItem> items) {
        this.items = items;
    }

    public List<InvoiceItem> getItems() {
        return items;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Invoice invoice = (Invoice) o;

        if (!items.equals(invoice.items)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return items.hashCode();
    }
}
