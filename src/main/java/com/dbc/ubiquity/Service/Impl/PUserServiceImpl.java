package com.dbc.ubiquity.Service.Impl;

import com.dbc.ubiquity.Entity.Primary.PUbiquityUserEntity;
import com.dbc.ubiquity.Repository.Primary.UserPrimaryRepository;
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
    UserPrimaryRepository userPrimaryRepository;

    @Override
    public void addUser(PUbiquityUserEntity pUbiquityUserEntity) {
        userPrimaryRepository.save(pUbiquityUserEntity);
    }

    @Override
    public List<PUbiquityUserEntity> getUserAll() {
        return userPrimaryRepository.findAll(Sort.by(Sort.Direction.ASC, "id"));
    }

    @Override
    public PUbiquityUserEntity getUserById(int id) {
        return userPrimaryRepository.findById(id).orElse(null);
    }

    @Override
    public PUbiquityUserEntity getUserByAccount(String account) {
        return userPrimaryRepository.findByAccount(account).orElse(null);
    }
}
