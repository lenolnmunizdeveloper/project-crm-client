package com.lenolnmuniz.java.clients;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ClientTest {

    public Client client;

    @Before
    public void setUp() throws ParseException {
        client = new Client("Carlos", "Rafael da", "Silva", "555.666.777-88", "07/04/1988", 'M', "carlos@carlos.com", "Rua Tal, 456", "(31) 98765-4321");
    }

    @Test
    public void testGetFirstName() {
        assertEquals(client.getFirstName(), "Carlos");
    }

    @Test
    public void testSetFirstName() {
        client.setFirstName("Roberto");
        assertEquals(client.getFirstName(), "Roberto");
    }

    @Test
    public void testGetMiddleName() {
        assertEquals(client.getMiddleName(), "Rafael da");
    }

    @Test
    public void testSetMiddleName() {
        client.setMiddleName("Frederico");
        assertEquals(client.getMiddleName(), "Frederico");
    }

    @Test
    public void testGetLastName() {
        assertEquals(client.getLastName(), "Silva");
    }

    @Test
    public void testSetLastName() {
        client.setLastName("Pereira");
        assertEquals(client.getLastName(), "Pereira");
    }

    @Test
    public void testGetFullName() {
        assertEquals(client.getFullName(), "Carlos Rafael da Silva");
    }

    @Test
    public void testSetFullName() {
        client.setFullName("Roberto Frederico Pereira");
        assertEquals(client.getFullName(), "Roberto Frederico Pereira");
    }

    @Test
    public void testGetCpf() {
        assertEquals(client.getCpf(), "555.666.777-88");
    }

    @Test
    public void testSetCpf() {
        client.setCpf("999.888.777-66");
        assertEquals(client.getCpf(), "999.888.777-66");
    }

    @Test
    public void testGetBirthday() {
        assertEquals(client.getBirthday(), LocalDate.parse("07/04/1988", DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }

    @Test
    public void testSetBirthday() {
        client.setBirthday(LocalDate.parse("02/02/2002", DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        assertEquals(client.getBirthday(), LocalDate.parse("02/02/2002", DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }

    @Test
    public void testGetAge() {
        assertTrue(client.getAge() >= 0);
    }

    @Test
    public void testSetAge() {
        client.setAge(35);
        assertEquals(client.getAge(), 35);
    }

    @Test
    public void testGetGender() {
        assertEquals(client.getGender(), 'M');
    }

    @Test
    public void testSetGender() {
        client.setGender('F');
        assertEquals(client.getGender(), 'F');
    }

    @Test
    public void testGetEmail() {
        assertEquals(client.getEmail(), "carlos@carlos.com");
    }

    @Test
    public void testSetEmail() {
        client.setEmail("roberto@roberto.com");
        assertEquals(client.getEmail(), "roberto@roberto.com");
    }

    @Test
    public void testGetAddress() {
        assertEquals(client.getAddress(), "Rua Tal, 456");
    }

    @Test
    public void testSetAddress() {
        client.setAddress("Rua Tal, 789");
        assertEquals(client.getAddress(), "Rua Tal, 789");
    }

    @Test
    public void testGetPhone() {
        assertEquals(client.getPhone(), "(31) 98765-4321");
    }

    @Test
    public void testSetPhone() {
        client.setPhone("(32) 91654-9870");
        assertEquals(client.getPhone(), "(32) 91654-9870");
    }

    @Test
    public void testTestToString() {
        assertNotNull(client.toString());
    }

    @After
    public void tearDown() {
        client = null;
    }

}