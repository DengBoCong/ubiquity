package com.dbc.ubiquity.Entity.Primary;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "UBIQUITY_USER_ROLE", schema = "ubiquity", catalog = "")
public class PUbiquityUserRoleEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;
    private String account;
    private String name;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "account", length = 20)
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    @Basic
    @Column(name = "name", length = 20)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PUbiquityUserRoleEntity that = (PUbiquityUserRoleEntity) o;
        return id == that.id &&
                account == that.account &&
                name == that.name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, account, name);
    }

    public PUbiquityUserRoleEntity() { }

    public PUbiquityUserRoleEntity(String account, String name) {
        this.account = account;
        this.name = name;
    }
}
