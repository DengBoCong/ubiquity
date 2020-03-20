package com.dbc.ubiquity.Service;

import com.dbc.ubiquity.Entity.Primary.PUbiquityUserEntity;

import java.util.List;


public interface PUserService {
    public void addUser(PUbiquityUserEntity pUbiquityUserEntity);
    public List<PUbiquityUserEntity> getUserAll();
    public PUbiquityUserEntity getUserById(int id);
    public PUbiquityUserEntity getUserByAccount(String account);
}
