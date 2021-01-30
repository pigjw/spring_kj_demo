package com.lsm.inject_attribute.factorybean;

public class FbCourse {
    private String CourseName;

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    @Override
    public String toString() {
        return "FbCourse{" +
                "CourseName='" + CourseName + '\'' +
                '}';
    }
}
