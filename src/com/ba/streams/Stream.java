package com.ba.streams;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Stream {

    public static void main(final String[] args) {

        System.out.println(extractAllProducts(TestData.listOfInvoices()));
    }

    /**
     * From a given list of invoices, extract a set of all product names.
     */
    public static Set<String> extractAllProducts(final List<Invoice> invoices) {
        return invoices.stream()
                .<InvoiceItem>flatMap((i) -> i.getItems().stream())
                .<String>map((InvoiceItem i) -> i.getProduct())
                .collect(Collectors.<String>toSet());
    }

    public static Set<String> extractProducts(final List<Invoice> invoices) {
        final Set<String> products = new HashSet<>();
        for (final Invoice i : invoices) {
            for (final InvoiceItem j : i.getItems()) {
                products.add(j.getProduct());
            }
        }
        return products;
    }
}
