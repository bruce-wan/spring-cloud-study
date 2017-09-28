package com.catalpa.example.repository;

import com.catalpa.example.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by wanchuan on 2017/9/27.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
