package br.com.example.springsecurity.repository;

import br.com.example.springsecurity.entity.Role;
import br.com.example.springsecurity.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByEmail(String email);
    User findByRole(Role role);
}
