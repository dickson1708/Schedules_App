package com.crud.citas.service;

import com.crud.citas.model.Appointment;
import com.crud.citas.repository.IappointmentRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AppointmentService implements IappointmentService {

    @Autowired
    IappointmentRepo iappointmentRepo;

    @Override
    public List<Appointment> viewAppointments() {
        return iappointmentRepo.findAll();
    }

    @Override
    public Appointment findAppointment(Long id) {
        return iappointmentRepo.findById(id).orElse(null);
    }
}
