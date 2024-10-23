package com.crud.citas.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Specialist extends Client {

    private Long idSpecialist;
    private String specialist;

    public Specialist(Long idClient, String fullName, String phoneNumber, String email, Long idSpecialist, String specialist) {
        super(idClient, fullName, phoneNumber, email);
        this.idSpecialist = idSpecialist;
        this.specialist = specialist;
    }

    @Override
    public String toString() {
        return "Specialist{" +
                "idSpecialist=" + idSpecialist +
                ", specialist='" + specialist + '\'' +
                '}';
    }
}
