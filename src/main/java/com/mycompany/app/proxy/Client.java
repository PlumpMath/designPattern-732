package com.mycompany.app.proxy;

/**
 * Created with IntelliJ IDEA.
 * User: zh
 * Date: 14-2-25
 * Time: 下午2:27
 * To change this template use File | Settings | File Templates.
 */
public class Client {

    public static void main(String[] args){
        //静态代理
        UserMgrStaticProxy proxy = new UserMgrStaticProxy(new UserMgrImpl());
        proxy.addUser("001","zhangsan");
        //动态代理类
        UserMgr dynamicProxy =  (UserMgr) new UserMgrDynamicProxy().newProxyInstance(new UserMgrImpl());
//      dynamicProxy.findUser("zhangsan");
        dynamicProxy.addUser("002","lisi");
    }
}
