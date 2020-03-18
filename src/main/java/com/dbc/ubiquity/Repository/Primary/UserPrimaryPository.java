package com.dbc.ubiquity.Repository.Primary;

import com.dbc.ubiquity.Entity.Primary.PUbiquityUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserPrimaryPository extends JpaRepository<PUbiquityUserEntity, Long> {
}
