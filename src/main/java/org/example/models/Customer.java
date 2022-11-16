package org.example.models;

public class Customer {
    private String nationalId;
    private int age;
    private String firstName;
    private String lastName;
    public Customer(){}

    public Customer(String nationalId, int age, String firstName, String lastName) {
        this.nationalId = nationalId;
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
