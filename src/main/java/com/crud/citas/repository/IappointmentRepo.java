package com.crud.citas.repository;

import com.crud.citas.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IappointmentRepo extends JpaRepository<Appointment, Long> {
}
