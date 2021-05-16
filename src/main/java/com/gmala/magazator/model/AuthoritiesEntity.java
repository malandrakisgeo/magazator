package com.gmala.magazator.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "authorities", schema = "mvcjsp", catalog = "")
public class AuthoritiesEntity {
    private int idauthorities;
    private String username;
    private Role authority;


    @Id
    @Column(name = "idauthorities")
    public int getIdauthorities() {
        return idauthorities;
    }

    public void setIdauthorities(int idauthorities) {
        this.idauthorities = idauthorities;
    }

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "authority")
    public String getAuthority() {
        return authority.name();
    }

    public void setAuthority(String authority) {
        this.authority = Role.valueOf(authority);
    }

    public void setAuthority(Role authority) {
        this.authority = authority;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AuthoritiesEntity that = (AuthoritiesEntity) o;
        return idauthorities == that.idauthorities && Objects.equals(username, that.username) && Objects.equals(authority, that.authority);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idauthorities, username, authority);
    }
}
