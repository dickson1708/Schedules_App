package com.crud.citas.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter @Setter
public class Appointment {

    private Client client;
    private Specialist specialist;
    private Date dateAndHour;
    private State state;

    public Appointment(Client client, Specialist specialist, Date date, State state) {
        this.client = client;
        this.specialist = specialist;
        this.dateAndHour = date;
        this.state = state;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "client=" + client +
                ", specialist=" + specialist +
                ", dateAndHour=" + dateAndHour +
                ", state=" + state +
                '}';
    }
}
