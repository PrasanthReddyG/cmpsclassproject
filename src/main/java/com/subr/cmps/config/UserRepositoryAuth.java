package com.subr.cmps.config;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepositoryAuth extends JpaRepository<UserTable, Integer> {

	UserTable findByUsername(String username);
}
