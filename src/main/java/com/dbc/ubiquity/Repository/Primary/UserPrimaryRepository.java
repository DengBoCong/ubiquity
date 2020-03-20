package com.dbc.ubiquity.Repository.Primary;

import com.dbc.ubiquity.Entity.Primary.PUbiquityUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserPrimaryRepository extends JpaRepository<PUbiquityUserEntity, Integer> {
    @Query("select user from PUbiquityUserEntity user where user.account = :account")
    Optional<PUbiquityUserEntity> findByAccount(@Param("account") String account);
}
