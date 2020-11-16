package com.udm.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udm.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
