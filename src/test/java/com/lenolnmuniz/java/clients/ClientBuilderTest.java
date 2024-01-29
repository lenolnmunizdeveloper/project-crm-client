package com.lenolnmuniz.java.clients;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ClientBuilderTest {

    public ClientBuilder clientBuilder;
    public ClientBuilder clientBuilder2;

    @Before
    public void setUp() throws Exception {
        clientBuilder = new ClientBuilder().withId("Lenoln", "B A M", "Muniz", "111.222.333-44", "06/03/1997", 'M');
        clientBuilder2 = new ClientBuilder().withId("John", "D E F", "Doe","123.456.789-01", "01/01/2000", 'M' );
    }

   @Test
    public void testWithId() {
        assertNotNull(clientBuilder.withId("Lenoln", "B A M", "Muniz", "111.222.333-44", "06/03/1997", 'M'));
        assertNotNull(clientBuilder2.withId("John", "D E F", "Doe","123.456.789-01", "01/01/2000", 'M' ));
    }

    @Test
    public void testWithContacts() {
        assertNotNull(clientBuilder.withContacts("lenoln@lenoln.com",
                "Rua tal, número 123, bairro Tal, cidade Tal/MG",
                "(31) 98922-2771"));
        assertNotNull(clientBuilder.withContacts("","",""));
    }

    @Test
    public void testGetFirstName() {
        assertEquals(clientBuilder.getFirstName(), "Lenoln");
    }

    @Test
    public void testSetFirstName() {
        clientBuilder.setFirstName("John");
        assertEquals(clientBuilder.getFirstName(), "John");
    }

    @Test
    public void testGetMiddleName() {
        assertEquals(clientBuilder.getMiddleName(), "B A M");
    }

    @Test
    public void testSetMiddleName() {
        clientBuilder.setMiddleName("D E F");
        assertEquals(clientBuilder.getMiddleName(), "D E F");
    }

    @Test
    public void testGetLastName() {
        assertEquals(clientBuilder.getLastName(), "Muniz");
    }

    @Test
    public void testSetLastName() {
        clientBuilder.setLastName("Doe");
        assertEquals(clientBuilder.getLastName(), "Doe");
    }

    @Test
    public void testGetFullName() {
        assertEquals(clientBuilder.getFullName(), "Lenoln B A M Muniz");
    }

    @Test
    public void testSetFullName() {
        clientBuilder.setFullName("John D E F Doe");
        assertEquals(clientBuilder.getFullName(), "John D E F Doe");
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

    @Test
    public void testGetBithday() {
        assertEquals(clientBuilder.getBirthday(), "06/03/1997");
    }

    @Test
    public void testSetBithday() {
        clientBuilder.setBirthday("01/01/2000");
        assertEquals(clientBuilder.getBirthday(), "01/01/2000");
    }

    @Test
    public void testGetAge() {
        assertTrue(clientBuilder.getAge() >= 0);
    }

    @Test
    public void testSetAge() {
        clientBuilder.setAge(30);
        assertEquals(clientBuilder.getAge(), 30);
    }

    @Test
    public void testGetGender() {
        assertEquals(clientBuilder.getGender(), 'M');
    }

    @Test
    public void testSetGender() {
        clientBuilder.setGender('F');
        assertEquals(clientBuilder.getGender(), 'F');
    }

    @Test
    public void testGetEmail() {
        assertNull(clientBuilder.getEmail());
    }

    @Test
    public void testSetEmail() {
        clientBuilder.setEmail("john.doe@joe.com");
        assertEquals(clientBuilder.getEmail(), "john.doe@joe.com");
    }

    @Test
    public void testGetAddress() {
        assertNull(clientBuilder.getAddress());
    }

    @Test
    public void testSetAddress() {
        clientBuilder.setAddress("Avenina Principal, 123");
        assertEquals(clientBuilder.getAddress(), "Avenina Principal, 123");
    }

    @Test
    public void testGetPhone() {
        assertNull(clientBuilder.getPhone());
    }

    @Test
    public void testSetPhone() {
        clientBuilder.setPhone("123-456-7890");
        assertEquals(clientBuilder.getPhone(), "123-456-7890");
    }

    @Test
    public void testToStringId() {
        assertNotNull(clientBuilder.toStringId());
    }

    @Test
    public void testToStringContacts() {
        assertNotNull(clientBuilder.toStringContacts());
    }

    @After
    public void tearDown() throws Exception {
        clientBuilder = null;
        clientBuilder2 = null;
    }

}