package com.lsm.springbean_lifecycle;

/**
 * 1.根据无参构造方法构造对象
 * 2.调用set方法进行附值
 * 3.执行初始化方法
 * 4.得到了对象-com.lsm.springbean_lifecycle.Orders@64f6106c
 * 5.执行销毁方法
 */
public class Orders {
    private String orderName;
    public Orders() {
        System.out.println("1.根据无参构造方法构造对象");
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
        System.out.println("2.调用set方法进行附值");
    }

    public void initMethod(){
        System.out.println("3.执行初始化方法");
    }
    public void destroyMethod(){
        System.out.println("5.执行销毁方法");
    }

}
