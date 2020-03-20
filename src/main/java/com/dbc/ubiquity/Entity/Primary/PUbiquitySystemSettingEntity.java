package com.dbc.ubiquity.Entity.Primary;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "UBIQUITY_SYSTEM_SETTING", schema = "ubiquity", catalog = "")
public class PUbiquitySystemSettingEntity {
    private int id;
    private byte isLogin;
    private byte isLoginApp;
    private String systemName;
    private String systemVersion;
    private byte isNew;
    private String appDownload;
    private String description;
    private Byte isClose;
    private String closeResult;
    private byte language;
    private String icpNum;
    private int updTime;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "isLogin")
    public byte getIsLogin() {
        return isLogin;
    }

    public void setIsLogin(byte isLogin) {
        this.isLogin = isLogin;
    }

    @Basic
    @Column(name = "isLoginApp")
    public byte getIsLoginApp() {
        return isLoginApp;
    }

    public void setIsLoginApp(byte isLoginApp) {
        this.isLoginApp = isLoginApp;
    }

    @Basic
    @Column(name = "systemName")
    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    @Basic
    @Column(name = "systemVersion")
    public String getSystemVersion() {
        return systemVersion;
    }

    public void setSystemVersion(String systemVersion) {
        this.systemVersion = systemVersion;
    }

    @Basic
    @Column(name = "isNew")
    public byte getIsNew() {
        return isNew;
    }

    public void setIsNew(byte isNew) {
        this.isNew = isNew;
    }

    @Basic
    @Column(name = "appDownload")
    public String getAppDownload() {
        return appDownload;
    }

    public void setAppDownload(String appDownload) {
        this.appDownload = appDownload;
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
    @Column(name = "isClose")
    public Byte getIsClose() {
        return isClose;
    }

    public void setIsClose(Byte isClose) {
        this.isClose = isClose;
    }

    @Basic
    @Column(name = "closeResult")
    public String getCloseResult() {
        return closeResult;
    }

    public void setCloseResult(String closeResult) {
        this.closeResult = closeResult;
    }

    @Basic
    @Column(name = "language")
    public byte getLanguage() {
        return language;
    }

    public void setLanguage(byte language) {
        this.language = language;
    }

    @Basic
    @Column(name = "icpNum")
    public String getIcpNum() {
        return icpNum;
    }

    public void setIcpNum(String icpNum) {
        this.icpNum = icpNum;
    }

    @Basic
    @Column(name = "updTime")
    public int getUpdTime() {
        return updTime;
    }

    public void setUpdTime(int updTime) {
        this.updTime = updTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PUbiquitySystemSettingEntity that = (PUbiquitySystemSettingEntity) o;
        return id == that.id &&
                isLogin == that.isLogin &&
                isLoginApp == that.isLoginApp &&
                isNew == that.isNew &&
                language == that.language &&
                updTime == that.updTime &&
                Objects.equals(systemName, that.systemName) &&
                Objects.equals(systemVersion, that.systemVersion) &&
                Objects.equals(appDownload, that.appDownload) &&
                Objects.equals(description, that.description) &&
                Objects.equals(isClose, that.isClose) &&
                Objects.equals(closeResult, that.closeResult) &&
                Objects.equals(icpNum, that.icpNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, isLogin, isLoginApp, systemName, systemVersion, isNew, appDownload, description, isClose, closeResult, language, icpNum, updTime);
    }
}
