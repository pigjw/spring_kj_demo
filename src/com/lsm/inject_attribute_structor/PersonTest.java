package com.lsm.inject_attribute_structor;

public class PersonTest {
    private String name;
    private int age;

    public PersonTest(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "PersonTest{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
