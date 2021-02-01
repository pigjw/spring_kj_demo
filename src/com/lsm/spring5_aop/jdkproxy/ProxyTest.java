package com.lsm.spring5_aop.jdkproxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


/**
 * JDK动态代理举例
 */
//接口
interface Human{
    String getBelief();
    void eat(String food);
}
//aop要做的事情
class HumanUtile{
    public void previousAop(){
        System.out.println("切面前置事情");
    }
    public void afterAop(){
        System.out.println("切面后置事情");
    }
}

//被代理类
class SuperMan implements Human {

    @Override
    public String getBelief() {
        return "I believe I can fly";
    }

    @Override
    public void eat(String food) {
        System.out.println("我喜欢吃" + food);
    }
}

/**
 * 1.如何根据加载到内存中被代理类，动态的创建一个代理类及其对象
 *
 * 2.当通过代理类调用这个方法时，如何动态去调用被代理类的同名方法
 *
 */

class ProxyFactory{
    /**
     * obj:加载到内存中的代理类
     * 调用此方法返回一个代理类对象
     */
    public static Object getProxyInstance(Object obj){
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), new MyInvocationHandler(obj));
    }
}

class MyInvocationHandler implements InvocationHandler{
    private Object obj;

    public MyInvocationHandler(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        HumanUtile humanUtile = new HumanUtile();
        humanUtile.previousAop();
        //代理类对象调用的方法  一个会直接输出| 我喜欢吃四川麻辣烫     一个返回|I believe I can fly
        Object returnValue = method.invoke(obj,args);
        //上述方法的返回值就作为invoke方法的返回值
        System.out.println("returnValue|"+returnValue);
        humanUtile.afterAop();
        return returnValue;
    }
}

public class ProxyTest {
    public static void main(String[] args) {
        SuperMan superMan = new SuperMan();
        // proxyInstance: 拿到的代理类对象
        Human proxyInstance = (Human) ProxyFactory.getProxyInstance(superMan);
        // proxyInstance调用eat()方法时会取调用invoke方法
        proxyInstance.eat("四川麻辣烫");
        proxyInstance.getBelief();
    }
}
