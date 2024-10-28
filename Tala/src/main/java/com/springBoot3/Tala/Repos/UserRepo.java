package com.springBoot3.Tala.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springBoot3.Tala.models.User;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
