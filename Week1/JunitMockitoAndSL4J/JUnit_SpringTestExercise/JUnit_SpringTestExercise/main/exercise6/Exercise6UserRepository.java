package org.example.exercise6;

import java.util.Optional;

public interface Exercise6UserRepository {

    Optional<Exercise6User> findById(Long id);
}