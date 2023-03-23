package ru.ddc.registration.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ddc.registration.persistence.model.NewLocationToken;
import ru.ddc.registration.persistence.model.UserLocation;

public interface NewLocationTokenRepository extends JpaRepository<NewLocationToken, Long> {

    NewLocationToken findByToken(String token);

    NewLocationToken findByUserLocation(UserLocation userLocation);

}