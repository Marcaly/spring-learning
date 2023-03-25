package com.coursespring.springas.repositories;

import com.coursespring.springas.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
