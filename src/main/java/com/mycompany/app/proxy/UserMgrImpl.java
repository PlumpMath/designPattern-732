package com.mycompany.app.proxy;

/**
 * Created with IntelliJ IDEA.
 * User: zh
 * Date: 14-2-25
 * Time: 下午2:17
 * To change this template use File | Settings | File Templates.
 */
public class UserMgrImpl implements UserMgr {
    @Override
    public void findUser(String userId) {
        //To change body of implemented methods use File | Settings | File Templates.
        System.out.println("UserMgrImpl find user :"+userId);
    }

    @Override
    public void addUser(String userId, String userName) {
        //To change body of implemented methods use File | Settings | File Templates.
        System.out.println("UserMgrImpl add user :"+userId +","+userName);
    }
}
