package ru.ddc.registration.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ddc.registration.persistence.model.User;
import ru.ddc.registration.persistence.model.UserLocation;

public interface UserLocationRepository extends JpaRepository<UserLocation, Long> {
    UserLocation findByCountryAndUser(String country, User user);

}