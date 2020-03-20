package com.dbc.ubiquity.Service.Impl;

import com.dbc.ubiquity.Entity.Primary.PUbiquityUserEntity;
import com.dbc.ubiquity.Repository.Primary.UserPrimaryPository;
import com.dbc.ubiquity.Service.PUserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional(rollbackFor = Exception.class)
public class PUserServiceImpl implements PUserService {
    @Autowired
    UserPrimaryPository userPrimaryPository;

    @Override
    public void addUser(PUbiquityUserEntity pUbiquityUserEntity) {
        userPrimaryPository.save(pUbiquityUserEntity);
    }

    @Override
    public List<PUbiquityUserEntity> getUserAll() {
        return userPrimaryPository.findAll(Sort.by(Sort.Direction.ASC, "id"));
    }

    @Override
    public PUbiquityUserEntity getUserById(int id) {
        return userPrimaryPository.findById(id).orElse(null);
    }

    @Override
    public PUbiquityUserEntity getUserByAccount(String account) {
        return userPrimaryPository.findByAccount(account).orElse(null);
    }
}
