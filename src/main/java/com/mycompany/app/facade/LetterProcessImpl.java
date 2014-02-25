package com.mycompany.app.facade;

/**
 * Created with IntelliJ IDEA.
 * User: zh
 * Date: 14-2-25
 * Time: 下午4:31
 * To change this template use File | Settings | File Templates.
 */
public class LetterProcessImpl implements LetterProcess {
    @Override
    public void writeContext(String context) {
        //To change body of implemented methods use File | Settings | File Templates.
        System.out.println("写信的内容： "+context);
    }

    @Override
    public void fillEnvelope(String address) {
        //To change body of implemented methods use File | Settings | File Templates.
        System.out.println("填写收信人地址: "+address);
    }

    @Override
    public void letterIntoEnvelope() {
        //To change body of implemented methods use File | Settings | File Templates.
        System.out.println("信件内容放入信封里...");
    }

    @Override
    public void sendLetter() {
        //To change body of implemented methods use File | Settings | File Templates.
        System.out.println("信件发送到邮箱...");
    }
}
