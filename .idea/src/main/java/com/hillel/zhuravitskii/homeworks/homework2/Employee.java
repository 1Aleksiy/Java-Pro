package com.hillel.zhuravitskii.homeworks.homework2;

public class Employee {
    private  String name;
    private  String email;
    private  String position;
    private  String phone;
    private  int age;

    public Employee(String name, String email, String position, String phone, int age) {
        this.name = name;
        this.email = email;
        this.position = position;
        this.phone = phone;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
