package com.lsm.inject_attribute_null;

public class TeaTest {
    private String name;
    private String age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "TeaTest{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
