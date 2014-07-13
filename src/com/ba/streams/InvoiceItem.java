package com.ba.streams;

public class InvoiceItem {

    private final String product;

    public InvoiceItem(String product) {
        this.product = product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InvoiceItem that = (InvoiceItem) o;

        if (!product.equals(that.product)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return product.hashCode();
    }

    public String getProduct() {
        return product;
    }
}
