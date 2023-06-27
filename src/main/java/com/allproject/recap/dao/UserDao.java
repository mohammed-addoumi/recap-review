package com.allproject.recap.dao;

import com.allproject.recap.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Long> {
}
