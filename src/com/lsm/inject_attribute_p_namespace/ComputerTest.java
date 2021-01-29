package com.lsm.inject_attribute_p_namespace;

import java.math.BigDecimal;

public class ComputerTest {
    private String name;
    private BigDecimal price;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ComputerTest{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
