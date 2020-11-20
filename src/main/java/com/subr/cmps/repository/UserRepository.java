package com.subr.cmps.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.subr.cmps.dao.UserDao;

@Repository
public interface UserRepository extends JpaRepository<UserDao, Long> {

	UserDao findByUserName(String userName);

}
