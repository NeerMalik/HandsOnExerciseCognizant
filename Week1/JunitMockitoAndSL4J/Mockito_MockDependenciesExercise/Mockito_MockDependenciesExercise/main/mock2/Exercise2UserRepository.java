package org.example.mock2;

import java.util.Optional;

public interface Exercise2UserRepository {

    Optional<Exercise2User> findById(Long id);
}