package com.dbc.ubiquity.Service.Impl;

import com.dbc.ubiquity.Entity.Primary.PUbiquityUserEntity;
import com.dbc.ubiquity.Repository.Primary.UserPrimaryPository;
import com.dbc.ubiquity.Service.PUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional(rollbackFor = Exception.class)
public class PUserServiceImpl implements PUserService {
    @Autowired
    UserPrimaryPository userPrimaryPository;

    @Override
    public void addUser(PUbiquityUserEntity pUbiquityUserEntity) {
        userPrimaryPository.save(pUbiquityUserEntity);
    }
}
