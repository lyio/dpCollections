package com.ba.streams;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class TestData {

    public static List<Invoice> listOfInvoices() {
        return Arrays.asList(
                new Invoice("Crusty Burger", "Homer", Arrays.asList(
                        new InvoiceItem("Burger"),
                        new InvoiceItem("Coke"))),
                new Invoice("Crusty Burger", "Bart", Arrays.asList(
                        new InvoiceItem("Coke"))),
                new Invoice("Moe", "Homer", Arrays.asList(
                        new InvoiceItem("Beer"),
                        new InvoiceItem("Burger"))),
                new Invoice("Kwik-E-Mart", "Homer", Arrays.asList(
                        new InvoiceItem("Beer"),
                        new InvoiceItem("Chips"))),
                new Invoice("Moe", "Marge", Arrays.asList(
                        new InvoiceItem("Beer"))),
                new Invoice("Kwik-E-Mart", "Bart", Arrays.asList(
                        new InvoiceItem("Coke"),
                        new InvoiceItem("Chips"))),
                new Invoice("Kwik-E-Mart", "Marge", Arrays.asList(
                        new InvoiceItem("Cake"),
                        new InvoiceItem("Corn Flakes"))),
                new Invoice("Moe", "Homer", Arrays.asList(
                        new InvoiceItem("Beer"))),
                new Invoice("Flander's Left-Handed Store", "Marge", Arrays.asList(
                        new InvoiceItem("Left-Handed Scissors")))
        );
    }
}
