package com.vincent.gestiondestock.repository;


import com.vincent.gestiondestock.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {
}
