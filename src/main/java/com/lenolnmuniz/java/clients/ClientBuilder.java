package com.lenolnmuniz.java.clients;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class ClientBuilder {

    private String firstName;
    private String middleName;
    private String lastName;
    private String fullName;
    private String cpf;
    private LocalDate birthday;
    private int age;
    private char gender;
    private String email;
    private String address;
    private String phone;

    public ClientBuilder withId(String firstName, String middleName, String lastName, String cpf, String birthday,
            char gender) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.fullName = firstName + " " + middleName + " " + lastName;
        this.cpf = cpf;
        this.birthday = LocalDate.parse(birthday, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this.age = defineAge();
        this.gender = gender;

        return this;
    }

    public ClientBuilder withContacts(String email, String address, String phone) {
        this.email = email;
        this.address = address;
        this.phone = phone;
        return this;
    }

    private int defineAge() {
        return Period.between(birthday, LocalDate.now()).getYears();
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    private String treatmentGender() {
        if (getGender() == 'M') {
            return "Sr.";
        } else if (getGender() == 'F') {
            return "Sra.";
        } else {
            return "";
        }
    }

    public String toStringId() {
        return "Os dados pessoais são: Nome Completo: " + treatmentGender() + " " + getFullName() +
                ", com CPF " + getCpf() +
                ", data de nascimento " + getBirthday().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) +
                " com idade de " + getAge();
    }

    public String toStringContacts() {
        return "Os dados do contato são: Email: " + getEmail() +
                ", endereço: " + getAddress() +
                ", e telefone: " + getPhone();
    }
}
