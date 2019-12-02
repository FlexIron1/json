package com.company;

import java.util.List;

public class Person {
    String name;
    String firstName;
    int age;
    List<Address> address;
    List<Phone> phone;

    public Person(String name, String firstName, int age, List<Address> address, List<Phone> phone) {
        this.name = name;
        this.firstName = firstName;
        this.age = age;
        this.address = address;
        this.phone = phone;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
               "name='" + name + '\'' +
               ", firstName='" + firstName + '\'' +
               ", age=" + age +
               ", address=" + address +
               ", phone=" + phone +
               '}';
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    public List<Phone> getPhone() {
        return phone;
    }

    public void setPhone(List<Phone> phone) {
        this.phone = phone;
    }
}

class Address {
    String city;
    String street;
    String Apartment;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getApartment() {
        return Apartment;
    }

    public void setApartment(String apartment) {
        Apartment = apartment;
    }
}

class Phone {
    String type;
    int number;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}


