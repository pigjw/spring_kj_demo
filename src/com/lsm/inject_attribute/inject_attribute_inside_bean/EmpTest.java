package com.lsm.inject_attribute.inject_attribute_inside_bean;

/**
 * 员工
 */
public class EmpTest {
    private String empName;
    private String empGender;
    private DeptTest deptTest;

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpGender(String empGender) {
        this.empGender = empGender;
    }

    public void setDeptTest(DeptTest deptTest) {
        this.deptTest = deptTest;
    }

    @Override
    public String toString() {
        return "EmpTest{" +
                "empName='" + empName + '\'' +
                ", empGender='" + empGender + '\'' +
                ", deptTest=" + deptTest.toString() +
                '}';
    }
}
