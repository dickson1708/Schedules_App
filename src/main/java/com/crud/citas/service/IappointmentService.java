package com.crud.citas.service;

import com.crud.citas.model.Appointment;

import java.util.List;

public interface IappointmentService {

    public List<Appointment> viewAppointments();
    public Appointment findAppointment(Long id);

}