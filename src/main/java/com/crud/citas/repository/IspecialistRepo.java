package com.crud.citas.repository;

import com.crud.citas.model.Specialist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IspecialistRepo extends JpaRepository<Specialist, Long> {
}
