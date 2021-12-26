package com.example.shop.repository;

import com.example.shop.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User,String>, JpaSpecificationExecutor<User> {
    @Query(value = "select t.userid,t.username from USERINFO t",nativeQuery = true)
    public List<User> getAll();
}