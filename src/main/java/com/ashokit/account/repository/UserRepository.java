package com.ashokit.account.repository;

import com.ashokit.account.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
    User findById(long id);
    /*public void updateUser(User user)*/;
    
}
