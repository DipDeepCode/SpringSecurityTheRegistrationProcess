package ru.ddc.registration.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ddc.registration.persistence.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);

    @Override
    void delete(User user);

}