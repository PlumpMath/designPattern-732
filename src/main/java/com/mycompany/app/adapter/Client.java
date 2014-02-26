package com.mycompany.app.adapter;

/**
 * Created with IntelliJ IDEA.
 * User: zh
 * Date: 14-2-26
 * Time: 下午4:16
 * To change this template use File | Settings | File Templates.
 */
public class Client {

    public static void main(String[] args){
        Robot birdRobot = new BirdRobot();
        birdRobot.cry();

        Robot robot = (Robot)XmlUtil.getBean();
        robot.cry();
    }
}
