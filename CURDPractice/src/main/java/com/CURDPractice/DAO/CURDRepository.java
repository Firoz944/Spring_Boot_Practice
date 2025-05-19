package com.CURDPractice.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CURDPractice.entity.User;

public interface CURDRepository extends JpaRepository<User, Long> {

}
