package com.mycompany.app.proxy;

/**
 * Created with IntelliJ IDEA.
 * User: zh
 * Date: 14-2-25
 * Time: 下午2:15
 * To change this template use File | Settings | File Templates.
 */
public interface UserMgr {

    public void findUser(String userId);

    public void addUser(String userId,String userName);
}
