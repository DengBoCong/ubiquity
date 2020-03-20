package com.dbc.ubiquity.Entity.Primary;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "UBIQUITY_USER_ROLE", schema = "ubiquity", catalog = "")
public class PUbiquityUserRoleEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;
    private int uid;
    private int roleId;

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
    @Column(name = "uid", length = 11)
    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    @Basic
    @Column(name = "roleId", length = 11)
    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PUbiquityUserRoleEntity that = (PUbiquityUserRoleEntity) o;
        return id == that.id &&
                uid == that.uid &&
                roleId == that.roleId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, uid, roleId);
    }

    public PUbiquityUserRoleEntity() { }

    public PUbiquityUserRoleEntity(int uid, int roleId) {
        this.uid = uid;
        this.roleId = roleId;
    }
}
