package com.crud.citas.service;

import com.crud.citas.model.Appointment;
import com.crud.citas.repository.IappointmentRepo;
import com.crud.citas.repository.IclientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService implements IclientService {

    @Autowired
    IclientRepo iclientRepo;
    @Autowired
    IappointmentRepo iappointmentRepo;

    @Override
    public void newAppointment(Appointment appointment) {
        iappointmentRepo.save(appointment);
    }

    @Override
    public void editAppointment(Long id, Appointment newAppointment) {
        iappointmentRepo.deleteById(id);
        iappointmentRepo.save(newAppointment);
    }

    @Override
    public void deleteAppointment(Long id) {
        iappointmentRepo.deleteById(id);
    }
}
