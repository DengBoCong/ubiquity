package com.dbc.ubiquity.Repository.Primary;

import com.dbc.ubiquity.Entity.Primary.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserPrimaryPository extends JpaRepository<User, Long> {
    User findById(long id);
    User findByUserName(String userName);
    User findByUserNameOrEmail(String username, String email);
}
