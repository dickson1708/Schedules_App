package com.crud.citas.service;

import com.crud.citas.model.Client;

public interface IspecialistService extends IclientService {

    public void attendAppointment(Long id);
    public void createClient(Client client);
    public void deleteClient(Long id);

}
