package org.example.mock2;

public class Exercise2UserService {

    private final Exercise2UserRepository repository;

    public Exercise2UserService(
            Exercise2UserRepository repository) {
        this.repository = repository;
    }

    public Exercise2User getUserById(Long id) {
        return repository.findById(id)
                .orElse(null);
    }
}