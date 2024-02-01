package com.lenolnmuniz.java;

import com.lenolnmuniz.java.clients.Client;
import com.lenolnmuniz.java.clients.ClientBuilder;

import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
        Client clientOne = new Client("Lenoln", "B A M", "Muniz", "111.222.333-44",
                "06/03/1997", 'M', "lenoln@lenoln.com", "Rua tal, número 123, bairro Tal, cidade Tal/MG",
                "(31) 98922-2771");

        System.out.println(clientOne.toString());

        ClientBuilder clientId = new ClientBuilder().withId("Lenoln", "B A M", "Muniz", "111.222.333-44", "17/02/1997",
                'M');

        System.out.println(clientId.toStringId());

        ClientBuilder clientContacts = new ClientBuilder().withContacts("lenoln@lenoln.com",
                "Rua tal, número 123, bairro Tal, cidade Tal/MG",
                "(31) 98922-2771");

        //System.out.println(clientContacts.toStringContacts());
    }
}

/*
 * Client(String firstName, String middleName, String lastName, String cpf,
 * String bithday,
 * char gender, String email, String address, String phone)
 */