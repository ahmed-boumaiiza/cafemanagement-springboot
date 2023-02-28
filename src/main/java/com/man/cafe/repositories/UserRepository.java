package com.man.cafe.repositories;

import com.man.cafe.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmailId(@Param("email") String email);

}
