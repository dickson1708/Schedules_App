package com.crud.citas.service;

import com.crud.citas.model.Appointment;

public interface IclientService {

    public void newAppointment(Appointment appointment);
    public void editAppointment(Long id, Appointment newAppointment);
    public void deleteAppointment(Long id);

}
