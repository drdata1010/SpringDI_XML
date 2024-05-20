package com.learning.beans;

public class Student {
    private String name;
    private String rollno;
    private String email;
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void display(){
        System.out.println("Name : " + name + " Roll no : " + rollno + " Email : " + email + " Address : " +address);
    }
}
