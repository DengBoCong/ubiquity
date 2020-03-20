package com.dbc.ubiquity.Entity.Primary;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "UBIQUITY_ROLE", schema = "ubiquity", catalog = "")
public class PUbiquityRoleEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;
    private String name;
    private Byte sort;
    private String description;

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
    @Column(name = "name", nullable = false, length = 20, unique = true)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "sort", length = 2)
    public Byte getSort() {
        return sort;
    }

    public void setSort(Byte sort) {
        this.sort = sort;
    }

    @Basic
    @Column(name = "description", length = 100)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PUbiquityRoleEntity that = (PUbiquityRoleEntity) o;
        return id == that.id &&
                Objects.equals(name, that.name) &&
                Objects.equals(sort, that.sort) &&
                Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, sort, description);
    }

    public PUbiquityRoleEntity() { }

    public PUbiquityRoleEntity(String name, Byte sort, String description) {
        this.name = name;
        this.sort = sort;
        this.description = description;
    }
}
