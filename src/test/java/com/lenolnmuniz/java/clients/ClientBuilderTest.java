package com.lenolnmuniz.java.clients;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ClientBuilderTest extends TestCase {

    public ClientBuilder clientBuilder;

    @Before
    public void setUp() throws Exception {
        clientBuilder = new ClientBuilder().withId("Lenoln", "B A M", "Muniz", "111.222.333-44", "06/03/1997",
                'M');
    }

    public void testWithId() {
    }

    public void testWithContacts() {
    }

    public void testGetFirstName() {
    }

    public void testSetFirstName() {
    }

    public void testGetMiddleName() {
    }

    public void testSetMiddleName() {
    }

    public void testGetLastName() {
    }

    public void testSetLastName() {
    }

    public void testGetFullName() {
    }

    public void testSetFullName() {
    }

    @Test
    public void testGetCpf() {
        assertEquals(clientBuilder.getCpf(), "111.222.333-44");
    }

    @Test
    public void testSetCpf() {
        clientBuilder.setCpf("000.000.000-00");
        assertEquals(clientBuilder.getCpf(), "000.000.000-00");
    }

    public void testGetBithday() {
    }

    public void testSetBithday() {
    }

    public void testGetAge() {
    }

    public void testSetAge() {
    }

    public void testGetGender() {
    }

    public void testSetGender() {
    }

    public void testGetEmail() {
    }

    public void testSetEmail() {
    }

    public void testGetAddress() {
    }

    public void testSetAddress() {
    }

    public void testGetPhone() {
    }

    public void testSetPhone() {
    }

    public void testToStringId() {
    }

    public void testToStringContacts() {
    }

    @After
    public void tearDown() throws Exception {
        clientBuilder = null;
    }
}