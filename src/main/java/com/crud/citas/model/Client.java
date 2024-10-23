package com.crud.citas.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Client {

    private Long idClient;
    private String fullName;
    private String phoneNumber;
    private String email;

    public Client(Long idClient, String fullName, String phoneNumber, String email) {
        this.idClient = idClient;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Client{" +
                "idClient=" + idClient +
                ", fullName='" + fullName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
