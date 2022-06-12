package com.main.databinding.model;

public class ModelClass {
    String Name;
    String Age;

    public ModelClass(String name, String age) {
        Name = name;
        Age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }

    @Override
    public String toString() {
        return "ModelClass{" +
                "Name='" + Name + '\'' +
                ", Age='" + Age + '\'' +
                '}';
    }
}
