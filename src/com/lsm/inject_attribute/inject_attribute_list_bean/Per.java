package com.lsm.inject_attribute.inject_attribute_list_bean;

public class Per {
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
        return "Per{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
