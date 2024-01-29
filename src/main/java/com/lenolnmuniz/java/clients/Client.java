package com.lenolnmuniz.java.clients;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Client {

    private String firstName;
    private String middleName;
    private String lastName;
    private String fullName;
    private String cpf;
    private String bithday;
    private int age;
    private char gender;
    private String email;
    private String address;
    private String phone;

    public Client(String firstName, String middleName, String lastName, String cpf, String bithday,
                 char gender, String email, String address, String phone) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.fullName = firstName +" "+ middleName+" "+lastName;
        this.cpf = cpf;
        this.bithday = bithday;
        this.age = defineAge();
        this.gender = gender;
        this.email = email;
        this.address = address;
        this.phone = phone;
    }

    private int defineAge() {
        int currentYear = restoreCurrentYear();
        int birthYear = restoreBirthYear();
        return currentYear - birthYear;
    }

    private int restoreBirthYear() {
        Calendar calendar = Calendar.getInstance();
        Date birthdayClient;
        try {
            birthdayClient = defineDateFormat("dd/MM/YYYY").parse(bithday);
        } catch (ParseException e){
            throw new RuntimeException(e);
        }
        calendar.setTime(birthdayClient);
        return calendar.get(Calendar.YEAR);
    }

    private int restoreCurrentYear(){
        Calendar calendar = Calendar.getInstance();
        Date today = new Date();
        calendar.setTime(today);
        return calendar.get(Calendar.YEAR);
    }

    private SimpleDateFormat defineDateFormat(String format){
        if("".equals(format)){
            return new SimpleDateFormat("dd/MM/yyyy");
        } else {
            return new SimpleDateFormat(format);
        }
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

    public String getBithday() {
        return bithday;
    }

    public void setBithday(String bithday) {
        this.bithday = bithday;
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

    private String treatmentGender(){
        if(getGender() == 'M'){
            return "Sr.";
        } else if (getGender() == 'F'){
            return "Sra.";
        } else {
            return "";
        }
    }

    @Override
    public String toString() {
        return treatmentGender() + " " + getFullName() +
                ", com CPF "+ getCpf() +
                ", data de nascimento "+ getBithday() +
                " com idade de "+ getAge() +
                ", email: " + getEmail() +
                ", endereço "+ getAddress() +
                " e telefone "+ getPhone();
    }

}
