package ru.ddc.registration.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ddc.registration.persistence.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);

    @Override
    void delete(Role role);

}