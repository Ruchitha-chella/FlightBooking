package com.booking.dao;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.booking.entities.Role;
import com.booking.entities.Roles;

public interface RoleRepository extends JpaRepository<Role, Integer>{
	Optional<Role> findByRoleName(Roles role);
}
