package org.example.exercise7;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Exercise7UserRepository
        extends JpaRepository<Exercise7User, Long> {

    List<Exercise7User> findByName(String name);
}