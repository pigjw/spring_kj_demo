package com.lsm.inject_attribute_inside_bean;

/**
 * 部门
 */
public class DeptTest {
    private String dpName;

    public void setDpName(String dpName) {
        this.dpName = dpName;
    }

    @Override
    public String toString() {
        return "DeptTest{" +
                "dpName='" + dpName + '\'' +
                '}';
    }
}
