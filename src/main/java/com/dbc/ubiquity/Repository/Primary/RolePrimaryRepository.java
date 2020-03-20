package com.dbc.ubiquity.Repository.Primary;

import com.dbc.ubiquity.Entity.Primary.PUbiquityRoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolePrimaryRepository extends JpaRepository<PUbiquityRoleEntity, Integer> {
}
