package com.gmala.magazator.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "products", schema = "mvcjsp", catalog = "")
public class ProductEntity {
    private int id;
    private String name;
    private int stock;
    private double priceX;
    private double priceL;
    private Date dateAdded;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "stock")
    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Basic
    @Column(name = "priceX")
    public double getPriceX() {
        return priceX;
    }

    public void setPriceX(double priceX) {
        this.priceX = priceX;
    }

    @Basic
    @Column(name = "priceL")
    public double getPriceL() {
        return priceL;
    }

    public void setPriceL(double priceL) {
        this.priceL = priceL;
    }

    @Basic
    @Column(name = "date_added")
    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductEntity that = (ProductEntity) o;
        return id == that.id && stock == that.stock && Double.compare(that.priceX, priceX) == 0 && Double.compare(that.priceL, priceL) == 0 && Objects.equals(name, that.name) && Objects.equals(dateAdded, that.dateAdded);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, stock, priceX, priceL, dateAdded);
    }
}
