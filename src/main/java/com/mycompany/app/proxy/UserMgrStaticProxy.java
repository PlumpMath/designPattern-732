package com.mycompany.app.proxy;

/**
 * Created with IntelliJ IDEA.
 * User: zh
 * Date: 14-2-25
 * Time: 下午2:20
 * To change this template use File | Settings | File Templates.
 */
public class UserMgrStaticProxy implements UserMgr {
    private UserMgr usermgr;

    public UserMgrStaticProxy(UserMgr usermgr){
      this.usermgr = usermgr;
    }
    @Override
    public void findUser(String userId) {
        //To change body of implemented methods use File | Settings | File Templates.
        System.out.println("findUser proxy method ->");
        usermgr.findUser(userId);
    }

    @Override
    public void addUser(String userId, String userName) {
        //To change body of implemented methods use File | Settings | File Templates.
        System.out.println("addUser proxy method");
        usermgr.addUser(userId,userName);
    }
}
