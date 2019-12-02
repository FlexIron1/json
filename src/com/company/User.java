package com.company;

import java.util.List;

public class User {
    private String name;
    private String firstName;
    int age;
    private List<String> address;
    private List<String>phone;

    public User() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public List<String> getAddress() {
        return address;
    }

    public void setAddress(List<String> address) {
        this.address = address;
    }

    public List<String> getPhone() {
        return phone;
    }

    public void setPhone(List<String> phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
               "name='" + name + '\'' +
               ", firstName='" + firstName + '\'' +
               ", address=" + address +
               ", phone=" + phone +
               '}';
    }
}
