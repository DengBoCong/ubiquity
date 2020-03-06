package com.dbc.ubiquity.Repository.Secondary;

import com.dbc.ubiquity.Entity.Secondary.Userq;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserSecondaryPository extends JpaRepository<Userq, Long> {
    Userq findById(long id);

    Userq findByUserName(String userName);

    Userq findByUserNameOrEmail(String username, String email);
}
