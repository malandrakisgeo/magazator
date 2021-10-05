package com.gmala.magazator.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "orders", schema = "mvcjsp", catalog = "")
public class OrdersEntity {
    private int id;
    private Date dateAdded;
    private Date dateShipped;
    private Date dateCompleted;
    private String details;
    private String shippingAddress;
    private int userId;
    private UsersEntity usersByUserId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "dateAdded")
    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    @Basic
    @Column(name = "dateShipped")
    public Date getDateShipped() {
        return dateShipped;
    }

    public void setDateShipped(Date dateShipped) {
        this.dateShipped = dateShipped;
    }

    @Basic
    @Column(name = "dateCompleted")
    public Date getDateCompleted() {
        return dateCompleted;
    }

    public void setDateCompleted(Date dateCompleted) {
        this.dateCompleted = dateCompleted;
    }

    @Basic
    @Column(name = "details")
    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Basic
    @Column(name = "shippingAddress")
    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrdersEntity that = (OrdersEntity) o;
        return id == that.id && Objects.equals(dateAdded, that.dateAdded) && Objects.equals(dateShipped, that.dateShipped) && Objects.equals(dateCompleted, that.dateCompleted) && Objects.equals(details, that.details) && Objects.equals(shippingAddress, that.shippingAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dateAdded, dateShipped, dateCompleted, details, shippingAddress);
    }

    @Basic
    @Column(name = "userId")
    public int getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @ManyToOne
    @JoinColumn(name = "userId", referencedColumnName = "id", nullable = false)
    public UsersEntity getUsersByUserId() {
        return usersByUserId;
    }

    public void setUsersByUserId(UsersEntity usersByUserId) {
        this.usersByUserId = usersByUserId;
    }
}
