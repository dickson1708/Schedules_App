package com.crud.citas.repository;

import com.crud.citas.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IclientRepo extends JpaRepository<Client, Long> {
}
