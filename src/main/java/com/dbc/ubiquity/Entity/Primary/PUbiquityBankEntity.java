package com.dbc.ubiquity.Entity.Primary;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "UBIQUITY_BANK", schema = "ubiquity", catalog = "")
public class PUbiquityBankEntity {
    private int id;
    private String account;
    private String bankName;
    private String userName;
    private String phone;
    private String idCard;
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
    @Column(name = "account")
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    @Basic
    @Column(name = "bankName")
    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    @Basic
    @Column(name = "userName")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "idCard")
    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
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
        PUbiquityBankEntity that = (PUbiquityBankEntity) o;
        return id == that.id &&
                userId == that.userId &&
                Objects.equals(account, that.account) &&
                Objects.equals(bankName, that.bankName) &&
                Objects.equals(userName, that.userName) &&
                Objects.equals(phone, that.phone) &&
                Objects.equals(idCard, that.idCard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, account, bankName, userName, phone, idCard, userId);
    }
}
