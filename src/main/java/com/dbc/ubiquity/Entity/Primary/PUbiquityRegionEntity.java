package com.dbc.ubiquity.Entity.Primary;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "UBIQUITY_REGION", schema = "ubiquity", catalog = "")
public class PUbiquityRegionEntity {
    private short id;
    private short parentId;
    private String regionName;
    private byte regionType;

    @Id
    @Column(name = "id")
    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    @Basic
    @Column(name = "parent_id")
    public short getParentId() {
        return parentId;
    }

    public void setParentId(short parentId) {
        this.parentId = parentId;
    }

    @Basic
    @Column(name = "region_name")
    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    @Basic
    @Column(name = "region_type")
    public byte getRegionType() {
        return regionType;
    }

    public void setRegionType(byte regionType) {
        this.regionType = regionType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PUbiquityRegionEntity that = (PUbiquityRegionEntity) o;
        return id == that.id &&
                parentId == that.parentId &&
                regionType == that.regionType &&
                Objects.equals(regionName, that.regionName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, parentId, regionName, regionType);
    }
}
