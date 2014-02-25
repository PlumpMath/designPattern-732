package com.mycompany.app.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created with IntelliJ IDEA.
 * User: zh
 * Date: 14-2-25
 * Time: 下午2:35
 * To change this template use File | Settings | File Templates.
 */
public class UserMgrDynamicProxy implements InvocationHandler {
    private Object targetObj;
    public Object newProxyInstance(Object targetObj){
        this.targetObj = targetObj;
        // 代理类初始化代理接口实现类
        return Proxy.newProxyInstance(targetObj.getClass().getClassLoader(),targetObj.getClass().getInterfaces(),this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("start dynamic method -->");
        for(Object obj : args){
            System.out.println(obj);
        }
        Object ret = null;
        try{
            //调用方法
            ret = method.invoke(targetObj,args);
            System.out.println("success ->"+method.getName());
        }catch (Exception ex){
            ex.printStackTrace();
            System.out.println("error ->"+method.getName());
            throw ex;
        }
        return ret;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
