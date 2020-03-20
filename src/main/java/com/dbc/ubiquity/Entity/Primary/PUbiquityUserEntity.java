package com.dbc.ubiquity.Entity.Primary;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "UBIQUITY_USER", schema = "ubiquity", catalog = "")
public class PUbiquityUserEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;
    private String account;
    private String password;
    private String userName;
    private String idCard;
    private byte loginStatus;
    private int regTime;
    private int updTime;
    private byte realStatus;
    private byte role;
//    @Transient
//    @ManyToMany(fetch = FetchType.EAGER)//立即从数据库加载数据
//    @JoinTable(name = "UBIQUITY_USER_ROLE", joinColumns = { @JoinColumn(name = "uid") }, inverseJoinColumns ={@JoinColumn(name = "roleId") })
//    private List<PUbiquityRoleEntity> roles;
    private String email;
    private String avatar;
    private String backCard;
    private String frontCard;
    private int loginTime;
    private String qq;
    private String weChat;
    private int province;
    private int city;
    private int district;
    private String address;
    private int country;
    private byte sex;
    private int birthday;

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
    @Column(name = "account", nullable = false, unique = true, length = 20)
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    @Basic
    @Column(name = "password", nullable = false, length = 100)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "userName", length = 30)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "idCard", length = 20)
    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    @Basic
    @Column(name = "loginStatus", nullable = false, length = 1)
    public byte getLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(byte loginStatus) {
        this.loginStatus = loginStatus;
    }

    @Basic
    @Column(name = "regTime", nullable = false, length = 11)
    public int getRegTime() {
        return regTime;
    }

    public void setRegTime(int regTime) {
        this.regTime = regTime;
    }

    @Basic
    @Column(name = "updTime", nullable = false, length = 11)
    public int getUpdTime() {
        return updTime;
    }

    public void setUpdTime(int updTime) {
        this.updTime = updTime;
    }

    @Basic
    @Column(name = "realStatus", nullable = false, length = 1)
    public byte getRealStatus() {
        return realStatus;
    }

    public void setRealStatus(byte realStatus) {
        this.realStatus = realStatus;
    }

    @Basic
    @Column(name = "role", nullable = false, length = 1)
    public byte getRole() {
        return role;
    }

    public void setRole(byte role) {
        this.role = role;
    }

    @Basic
    @Column(name = "email", unique = true, length = 60)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "avatar", length = 1000)
    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Basic
    @Column(name = "backCard", length = 1000)
    public String getBackCard() {
        return backCard;
    }

    public void setBackCard(String backCard) {
        this.backCard = backCard;
    }

    @Basic
    @Column(name = "frontCard", length = 1000)
    public String getFrontCard() {
        return frontCard;
    }

    public void setFrontCard(String frontCard) {
        this.frontCard = frontCard;
    }

    @Basic
    @Column(name = "loginTime", length = 11)
    public Integer getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Integer loginTime) {
        this.loginTime = loginTime;
    }

    @Basic
    @Column(name = "qq", length = 20)
    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    @Basic
    @Column(name = "weChat", length = 20)
    public String getWeChat() {
        return weChat;
    }

    public void setWeChat(String weChat) {
        this.weChat = weChat;
    }

    @Basic
    @Column(name = "province", nullable = false, length = 11)
    public int getProvince() {
        return province;
    }

    public void setProvince(int province) {
        this.province = province;
    }

    @Basic
    @Column(name = "city", nullable = false, length = 11)
    public int getCity() {
        return city;
    }

    public void setCity(int city) {
        this.city = city;
    }

    @Basic
    @Column(name = "district", nullable = false, length = 11)
    public int getDistrict() {
        return district;
    }

    public void setDistrict(int district) {
        this.district = district;
    }

    @Basic
    @Column(name = "address", nullable = false, length = 255)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "country", nullable = false, length = 11)
    public int getCountry() {
        return country;
    }

    public void setCountry(int country) {
        this.country = country;
    }

    @Basic
    @Column(name = "sex", nullable = false, length = 1)
    public byte getSex() {
        return sex;
    }

    public void setSex(byte sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "birthday", nullable = false, length = 11)
    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

//    @Transient
//    public List<PUbiquityRoleEntity> getRoles() {
//        return roles;
//    }
//
//    public void setRoles(List<PUbiquityRoleEntity> roles) {
//        this.roles = roles;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PUbiquityUserEntity that = (PUbiquityUserEntity) o;
        return id == that.id &&
                loginStatus == that.loginStatus &&
                regTime == that.regTime &&
                updTime == that.updTime &&
                realStatus == that.realStatus &&
                role == that.role &&
                province == that.province &&
                city == that.city &&
                district == that.district &&
                country == that.country &&
                sex == that.sex &&
                birthday == that.birthday &&
                Objects.equals(account, that.account) &&
                Objects.equals(password, that.password) &&
                Objects.equals(userName, that.userName) &&
                Objects.equals(idCard, that.idCard) &&
                Objects.equals(email, that.email) &&
                Objects.equals(avatar, that.avatar) &&
                Objects.equals(backCard, that.backCard) &&
                Objects.equals(frontCard, that.frontCard) &&
                Objects.equals(loginTime, that.loginTime) &&
                Objects.equals(qq, that.qq) &&
                Objects.equals(weChat, that.weChat) &&
                Objects.equals(address, that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, account, password, userName, idCard, loginStatus, regTime, updTime, realStatus, role, email, avatar, backCard, frontCard, loginTime, qq, weChat, province, city, district, address, country, sex, birthday);
    }

    public PUbiquityUserEntity() {
    }

    public PUbiquityUserEntity(String account, String password, String userName, String idCard, byte loginStatus, int regTime, int updTime, byte realStatus, byte role, String email, String avatar, String backCard, String frontCard, int loginTime, String qq, String weChat, int province, int city, int district, String address, int country, byte sex, int birthday) {
        this.account = account;
        this.password = password;
        this.userName = userName;
        this.idCard = idCard;
        this.loginStatus = loginStatus;
        this.regTime = regTime;
        this.updTime = updTime;
        this.realStatus = realStatus;
        this.role = role;
        this.email = email;
        this.avatar = avatar;
        this.backCard = backCard;
        this.frontCard = frontCard;
        this.loginTime = loginTime;
        this.qq = qq;
        this.weChat = weChat;
        this.province = province;
        this.city = city;
        this.district = district;
        this.address = address;
        this.country = country;
        this.sex = sex;
        this.birthday = birthday;
    }
}
