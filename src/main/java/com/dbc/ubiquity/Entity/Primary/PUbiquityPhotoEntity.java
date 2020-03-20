package com.dbc.ubiquity.Entity.Primary;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "UBIQUITY_PHOTO", schema = "ubiquity", catalog = "")
public class PUbiquityPhotoEntity {
    private int id;
    private String address;
    private String photoName;
    private byte type;
    private int userId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "photoName")
    public String getPhotoName() {
        return photoName;
    }

    public void setPhotoName(String photoName) {
        this.photoName = photoName;
    }

    @Basic
    @Column(name = "type")
    public byte getType() {
        return type;
    }

    public void setType(byte type) {
        this.type = type;
    }

    @Basic
    @Column(name = "userId")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PUbiquityPhotoEntity that = (PUbiquityPhotoEntity) o;
        return id == that.id &&
                type == that.type &&
                userId == that.userId &&
                Objects.equals(address, that.address) &&
                Objects.equals(photoName, that.photoName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, address, photoName, type, userId);
    }
}
