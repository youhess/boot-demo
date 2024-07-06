package com.tutorial.boot_demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {


    List<User> findByName(String name); // 自动配置，不需要手写sql/ 复杂的情况下才需要手写
}
