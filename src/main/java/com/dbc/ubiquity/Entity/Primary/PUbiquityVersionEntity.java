package com.dbc.ubiquity.Entity.Primary;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "UBIQUITY_VERSION", schema = "ubiquity", catalog = "")
public class PUbiquityVersionEntity {
    private int id;
    private String version;
    private int updTime;
    private String download;
    private String description;
    private byte type;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "version")
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Basic
    @Column(name = "updTime")
    public int getUpdTime() {
        return updTime;
    }

    public void setUpdTime(int updTime) {
        this.updTime = updTime;
    }

    @Basic
    @Column(name = "download")
    public String getDownload() {
        return download;
    }

    public void setDownload(String download) {
        this.download = download;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "type")
    public byte getType() {
        return type;
    }

    public void setType(byte type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PUbiquityVersionEntity that = (PUbiquityVersionEntity) o;
        return id == that.id &&
                updTime == that.updTime &&
                type == that.type &&
                Objects.equals(version, that.version) &&
                Objects.equals(download, that.download) &&
                Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, version, updTime, download, description, type);
    }
}
