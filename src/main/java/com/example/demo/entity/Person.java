package com.example.demo.entity;

public class Person {

    private Integer id;

    private String personName;
    private String personLastName;
    private String personGender;
    private Integer personAge;
    private String personPhoneNumber;

    public Person() {
    }

    public Person(Integer id, String personName, String personLastName, String personGender, Integer personAge, String personPhoneNumber) {
        this.id = id;
        this.personName = personName;
        this.personLastName = personLastName;
        this.personGender = personGender;
        this.personAge = personAge;
        this.personPhoneNumber = personPhoneNumber;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonLastName() {
        return personLastName;
    }

    public void setPersonLastName(String personLastName) {
        this.personLastName = personLastName;
    }

    public String getPersonGender() {
        return personGender;
    }

    public void setPersonGender(String personGender) {
        this.personGender = personGender;
    }

    public Integer getPersonAge() {
        return personAge;
    }

    public void setPersonAge(Integer personAge) {
        this.personAge = personAge;
    }

    public String getPersonPhoneNumber() {
        return personPhoneNumber;
    }

    public void setPersonPhoneNumber(String personPhoneNumber) {
        this.personPhoneNumber = personPhoneNumber;
    }
}
