package com.project.fayek.socialMedia.repository;

import com.project.fayek.socialMedia.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

   Optional<User> findByUserName(String username);
}