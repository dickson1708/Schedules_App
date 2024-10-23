package com.crud.citas.service;

import com.crud.citas.model.Appointment;
import com.crud.citas.model.Client;
import com.crud.citas.model.State;
import com.crud.citas.repository.IappointmentRepo;
import com.crud.citas.repository.IclientRepo;
import org.springframework.beans.factory.annotation.Autowired;

public class SpecialistService implements IspecialistService {

    @Autowired
    IappointmentRepo iappointmentRepo;
    @Autowired
    IclientRepo iclientRepo;

    @Override
    public void attendAppointment(Long id) {
        Appointment appointment = iappointmentRepo.findById(id).orElse(null);
        if ( appointment != null) {
            appointment.setState(State.ATTENDED);
        } else {
            throw new RuntimeException("The scheduled is not finded.");
        }
    }

    @Override
    public void createClient(Client client) {
        iclientRepo.save(client);
    }

    @Override
    public void deleteClient(Long id) {
        iclientRepo.findById(id);
    }

    @Override
    public void newAppointment(Appointment appointment) {
        iappointmentRepo.save(appointment);
    }

    @Override
    public void editAppointment(Long id, Appointment newAppointment) {
        iappointmentRepo.findById(id);
        iappointmentRepo.save(newAppointment);
    }

    @Override
    public void deleteAppointment(Long id) {
        iappointmentRepo.deleteById(id);
    }
}
