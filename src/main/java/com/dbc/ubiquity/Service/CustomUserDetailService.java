package com.dbc.ubiquity.Service;

import com.dbc.ubiquity.Entity.Primary.PUbiquityRoleEntity;
import com.dbc.ubiquity.Entity.Primary.PUbiquityUserEntity;
import com.dbc.ubiquity.Entity.Primary.PUbiquityUserRoleEntity;
import com.dbc.ubiquity.Repository.Primary.UserPrimaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CustomUserDetailService implements UserDetailsService {
    @Autowired
    private UserPrimaryRepository userPrimaryRepository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        PUbiquityUserEntity userEntity = userPrimaryRepository.findByAccount(s).orElse(null);
        if (userEntity == null) throw new UsernameNotFoundException(s + " not found");
        List<GrantedAuthority> authorities = new ArrayList<>();
        for (PUbiquityRoleEntity userRoleEntity : userEntity.getRoles()){
            authorities.add(new SimpleGrantedAuthority("ROLE_" + userRoleEntity.getName()));
        }
        User userDetails = new User(userEntity.getAccount(), userEntity.getPassword(), authorities);
        return userDetails;
    }
}
