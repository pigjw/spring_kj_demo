package com.lsm.spring5_aop.staticProxy;

/**
 * 静态代理
 * 特点:代理类和被代理类在编译期间就确定下来了
 */
interface ClothFactory{
    void clothFactory();
}

//代理类
class ProxyClothFactory implements ClothFactory {
    private ClothFactory factory;

    //用被代理类对象进行初始化
    public ProxyClothFactory(ClothFactory factory) {
        this.factory = factory;
    }

    @Override
    public void clothFactory() {
        System.out.println("代理工厂做一些准备工作");
        //用真正的被代理类的实现方法进行相关调用
        factory.clothFactory();
        System.out.println("代理工厂做一些后续的收尾工作");
    }
}

//被代理类
class NikeClothFactory implements ClothFactory {

    @Override
    public void clothFactory() {
        System.out.println("Nike工厂生产一批运动服");
    }
}

//做一个测试
public class StaticProxy {
    public static void main(String[] args) {
        NikeClothFactory nikeClothFactory = new NikeClothFactory();
        ProxyClothFactory proxyClothFactory = new ProxyClothFactory(nikeClothFactory);
        proxyClothFactory.clothFactory();
    }
}
