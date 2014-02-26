package com.mycompany.app.adapter;

/**
 * Created with IntelliJ IDEA.
 * User: zh
 * Date: 14-2-26
 * Time: 下午4:12
 * To change this template use File | Settings | File Templates.
 */
public class BirdRobot extends Bird implements Robot {
    @Override
    public void cry() {
        //To change body of implemented methods use File | Settings | File Templates.
        System.out.println("模仿鸟儿");
        super.tweedle();
    }
}
