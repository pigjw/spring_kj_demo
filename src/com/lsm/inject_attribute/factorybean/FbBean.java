package com.lsm.inject_attribute.factorybean;

import org.springframework.beans.factory.FactoryBean;

public class FbBean implements FactoryBean<FbCourse>
{

    //这个就是设置你返回类型的方法
    @Override
    public FbCourse getObject() throws Exception {
        FbCourse fbCourse = new FbCourse();
        fbCourse.setCourseName("spring5框架课程");
        return fbCourse;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
