package com.example.Bil.Genration.model;

import jakarta.persistence.*;

@Entity
@Table(name = "product")


public class Product {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @Column(name = "Name")
    private String name;


    @Column(name = "price")
    private int price;


    @Column(name = "Gst")
    private double gst;

    @Column(name = "Quantity")
    private int quantity;

    private int newstock;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public double getGst() {
        return gst;
    }

    public void setGst(double gst) {
        this.gst = gst;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getNewstock() {
        return newstock;
    }

    public void setNewstock(int newstock) {
        this.newstock = newstock;
    }
}




