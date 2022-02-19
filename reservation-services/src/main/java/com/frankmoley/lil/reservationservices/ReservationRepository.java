package com.frankmoley.lil.reservationservices;

import org.springframework.data.repository.CrudRepository;

public interface ReservationRepository extends CrudRepository<Reservation, Long> {
}
