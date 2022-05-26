package com.vincent.gestiondestock.repository;


import com.vincent.gestiondestock.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
